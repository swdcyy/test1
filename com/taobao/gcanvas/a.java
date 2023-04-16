package com.taobao.gcanvas.a;
import java.lang.Object;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.io.File;
import java.lang.String;
import org.w3c.dom.Document;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.util.HashMap;
import org.w3c.dom.NamedNodeMap;
import java.util.Iterator;
import java.util.Collection;

public class a	// class@000df1
{
    public boolean a;
    public HashMap b;
    public List c;

    public void a(){
       super();
       this.a = false;
       HashMap hashMap = null;
       this.b = hashMap;
       try{
          this.c = hashMap;
          this.b(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("/system/etc/fonts.xml")));
       }catch(java.lang.Exception e0){
          e0.getMessage();
       }
       try{
          DocumentBuilder uDocumentBui = DocumentBuilderFactory.newInstance().newDocumentBuilder();
          File uFile = new File("/system/etc/fallback_fonts.xml");
          if (uFile.exists()) {
             this.a(uDocumentBui.parse(uFile));
          }
       }catch(java.lang.Exception e0){
          e0.getMessage();
       }
       this.a = true;
       return;
    }
    public final void a(Document p0){
       NodeList elementsByTa1;
       a tc = this.c;
       if (tc == null) {
          this.c = new ArrayList();
       }else {
          tc.clear();
       }
       Element documentElem = p0.getDocumentElement();
       if (!(documentElem.getTagName()).equals("familyset")) {
          return;
       }else {
          NodeList elementsByTa = documentElem.getElementsByTagName("family");
          int length = elementsByTa.getLength();
          int i = 0;
          while (true) {
             if (i >= length) {
                return;
             }
             Node node = elementsByTa.item(i);
             String str = null;
             if (node instanceof Element) {
                elementsByTa1 = node.getElementsByTagName("fileset");
                if (elementsByTa1 == null || elementsByTa1.getLength() != 1) {
                   break ;
                }else {
                   str = elementsByTa1.item(0);
                }
             }
             if (str == null) {
                return;
             }else {
                elementsByTa1 = str.getChildNodes();
                if (elementsByTa1 == null) {
                   return;
                }else {
                   int length1 = elementsByTa1.getLength();
                   int i1 = 0;
                   while (i1 < length1) {
                      Node node1 = elementsByTa1.item(i1);
                      if (node1 instanceof Element && (node1.getTagName()).equals("file")) {
                         this.c.add(node1.getTextContent());
                      }
                      i1 = i1 + 1;
                   }
                   i = i + 1;
                }
             }
          }
          return;
       }
    }
    public final void b(Document p0){
       Node node1;
       a uoa = this;
       a b = uoa.b;
       if (b == null) {
          uoa.b = new HashMap();
       }else {
          b.clear();
       }
       Element documentElem = p0.getDocumentElement();
       if (!(documentElem.getTagName()).equals("familyset")) {
          return;
       }else {
          NodeList elementsByTa = documentElem.getElementsByTagName("family");
          int length = elementsByTa.getLength();
          int i = 0;
          while (i < length) {
             Node node = elementsByTa.item(i);
             node.getAttributes();
             Node namedItem = node.getAttributes().getNamedItem("name");
             if (namedItem == null) {
                break ;
             }else {
                NodeList elementsByTa1 = node.getElementsByTagName("font");
                if (elementsByTa1 == null) {
                   break ;
                }else {
                   int length1 = elementsByTa1.getLength();
                   ArrayList uArrayList = new ArrayList();
                   uArrayList.add(namedItem.getNodeValue());
                   ArrayList uArrayList1 = new ArrayList();
                   int i1 = 0;
                   while (i1 < length1) {
                      node1 = elementsByTa1.item(i1);
                      if (node1 instanceof Element) {
                         uArrayList1.add(node1.getTextContent());
                      }
                      i1 = i1 + 1;
                   }
                   elementsByTa1 = documentElem.getElementsByTagName("alias");
                   length1 = elementsByTa1.getLength();
                   for (i1 = 0; i1 < length1; i1 = i1 + 1) {
                      node1 = elementsByTa1.item(i1);
                      Node namedItem1 = node1.getAttributes().getNamedItem("name");
                      node1 = node1.getAttributes().getNamedItem("to");
                      if (namedItem1 == null || node1 == null) {
                         break ;
                      }else {
                         ArrayList uArrayList2 = new ArrayList();
                         Iterator iterator = uArrayList.iterator();
                         while (iterator.hasNext()) {
                            Element uElement = documentElem;
                            if ((iterator.next()).equals(node1.getNodeValue())) {
                               uArrayList2.add(namedItem1.getNodeValue());
                            }
                            documentElem = uElement;
                         }
                         uArrayList.addAll(uArrayList2);
                      }
                   }
                   uoa.b.put(uArrayList, uArrayList1);
                   i = i + 1;
                   documentElem = documentElem;
                }
             }
          }
          return;
       }
    }
}
