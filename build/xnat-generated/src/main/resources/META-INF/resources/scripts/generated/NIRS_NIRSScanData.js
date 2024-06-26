/*
 * GENERATED FILE
 * Created on Thu May 02 07:48:07 BST 2024
 *
 */

/**
 * @author XDAT
 *
 */

function NIRS_NIRSScanData(){
this.xsiType="NIRS:NIRSScanData";

	this.getSchemaElementName=function(){
		return "NIRSScanData";
	}

	this.getFullSchemaElementName=function(){
		return "NIRS:NIRSScanData";
	}
this.extension=dynamicJSLoad('xnat_imageScanData','generated/xnat_imageScanData.js');

	this.Task=null;


	function getTask() {
		return this.Task;
	}
	this.getTask=getTask;


	function setTask(v){
		this.Task=v;
	}
	this.setTask=setTask;


	this.getProperty=function(xmlPath){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="imageScanData"){
				return this.Imagescandata ;
			} else 
			if(xmlPath.startsWith("imageScanData")){
				xmlPath=xmlPath.substring(13);
				if(xmlPath=="")return this.Imagescandata ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Imagescandata!=undefined)return this.Imagescandata.getProperty(xmlPath);
				else return null;
			} else 
			if(xmlPath=="task"){
				return this.Task ;
			} else 
			if(xmlPath=="meta"){
				return this.Meta ;
			} else 
			{
				return this.extension.getProperty(xmlPath);
			}
	}


	this.setProperty=function(xmlPath,value){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="imageScanData"){
				this.Imagescandata=value;
			} else 
			if(xmlPath.startsWith("imageScanData")){
				xmlPath=xmlPath.substring(13);
				if(xmlPath=="")return this.Imagescandata ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Imagescandata!=undefined){
					this.Imagescandata.setProperty(xmlPath,value);
				}else{
						if(options && options.xsiType){
							this.Imagescandata= instanciateObject(options.xsiType);//omUtils.js
						}else{
							this.Imagescandata= instanciateObject("xnat:imageScanData");//omUtils.js
						}
						if(options && options.where)this.Imagescandata.setProperty(options.where.field,options.where.value);
						this.Imagescandata.setProperty(xmlPath,value);
				}
			} else 
			if(xmlPath=="task"){
				this.Task=value;
			} else 
			if(xmlPath=="meta"){
				this.Meta=value;
			} else 
			{
				return this.extension.setProperty(xmlPath,value);
			}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.setReferenceField=function(xmlPath,v) {
			this.extension.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.getReferenceFieldName=function(xmlPath) {
			return this.extension.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	this.getFieldType=function(xmlPath){
		if (xmlPath=="task"){
			return "field_data";
		}
		else{
			return this.extension.getFieldType(xmlPath);
		}
	}


	this.toXML=function(xmlTxt,preventComments){
		xmlTxt+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		xmlTxt+="\n<NIRS:NIRSScan";
		xmlTxt+=this.getXMLAtts();
		xmlTxt+=" xmlns:NIRS=\"http://nrg.wustl.edu/NIRS\"";
		xmlTxt+=" xmlns:arc=\"http://nrg.wustl.edu/arc\"";
		xmlTxt+=" xmlns:cat=\"http://nrg.wustl.edu/catalog\"";
		xmlTxt+=" xmlns:icr=\"http://icr.ac.uk/icr\"";
		xmlTxt+=" xmlns:pipe=\"http://nrg.wustl.edu/pipe\"";
		xmlTxt+=" xmlns:prov=\"http://www.nbirn.net/prov\"";
		xmlTxt+=" xmlns:scr=\"http://nrg.wustl.edu/scr\"";
		xmlTxt+=" xmlns:val=\"http://nrg.wustl.edu/val\"";
		xmlTxt+=" xmlns:wrk=\"http://nrg.wustl.edu/workflow\"";
		xmlTxt+=" xmlns:xdat=\"http://nrg.wustl.edu/security\"";
		xmlTxt+=" xmlns:xnat=\"http://nrg.wustl.edu/xnat\"";
		xmlTxt+=" xmlns:xnat_a=\"http://nrg.wustl.edu/xnat_assessments\"";
		xmlTxt+=" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"";
		xmlTxt+=">";
		xmlTxt+=this.getXMLBody(preventComments)
		xmlTxt+="\n</NIRS:NIRSScan>";
		return xmlTxt;
	}


	this.getXMLComments=function(preventComments){
		var str ="";
		if((preventComments==undefined || !preventComments) && this.hasXMLComments()){
		}
		return str;
	}


	this.getXMLAtts=function(){
		var attTxt = this.extension.getXMLAtts();
		return attTxt;
	}


	this.getXMLBody=function(preventComments){
		var xmlTxt=this.getXMLComments(preventComments);
		xmlTxt+=this.extension.getXMLBody(preventComments);
		if (this.Task!=null){
			xmlTxt+="\n<NIRS:task";
			xmlTxt+=">";
			xmlTxt+=this.Task.replace(/>/g,"&gt;").replace(/</g,"&lt;");
			xmlTxt+="</NIRS:task>";
		}
		return xmlTxt;
	}


	this.hasXMLComments=function(){
	}


	this.hasXMLBodyContent=function(){
		if (this.Task!=null) return true;
		if(this.hasXMLComments())return true;
		if(this.extension.hasXMLBodyContent())return true;
		return false;
	}
}
