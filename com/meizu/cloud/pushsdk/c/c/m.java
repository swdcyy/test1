package com.meizu.cloud.pushsdk.c.c.m;
import java.lang.String;
import java.nio.charset.Charset;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.net.IDN;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.Closeable;

public class m	// class@0014e1
{
    public static final byte[] a;
    public static final String[] b;
    public static final Charset c;
    public static final TimeZone d;
    public static final Pattern e;

    static {
       byte[] uobyteArray = new byte[0];
       m.a = uobyteArray;
       String[] stringArray = new String[0];
       m.b = stringArray;
       m.c = Charset.forName("UTF-8");
       m.d = TimeZone.getTimeZone("GMT");
       m.e = Pattern.compile("\([0-9a-fA-F]*:[0-9a-fA-F:.]*\)|\([\\d.]+\)");
    }
    public static int a(String p0,int p1,int p2){
       while (true) {
          if (p1 >= p2) {
             return p2;
          }
          char c = p0.charAt(p1);
          if (c != 9 && (c != 10 && (c != 12 && (c != 13 && c != ' ')))) {
             break ;
          }else {
             p1++;
          }
       }
       return p1;
    }
    public static int a(String p0,int p1,int p2,char p3){
       while (true) {
          if (p1 >= p2) {
             return p2;
          }
          if (p0.charAt(p1) == p3) {
             break ;
          }else {
             p1++;
          }
       }
       return p1;
    }
    public static int a(String p0,int p1,int p2,String p3){
       while (true) {
          if (p1 >= p2) {
             return p2;
          }
          if (p3.indexOf(p0.charAt(p1)) != -1) {
             break ;
          }else {
             p1++;
          }
       }
       return p1;
    }
    public static String a(String p0){
       String str = null;
       try{
          p0 = (IDN.toASCII(p0)).toLowerCase(Locale.US);
          if (p0.isEmpty()) {
             return str;
          }
          if (m.b(p0)) {
             return str;
          }
          return p0;
       }catch(java.lang.IllegalArgumentException e0){
          return e0;
       }
    }
    public static List a(List p0){
       return Collections.unmodifiableList(new ArrayList(p0));
    }
    public static void a(long p0,long p1,long p2){
       if ((p1 | p2) >= 0 && (p1 - p0 <= 0 && (p0 - p1) - p2 >= 0)) {
          return;
       }
       throw new ArrayIndexOutOfBoundsException();
    }
    public static void a(Closeable p0){
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.lang.RuntimeException e0){
             throw e0;
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public static int b(String p0,int p1,int p2){
       p2--;
       while (true) {
          if (p2 < p1) {
             return p1;
          }
          char c = p0.charAt(p2);
          if (c != 9 && (c != 10 && (c != 12 && (c != 13 && c != ' ')))) {
             break ;
          }else {
             p2--;
          }
       }
       p2++;
       return p2;
    }
    public static boolean b(String p0){
       int i = 0;
       while (true) {
          if (i >= p0.length()) {
             return false;
          }
          char c = p0.charAt(i);
          if (c <= 31 || c >= 127) {
             break ;
          }else if((" #%/:?@[\\]").indexOf(c) != -1){
             return true;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
}
