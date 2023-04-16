package okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.nio.charset.Charset;
import java.lang.Character;
import okio.b;
import okhttp3.internal.Util;
import java.net.URI;
import java.net.URL;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.lang.IndexOutOfBoundsException;
import java.util.Set;
import java.util.LinkedHashSet;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class HttpUrl	// class@00207d
{
    public final String fragment;
    public final String host;
    public final String password;
    public final List pathSegments;
    public final int port;
    public final List queryNamesAndValues;
    public final String scheme;
    public final String url;
    public final String username;
    public static final char[] HEX_DIGITS;

    static {
       HttpUrl.HEX_DIGITS = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    }
    public void HttpUrl(HttpUrl$Builder p0){
       super();
       this.scheme = p0.scheme;
       this.username = HttpUrl.percentDecode(p0.encodedUsername, false);
       this.password = HttpUrl.percentDecode(p0.encodedPassword, false);
       this.host = p0.host;
       this.port = p0.effectivePort();
       this.pathSegments = this.percentDecode(p0.encodedPathSegments, false);
       HttpUrl$Builder encodedQuery = p0.encodedQueryNamesAndValues;
       String str = null;
       List list = (encodedQuery != null)? this.percentDecode(encodedQuery, true): str;
       this.queryNamesAndValues = list;
       encodedQuery = p0.encodedFragment;
       if (encodedQuery != null) {
          str = HttpUrl.percentDecode(encodedQuery, false);
       }
       this.fragment = str;
       this.url = p0.toString();
       return;
    }
    public static String canonicalize(String p0,int p1,int p2,String p3,boolean p4,boolean p5,boolean p6,boolean p7,Charset p8){
       int i = p2;
       int i1 = p1;
       while (true) {
          if (i1 >= i) {
             return p0.substring(p1, p2);
          }
          int i2 = p0.codePointAt(i1);
          if (i2 >= 32 && (i2 != 127 && (i2 < 128 || !p7))) {
             if (p3.indexOf(i2) == -1 && (i2 == 37 && (!p4 || (p5 && (HttpUrl.percentEncoded(p0, i1, p2) && (i2 != 43 || !p6)))))) {
                i1 = i1 + Character.charCount(i2);
             }
          }else {
             int i3 = p3;
             break ;
          }
          break ;
       }
       b uob = new b();
       uob.Q(p0, p1, i1);
       HttpUrl.canonicalize(uob, p0, i1, p2, p3, p4, p5, p6, p7, p8);
       return uob.readUtf8();
    }
    public static String canonicalize(String p0,String p1,boolean p2,boolean p3,boolean p4,boolean p5){
       return HttpUrl.canonicalize(p0, 0, p0.length(), p1, p2, p3, p4, p5, null);
    }
    public static String canonicalize(String p0,String p1,boolean p2,boolean p3,boolean p4,boolean p5,Charset p6){
       return HttpUrl.canonicalize(p0, 0, p0.length(), p1, p2, p3, p4, p5, p6);
    }
    public static void canonicalize(b p0,String p1,int p2,int p3,String p4,boolean p5,boolean p6,boolean p7,boolean p8,Charset p9){
       int i1;
       b uob = null;
       for (; p2 < p3; p2 = p2 + Character.charCount(i)) {
          int i = p1.codePointAt(p2);
          if (!p5 || (i == 9 || (i == 10 || (i != 12 && i != 13)))) {
             if (i == 43 && p7) {
                String str = (p5)? "+": "%2B";
                p0.P(str);
             }else if(i >= 32 && (i != 127 && (i < 128 || (!p8 && (p4.indexOf(i) != -1 || (i == 37 && (!p5 || (p6 && !HttpUrl.percentEncoded(p1, p2, p3))))))))){
                if (uob == null) {
                   uob = new b();
                }
                if (p9 == null || p9.equals(Util.UTF_8)) {
                   uob.R(i);
                }else {
                   i1 = Character.charCount(i) + p2;
                   uob.M(p1, p2, i1, p9);
                }
                while (!uob.exhausted()) {
                   i1 = uob.readByte() & 0x00ff;
                   p0.y(37);
                   char[] hEX_DIGITS = HttpUrl.HEX_DIGITS;
                   int i2 = i1 >> 4;
                   i2 = i2 & 0x0f;
                   p0.y(hEX_DIGITS[i2]);
                   i1 = i1 & 0x0f;
                   p0.y(hEX_DIGITS[i1]);
                }
             }else {
                p0.R(i);
             }
          }
       }
       return;
    }
    public static int defaultPort(String p0){
       if (p0.equals("http")) {
          return 80;
       }
       if (p0.equals("https")) {
          return 443;
       }
       return -1;
    }
    public static HttpUrl get(String p0){
       return new HttpUrl$Builder().parse(null, p0).build();
    }
    public static HttpUrl get(URI p0){
       return HttpUrl.parse(p0.toString());
    }
    public static HttpUrl get(URL p0){
       return HttpUrl.parse(p0.toString());
    }
    public static void namesAndValuesToQueryString(StringBuilder p0,List p1){
       int i = p1.size();
       int i1 = 0;
       while (i1 < i) {
          String str = p1.get(i1);
          int i2 = i1 + 1;
          String str1 = p1.get(i2);
          if (i1 > 0) {
             p0 = p0+'&';
          }
          p0 = p0+str;
          if (str1 != null) {
             p0 = p0+'='+str1;
          }
          i1 = i1 + 2;
       }
       return;
    }
    public static HttpUrl parse(String p0){
       try{
          return HttpUrl.get(p0);
       }catch(java.lang.IllegalArgumentException e0){
          return null;
       }
    }
    public static void pathSegmentsToString(StringBuilder p0,List p1){
       int i = p1.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          p0+'/'+p1.get(i1);
       }
       return;
    }
    public static String percentDecode(String p0,int p1,int p2,boolean p3){
       int i = p1;
       while (true) {
          if (i >= p2) {
             return p0.substring(p1, p2);
          }
          char c = p0.charAt(i);
          if (c == '%' || (c == '+' && p3)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       b uob = new b();
       uob.Q(p0, p1, i);
       HttpUrl.percentDecode(uob, p0, i, p2, p3);
       return uob.readUtf8();
    }
    public static String percentDecode(String p0,boolean p1){
       return HttpUrl.percentDecode(p0, 0, p0.length(), p1);
    }
    public static void percentDecode(b p0,String p1,int p2,int p3,boolean p4){
       while (p2 < p3) {
          int i = p1.codePointAt(p2);
          if (i == 37) {
             int i1 = p2 + 2;
             if (i1 < p3) {
                int i2 = p2 + 1;
                i2 = Util.decodeHexDigit(p1.charAt(i2));
                int i3 = Util.decodeHexDigit(p1.charAt(i1));
                if (i2 != -1 && i3 != -1) {
                   p2 = i2 << 4;
                   p2 = p2 + i3;
                   p0.y(p2);
                   p2 = i1;
                }else {
                label_0039 :
                   p0.R(i);
                }
             }else if(i == 43 && p4){
                p0.y(32);
             }else {
                goto label_0039 ;
             }
          }else {
             goto label_002d ;
          }
          p2 = p2 + Character.charCount(i);
       }
       return;
    }
    public static boolean percentEncoded(String p0,int p1,int p2){
       int i = p1 + 2;
       int i1 = 1;
       if (i >= p2 || (p0.charAt(p1) != '%' || (Util.decodeHexDigit(p0.charAt((p1 + i1))) == -1 || Util.decodeHexDigit(p0.charAt(i)) == -1))) {
          i1 = false;
       }
       return i1;
    }
    public static List queryStringToNamesAndValues(String p0){
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       while (i <= p0.length()) {
          int i1 = p0.indexOf(38, i);
          if (i1 == -1) {
             i1 = p0.length();
          }
          int i2 = p0.indexOf(61, i);
          if (i2 == -1 || i2 > i1) {
             uArrayList.add(p0.substring(i, i1));
             uArrayList.add(null);
          }else {
             uArrayList.add(p0.substring(i, i2));
             i2 = i2 + 1;
             uArrayList.add(p0.substring(i2, i1));
          }
          i = i1 + 1;
       }
       return uArrayList;
    }
    public String encodedFragment(){
       if (this.fragment == null) {
          return null;
       }
       return (this.url).substring(((this.url).indexOf(35) + 1));
    }
    public String encodedPassword(){
       if ((this.password).isEmpty()) {
          return "";
       }
       return (this.url).substring(((this.url).indexOf(58, ((this.scheme).length() + 3)) + 1), (this.url).indexOf(64));
    }
    public String encodedPath(){
       int i = (this.url).indexOf(47, ((this.scheme).length() + 3));
       HttpUrl turl = this.url;
       return (this.url).substring(i, Util.delimiterOffset(turl, i, turl.length(), "?#"));
    }
    public List encodedPathSegments(){
       int i = (this.url).indexOf(47, ((this.scheme).length() + 3));
       HttpUrl turl = this.url;
       int i1 = Util.delimiterOffset(turl, i, turl.length(), "?#");
       ArrayList uArrayList = new ArrayList();
       for (; i < i1; i = i2) {
          i = i + 1;
          int i2 = Util.delimiterOffset(this.url, i, i1, 47);
          uArrayList.add((this.url).substring(i, i2));
       }
       return uArrayList;
    }
    public String encodedQuery(){
       if (this.queryNamesAndValues == null) {
          return null;
       }
       int i = (this.url).indexOf(63) + 1;
       HttpUrl turl = this.url;
       return (this.url).substring(i, Util.delimiterOffset(turl, i, turl.length(), '#'));
    }
    public String encodedUsername(){
       if ((this.username).isEmpty()) {
          return "";
       }
       int i = (this.scheme).length() + 3;
       HttpUrl turl = this.url;
       return (this.url).substring(i, Util.delimiterOffset(turl, i, turl.length(), ":@"));
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof HttpUrl && (p0.url).equals(this.url))? true: false;
       return b;
    }
    public String fragment(){
       return this.fragment;
    }
    public int hashCode(){
       return (this.url).hashCode();
    }
    public String host(){
       return this.host;
    }
    public boolean isHttps(){
       return (this.scheme).equals("https");
    }
    public HttpUrl$Builder newBuilder(){
       HttpUrl$Builder uBuilder = new HttpUrl$Builder();
       uBuilder.scheme = this.scheme;
       uBuilder.encodedUsername = this.encodedUsername();
       uBuilder.encodedPassword = this.encodedPassword();
       uBuilder.host = this.host;
       HttpUrl tport = (this.port != HttpUrl.defaultPort(this.scheme))? this.port: -1;
       uBuilder.port = tport;
       uBuilder.encodedPathSegments.clear();
       uBuilder.encodedPathSegments.addAll(this.encodedPathSegments());
       uBuilder.encodedQuery(this.encodedQuery());
       uBuilder.encodedFragment = this.encodedFragment();
       return uBuilder;
    }
    public HttpUrl$Builder newBuilder(String p0){
       try{
          return new HttpUrl$Builder().parse(this, p0);
       }catch(java.lang.IllegalArgumentException e0){
          return null;
       }
    }
    public String password(){
       return this.password;
    }
    public List pathSegments(){
       return this.pathSegments;
    }
    public int pathSize(){
       return this.pathSegments.size();
    }
    public final List percentDecode(List p0,boolean p1){
       int i = p0.size();
       ArrayList uArrayList = new ArrayList(i);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          String str = p0.get(i1);
          str = (str != null)? HttpUrl.percentDecode(str, p1): null;
          uArrayList.add(str);
       }
       return Collections.unmodifiableList(uArrayList);
    }
    public int port(){
       return this.port;
    }
    public String query(){
       if (this.queryNamesAndValues == null) {
          return null;
       }
       StringBuilder str = "";
       HttpUrl.namesAndValuesToQueryString(str, this.queryNamesAndValues);
       return str;
    }
    public String queryParameter(String p0){
       HttpUrl tqueryNamesA = this.queryNamesAndValues;
       if (tqueryNamesA == null) {
          return null;
       }
       int i = 0;
       int i1 = tqueryNamesA.size();
       while (true) {
          if (i >= i1) {
             return null;
          }
          if (p0.equals(this.queryNamesAndValues.get(i))) {
             break ;
          }else {
             i = i + 2;
          }
       }
       return this.queryNamesAndValues.get((i + 1));
    }
    public String queryParameterName(int p0){
       HttpUrl tqueryNamesA = this.queryNamesAndValues;
       if (tqueryNamesA != null) {
          return tqueryNamesA.get((p0 * 2));
       }
       throw new IndexOutOfBoundsException();
    }
    public Set queryParameterNames(){
       if (this.queryNamesAndValues == null) {
          return Collections.emptySet();
       }
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       int i1 = this.queryNamesAndValues.size();
       for (int i = 0; i < i1; i = i + 2) {
          linkedHashSe.add(this.queryNamesAndValues.get(i));
       }
       return Collections.unmodifiableSet(linkedHashSe);
    }
    public String queryParameterValue(int p0){
       HttpUrl tqueryNamesA = this.queryNamesAndValues;
       if (tqueryNamesA != null) {
          return tqueryNamesA.get(((p0 * 2) + 1));
       }
       throw new IndexOutOfBoundsException();
    }
    public List queryParameterValues(String p0){
       if (this.queryNamesAndValues == null) {
          return Collections.emptyList();
       }
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       int i1 = this.queryNamesAndValues.size();
       while (i < i1) {
          if (p0.equals(this.queryNamesAndValues.get(i))) {
             int i2 = i + 1;
             uArrayList.add(this.queryNamesAndValues.get(i2));
          }
          i = i + 2;
       }
       return Collections.unmodifiableList(uArrayList);
    }
    public int querySize(){
       HttpUrl tqueryNamesA = this.queryNamesAndValues;
       int i = (tqueryNamesA != null)? tqueryNamesA.size() / 2: 0;
       return i;
    }
    public String redact(){
       return this.newBuilder("/...").username("").password("").build().toString();
    }
    public HttpUrl resolve(String p0){
       HttpUrl$Builder uBuilder = this.newBuilder(p0);
       HttpUrl httpUrl = (uBuilder != null)? uBuilder.build(): null;
       return httpUrl;
    }
    public String scheme(){
       return this.scheme;
    }
    public String toString(){
       return this.url;
    }
    public String topPrivateDomain(){
       if (Util.verifyAsIpAddress(this.host)) {
          return null;
       }
       return PublicSuffixDatabase.get().getEffectiveTldPlusOne(this.host);
    }
    public URI uri(){
       String str = this.newBuilder().reencodeForUri().toString();
       try{
          return new URI(str);
       }catch(java.net.URISyntaxException e1){
          try{
             return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
          }catch(java.lang.Exception e0){
             throw new RuntimeException(e1);
          }
       }
    }
    public URL url(){
       try{
          return new URL(this.url);
       }catch(java.net.MalformedURLException e0){
          throw new RuntimeException(e0);
       }
    }
    public String username(){
       return this.username;
    }
}
