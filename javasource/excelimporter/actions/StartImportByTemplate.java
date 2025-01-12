// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package excelimporter.actions;

import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import excelimporter.reader.ExcelImporter;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Start the excel import, The parameter TemplateObject should be a valid parameter, this template is analysed and by this template configuration the filedocument (which should be an excel .xls file)
 * 
 * The last parameter is the ImportObjectParameter, when an 'reference to imported object' is configured this parameter should containt the object to which all objects should refer to.This parameter is optional and can be left empty.
 * 
 * The return value is irrelevant and will be always true
 */
public class StartImportByTemplate extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __TemplateObject;
	private excelimporter.proxies.Template TemplateObject;
	private IMendixObject __ImportExcelDoc;
	private system.proxies.FileDocument ImportExcelDoc;
	private IMendixObject ImportObjectParameter;

	public StartImportByTemplate(IContext context, IMendixObject TemplateObject, IMendixObject ImportExcelDoc, IMendixObject ImportObjectParameter)
	{
		super(context);
		this.__TemplateObject = TemplateObject;
		this.__ImportExcelDoc = ImportExcelDoc;
		this.ImportObjectParameter = ImportObjectParameter;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.TemplateObject = __TemplateObject == null ? null : excelimporter.proxies.Template.initialize(getContext(), __TemplateObject);

		this.ImportExcelDoc = __ImportExcelDoc == null ? null : system.proxies.FileDocument.initialize(getContext(), __ImportExcelDoc);

		// BEGIN USER CODE
		if( this.TemplateObject == null )
			throw new CoreException( "No template" );
		if( this.ImportExcelDoc == null )
			throw new CoreException( "No excel document" );

		ExcelImporter.startImport(this.getContext(), this.TemplateObject.getMendixObject(), this.ImportExcelDoc.getMendixObject(), this.ImportObjectParameter );
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "StartImportByTemplate";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
