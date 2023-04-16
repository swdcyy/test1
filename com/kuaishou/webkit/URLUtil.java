package com.kuaishou.webkit.URLUtil;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.StringBuilder;
import java.net.URLEncoder;
import java.lang.IllegalArgumentException;
import java.lang.System;
import android.net.Uri;
import com.kuaishou.webkit.MimeTypeMap;
import java.util.Locale;
import com.kuaishou.webkit.WebAddress;
import java.lang.CharSequence;
import java.util.regex.Matcher;

public final class URLUtil	// class@001262
{
    public static final Pattern CONTENT_DISPOSITION_PATTERN;

    static {
       URLUtil.CONTENT_DISPOSITION_PATTERN = Pattern.compile("attachment;\\s*filename\\s*=\\s*\(\"?\)\([^\"]*\)\\1\\s*$", 2);
    }
    public void URLUtil(){
       super();
    }
    public static String composeSearchUrl(String p0,String p1,String p2){
       int i = p1.indexOf(p2);
       if (i < 0) {
          return null;
       }
       StringBuilder str = "";
       String str1 = p1.substring(0, i);
       try{
          str+str1;
          return str+URLEncoder.encode(p0, "utf-8")+p1.substring((i + p2.length()));
       }catch(java.io.UnsupportedEncodingException e0){
          return v1;
       }
    }
    public static byte[] decode(byte[] p0){
       if (!p0.length) {
          p0 = new byte[0];
          return p0;
       }else {
          byte[] uobyteArray = new byte[p0.length];
          int i = 0;
          int i1 = 0;
          while (true) {
             if (i < p0.length) {
                int b = p0[i];
                if (b == 37) {
                   b = p0.length - i;
                   if (b > 2) {
                      b = i + 1;
                      b = URLUtil.parseHex(p0[b]) * 16;
                      i = i + 2;
                      b = b + URLUtil.parseHex(p0[i]);
                      b = (byte)b;
                   }else {
                      break ;
                   }
                }
                int i2 = i1 + 1;
                uobyteArray[i1] = b;
                i = i + 1;
                i1 = i2;
             }else {
                p0 = new byte[i1];
                System.arraycopy(uobyteArray, 0, p0, 0, i1);
                return p0;
             }
          }
          throw new IllegalArgumentException("Invalid format");
       }
    }
    public static final String guessFileName(String p0,String p1,String p2){
       int i = 47;
       String str = null;
       if (p1 != null) {
          p1 = URLUtil.parseContentDisposition(p1);
          if (p1 != null) {
             int i1 = p1.lastIndexOf(i) + 1;
             if (i1 > 0) {
                p1 = p1.substring(i1);
             }
          }
       }else {
          p1 = str;
       }
       if (p1 == null) {
          p0 = Uri.decode(p0);
          if (p0 != null) {
             int i2 = p0.indexOf(63);
             if (i2 > 0) {
                p0 = p0.substring(0, i2);
             }
             if (!p0.endsWith("/")) {
                i = p0.lastIndexOf(i) + 1;
                if (i > 0) {
                   p1 = p0.substring(i);
                }
             }
          }
       }
       if (p1 == null) {
          p1 = "downloadfile";
       }
       int i3 = 46;
       i = p1.indexOf(i3);
       if (i < 0) {
          if (p2 != null) {
             str = MimeTypeMap.getSingleton().getExtensionFromMimeType(p2);
             if (str != null) {
                str = "."+str;
             }
          }
          if (str == null) {
             if (p2 != null && (p2.toLowerCase(Locale.ROOT)).startsWith("text/")) {
                if (p2.equalsIgnoreCase("text/html")) {
                   str = ".html";
                }else {
                   str = ".txt";
                }
             }else {
                str = ".bin";
             }
          }
       }else if(p2 != null){
          i3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(p1.substring((p1.lastIndexOf(i3) + 1)));
          if (i3 != null && !i3.equalsIgnoreCase(p2)) {
             str = MimeTypeMap.getSingleton().getExtensionFromMimeType(p2);
             if (str != null) {
                str = "."+str;
             }
          }
       }
       if (str == null) {
          str = p1.substring(i);
       }
       p1 = p1.substring(0, i);
       return p1+str;
    }
    public static String guessUrl(String p0){
       if (!p0.length()) {
          return p0;
       }
       if (p0.startsWith("about:")) {
          return p0;
       }
       if (p0.startsWith("data:")) {
          return p0;
       }
       if (p0.startsWith("file:")) {
          return p0;
       }
       if (p0.startsWith("javascript:")) {
          return p0;
       }
       int i = 1;
       String str = (p0.endsWith(".") == i)? p0.substring(0, (p0.length() - i)): p0;
       try{
          WebAddress webAddress = new WebAddress(str);
          if ((webAddress.getHost()).indexOf(46) == -1) {
             webAddress.setHost("www."+webAddress.getHost()+".com");
          }
          p0 = webAddress.toString();
          return (webAddress.getHost()).indexOf(46);
       }catch(com.kuaishou.webkit.ParseException e0){
       }
    }
    public static boolean isAboutUrl(String p0){
       boolean b = (p0 != null && p0.startsWith("about:"))? true: false;
       return b;
    }
    public static boolean isAssetUrl(String p0){
       boolean b = (p0 != null && p0.startsWith("file:///android_asset/"))? true: false;
       return b;
    }
    public static boolean isContentUrl(String p0){
       boolean b = (p0 != null && p0.startsWith("content:"))? true: false;
       return b;
    }
    public static boolean isCookielessProxyUrl(String p0){
       boolean b = (p0 != null && p0.startsWith("file:///cookieless_proxy/"))? true: false;
       return b;
    }
    public static boolean isDataUrl(String p0){
       boolean b = (p0 != null && p0.startsWith("data:"))? true: false;
       return b;
    }
    public static boolean isFileUrl(String p0){
       boolean b = (p0 != null && (p0.startsWith("file:") && (!p0.startsWith("file:///android_asset/") && !p0.startsWith("file:///cookieless_proxy/"))))? true: false;
       return b;
    }
    public static boolean isHttpUrl(String p0){
       int i = 0;
       if (p0 != null && (p0.length() > 6 && (p0.substring(i, 7)).equalsIgnoreCase("http://"))) {
          i = true;
       }
    label_0018 :
       return i;
    }
    public static boolean isHttpsUrl(String p0){
       int i = 0;
       if (p0 != null && (p0.length() > 7 && (p0.substring(i, 8)).equalsIgnoreCase("https://"))) {
          i = true;
       }
    label_0019 :
       return i;
    }
    public static boolean isJavaScriptUrl(String p0){
       boolean b = (p0 != null && p0.startsWith("javascript:"))? true: false;
       return b;
    }
    public static boolean isNetworkUrl(String p0){
       boolean b = false;
       if (p0 == null || (p0.length() && (URLUtil.isHttpUrl(p0) || URLUtil.isHttpsUrl(p0)))) {
          b = true;
       }
    label_0017 :
       return b;
    }
    public static boolean isResourceUrl(String p0){
       boolean b = (p0 != null && p0.startsWith("file:///android_res/"))? true: false;
       return b;
    }
    public static boolean isValidUrl(String p0){
       boolean b = false;
       if (p0 == null || (p0.length() && (!URLUtil.isAssetUrl(p0) && (!URLUtil.isResourceUrl(p0) && (!URLUtil.isFileUrl(p0) && (!URLUtil.isAboutUrl(p0) && (!URLUtil.isHttpUrl(p0) && (!URLUtil.isHttpsUrl(p0) && (URLUtil.isJavaScriptUrl(p0) || URLUtil.isContentUrl(p0)))))))))) {
          b = true;
       }
    label_003b :
       return b;
    }
    public static String parseContentDisposition(String p0){
       try{
          Matcher matcher = URLUtil.CONTENT_DISPOSITION_PATTERN.matcher(p0);
          if (matcher.find()) {
             return matcher.group(2);
          }
          return null;
       }catch(java.lang.IllegalStateException e0){
       }
    }
    public static int parseHex(byte p0){
       byte b = 48;
       if (p0 >= b && p0 <= 57) {
          return (p0 - b);
       }
       b = 65;
       if (p0 < b || p0 > 70) {
          b = 97;
          if (p0 < b || p0 > 102) {
             throw new IllegalArgumentException("Invalid hex char \'"+p0+"\'");
          }
       }
       return ((p0 - b) + 10);
    }
    public static Pattern preload(){
       return URLUtil.CONTENT_DISPOSITION_PATTERN;
    }
    public static String stripAnchor(String p0){
       int i = p0.indexOf(35);
       if (i != -1) {
          p0 = p0.substring(0, i);
       }
       return p0;
    }
    public static boolean verifyURLEncoding(String p0){
       int i = p0.length();
       if (!i) {
          return false;
       }
       int i1 = p0.indexOf(37);
       while (true) {
          if (i1 < 0 || i1 >= i) {
             return true;
          }
          int i2 = i - 2;
          if (i1 < i2) {
             i1 = i1 + 1;
             try{
                URLUtil.parseHex((byte)p0.charAt(i1));
                i1 = i1 + 1;
                URLUtil.parseHex((byte)p0.charAt(i1));
                i1 = i1 + 1;
                i1 = p0.indexOf(37, i1);
             }catch(java.lang.IllegalArgumentException e0){
                break ;
             }
          }else {
          }
       }
       return false;
    }
}
