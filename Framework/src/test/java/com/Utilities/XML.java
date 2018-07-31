package com.Utilities;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XML {

	public void readXML() throws JAXBException
	{
		File f= new File("suite11.xml");
		JAXBContext j=JAXBContext.newInstance(Data.class);
		Unmarshaller u=j.createUnmarshaller();
		Data r=(Data)u.unmarshal(f);
		System.out.println("Firstname"+r.getFirstname());
		System.out.println("Lastname"+r.getLastname());
	//	List<Data> mydata= r.getUserdata();
	//	System.out.println(r.getUserdata());
	/*	for(Data d:mydata)
		{
			System.out.println("Firstname"+d.getFirstname());
			System.out.println("Lastname"+d.getLastname());
		}*/
	}
	public static void main(String[] args) throws JAXBException {
XML x = new XML();
		x.readXML();

	}

}
