/*
 * GENERATED FILE
 *
 */
package org.nrg.xdat.om.base.auto;
import org.apache.log4j.Logger;
import org.nrg.xft.*;
import org.nrg.xft.security.UserI;
import org.nrg.xdat.om.*;
import org.nrg.xft.utils.ResourceFile;
import org.nrg.xft.exception.*;

import java.util.*;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author XDAT
 *
 *//*
 ******************************** 
 * DO NOT MODIFY THIS FILE
 *
 ********************************/
@SuppressWarnings({"unchecked","rawtypes"})
public abstract class AutoNirsNirssessiondata extends XnatImagesessiondata implements org.nrg.xdat.model.NirsNirssessiondataI {
	public static final Logger logger = Logger.getLogger(AutoNirsNirssessiondata.class);
	public static final String SCHEMA_ELEMENT_NAME="NIRS:NIRSSessionData";

	public AutoNirsNirssessiondata(ItemI item)
	{
		super(item);
	}

	public AutoNirsNirssessiondata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoNirsNirssessiondata(UserI user)
	 **/
	public AutoNirsNirssessiondata(){}

	public AutoNirsNirssessiondata(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "NIRS:NIRSSessionData";
	}
	 private org.nrg.xdat.om.XnatImagesessiondata _Imagesessiondata =null;

	/**
	 * imageSessionData
	 * @return org.nrg.xdat.om.XnatImagesessiondata
	 */
	public org.nrg.xdat.om.XnatImagesessiondata getImagesessiondata() {
		try{
			if (_Imagesessiondata==null){
				_Imagesessiondata=((XnatImagesessiondata)org.nrg.xdat.base.BaseElement.GetGeneratedItem((XFTItem)getProperty("imageSessionData")));
				return _Imagesessiondata;
			}else {
				return _Imagesessiondata;
			}
		} catch (Exception e1) {return null;}
	}

	/**
	 * Sets the value for imageSessionData.
	 * @param v Value to Set.
	 */
	public void setImagesessiondata(ItemI v) throws Exception{
		_Imagesessiondata =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/imageSessionData",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/imageSessionData",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * imageSessionData
	 * set org.nrg.xdat.model.XnatImagesessiondataI
	 */
	public <A extends org.nrg.xdat.model.XnatImagesessiondataI> void setImagesessiondata(A item) throws Exception{
	setImagesessiondata((ItemI)item);
	}

	/**
	 * Removes the imageSessionData.
	 * */
	public void removeImagesessiondata() {
		_Imagesessiondata =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/imageSessionData",0);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
		catch (java.lang.IndexOutOfBoundsException e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.NirsNirssessiondata> getAllNirsNirssessiondatas(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.NirsNirssessiondata> al = new ArrayList<org.nrg.xdat.om.NirsNirssessiondata>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.NirsNirssessiondata> getNirsNirssessiondatasByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.NirsNirssessiondata> al = new ArrayList<org.nrg.xdat.om.NirsNirssessiondata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.NirsNirssessiondata> getNirsNirssessiondatasByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.NirsNirssessiondata> al = new ArrayList<org.nrg.xdat.om.NirsNirssessiondata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static NirsNirssessiondata getNirsNirssessiondatasById(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("NIRS:NIRSSessionData/id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (NirsNirssessiondata) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
			else
				 return null;
		} catch (IllegalAccessException e) {
			final StackTraceElement[] stacktrace = e.getStackTrace();
			final String location = stacktrace == null || stacktrace.length == 0 ? "Unknown (no stack trace)" : stacktrace[0].toString();
			logger.error("The user " + user.getUsername() + " was denied access to the NIRS:NIRSSessionData/id instance with ID " + value + ". Occurred at: " + location + "\n" + e.getMessage());
		} catch (Exception e) {
			logger.error("",e);
		}

		return null;
	}

	public static ArrayList wrapItems(ArrayList items)
	{
		ArrayList al = new ArrayList();
		al = org.nrg.xdat.base.BaseElement.WrapItems(items);
		al.trimToSize();
		return al;
	}

	public static ArrayList wrapItems(org.nrg.xft.collections.ItemCollection items)
	{
		return wrapItems(items.getItems());
	}

	public org.w3c.dom.Document toJoinedXML() throws Exception
	{
		ArrayList al = new ArrayList();
		al.add(this.getItem());
		al.add(org.nrg.xft.search.ItemSearch.GetItem("xnat:subjectData.ID",this.getItem().getProperty("xnat:mrSessionData.subject_ID"),getItem().getUser(),false));
		al.trimToSize();
		return org.nrg.xft.schema.Wrappers.XMLWrapper.XMLWriter.ItemListToDOM(al);
	}
	public ArrayList<ResourceFile> getFileResources(String rootPath, boolean preventLoop){
ArrayList<ResourceFile> _return = new ArrayList<ResourceFile>();
	 boolean localLoop = preventLoop;
	        localLoop = preventLoop;
	
	        //imageSessionData
	        XnatImagesessiondata childImagesessiondata = (XnatImagesessiondata)this.getImagesessiondata();
	            if (childImagesessiondata!=null){
	              for(ResourceFile rf: ((XnatImagesessiondata)childImagesessiondata).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("imageSessionData[" + ((XnatImagesessiondata)childImagesessiondata).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("imageSessionData/" + ((XnatImagesessiondata)childImagesessiondata).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	
	        localLoop = preventLoop;
	
	return _return;
}
}
