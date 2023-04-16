package com.ta.utdid2.b.a.e;
import org.xmlpull.v1.XmlPullParser;
import java.lang.String;
import java.lang.Object;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.io.InputStream;
import java.util.HashMap;
import android.util.Xml;
import org.xmlpull.v1.XmlSerializer;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.Boolean;
import java.util.Map;
import java.util.List;
import java.lang.CharSequence;
import java.lang.RuntimeException;
import java.io.OutputStream;
import com.ta.utdid2.b.a.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class e	// class@000cd0
{

    public static final Object a(XmlPullParser p0,String[] p1){
       int eventType = p0.getEventType();
       while (true) {
          if (eventType == 2) {
             return e.b(p0, p1);
          }
          if (eventType != 3) {
             if (eventType == 4) {
                throw new XmlPullParserException("Unexpected text: "+p0.getText());
             }
             try{
                eventType = p0.next();
                if (eventType == 1) {
                label_001a :
                   throw new XmlPullParserException("Unexpected end of document");
                }
                continue ;
             }catch(java.lang.Exception e0){
                throw new XmlPullParserException("Unexpected call next\(\): "+p0.getName());
             }
          }else {
             break ;
          }
       }
       throw new XmlPullParserException("Unexpected end tag at: "+p0.getName());
    }
    public static final ArrayList a(XmlPullParser p0,String p1,String[] p2){
       ArrayList uArrayList = new ArrayList();
       int eventType = p0.getEventType();
       do {
          if (eventType == 2) {
             uArrayList.add(e.b(p0, p2));
          }else if(eventType == 3){
             if ((p0.getName()).equals(p1)) {
                return uArrayList;
             }else {
                throw new XmlPullParserException("Expected "+p1+" end tag at: "+p0.getName());
             }
          }
          eventType = p0.next();
       } while (eventType != 1);
       throw new XmlPullParserException("Document ended before "+p1+" end tag");
    }
    public static final HashMap a(InputStream p0){
       XmlPullParser xmlPullParse = Xml.newPullParser();
       xmlPullParse.setInput(p0, null);
       String[] stringArray = new String[1];
       return e.a(xmlPullParse, stringArray);
    }
    public static final HashMap a(XmlPullParser p0,String p1,String[] p2){
       HashMap hashMap = new HashMap();
       int eventType = p0.getEventType();
       do {
          if (eventType == 2) {
             Object obj = e.b(p0, p2);
             int i = 0;
             if (p2[i] != null) {
                hashMap.put(p2[i], obj);
             }else {
                throw new XmlPullParserException("Map value without name attribute: "+p0.getName());
             }
          }else if(eventType == 3){
             if ((p0.getName()).equals(p1)) {
                return hashMap;
             }else {
                throw new XmlPullParserException("Expected "+p1+" end tag at: "+p0.getName());
             }
          }
          eventType = p0.next();
       } while (eventType != 1);
       throw new XmlPullParserException("Document ended before "+p1+" end tag");
    }
    public static final void a(Object p0,String p1,XmlSerializer p2){
       String str1;
       String str = "name";
       if (p0 == null) {
          p2.startTag(null, "null");
          if (p1 != null) {
             p2.attribute(null, str, p1);
          }
          p2.endTag(null, "null");
          return;
       }else if(p0 instanceof String){
          p2.startTag(null, "string");
          if (p1 != null) {
             p2.attribute(null, str, p1);
          }
          p2.text(p0.toString());
          p2.endTag(null, "string");
          return;
       }else if(p0 instanceof Integer){
          str1 = "int";
       }else if(p0 instanceof Long){
          str1 = "long";
       }else if(p0 instanceof Float){
          str1 = "float";
       }else if(p0 instanceof Double){
          str1 = "double";
       }else if(p0 instanceof Boolean){
          str1 = "boolean";
       }else if(p0 instanceof byte[]){
          e.a(p0, p1, p2);
          return;
       }else if(p0 instanceof int[]){
          e.a(p0, p1, p2);
          return;
       }else if(p0 instanceof Map){
          e.a(p0, p1, p2);
          return;
       }else if(p0 instanceof List){
          e.a(p0, p1, p2);
          return;
       }else if(p0 instanceof CharSequence){
          p2.startTag(null, "string");
          if (p1 != null) {
             p2.attribute(null, str, p1);
          }
          p2.text(p0.toString());
          p2.endTag(null, "string");
          return;
       }else {
          throw new RuntimeException("writeValueXml: unable to write value "+p0);
       }
       p2.startTag(null, str1);
       if (p1 != null) {
          p2.attribute(null, str, p1);
       }
       p2.attribute(null, "value", p0.toString());
       p2.endTag(null, str1);
       return;
    }
    public static final void a(List p0,String p1,XmlSerializer p2){
       if (p0 == null) {
          p2.startTag(null, "null");
          p2.endTag(null, "null");
          return;
       }else {
          p2.startTag(null, "list");
          if (p1 != null) {
             p2.attribute(null, "name", p1);
          }
          int i = p0.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             e.a(p0.get(i1), null, p2);
          }
          p2.endTag(null, "list");
          return;
       }
    }
    public static final void a(Map p0,OutputStream p1){
       a uoa = new a();
       uoa.setOutput(p1, "utf-8");
       uoa.startDocument(null, Boolean.TRUE);
       uoa.setFeature(a.d(), true);
       e.a(p0, null, uoa);
       uoa.endDocument();
    }
    public static final void a(Map p0,String p1,XmlSerializer p2){
       if (p0 == null) {
          p2.startTag(null, "null");
          p2.endTag(null, "null");
          return;
       }else {
          Iterator iterator = p0.entrySet().iterator();
          p2.startTag(null, "map");
          if (p1 != null) {
             p2.attribute(null, "name", p1);
          }
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Object value = uEntry.getValue();
             e.a(value, uEntry.getKey(), p2);
          }
          p2.endTag(null, "map");
          return;
       }
    }
    public static final void a(byte[] p0,String p1,XmlSerializer p2){
       if (p0 == null) {
          p2.startTag(null, "null");
          p2.endTag(null, "null");
          return;
       }else {
          p2.startTag(null, "byte-array");
          if (p1 != null) {
             p2.attribute(null, "name", p1);
          }
          int len = p0.length;
          p2.attribute(null, "num", Integer.toString(len));
          StringBuilder str = new StringBuilder((p0.length * 2));
          for (int i = 0; i < len; i = i + 1) {
             int b = p0[i];
             int i1 = b >> 4;
             if (i1 >= 10) {
                i1 = i1 + 97;
                i1 = i1 - 10;
             }else {
                i1 = i1 + 48;
             }
             str = str+i1;
             b = b & 0x00ff;
             if (b >= 10) {
                b = b + 97;
                b = b - 10;
             }else {
                b = b + 48;
             }
             str = str+b;
          }
          p2.text(str);
          p2.endTag(null, "byte-array");
          return;
       }
    }
    public static final void a(int[] p0,String p1,XmlSerializer p2){
       if (p0 == null) {
          p2.startTag(null, "null");
          p2.endTag(null, "null");
          return;
       }else {
          p2.startTag(null, "int-array");
          if (p1 != null) {
             p2.attribute(null, "name", p1);
          }
          int len = p0.length;
          p2.attribute(null, "num", Integer.toString(len));
          for (int i = 0; i < len; i = i + 1) {
             p2.startTag(null, "item");
             p2.attribute(null, "value", Integer.toString(p0[i]));
             p2.endTag(null, "item");
          }
          p2.endTag(null, "int-array");
          return;
       }
    }
    public static final int[] a(XmlPullParser p0,String p1,String[] p2){
       try{
          String str = null;
          int[] ointArray = new int[Integer.parseInt(p0.getAttributeValue(str, "num"))];
          int i = 0;
          int eventType = p0.getEventType();
          do {
             if (eventType == 2) {
                if ((p0.getName()).equals("item")) {
                   try{
                      ointArray[i] = Integer.parseInt(p0.getAttributeValue(str, "value"));
                   }catch(java.lang.NullPointerException e0){
                      throw new XmlPullParserException("Need value attribute in item");
                   }catch(java.lang.NumberFormatException e0){
                      throw new XmlPullParserException("Not a number in value attribute in item");
                   }
                }else {
                   throw new XmlPullParserException("Expected item tag at: "+p0.getName());
                }
             }else if(eventType == 3){
                if ((p0.getName()).equals(p1)) {
                   return ointArray;
                }else if((p0.getName()).equals("item")){
                   i = i + 1;
                }else {
                   throw new XmlPullParserException("Expected "+p1+" end tag at: "+p0.getName());
                }
             }
             eventType = p0.next();
          } while (eventType != 1);
          throw new XmlPullParserException("Document ended before "+p1+" end tag");
       }catch(java.lang.NullPointerException e0){
          throw new XmlPullParserException("Need num attribute in byte-array");
       }catch(java.lang.NumberFormatException e0){
          throw new XmlPullParserException("Not a number in num attribute in byte-array");
       }
    }
    public static Object b(XmlPullParser p0,String[] p1){
       String name;
       String str = null;
       String attributeVal = p0.getAttributeValue(str, "name");
       name = p0.getName();
       if (name.equals("null")) {
       }else {
          String str1 = "string";
          if (name.equals(str1)) {
             str = "";
             while (true) {
                int i1 = p0.next();
                if (i1 == 1) {
                   throw new XmlPullParserException("Unexpected end of document in <string>");
                }
                if (i1 == 3) {
                   if ((p0.getName()).equals(str1)) {
                      break ;
                   }else {
                      throw new XmlPullParserException("Unexpected end tag in <string>: "+p0.getName());
                   }
                }else if(i1 == 4){
                   str = str+p0.getText();
                }else if(i1 != 2){
                   continue ;
                }else {
                   throw new XmlPullParserException("Unexpected start tag in <string>: "+p0.getName());
                }
             }
             p1[0] = attributeVal;
             return str;
          }else {
             String str2 = "value";
             if (name.equals("int")) {
                str = Integer.valueOf(Integer.parseInt(p0.getAttributeValue(str, str2)));
             }else if(name.equals("long")){
                str = Long.valueOf(p0.getAttributeValue(str, str2));
             }else if(name.equals("float")){
                str = Float.valueOf(p0.getAttributeValue(str, str2));
             }else if(name.equals("double")){
                str = Double.valueOf(p0.getAttributeValue(str, str2));
             }else if(name.equals("boolean")){
                str = Boolean.valueOf(p0.getAttributeValue(str, str2));
             }else {
                str = "int-array";
                if (name.equals(str)) {
                   p0.next();
                   p1[0] = attributeVal;
                   return e.a(p0, str, p1);
                }else {
                   str = "map";
                   if (name.equals(str)) {
                      p0.next();
                      p1[0] = attributeVal;
                      return e.a(p0, str, p1);
                   }else {
                      str = "list";
                      if (name.equals(str)) {
                         p0.next();
                         p1[0] = attributeVal;
                         return e.a(p0, str, p1);
                      }else {
                         throw new XmlPullParserException("Unknown tag: "+name);
                      }
                   }
                }
             }
          }
       }
       while (true) {
          int i = p0.next();
          if (i == 1) {
             throw new XmlPullParserException("Unexpected end of document in <"+name+">");
          }
          if (i == 3) {
             if ((p0.getName()).equals(name)) {
                break ;
             }else {
                throw new XmlPullParserException("Unexpected end tag in <"+name+">: "+p0.getName());
             }
          }else if(i != 4){
             if (i != 2) {
             }else {
                throw new XmlPullParserException("Unexpected start tag in <"+name+">: "+p0.getName());
             }
          }else {
             throw new XmlPullParserException("Unexpected text in <"+name+">: "+p0.getName());
          }
       }
       p1[0] = attributeVal;
       return str;
    }
}
