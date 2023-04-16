package okhttp3.HttpUrl$Builder;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import java.nio.charset.Charset;
import java.lang.Integer;
import java.util.Objects;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Collection;

public final class HttpUrl$Builder	// class@00207c
{
    public String encodedFragment;
    public String encodedPassword;
    public final List encodedPathSegments;
    public List encodedQueryNamesAndValues;
    public String encodedUsername;
    public String host;
    public int port;
    public String scheme;

    public void HttpUrl$Builder(){
       super();
       this.encodedUsername = "";
       this.encodedPassword = "";
       this.port = -1;
       ArrayList uArrayList = new ArrayList();
       this.encodedPathSegments = uArrayList;
       uArrayList.add("");
    }
    public static String canonicalizeHost(String p0,int p1,int p2){
       return Util.canonicalizeHost(HttpUrl.percentDecode(p0, p1, p2, false));
    }
    public static int parsePort(String p0,int p1,int p2){
       int i = -1;
       try{
          int i1 = Integer.parseInt(HttpUrl.canonicalize(p0, p1, p2, "", false, false, false, true, null));
          if (i1 > 0 && i1 <= 0xffff) {
             return i1;
          }
          return e0;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public static int portColonOffset(String p0,int p1,int p2){
       while (true) {
          if (p1 >= p2) {
             return p2;
          }
          char c = p0.charAt(p1);
          if (c != ':') {
             if (c == '[') {
                do {
                   p1++;
                } while (p1 >= p2 || p0.charAt(p1) == ']');
             }
             p1++;
          }else {
             break ;
          }
       }
       return p1;
    }
    public static int schemeDelimiterOffset(String p0,int p1,int p2){
       int i = p2 - p1;
       if (i < 2) {
          return -1;
       }
       char c = p0.charAt(p1);
       if (c >= 'a' && (c <= 'z' || (c >= 'A' && c <= 'Z'))) {
          p1++;
          while (p1 < p2) {
             c = p0.charAt(p1);
             if (c < 'a' || (c > 'z' && (c < 'A' || (c <= 'Z' || (c < '0' || (c > '9' && (c != '+' && (c == '-' || c == '.')))))))) {
             }else if(c == ':'){
                return p1;
             }
          }
       }
       return -1;
    }
    public static int slashCount(String p0,int p1,int p2){
       int i = 0;
       for (; p1 < p2; p1++) {
          char c = p0.charAt(p1);
          if (c == '\' || c == '/') {
             i = i + 1;
          }else {
             break ;
          }
       }
       return i;
    }
    public HttpUrl$Builder addEncodedPathSegment(String p0){
       Objects.requireNonNull(p0, "encodedPathSegment == null");
       this.push(p0, 0, p0.length(), false, true);
       return this;
    }
    public HttpUrl$Builder addEncodedPathSegments(String p0){
       Objects.requireNonNull(p0, "encodedPathSegments == null");
       return this.addPathSegments(p0, true);
    }
    public HttpUrl$Builder addEncodedQueryParameter(String p0,String p1){
       Objects.requireNonNull(p0, "encodedName == null");
       if (this.encodedQueryNamesAndValues == null) {
          this.encodedQueryNamesAndValues = new ArrayList();
       }
       this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(p0, " \"\'<>#&=", true, false, true, true));
       HttpUrl$Builder tencodedQuer = this.encodedQueryNamesAndValues;
       p1 = (p1 != null)? HttpUrl.canonicalize(p1, " \"\'<>#&=", true, false, true, true): null;
       tencodedQuer.add(p1);
       return this;
    }
    public HttpUrl$Builder addPathSegment(String p0){
       Objects.requireNonNull(p0, "pathSegment == null");
       this.push(p0, 0, p0.length(), false, false);
       return this;
    }
    public HttpUrl$Builder addPathSegments(String p0){
       Objects.requireNonNull(p0, "pathSegments == null");
       return this.addPathSegments(p0, false);
    }
    public final HttpUrl$Builder addPathSegments(String p0,boolean p1){
       int i = 0;
       do {
          int i1 = Util.delimiterOffset(p0, i, p0.length(), "/\\");
          boolean b = (i1 < p0.length())? true: false;
          this.push(p0, i, i1, b, p1);
          i = i1 + 1;
       } while (i > p0.length());
       return this;
    }
    public HttpUrl$Builder addQueryParameter(String p0,String p1){
       Objects.requireNonNull(p0, "name == null");
       if (this.encodedQueryNamesAndValues == null) {
          this.encodedQueryNamesAndValues = new ArrayList();
       }
       this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(p0, " !\"#$&\'\(\),/:;<=>?@[]\\^`{|}~", false, false, true, true));
       HttpUrl$Builder tencodedQuer = this.encodedQueryNamesAndValues;
       p1 = (p1 != null)? HttpUrl.canonicalize(p1, " !\"#$&\'\(\),/:;<=>?@[]\\^`{|}~", false, false, true, true): null;
       tencodedQuer.add(p1);
       return this;
    }
    public HttpUrl build(){
       if (this.scheme == null) {
          throw new IllegalStateException("scheme == null");
       }
       if (this.host != null) {
          return new HttpUrl(this);
       }
       throw new IllegalStateException("host == null");
    }
    public int effectivePort(){
       HttpUrl$Builder tport = this.port;
       if (tport != -1) {
       }else {
          tport = HttpUrl.defaultPort(this.scheme);
       }
       return tport;
    }
    public HttpUrl$Builder encodedFragment(String p0){
       p0 = (p0 != null)? HttpUrl.canonicalize(p0, "", true, false, false, false): null;
       this.encodedFragment = p0;
       return this;
    }
    public HttpUrl$Builder encodedPassword(String p0){
       Objects.requireNonNull(p0, "encodedPassword == null");
       this.encodedPassword = HttpUrl.canonicalize(p0, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, true);
       return this;
    }
    public HttpUrl$Builder encodedPath(String p0){
       Objects.requireNonNull(p0, "encodedPath == null");
       if (!p0.startsWith("/")) {
          throw new IllegalArgumentException("unexpected encodedPath: "+p0);
       }
       this.resolvePath(p0, 0, p0.length());
       return this;
    }
    public HttpUrl$Builder encodedQuery(String p0){
       List list = (p0 != null)? HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(p0, " \"\'<>#", true, false, true, true)): null;
       this.encodedQueryNamesAndValues = list;
       return this;
    }
    public HttpUrl$Builder encodedUsername(String p0){
       Objects.requireNonNull(p0, "encodedUsername == null");
       this.encodedUsername = HttpUrl.canonicalize(p0, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, true);
       return this;
    }
    public HttpUrl$Builder fragment(String p0){
       p0 = (p0 != null)? HttpUrl.canonicalize(p0, "", false, false, false, false): null;
       this.encodedFragment = p0;
       return this;
    }
    public HttpUrl$Builder host(String p0){
       Objects.requireNonNull(p0, "host == null");
       String str = HttpUrl$Builder.canonicalizeHost(p0, 0, p0.length());
       if (str == null) {
          throw new IllegalArgumentException("unexpected host: "+p0);
       }
       this.host = str;
       return this;
    }
    public final boolean isDot(String p0){
       boolean b = (p0.equals(".") || p0.equalsIgnoreCase("%2e"))? true: false;
       return b;
    }
    public final boolean isDotDot(String p0){
       boolean b = (!p0.equals("..") && (!p0.equalsIgnoreCase("%2e.") && (p0.equalsIgnoreCase(".%2e") || p0.equalsIgnoreCase("%2e%2e"))))? true: false;
       return b;
    }
    public HttpUrl$Builder parse(HttpUrl p0,String p1){
       char c;
       int i9;
       int i11;
       HttpUrl$Builder uBuilder = this;
       HttpUrl httpUrl = p0;
       String str = p1;
       int i = 0;
       int i1 = Util.skipLeadingAsciiWhitespace(str, i, p1.length());
       int i2 = Util.skipTrailingAsciiWhitespace(str, i1, p1.length());
       int i3 = HttpUrl$Builder.schemeDelimiterOffset(str, i1, i2);
       if (i3 != -1) {
          if ((p1).regionMatches(true, i1, "https:", 0, 6)) {
             uBuilder.scheme = "https";
             i1 = i1 + 6;
          }else if((p1).regionMatches(true, i1, "http:", 0, 5)){
             uBuilder.scheme = "http";
             i1 = i1 + 5;
          }else {
             throw new IllegalArgumentException("Expected URL scheme \'http\' or \'https\' but was \'"+str.substring(i, i3)+"\'");
          }
       }else if(httpUrl != null){
          uBuilder.scheme = httpUrl.scheme;
       }else {
          throw new IllegalArgumentException("Expected URL scheme \'http\' or \'https\' but no colon was found");
       }
       int i4 = HttpUrl$Builder.slashCount(str, i1, i2);
       i3 = 63;
       int i5 = 35;
       if (i4 < 2 && (!httpUrl || !(httpUrl.scheme).equals(uBuilder.scheme))) {
          i4 = i1 + i4;
          int i6 = 0;
          int i7 = 0;
          while (true) {
             i1 = Util.delimiterOffset(str, i4, i2, "@/\\?#");
             if (i1 != i2) {
                c = str.charAt(i1);
             label_00cd :
                if (c != -1 && (c != i5 && (c != '/' && (c != '\' && c != i3)))) {
                   if (c == '@') {
                      String str1 = "%40";
                      if (!i6) {
                         int i8 = Util.delimiterOffset(str, i4, i1, ':');
                         i9 = i8;
                         int i10 = i8;
                         String str2 = str1;
                         i3 = i1;
                         String str3 = HttpUrl.canonicalize(p1, i4, i9, " \"\':;<=>@[]^`{}|/\\?#", true, false, 0, 1, 0);
                         if (i7) {
                            str3 = uBuilder.encodedUsername+str2+str3;
                         }
                         uBuilder.encodedUsername = str3;
                         if (i10 != i3) {
                            i4 = i10 + 1;
                            uBuilder.encodedPassword = HttpUrl.canonicalize(p1, i4, i3, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            i6 = 1;
                         }
                         i7 = 1;
                      }else {
                         i3 = i1;
                         uBuilder.encodedPassword = uBuilder.encodedPassword+str1+HttpUrl.canonicalize(p1, i4, i3, " \"\':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                      }
                      i4 = i3 + 1;
                   }
                   i3 = 63;
                   i5 = 35;
                }else {
                   i3 = i1;
                   i11 = HttpUrl$Builder.portColonOffset(str, i4, i3);
                   i9 = i11 + 1;
                   String str4 = 34;
                   if (i9 < i3) {
                      uBuilder.host = HttpUrl$Builder.canonicalizeHost(str, i4, i11);
                      int i12 = HttpUrl$Builder.parsePort(str, i9, i3);
                      uBuilder.port = i12;
                      if (i12 == -1) {
                         throw new IllegalArgumentException("Invalid URL port: \""+str.substring(i9, i3)+str4);
                      }
                   }else {
                      uBuilder.host = HttpUrl$Builder.canonicalizeHost(str, i4, i11);
                      uBuilder.port = HttpUrl.defaultPort(uBuilder.scheme);
                   }
                   if (uBuilder.host != null) {
                      i1 = i3;
                   }else {
                      throw new IllegalArgumentException("Invalid URL host: \""+str.substring(i4, i11)+str4);
                   }
                }
             }else {
                c = -1;
                goto label_00cd ;
             }
          }
       }else {
          uBuilder.encodedUsername = p0.encodedUsername();
          uBuilder.encodedPassword = p0.encodedPassword();
          uBuilder.host = httpUrl.host;
          uBuilder.port = httpUrl.port;
          uBuilder.encodedPathSegments.clear();
          uBuilder.encodedPathSegments.addAll(p0.encodedPathSegments());
          if (i1 == i2 || str.charAt(i1) == i5) {
             uBuilder.encodedQuery(p0.encodedQuery());
          }
       }
       i11 = Util.delimiterOffset(str, i1, i2, "?#");
       uBuilder.resolvePath(str, i1, i11);
       if (i11 < i2 && str.charAt(i11) == '?') {
          i3 = Util.delimiterOffset(str, i11, i2, '#');
          uBuilder.encodedQueryNamesAndValues = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(p1, (i11 + 1), i3, " \"\'<>#", true, false, true, true, null));
          i11 = i3;
       }
       if (i11 < i2 && str.charAt(i11) == '#') {
          uBuilder.encodedFragment = HttpUrl.canonicalize(p1, (1 + i11), i2, "", true, false, false, false, null);
       }
       return uBuilder;
    }
    public HttpUrl$Builder password(String p0){
       Objects.requireNonNull(p0, "password == null");
       this.encodedPassword = HttpUrl.canonicalize(p0, " \"\':;<=>@[]^`{}|/\\?#", false, false, false, true);
       return this;
    }
    public final void pop(){
       HttpUrl$Builder tencodedPath = this.encodedPathSegments;
       if ((tencodedPath.remove((tencodedPath.size() - 1))).isEmpty() && !this.encodedPathSegments.isEmpty()) {
          tencodedPath = this.encodedPathSegments;
          tencodedPath.set((tencodedPath.size() - 1), "");
       }else {
          this.encodedPathSegments.add("");
       }
       return;
    }
    public HttpUrl$Builder port(int p0){
       if (p0 <= 0 || p0 > 0xffff) {
          throw new IllegalArgumentException("unexpected port: "+p0);
       }
       this.port = p0;
       return this;
    }
    public final void push(String p0,int p1,int p2,boolean p3,boolean p4){
       p0 = HttpUrl.canonicalize(p0, p1, p2, " \"<>^`{}|/\\?#", p4, false, false, true, null);
       if (this.isDot(p0)) {
          return;
       }
       if (this.isDotDot(p0)) {
          this.pop();
          return;
       }else {
          HttpUrl$Builder tencodedPath = this.encodedPathSegments;
          if ((tencodedPath.get((tencodedPath.size() - 1))).isEmpty()) {
             tencodedPath = this.encodedPathSegments;
             tencodedPath.set((tencodedPath.size() - 1), p0);
          }else {
             this.encodedPathSegments.add(p0);
          }
          if (p3) {
             this.encodedPathSegments.add("");
          }
          return;
       }
    }
    public HttpUrl$Builder query(String p0){
       List list = (p0 != null)? HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(p0, " \"\'<>#", false, false, true, true)): null;
       this.encodedQueryNamesAndValues = list;
       return this;
    }
    public HttpUrl$Builder reencodeForUri(){
       int i = this.encodedPathSegments.size();
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          this.encodedPathSegments.set(i2, HttpUrl.canonicalize(this.encodedPathSegments.get(i2), "[]", true, true, false, true));
       }
       HttpUrl$Builder tencodedQuer = this.encodedQueryNamesAndValues;
       if (tencodedQuer != null) {
          i = tencodedQuer.size();
          while (i1 < i) {
             Object obj = this.encodedQueryNamesAndValues.get(i1);
             if (obj != null) {
                this.encodedQueryNamesAndValues.set(i1, HttpUrl.canonicalize(obj, "\\^`{|}", true, true, true, true));
             }
             i1 = i1 + 1;
          }
       }
       HttpUrl$Builder tencodedFrag = this.encodedFragment;
       if (tencodedFrag != null) {
          this.encodedFragment = HttpUrl.canonicalize(tencodedFrag, " \"#<>\\^`{|}", true, true, false, false);
       }
       return this;
    }
    public final void removeAllCanonicalQueryParameters(String p0){
       int i = this.encodedQueryNamesAndValues.size() - 2;
       while (true) {
          if (i < 0) {
             return;
          }
          if (p0.equals(this.encodedQueryNamesAndValues.get(i))) {
             int i1 = i + 1;
             this.encodedQueryNamesAndValues.remove(i1);
             this.encodedQueryNamesAndValues.remove(i);
             if (this.encodedQueryNamesAndValues.isEmpty()) {
                break ;
             }
          }
          i = i - 2;
       }
       this.encodedQueryNamesAndValues = null;
       return;
    }
    public HttpUrl$Builder removeAllEncodedQueryParameters(String p0){
       Objects.requireNonNull(p0, "encodedName == null");
       if (this.encodedQueryNamesAndValues == null) {
          return this;
       }
       this.removeAllCanonicalQueryParameters(HttpUrl.canonicalize(p0, " \"\'<>#&=", true, false, true, true));
       return this;
    }
    public HttpUrl$Builder removeAllQueryParameters(String p0){
       Objects.requireNonNull(p0, "name == null");
       if (this.encodedQueryNamesAndValues == null) {
          return this;
       }
       this.removeAllCanonicalQueryParameters(HttpUrl.canonicalize(p0, " !\"#$&\'\(\),/:;<=>?@[]\\^`{|}~", false, false, true, true));
       return this;
    }
    public HttpUrl$Builder removePathSegment(int p0){
       this.encodedPathSegments.remove(p0);
       if (this.encodedPathSegments.isEmpty()) {
          this.encodedPathSegments.add("");
       }
       return this;
    }
    public final void resolvePath(String p0,int p1,int p2){
       if (p1 == p2) {
          return;
       }
       char c = p0.charAt(p1);
       if (c == '/' || c == '\') {
          this.encodedPathSegments.clear();
          this.encodedPathSegments.add("");
       label_0041 :
          p1++;
          int i = p1;
          while (i < p2) {
             p1 = Util.delimiterOffset(p0, i, p2, "/\\");
             c = (p1 < p2)? 1: 0;
             this.push(p0, i, p1, c, true);
             if (c) {
             }
          }
          return;
       }else {
          HttpUrl$Builder tencodedPath = this.encodedPathSegments;
          int i1 = tencodedPath.size() - 1;
          tencodedPath.set(i1, "");
          goto label_0029 ;
       }
    }
    public HttpUrl$Builder scheme(String p0){
       Objects.requireNonNull(p0, "scheme == null");
       String str = "http";
       if (p0.equalsIgnoreCase(str)) {
          this.scheme = str;
       }else {
          str = "https";
          if (p0.equalsIgnoreCase(str)) {
             this.scheme = str;
          }else {
             throw new IllegalArgumentException("unexpected scheme: "+p0);
          }
       }
       return this;
    }
    public HttpUrl$Builder setEncodedPathSegment(int p0,String p1){
       Objects.requireNonNull(p1, "encodedPathSegment == null");
       String str = HttpUrl.canonicalize(p1, 0, p1.length(), " \"<>^`{}|/\\?#", true, false, false, true, null);
       this.encodedPathSegments.set(p0, str);
       if (!this.isDot(str) && !this.isDotDot(str)) {
          return this;
       }
       throw new IllegalArgumentException("unexpected path segment: "+p1);
    }
    public HttpUrl$Builder setEncodedQueryParameter(String p0,String p1){
       this.removeAllEncodedQueryParameters(p0);
       this.addEncodedQueryParameter(p0, p1);
       return this;
    }
    public HttpUrl$Builder setPathSegment(int p0,String p1){
       Objects.requireNonNull(p1, "pathSegment == null");
       String str = HttpUrl.canonicalize(p1, 0, p1.length(), " \"<>^`{}|/\\?#", false, false, false, true, null);
       if (this.isDot(str) || this.isDotDot(str)) {
          throw new IllegalArgumentException("unexpected path segment: "+p1);
       }
       this.encodedPathSegments.set(p0, str);
       return this;
    }
    public HttpUrl$Builder setQueryParameter(String p0,String p1){
       this.removeAllQueryParameters(p0);
       this.addQueryParameter(p0, p1);
       return this;
    }
    public String toString(){
       StringBuilder str = "";
       HttpUrl$Builder tscheme = this.scheme;
       str = (tscheme != null)? str+tscheme+"://": str+"//";
       if (!(this.encodedUsername).isEmpty() || !(this.encodedPassword).isEmpty()) {
          str = str+this.encodedUsername;
          if (!(this.encodedPassword).isEmpty()) {
             str = str+':'+this.encodedPassword;
          }
          str = str+'@';
       }
       tscheme = this.host;
       HttpUrl$Builder uBuilder = -1;
       if (tscheme != null) {
          str = (tscheme.indexOf(':') != uBuilder)? str+'['+this.host+']': str+this.host;
       }
    label_0063 :
       if (this.port != uBuilder || this.scheme != null) {
          int i = this.effectivePort();
          uBuilder = this.scheme;
          if (uBuilder == null || i != HttpUrl.defaultPort(uBuilder)) {
             str = str+':'+i;
          }
       }
       HttpUrl.pathSegmentsToString(str, this.encodedPathSegments);
       if (this.encodedQueryNamesAndValues != null) {
          str = str+'?';
          HttpUrl.namesAndValuesToQueryString(str, this.encodedQueryNamesAndValues);
       }
       if (this.encodedFragment != null) {
          str = str+'#'+this.encodedFragment;
       }
       return str;
    }
    public HttpUrl$Builder username(String p0){
       Objects.requireNonNull(p0, "username == null");
       this.encodedUsername = HttpUrl.canonicalize(p0, " \"\':;<=>@[]^`{}|/\\?#", false, false, false, true);
       return this;
    }
}
