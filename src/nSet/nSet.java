package nSet;

public final class nSet {
	
//	name of the file keeping the settings
	private String settingsFileName = null;
	
//	the implementation should cover the functionality with .ini files and .xml files
	private nSetType settingsFileType = nSetType.none;
	
	public nSet() {}
	
	public void read()
	{}
	
	public void write(nSetElement element)
	{}
	
	public void update(String paramElement)
	{}
	
	public void delete(String paramElement)
	{}

}
