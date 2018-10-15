package fr.gmail.zwawiak.comte_harebourg_dofus.etat;

public enum Etat {

	PREMIER("premier.png"),
	SECOND("second.png"),
	TROISIEME("troisieme.png");
	
	private String path;
	
	Etat(String path){
		this.path = path;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	
	
}
