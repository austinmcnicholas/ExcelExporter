// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public enum ConstraintType
{
	Contains(new java.lang.String[][] { new java.lang.String[] { "en_US", "Contains" } }),
	StartWith(new java.lang.String[][] { new java.lang.String[] { "en_US", "Start with" } }),
	Greater(new java.lang.String[][] { new java.lang.String[] { "en_US", "Greater" } }),
	GreaterEqual(new java.lang.String[][] { new java.lang.String[] { "en_US", "Greater and equal" } }),
	Equal(new java.lang.String[][] { new java.lang.String[] { "en_US", "Equal" } }),
	NotEqual(new java.lang.String[][] { new java.lang.String[] { "en_US", "NotEqual" } }),
	SmallerEqual(new java.lang.String[][] { new java.lang.String[] { "en_US", "Smaller and equal" } }),
	Smaller(new java.lang.String[][] { new java.lang.String[] { "en_US", "Smaller" } }),
	_empty(new java.lang.String[][] { new java.lang.String[] { "en_US", "Empty" } }),
	NotEmpty(new java.lang.String[][] { new java.lang.String[] { "en_US", "Not empty" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ConstraintType(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
