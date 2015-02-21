package com.cdepman.toptendownloader;

import java.io.StringReader;
import java.util.ArrayList;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class ParseApplications {
	private String data;
	private ArrayList<Application> applications;
	
	public ParseApplications(String XMLData){
		data = XMLData;
		applications = new ArrayList<Application>();
	}
	
	public ArrayList<Application> getApplications(){
		return applications;
	}
	
	public boolean process(){
		boolean operationStatus = true;
		boolean inEntry = false;
		String textValue = "";
		Application currentRecord = null;
		
		
		try{
			XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
			factory.setNamespaceAware(true);
			XmlPullParser xpp = factory.newPullParser();
			
			xpp.setInput(new StringReader(this.data));
			int eventType = xpp.getEventType();
			
			while (eventType != XmlPullParser.END_DOCUMENT){
				String tagName = xpp.getName();
				if (eventType == XmlPullParser.START_TAG){
					if (tagName.equalsIgnoreCase("entry")){
						inEntry = true;
						currentRecord = new Application();
					}
				} else if (eventType == XmlPullParser.TEXT){
					textValue = xpp.getText();
				} else if (eventType == XmlPullParser.END_TAG){
					if (inEntry){
						if (tagName.equalsIgnoreCase("entry")){
							applications.add(currentRecord);
							inEntry = false;
						}
						if (tagName.equalsIgnoreCase("name")){
							currentRecord.setName(textValue);
						} else if (tagName.equalsIgnoreCase("artist")){
							currentRecord.setArtist(textValue);
						} else if (tagName.equalsIgnoreCase("releaseDate")){
							currentRecord.setReleaseDate(textValue);
						}
					}
				}
				
				eventType = xpp.next();
			}
			
		} catch(Exception e){
			e.printStackTrace();
			operationStatus = false;
		}
		
		return operationStatus;
	}
}
