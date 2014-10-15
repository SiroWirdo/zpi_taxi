import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;




public class Reader {
	
	public int readInt(String name){
		int value = 0;
		try{
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			InputStream in = new FileInputStream("test.xml");
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
			
			while(eventReader.hasNext()){
				XMLEvent event = eventReader.nextEvent();
				
				if(event.isStartElement()){
					StartElement startElement = event.asStartElement();
					
					if(startElement.getName().getLocalPart().equals(name)){
						event = eventReader.nextEvent();
						value = new Integer(event.asCharacters().getData());
						break;
					}
				}
			}
		} catch (FileNotFoundException e) {
		      e.printStackTrace();
	    } catch (XMLStreamException e) {
	      e.printStackTrace();
	    }
		return value;
	}

}

