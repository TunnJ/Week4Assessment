package model;

public class MadLibs {
	private String personName;
	private String verb;
	private String adjective;
	private String adverb;
	
	public MadLibs() {
		super();
	}
	
	public MadLibs(String personName, String verb, String adjective, String adverb) {
		this.personName = personName;
		this.verb = verb;
		this.adjective = adjective;
		this.adverb = adverb;
	}
	
	public String constructMadLib() {
		return "Once apon a time, " + getPersonName() + " decided to " + getVerb().toLowerCase() + " " + getAdverb().toLowerCase() + " when all of " +
				getPersonName() + "'s neighbors were asleep. From then on, " + getPersonName() + "'s neighbors described " +
				getPersonName() + " as " + getAdjective().toLowerCase() + ". The End.";
	}
	
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public String getAdjective() {
		return adjective;
	}

	public void setAdjective(String adjective) {
		this.adjective = adjective;
	}

	public String getAdverb() {
		return adverb;
	}

	public void setAdverb(String adverb) {
		this.adverb = adverb;
	}
}
