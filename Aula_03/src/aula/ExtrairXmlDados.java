package aula;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ExtrairXmlDados {

	public static void main(String[] args) {
		try {
			File inputFile = new File("passageiros.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			
			doc.getDocumentElement().normalize();
			
			NodeList nodeList = doc.getElementsByTagName("passageiro");
			
			for(int i  = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				
				if(node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					String nome = element.getElementsByTagName("nome").item(0).getTextContent();
					String numero = element.getElementsByTagName("numero_ticket").item(0).getTextContent();
					String origem = element.getElementsByTagName("origem").item(0).getTextContent();
					String destino = element.getElementsByTagName("destino").item(0).getTextContent();
					System.out.println("Nome do passageiro: " +"" + nome + "\n" + "Numero do passageiro: " + numero +"\n" + "Origem: " + origem + "\n" + "Destino: " + destino);
					System.out.println();
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
