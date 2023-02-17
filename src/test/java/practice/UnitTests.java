package practice;

import org.testng.annotations.Test;

import geico.tdd.utils.AutoData;

public class UnitTests {
	@Test
	public void unitTestAutoData() {
		AutoData data = new AutoData("Title", "10461");
		System.out.println(data.getHomePageTitle());
		
	}
	
	@Test
	public void unitTestAutoDataZeroLeangth() {
		AutoData data = new AutoData("Title", "10461");
		System.out.println(data.getHomePageTitle());
	}
	
		
	

}
