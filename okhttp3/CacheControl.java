package okhttp3.CacheControl;
import okhttp3.CacheControl$Builder;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.String;
import okhttp3.Headers;
import okhttp3.internal.http.HttpHeaders;
import java.lang.StringBuilder;

public final class CacheControl	// class@00205e
{
    public String headerValue;
    public final boolean immutable;
    public final boolean isPrivate;
    public final boolean isPublic;
    public final int maxAgeSeconds;
    public final int maxStaleSeconds;
    public final int minFreshSeconds;
    public final boolean mustRevalidate;
    public final boolean noCache;
    public final boolean noStore;
    public final boolean noTransform;
    public final boolean onlyIfCached;
    public final int sMaxAgeSeconds;
    public static final CacheControl FORCE_CACHE;
    public static final CacheControl FORCE_NETWORK;

    static {
       CacheControl.FORCE_NETWORK = new CacheControl$Builder().noCache().build();
       CacheControl.FORCE_CACHE = new CacheControl$Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();
    }
    public void CacheControl(CacheControl$Builder p0){
       super();
       this.noCache = p0.noCache;
       this.noStore = p0.noStore;
       this.maxAgeSeconds = p0.maxAgeSeconds;
       this.sMaxAgeSeconds = -1;
       this.isPrivate = false;
       this.isPublic = false;
       this.mustRevalidate = false;
       this.maxStaleSeconds = p0.maxStaleSeconds;
       this.minFreshSeconds = p0.minFreshSeconds;
       this.onlyIfCached = p0.onlyIfCached;
       this.noTransform = p0.noTransform;
       this.immutable = p0.immutable;
    }
    public void CacheControl(boolean p0,boolean p1,int p2,int p3,boolean p4,boolean p5,boolean p6,int p7,int p8,boolean p9,boolean p10,boolean p11,String p12){
       super();
       this.noCache = p0;
       this.noStore = p1;
       this.maxAgeSeconds = p2;
       this.sMaxAgeSeconds = p3;
       this.isPrivate = p4;
       this.isPublic = p5;
       this.mustRevalidate = p6;
       this.maxStaleSeconds = p7;
       this.minFreshSeconds = p8;
       this.onlyIfCached = p9;
       this.noTransform = p10;
       this.immutable = p11;
       this.headerValue = p12;
    }
    public static CacheControl parse(Headers p0){
       String str2;
       Headers headers = p0;
       int i = p0.size();
       int i1 = 0;
       int i2 = 1;
       int i3 = 0;
       boolean b = false;
       boolean b1 = false;
       int i4 = -1;
       int i5 = -1;
       boolean b2 = false;
       boolean b3 = false;
       boolean b4 = false;
       int i6 = -1;
       int i7 = -1;
       boolean b5 = false;
       boolean b6 = false;
       boolean b7 = false;
       while (i1 < i) {
          String str = headers.name(i1);
          String str1 = headers.value(i1);
          if (str.equalsIgnoreCase("Cache-Control")) {
             if (i3 == null) {
                i3 = str1;
                for (int i8 = 0; i8 < str1.length(); i8 = i9) {
                   int i9 = HttpHeaders.skipUntil(str1, i8, "=,;");
                   str = (str1.substring(i8, i9)).trim();
                   if (i9 != str1.length() && (str1.charAt(i9) == ',' || str1.charAt(i9) == ';')) {
                      i9 = i9 + 1;
                      str2 = null;
                   }else {
                      i9 = i9 + 1;
                      int i11 = HttpHeaders.skipWhitespace(str1, i9);
                      if (i11 < str1.length() && str1.charAt(i11) == '"') {
                         i11 = i11 + 1;
                         i9 = HttpHeaders.skipUntil(str1, i11, "\"");
                         str2 = str1.substring(i11, i9);
                         i9 = i9 + 1;
                      }else {
                         i9 = HttpHeaders.skipUntil(str1, i11, ",;");
                         str2 = (str1.substring(i11, i9)).trim();
                      }
                   }
                   if (("no-cache").equalsIgnoreCase(str)) {
                      b = true;
                   }else if(("no-store").equalsIgnoreCase(str)){
                      b1 = true;
                   }else if(("max-age").equalsIgnoreCase(str)){
                      i4 = HttpHeaders.parseSeconds(str2, -1);
                   }else if(("s-maxage").equalsIgnoreCase(str)){
                      i5 = HttpHeaders.parseSeconds(str2, -1);
                   }else if(("private").equalsIgnoreCase(str)){
                      b2 = true;
                   }else if(("public").equalsIgnoreCase(str)){
                      b3 = true;
                   }else if(("must-revalidate").equalsIgnoreCase(str)){
                      b4 = true;
                   }else if(("max-stale").equalsIgnoreCase(str)){
                      i6 = HttpHeaders.parseSeconds(str2, Integer.MAX_VALUE);
                      int i10 = -1;
                   }else if(("min-fresh").equalsIgnoreCase(str)){
                      i7 = HttpHeaders.parseSeconds(str2, -1);
                   }else if(("only-if-cached").equalsIgnoreCase(str)){
                      b5 = true;
                   }else if(("no-transform").equalsIgnoreCase(str)){
                      b6 = true;
                   }else if(("immutable").equalsIgnoreCase(str)){
                      b7 = true;
                   }
                }
                i1 = i1 + 1;
                headers = p0;
             }
          }else if(str.equalsIgnoreCase("Pragma")){
          }
          i2 = 0;
          goto label_003a ;
       }
       String str3 = (!i2)? null: i3;
       CacheControl uCacheContro = new CacheControl(b, b1, i4, i5, b2, b3, b4, i6, i7, b5, b6, b7, str3);
       return headers;
    }
    public final String headerValue(){
       StringBuilder str = "";
       if (this.noCache != null) {
          str = str+"no-cache, ";
       }
       if (this.noStore != null) {
          str = str+"no-store, ";
       }
       String str1 = ", ";
       if (this.maxAgeSeconds != -1) {
          str = str+"max-age="+this.maxAgeSeconds+str1;
       }
       if (this.sMaxAgeSeconds != -1) {
          str = str+"s-maxage="+this.sMaxAgeSeconds+str1;
       }
       if (this.isPrivate != null) {
          str = str+"private, ";
       }
       if (this.isPublic != null) {
          str = str+"public, ";
       }
       if (this.mustRevalidate != null) {
          str = str+"must-revalidate, ";
       }
       if (this.maxStaleSeconds != -1) {
          str = str+"max-stale="+this.maxStaleSeconds+str1;
       }
       if (this.minFreshSeconds != -1) {
          str = str+"min-fresh="+this.minFreshSeconds+str1;
       }
       if (this.onlyIfCached != null) {
          str = str+"only-if-cached, ";
       }
       if (this.noTransform != null) {
          str = str+"no-transform, ";
       }
       if (this.immutable != null) {
          str = str+"immutable, ";
       }
       if (!str.length()) {
          return "";
       }else {
          str.delete((str.length() - 2), str.length());
          return str;
       }
    }
    public boolean immutable(){
       return this.immutable;
    }
    public boolean isPrivate(){
       return this.isPrivate;
    }
    public boolean isPublic(){
       return this.isPublic;
    }
    public int maxAgeSeconds(){
       return this.maxAgeSeconds;
    }
    public int maxStaleSeconds(){
       return this.maxStaleSeconds;
    }
    public int minFreshSeconds(){
       return this.minFreshSeconds;
    }
    public boolean mustRevalidate(){
       return this.mustRevalidate;
    }
    public boolean noCache(){
       return this.noCache;
    }
    public boolean noStore(){
       return this.noStore;
    }
    public boolean noTransform(){
       return this.noTransform;
    }
    public boolean onlyIfCached(){
       return this.onlyIfCached;
    }
    public int sMaxAgeSeconds(){
       return this.sMaxAgeSeconds;
    }
    public String toString(){
       CacheControl theaderValue = this.headerValue;
       if (theaderValue != null) {
       }else {
          theaderValue = this.headerValue();
          this.headerValue = theaderValue;
       }
       return theaderValue;
    }
}
