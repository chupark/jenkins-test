package com.crawling.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public String test() throws Exception {
		String URL = "http://www.leagueoflegends.co.kr/?m=news&cate=event&p=1";
		Document doc = Jsoup.connect(URL).get();
		Elements contents = doc.getElementsByClass("contents-table").select("td");
		for (Element e : contents) {
			/*System.out.println(e.select("a").attr("href"));*/
			System.out.println(e);
		}
		
		
		String txt = contents.text();
		
		return txt;
	}
	
}
