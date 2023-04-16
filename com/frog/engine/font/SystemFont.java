package com.frog.engine.font.SystemFont;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.CharSequence;
import java.lang.Integer;
import android.text.TextUtils;
import java.io.File;
import com.frog.engine.font.FontData;
import java.lang.Math;
import java.util.Collection;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.io.FileInputStream;
import java.io.InputStream;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.NamedNodeMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.System;
import java.io.PrintStream;

public class SystemFont	// class@001501
{
    public static String sDefaultFamilyName = "";
    public static String sFirstFontFamilyName = "";
    public static HashMap sMap;
    public static List sSystemAllFont;

    static {
       SystemFont.sMap = new HashMap();
       SystemFont.sSystemAllFont = new ArrayList();
    }
    public void SystemFont(){
       super();
    }
    public static synchronized void cleanAllCache(){
       _monitor_enter(SystemFont.class);
       if (PatchProxy.applyVoid(null, null, SystemFont.class, "1")) {
          _monitor_exit(SystemFont.class);
          return;
       }else {
          SystemFont.sMap.clear();
          SystemFont.sSystemAllFont.clear();
          _monitor_exit(SystemFont.class);
          return;
       }
    }
    public static boolean fontExists(String p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, null, SystemFont.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = SystemFont.sSystemAllFont.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if ((obj.next()).contains(p0)) {
             break ;
          }
       }
       return true;
    }
    public static List getAllSystemFonts(){
       List obj = PatchProxy.apply(null, null, SystemFont.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SystemFont.getSystemFonts("/system/fonts/");
       if (obj.size() <= 0) {
          obj = SystemFont.getSystemFonts("/system/font/");
       }
       if (obj.size() <= 0) {
          obj = SystemFont.getSystemFonts("/data/fonts");
       }
       return obj;
    }
    public static synchronized byte[] getFont(String p0,int p1){
       String obj;
       boolean b;
       _monitor_enter(SystemFont.class);
       if (PatchProxy.isSupport(SystemFont.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, SystemFont.class, "2");
          if (obj != PatchProxyResult.class) {
             _monitor_exit(SystemFont.class);
             return obj;
          }
       }
       p1 = Integer.parseInt(Integer.toHexString(p1));
       SystemFont.loadFontInfo();
       String str = 1;
       File uFile = null;
       if (p0.equals("arial")) {
          p0 = SystemFont.sDefaultFamilyName;
          b = true;
       }else {
          b = false;
       }
       if (p0.equals("__ANDROID_DEFAULT_FONT_FAMILY_NAME__")) {
          p0 = SystemFont.sFirstFontFamilyName;
       }else {
          uFile = b;
       }
       if (TextUtils.isEmpty(p0) || !SystemFont.sMap.containsKey(p0)) {
          p0 = SystemFont.sDefaultFamilyName;
       }else {
          str = uFile;
       }
       obj = "";
       if (str != null) {
          str = SystemFont.getFontRealPath("DroidSansFallback");
          uFile = new File(str);
          if (uFile.exists() && uFile.length() - 0x100000 > 0) {
             obj = str;
          }
       }
       if (TextUtils.isEmpty(obj) && !TextUtils.isEmpty(p0)) {
          FontData uFontData = Integer.MAX_VALUE;
          Iterator iterator = SystemFont.sMap.get(p0).iterator();
          FontData uFontData1 = null;
          while (iterator.hasNext()) {
             FontData uFontData2 = iterator.next();
             if (uFontData2.weight == p1 && SystemFont.fontExists(uFontData2.getFontFileName())) {
                uFontData1 = uFontData2;
                break ;
             }else {
                int i = uFontData2.weight - p1;
                if (Math.abs(i) < uFontData && SystemFont.fontExists(uFontData2.getFontFileName())) {
                   int i1 = uFontData2.weight - p1;
                   i1 = Math.abs(i1);
                   uFontData1 = uFontData2;
                }
             }
          }
          if (uFontData1 != null) {
             obj = SystemFont.getFontRealPath(uFontData1.getFontFileName());
          }
       }
       if (!TextUtils.isEmpty(obj)) {
          _monitor_exit(SystemFont.class);
          return SystemFont.readFile(new File(obj));
       }else {
          _monitor_exit(SystemFont.class);
          return null;
       }
    }
    public static String getFontRealPath(String p0){
       String str;
       Iterator obj = PatchProxy.applyOneRefs(p0, null, SystemFont.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SystemFont.sSystemAllFont.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return "";
          }
          str = obj.next();
          if (str.contains(p0)) {
             break ;
          }
       }
       return str;
    }
    public static List getSystemFonts(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, SystemFont.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       File[] uFileArray = new File(p0).listFiles();
       if (uFileArray != null) {
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             obj.add(uFileArray[i].getAbsolutePath());
          }
       }
       return obj;
    }
    public static void loadAllFontName(){
       if (PatchProxy.applyVoid(null, null, SystemFont.class, "6")) {
          return;
       }
       List sSystemAllFo = SystemFont.sSystemAllFont;
       if (sSystemAllFo != null && sSystemAllFo.size() > 0) {
          return;
       }
       sSystemAllFo = SystemFont.getAllSystemFonts();
       if (sSystemAllFo != null) {
          SystemFont.sSystemAllFont.addAll(sSystemAllFo);
       }
       return;
    }
    public static void loadFontInfo(){
       if (PatchProxy.applyVoid(null, null, SystemFont.class, "3")) {
          return;
       }
       try{
          SystemFont.loadAllFontName();
          SystemFont.parseFontInfo();
       }catch(java.lang.Exception e0){
          FrogLog.e("SystemFont", e0.getMessage());
       }
       return;
    }
    public static void parseFontInfo(){
       String str2;
       String nodeValue;
       FontData uFontData;
       if (PatchProxy.applyVoid(null, null, SystemFont.class, "7")) {
          return;
       }
       HashMap sMap = SystemFont.sMap;
       if (sMap != null && sMap.size() > 0) {
          return;
       }
       File uFile = new File("/system/etc/fonts.xml");
       if (!uFile.exists()) {
          return;
       }
       NodeList elementsByTa = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(uFile)).getElementsByTagName("familyset");
       int i = 0;
       while (i < elementsByTa.getLength()) {
          NodeList childNodes = elementsByTa.item(i).getChildNodes();
          if (childNodes != null) {
             int i1 = 0;
             while (i1 < childNodes.getLength()) {
                String nodeName = childNodes.item(i1).getNodeName();
                String str = "weight";
                String str1 = "name";
                if (("family").equals(nodeName)) {
                   NamedNodeMap attributes = childNodes.item(i1).getAttributes();
                   str2 = "";
                   nodeValue = (attributes.getNamedItem(str1) != null)? attributes.getNamedItem(str1).getNodeValue(): str2;
                   str1 = "lang";
                   if (attributes.getNamedItem(str1) != null) {
                      str2 = attributes.getNamedItem(str1).getNodeValue();
                   }
                   str1 = "zh-Hans";
                   if (!TextUtils.isEmpty(nodeValue) || str1.equals(str2)) {
                      nodeName = (TextUtils.isEmpty(nodeValue))? str1: nodeValue;
                      if (!TextUtils.isEmpty(nodeValue) && TextUtils.isEmpty(SystemFont.sFirstFontFamilyName)) {
                         SystemFont.sFirstFontFamilyName = nodeValue;
                      }
                      if (TextUtils.isEmpty(SystemFont.sDefaultFamilyName)) {
                         SystemFont.sDefaultFamilyName = nodeName;
                      }
                      if (!TextUtils.equals(SystemFont.sDefaultFamilyName, str1) && nodeName.equals(str1)) {
                         SystemFont.sDefaultFamilyName = str1;
                      }
                      if (SystemFont.sMap.get(nodeName) == null) {
                         SystemFont.sMap.put(nodeName, new ArrayList());
                      }
                      NodeList childNodes1 = childNodes.item(i1).getChildNodes();
                      if (childNodes1 != null) {
                         List list = SystemFont.sMap.get(nodeName);
                         int i2 = 0;
                         while (i2 < childNodes.getLength()) {
                            Node node = childNodes1.item(i2);
                            if (node != null && ("font").equals(node.getNodeName())) {
                               NamedNodeMap attributes1 = node.getAttributes();
                               int i3 = Integer.valueOf(attributes1.getNamedItem(str).getNodeValue()).intValue();
                               String nodeValue1 = attributes1.getNamedItem("style").getNodeValue();
                               String textContent = node.getTextContent();
                               try{
                                  uFontData = new FontData();
                                  uFontData.fontFileName = ((textContent.trim()).replace(10, ' ')).trim();
                               }catch(java.lang.Exception e0){
                                  uFontData.fontFileName = textContent;
                               }
                               uFontData.style = nodeValue1;
                               uFontData.weight = i3;
                               list.add(uFontData);
                            }
                            i2 = i2 + 1;
                         }
                         SystemFont.sMap.put(nodeName, list);
                      }
                   }
                }else if(("alias").equals(nodeName)){
                   NamedNodeMap attributes2 = childNodes.item(i1).getAttributes();
                   nodeName = attributes2.getNamedItem(str1).getNodeValue();
                   nodeValue = attributes2.getNamedItem("to").getNodeValue();
                   str2 = -1;
                   int i4 = (attributes2.getNamedItem(str) != null)? Integer.valueOf(attributes2.getNamedItem(str).getNodeValue()).intValue(): -1;
                   List list1 = SystemFont.sMap.get(nodeName);
                   if (list1 == null) {
                      list1 = new ArrayList();
                   }
                   if (i4 == str2) {
                      List list2 = SystemFont.sMap.get(nodeValue);
                      if (list2 != null) {
                         list1 = new ArrayList(list2);
                      }
                   }else {
                      List list3 = SystemFont.sMap.get(nodeValue);
                      if (list3 != null) {
                         Iterator iterator = list3.iterator();
                         while (iterator.hasNext()) {
                            FontData uFontData1 = iterator.next();
                            if (uFontData1 != null && i4 == uFontData1.weight) {
                               list1.add(uFontData1);
                               break ;
                            }
                         }
                      }
                   }
                   SystemFont.sMap.put(nodeName, list1);
                }
                i1 = i1 + 1;
             }
          }
          i = i + 1;
       }
       return;
    }
    public static byte[] readFile(File p0){
       ByteArrayOutputStream obj1;
       FileInputStream obj = PatchProxy.applyOneRefs(p0, null, SystemFont.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.isFile()) {
          try{
             obj = new FileInputStream(p0);
             try{
                int i = 1024;
                byte[] uobyteArray = new byte[i];
                obj1 = new ByteArrayOutputStream();
                try{
                   int i1 = obj.read(uobyteArray);
                   while (i1 != -1) {
                      obj1.write(uobyteArray, 0, i1);
                   }
                   uobyteArray = obj1.toByteArray();
                   try{
                      obj.close();
                      obj1.close();
                   }catch(java.io.IOException e0){
                      e0.printStackTrace();
                   }
                   return uobyteArray;
                }catch(java.io.IOException e6){
                }
             }catch(java.io.IOException e6){
                obj1 = null;
             }
          }catch(java.io.IOException e6){
             obj = null;
             obj1 = obj;
          }
       label_0080 :
          return null;
       }else {
          System.out.println("文件不存在！");
          goto label_0080 ;
       }
    }
}
