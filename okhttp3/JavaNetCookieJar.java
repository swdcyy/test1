package okhttp3.JavaNetCookieJar;
import okhttp3.CookieJar;
import java.net.CookieHandler;
import java.lang.Object;
import okhttp3.HttpUrl;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import okhttp3.internal.Util;
import okhttp3.Cookie$Builder;
import okhttp3.Cookie;
import java.util.Map;
import java.util.Collections;
import java.net.URI;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import okhttp3.internal.platform.Platform;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class JavaNetCookieJar implements CookieJar	// class@001f50
{
    public final CookieHandler cookieHandler;

    public void JavaNetCookieJar(CookieHandler p0){
       super();
       this.cookieHandler = p0;
    }
    public final List decodeHeaderAsJavaNetCookies(HttpUrl p0,String p1){
       String str1;
       ArrayList uArrayList = new ArrayList();
       int i = p1.length();
       int i1 = 0;
       while (i1 < i) {
          int i2 = Util.delimiterOffset(p1, i1, i, ";,");
          int i3 = Util.delimiterOffset(p1, i1, i2, '=');
          String str = Util.trimSubstring(p1, i1, i3);
          if (!str.startsWith("$")) {
             if (i3 < i2) {
                i3 = i3 + 1;
                str1 = Util.trimSubstring(p1, i3, i2);
             }else {
                str1 = "";
             }
             String str2 = "\"";
             if (str1.startsWith(str2) && str1.endsWith(str2)) {
                int i4 = 1;
                int i5 = str1.length() - i4;
                str1 = str1.substring(i4, i5);
             }
             uArrayList.add(new Cookie$Builder().name(str).value(str1).domain(p0.host()).build());
          }
          i1 = i2 + 1;
       }
       return uArrayList;
    }
    public List loadForRequest(HttpUrl p0){
       Map map = Collections.emptyMap();
       try{
          ArrayList uArrayList = null;
          Iterator iterator = this.cookieHandler.get(p0.uri(), map).entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             if (("Cookie").equalsIgnoreCase(key) || (("Cookie2").equalsIgnoreCase(key) && !uEntry.getValue().isEmpty())) {
                Iterator iterator1 = uEntry.getValue().iterator();
                while (iterator1.hasNext()) {
                   key = iterator1.next();
                   if (uArrayList == null) {
                      uArrayList = new ArrayList();
                   }
                   uArrayList.addAll(this.decodeHeaderAsJavaNetCookies(p0, key));
                }
             }
          }
          List list = (uArrayList != null)? Collections.unmodifiableList(uArrayList): Collections.emptyList();
          return list;
       }catch(java.io.IOException e0){
          Platform.get().log(5, "Loading cookies failed for "+p0.resolve("/..."), e0);
          return Collections.emptyList();
       }
    }
    public void saveFromResponse(HttpUrl p0,List p1){
       if (this.cookieHandler != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().toString(true));
          }
          Map map = Collections.singletonMap("Set-Cookie", uArrayList);
          try{
             this.cookieHandler.put(p0.uri(), map);
          }catch(java.io.IOException e6){
             Platform.get().log(5, "Saving cookies failed for "+p0.resolve("/..."), e6);
          }
       }
    }
}
