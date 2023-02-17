package geico.tdd.utils;

public class AutoData {

	private String homePageTitle;

	private String zipCode;
	private String autoLOB;
	public String startMyQuote;

	public AutoData(String homePageTitle, String zipCode) {
		if (homePageTitle == null || zipCode == null || homePageTitle.length() == 0 || zipCode.length() == 0) {
			throw new NullPointerException();
		} else {

			this.homePageTitle = homePageTitle;
			this.zipCode = zipCode;

		}

	}

	public String getZipCode() {
		return zipCode;
	}

	public String getAutoLOB() {
		return autoLOB;
	}

	public String getStartMyQuote() {
		return startMyQuote;
	}

	public String getHomePageTitle() {
		return homePageTitle;

	}

}
