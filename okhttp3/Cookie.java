package okhttp3.Cookie;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import okhttp3.Cookie$Builder;
import java.util.Objects;
import okhttp3.internal.Util;
import okhttp3.HttpUrl;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import java.lang.System;
import okhttp3.Headers;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.IllegalArgumentException;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.Integer;
import java.util.Locale;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Calendar;
import java.lang.Long;
import java.lang.StringBuilder;
import java.util.Date;
import okhttp3.internal.http.HttpDate;

public final class Cookie	// class@001f40
{
    public final String domain;
    public final long expiresAt;
    public final boolean hostOnly;
    public final boolean httpOnly;
    public final String name;
    public final String path;
    public final boolean persistent;
    public final boolean secure;
    public final String value;
    public static final Pattern DAY_OF_MONTH_PATTERN;
    public static final Pattern MONTH_PATTERN;
    public static final Pattern TIME_PATTERN;
    public static final Pattern YEAR_PATTERN;

    static {
       Cookie.YEAR_PATTERN = Pattern.compile("\(\\d{2,4}\)[^\\d]*");
       Cookie.MONTH_PATTERN = Pattern.compile("\(?i\)\(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec\).*");
       Cookie.DAY_OF_MONTH_PATTERN = Pattern.compile("\(\\d{1,2}\)[^\\d]*");
       Cookie.TIME_PATTERN = Pattern.compile("\(\\d{1,2}\):\(\\d{1,2}\):\(\\d{1,2}\)[^\\d]*");
    }
    public void Cookie(String p0,String p1,long p2,String p3,String p4,boolean p5,boolean p6,boolean p7,boolean p8){
       super();
       this.name = p0;
       this.value = p1;
       this.expiresAt = p2;
       this.domain = p3;
       this.path = p4;
       this.secure = p5;
       this.httpOnly = p6;
       this.hostOnly = p7;
       this.persistent = p8;
    }
    public void Cookie(Cookie$Builder p0){
       super();
       Cookie$Builder name = p0.name;
       Objects.requireNonNull(name, "builder.name == null");
       Cookie$Builder value = p0.value;
       Objects.requireNonNull(value, "builder.value == null");
       Cookie$Builder domain = p0.domain;
       Objects.requireNonNull(domain, "builder.domain == null");
       this.name = name;
       this.value = value;
       this.expiresAt = p0.expiresAt;
       this.domain = domain;
       this.path = p0.path;
       this.secure = p0.secure;
       this.httpOnly = p0.httpOnly;
       this.persistent = p0.persistent;
       this.hostOnly = p0.hostOnly;
    }
    public static int dateCharacterOffset(String p0,int p1,int p2,boolean p3){
       while (true) {
          if (p1 >= p2) {
             return p2;
          }
          char c = p0.charAt(p1);
          c = (c >= ' ' || (c == 9 && (c < 127 && (c < '0' || (c > '9' && (c < 'a' || (c <= 'z' || (c < 'A' || (c <= 'Z' || c == ':')))))))))? 1: 0;
          int i = p3 ^ 0x01;
          if (c == i) {
             break ;
          }else {
             p1++;
          }
       }
       return p1;
    }
    public static boolean domainMatch(String p0,String p1){
       if (p0.equals(p1)) {
          return true;
       }
       if (p0.endsWith(p1) && (p0.charAt(((p0.length() - p1.length()) - true)) == '.' && !Util.verifyAsIpAddress(p0))) {
          return true;
       }
       return false;
    }
    public static Cookie parse(long p0,HttpUrl p1,String p2){
       int i7;
       String str5;
       long l1;
       String str6;
       Cookie uCookie3;
       String str8;
       String str = p2;
       int i = p2.length();
       char c = ';';
       int i1 = Util.delimiterOffset(str, 0, i, c);
       char c1 = '=';
       int i2 = Util.delimiterOffset(str, 0, i1, c1);
       Cookie uCookie = null;
       if (i2 == i1) {
          return uCookie;
       }
       String str1 = Util.trimSubstring(str, 0, i2);
       if (!str1.isEmpty()) {
          int i3 = -1;
          if (Util.indexOfControlOrNonAscii(str1) == i3) {
             int i4 = 1;
             String str2 = Util.trimSubstring(str, (i2 + i4), i1);
             if (Util.indexOfControlOrNonAscii(str2) != i3) {
                return uCookie;
             }else {
                i1 = i1 + i4;
                String str3 = -1;
                Cookie uCookie1 = uCookie;
                Cookie uCookie2 = uCookie1;
                long l = str3;
                int i5 = 0xe677d21fdbff;
                boolean b = false;
                boolean b1 = false;
                boolean b2 = true;
                boolean b3 = false;
                while (i1 < i) {
                   int i6 = Util.delimiterOffset(str, i1, i, c);
                   i7 = Util.delimiterOffset(str, i1, i6, c1);
                   String str4 = Util.trimSubstring(str, i1, i7);
                   if (i7 < i6) {
                      i7 = i7 + 1;
                      str5 = Util.trimSubstring(str, i7, i6);
                   }else {
                      str5 = "";
                   }
                   try{
                      if (str4.equalsIgnoreCase("expires")) {
                         i5 = Cookie.parseExpires(str5, 0, str5.length());
                      label_0082 :
                         b3 = true;
                      }else if(str4.equalsIgnoreCase("max-age")){
                         try{
                            l = Cookie.parseMaxAge(str5);
                            goto label_0082 ;
                         }catch(java.lang.NumberFormatException e0){
                         }
                      }else if(str4.equalsIgnoreCase("domain")){
                         uCookie2 = Cookie.parseDomain(str5);
                         b2 = false;
                      }else if(str4.equalsIgnoreCase("path")){
                         uCookie1 = str5;
                      }else if(str4.equalsIgnoreCase("secure")){
                         b = true;
                      }else if(str4.equalsIgnoreCase("httponly")){
                         b1 = true;
                      }
                      i1 = i6 + 1;
                      c = ';';
                      c1 = '=';
                      i6 = 0;
                   }catch(java.lang.IllegalArgumentException e0){
                   }
                }
                str = Long.MIN_VALUE;
                if (!l - str) {
                label_00c0 :
                   l1 = str;
                }else if(l - str3){
                   l = (l - 0x20c49ba5e353f7 <= 0)? l * 1000: Long.MAX_VALUE;
                   long l2 = p0 + l;
                   if (l2 - p0 < 0 || l2 - 0xe677d21fdbff > 0) {
                      l1 = 0xe677d21fdbff;
                   }else {
                      goto label_00c0 ;
                   }
                }else {
                   l1 = i5;
                }
                str = p1.host();
                if (uCookie2 == null) {
                   str6 = str;
                   uCookie3 = null;
                }else if(!Cookie.domainMatch(str, uCookie2)){
                   return null;
                }else {
                   uCookie3 = null;
                   str6 = uCookie2;
                }
                if (str.length() != str6.length() && PublicSuffixDatabase.get().getEffectiveTldPlusOne(str6) == null) {
                   return uCookie3;
                }else {
                   str = "/";
                   if (uCookie1 == null || !uCookie1.startsWith(str)) {
                      String str7 = p1.encodedPath();
                      i7 = str7.lastIndexOf(47);
                      if (i7) {
                         str = str7.substring(0, i7);
                      }
                      str8 = str;
                   }else {
                      str8 = uCookie1;
                   }
                   uCookie1 = new Cookie(str1, str2, l1, str6, str8, b, b1, b2, b3);
                   return str;
                }
             }
          }
       }
       return uCookie;
    }
    public static Cookie parse(HttpUrl p0,String p1){
       return Cookie.parse(System.currentTimeMillis(), p0, p1);
    }
    public static List parseAll(HttpUrl p0,Headers p1){
       List list = p1.values("Set-Cookie");
       int i = list.size();
       ArrayList uArrayList = null;
       int i1 = 0;
       while (i1 < i) {
          Cookie uCookie = Cookie.parse(p0, list.get(i1));
          if (uCookie != null) {
             if (uArrayList == null) {
                uArrayList = new ArrayList();
             }
             uArrayList.add(uCookie);
          }
          i1 = i1 + 1;
       }
       List list1 = (uArrayList != null)? Collections.unmodifiableList(uArrayList): Collections.emptyList();
       return list1;
    }
    public static String parseDomain(String p0){
       String str = ".";
       if (p0.endsWith(str)) {
          throw new IllegalArgumentException();
       }
       if (p0.startsWith(str)) {
          p0 = p0.substring(1);
       }
       p0 = Util.canonicalizeHost(p0);
       if (p0 != null) {
          return p0;
       }else {
          throw new IllegalArgumentException();
       }
    }
    public static long parseExpires(String p0,int p1,int p2){
       p1 = Cookie.dateCharacterOffset(p0, p1, p2, false);
       Matcher matcher = Cookie.TIME_PATTERN.matcher(p0);
       int i = -1;
       int i1 = -1;
       int i2 = -1;
       String str = -1;
       int i3 = -1;
       int i4 = -1;
       int i5 = 2;
       while (p1 < p2) {
          int i6 = p1 + 1;
          i6 = Cookie.dateCharacterOffset(p0, i6, p2, true);
          matcher.region(p1, i6);
          if (i1 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
             i1 = Integer.parseInt(matcher.group(true));
             i3 = Integer.parseInt(matcher.group(i5));
             i4 = Integer.parseInt(matcher.group(3));
          }else if(i2 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()){
             i2 = Integer.parseInt(matcher.group(true));
          }else if(str == -1){
             Pattern mONTH_PATTER = Cookie.MONTH_PATTERN;
             if (matcher.usePattern(mONTH_PATTER).matches()) {
                str = (mONTH_PATTER.pattern()).indexOf((matcher.group(true)).toLowerCase(Locale.US)) / 4;
             }
          }
          if (i == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
             i = Integer.parseInt(matcher.group(true));
          }
          i6 = i6 + 1;
          p1 = Cookie.dateCharacterOffset(p0, i6, p2, false);
       }
       if (i >= 70 && i <= 99) {
          i = i + 1900;
       }
       if (i >= 0 && i <= 69) {
          i = i + 2000;
       }
       if (i >= 1601) {
          if (str != -1) {
             if (i2 >= 1 && i2 <= 31) {
                if (i1 >= 0 && i1 <= 23) {
                   if (i3 >= 0) {
                      GregorianCalendar gregorianCal = 59;
                      if (i3 <= gregorianCal) {
                         if (i4 >= 0 && i4 <= gregorianCal) {
                            gregorianCal = new GregorianCalendar(Util.UTC);
                            gregorianCal.setLenient(false);
                            gregorianCal.set(true, i);
                            gregorianCal.set(i5, (str - true));
                            gregorianCal.set(5, i2);
                            gregorianCal.set(11, i1);
                            gregorianCal.set(12, i3);
                            gregorianCal.set(13, i4);
                            gregorianCal.set(14, false);
                            return gregorianCal.getTimeInMillis();
                         }else {
                            throw new IllegalArgumentException();
                         }
                      }
                   }
                   throw new IllegalArgumentException();
                }else {
                   throw new IllegalArgumentException();
                }
             }else {
                throw new IllegalArgumentException();
             }
          }else {
             throw new IllegalArgumentException();
          }
       }else {
          throw new IllegalArgumentException();
       }
    }
    public static long parseMaxAge(String p0){
       long l1;
       long l = Long.MIN_VALUE;
       try{
          l1 = Long.parseLong(p0);
          if (l1 > 0) {
             l = l1;
          }
          return l;
       }catch(java.lang.NumberFormatException e2){
          if (l1.matches("-?\\d+")) {
             if (!l1.startsWith("-")) {
                l = Long.MAX_VALUE;
             }
             return l;
          }else {
             throw e2;
          }
       }
    }
    public static boolean pathMatch(HttpUrl p0,String p1){
       String str = p0.encodedPath();
       if (str.equals(p1)) {
          return true;
       }
       if (str.startsWith(p1)) {
          if (p1.endsWith("/")) {
             return true;
          }else if(str.charAt(p1.length()) == '/'){
             return true;
          }
       }
       return false;
    }
    public String domain(){
       return this.domain;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof Cookie) {
          return b;
       }
       if ((p0.name).equals(this.name) && ((p0.value).equals(this.value) && ((p0.domain).equals(this.domain) && ((p0.path).equals(this.path) && (!p0.expiresAt - this.expiresAt && (p0.secure == this.secure && (p0.httpOnly == this.httpOnly && (p0.persistent == this.persistent && p0.hostOnly == this.hostOnly)))))))) {
          b = true;
       }
    label_0051 :
       return b;
    }
    public long expiresAt(){
       return this.expiresAt;
    }
    public int hashCode(){
       Cookie texpiresAt = this.expiresAt;
       return (((((((((((((((((527 + (this.name).hashCode()) * 31) + (this.value).hashCode()) * 31) + (this.domain).hashCode()) * 31) + (this.path).hashCode()) * 31) + (int)(texpiresAt ^ (texpiresAt >> 32))) * 31) + (this.secure ^ 0x01)) * 31) + (this.httpOnly ^ 0x01)) * 31) + (this.persistent ^ 0x01)) * 31) + (this.hostOnly ^ 0x01));
    }
    public boolean hostOnly(){
       return this.hostOnly;
    }
    public boolean httpOnly(){
       return this.httpOnly;
    }
    public boolean matches(HttpUrl p0){
       boolean b = (this.hostOnly != null)? (p0.host()).equals(this.domain): Cookie.domainMatch(p0.host(), this.domain);
       if (!b) {
          return false;
       }else if(!Cookie.pathMatch(p0, this.path)){
          return false;
       }else if(this.secure != null && !p0.isHttps()){
          return false;
       }else {
          return true;
       }
    }
    public String name(){
       return this.name;
    }
    public String path(){
       return this.path;
    }
    public boolean persistent(){
       return this.persistent;
    }
    public boolean secure(){
       return this.secure;
    }
    public String toString(){
       return this.toString(false);
    }
    public String toString(boolean p0){
       StringBuilder str = this.name+'='+this.value;
       if (this.persistent != null) {
          str = (!this.expiresAt - Long.MIN_VALUE)? str+"; max-age=0": str+"; expires="+HttpDate.format(new Date(this.expiresAt));
       }
    label_0039 :
       if (this.hostOnly == null) {
          str = str+"; domain=";
          if (p0) {
             str = str+".";
          }
          str = str+this.domain;
       }
       str = str+"; path="+this.path;
       if (this.secure != null) {
          str = str+"; secure";
       }
       if (this.httpOnly != null) {
          str = str+"; httponly";
       }
       return str;
    }
    public String value(){
       return this.value;
    }
}
