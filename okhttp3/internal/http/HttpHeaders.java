package okhttp3.internal.http.HttpHeaders;
import java.lang.String;
import okio.ByteString;
import java.lang.Object;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.Request;
import java.util.Set;
import java.util.List;
import okio.b;
import okhttp3.Challenge;
import java.util.Map;
import java.util.Collections;
import java.lang.StringBuilder;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.IllegalArgumentException;
import java.lang.AssertionError;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.Cookie;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Comparator;
import okhttp3.Headers$Builder;
import java.util.Iterator;
import okhttp3.internal.Util;

public final class HttpHeaders	// class@0020b7
{
    public static final ByteString QUOTED_STRING_DELIMITERS;
    public static final ByteString TOKEN_DELIMITERS;

    static {
       HttpHeaders.QUOTED_STRING_DELIMITERS = ByteString.encodeUtf8("\"\\");
       HttpHeaders.TOKEN_DELIMITERS = ByteString.encodeUtf8("\t ,=");
    }
    public void HttpHeaders(){
       super();
    }
    public static long contentLength(Headers p0){
       return HttpHeaders.stringToLong(p0.get("Content-Length"));
    }
    public static long contentLength(Response p0){
       return HttpHeaders.contentLength(p0.headers());
    }
    public static boolean hasBody(Response p0){
       if ((p0.request().method()).equals("HEAD")) {
          return false;
       }
       int i = p0.code();
       if (i < 100 || (i >= 200 && (i != 204 && i != 304))) {
          return true;
       }
       if (HttpHeaders.contentLength(p0) - -1 || ("chunked").equalsIgnoreCase(p0.header("Transfer-Encoding"))) {
          return true;
       }
       return false;
    }
    public static boolean hasVaryAll(Headers p0){
       return HttpHeaders.varyFields(p0).contains("*");
    }
    public static boolean hasVaryAll(Response p0){
       return HttpHeaders.hasVaryAll(p0.headers());
    }
    public static void parseChallengeHeader(List p0,b p1){
       String str2;
       Map map = null;
       while (true) {
          String str = map;
          break ;
       }
       while (true) {
          if (str == null) {
             HttpHeaders.skipWhitespaceAndCommas(p1);
             str = HttpHeaders.readToken(p1);
             if (str == null) {
                return;
             }
          label_000e :
             boolean b = HttpHeaders.skipWhitespaceAndCommas(p1);
             String str1 = HttpHeaders.readToken(p1);
             if (str1 == null) {
                if (!p1.exhausted()) {
                   return;
                }else {
                   p0.add(new Challenge(str, Collections.emptyMap()));
                   return;
                }
             }else {
                byte b1 = 61;
                int i = HttpHeaders.skipAll(p1, b1);
                boolean b2 = HttpHeaders.skipWhitespaceAndCommas(p1);
                if (!b && (b2 || p1.exhausted())) {
                   p0.add(new Challenge(str, Collections.singletonMap(map, str1+HttpHeaders.repeat(b1, i))));
                }else {
                   LinkedHashMap linkedHashMa = new LinkedHashMap();
                   i = i + HttpHeaders.skipAll(p1, b1);
                   while (true) {
                      if (str1 == null) {
                         str1 = HttpHeaders.readToken(p1);
                         if (HttpHeaders.skipWhitespaceAndCommas(p1)) {
                         label_007d :
                            p0.add(new Challenge(str, linkedHashMa));
                            str = str1;
                         }else {
                            i = HttpHeaders.skipAll(p1, b1);
                         label_007b :
                            if (!i) {
                               goto label_007d ;
                            }else if(i > 1){
                               return;
                            }else if(HttpHeaders.skipWhitespaceAndCommas(p1)){
                               return;
                            }else if(!p1.exhausted() && p1.g(0) == 34){
                               str2 = HttpHeaders.readQuotedString(p1);
                            }else {
                               str2 = HttpHeaders.readToken(p1);
                            }
                            if (str2 == null) {
                               return;
                            }else if(linkedHashMa.put(str1, str2) != null){
                               return;
                            }else if(!HttpHeaders.skipWhitespaceAndCommas(p1) && !p1.exhausted()){
                               break ;
                            }else {
                               str1 = map;
                            }
                         }
                      }else {
                         goto label_007b ;
                      }
                   }
                   return;
                }
             }
          }else {
             goto label_000e ;
          }
       }
    }
    public static List parseChallenges(Headers p0,String p1){
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       while (i < p0.size()) {
          if (p1.equalsIgnoreCase(p0.name(i))) {
             b uob = new b();
             uob.P(p0.value(i));
             HttpHeaders.parseChallengeHeader(uArrayList, uob);
          }
          i = i + 1;
       }
       return uArrayList;
    }
    public static int parseSeconds(String p0,int p1){
       try{
          long l = Long.parseLong(p0);
          if (l - 0x7fffffff > 0) {
             return Integer.MAX_VALUE;
          }
          if (l < 0) {
             return 0;
          }
          p1 = (int)l;
          return p1;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public static String readQuotedString(b p0){
       if (p0.readByte() != 34) {
          throw new IllegalArgumentException();
       }
       b uob = new b();
       while (true) {
          long l = p0.N(HttpHeaders.QUOTED_STRING_DELIMITERS);
          if (!l - -1) {
             return null;
          }
          if (p0.g(l) == 34) {
             uob.write(p0, l);
             p0.readByte();
             return uob.readUtf8();
          }else {
             long l1 = 1;
             long l2 = l + l1;
             if (!p0.p() - l2) {
                break ;
             }else {
                uob.write(p0, l);
                p0.readByte();
                uob.write(p0, l1);
             }
          }
       }
       return null;
    }
    public static String readToken(b p0){
       try{
          long l = p0.N(HttpHeaders.TOKEN_DELIMITERS);
          if (!l - -1) {
             l = p0.p();
          }
          String str = (l)? p0.readUtf8(l): null;
          return str;
       }catch(java.io.EOFException e0){
          throw new AssertionError();
       }
    }
    public static void receiveHeaders(CookieJar p0,HttpUrl p1,Headers p2){
       if (p0 == CookieJar.NO_COOKIES) {
          return;
       }
       List list = Cookie.parseAll(p1, p2);
       if (list.isEmpty()) {
          return;
       }
       p0.saveFromResponse(p1, list);
       return;
    }
    public static String repeat(char p0,int p1){
       char[] uocharArray = new char[p1];
       Arrays.fill(uocharArray, p0);
       return new String(uocharArray);
    }
    public static int skipAll(b p0,byte p1){
       int i = 0;
       while (!p0.exhausted() && p0.g(0) == p1) {
          i = i + 1;
          p0.readByte();
       }
       return i;
    }
    public static int skipUntil(String p0,int p1,String p2){
       while (p1 < p0.length() && p2.indexOf(p0.charAt(p1)) == -1) {
          p1++;
       }
       return p1;
    }
    public static int skipWhitespace(String p0,int p1){
       while (p1 < p0.length()) {
          char c = p0.charAt(p1);
          if (c != ' ' && c != 9) {
             break ;
          }else {
             p1++;
          }
       }
       return p1;
    }
    public static boolean skipWhitespaceAndCommas(b p0){
       boolean b = false;
       while (!p0.exhausted()) {
          byte b1 = p0.g(0);
          if (b1 == 44) {
             p0.readByte();
             b = true;
          }else if(b1 == 32 || b1 == 9){
             p0.readByte();
          }else {
             break ;
          }
       }
       return b;
    }
    public static long stringToLong(String p0){
       long l = -1;
       if (p0 == null) {
          return l;
       }
       try{
          l = Long.parseLong(p0);
          return e0;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public static Set varyFields(Headers p0){
       Set set = Collections.emptySet();
       int i = p0.size();
       int i1 = 0;
       while (i1 < i) {
          if (("Vary").equalsIgnoreCase(p0.name(i1))) {
             String str = p0.value(i1);
             if (set.isEmpty()) {
                set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
             }
             String[] stringArray = str.split(",");
             int len = stringArray.length;
             for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                set.add((stringArray[i2]).trim());
             }
          }
          i1 = i1 + 1;
       }
       return set;
    }
    public static Set varyFields(Response p0){
       return HttpHeaders.varyFields(p0.headers());
    }
    public static Headers varyHeaders(Headers p0,Headers p1){
       Set set = HttpHeaders.varyFields(p1);
       if (set.isEmpty()) {
          return new Headers$Builder().build();
       }
       Headers$Builder uBuilder = new Headers$Builder();
       int i = 0;
       int i1 = p0.size();
       while (i < i1) {
          String str = p0.name(i);
          if (set.contains(str)) {
             uBuilder.add(str, p0.value(i));
          }
          i = i + 1;
       }
       return uBuilder.build();
    }
    public static Headers varyHeaders(Response p0){
       return HttpHeaders.varyHeaders(p0.networkResponse().request().headers(), p0.headers());
    }
    public static boolean varyMatches(Response p0,Headers p1,Request p2){
       Iterator iterator = HttpHeaders.varyFields(p0).iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          String str = iterator.next();
          List list = p1.values(str);
          if (!Util.equal(list, p2.headers(str))) {
             break ;
          }
       }
       return false;
    }
}
