package com.facebook.imagepipeline.producers.f;
import id.c;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.lang.String;
import java.util.Map;
import hb.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Object;
import java.util.Locale;
import id.i;
import id.c0;
import id.s;
import com.facebook.imagepipeline.producers.f$a;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Integer;
import com.facebook.imagepipeline.producers.n$a;
import com.facebook.imagepipeline.producers.d;
import java.lang.Runnable;
import java.util.concurrent.Future;
import com.facebook.imagepipeline.producers.e;
import id.d0;
import android.net.Uri;
import java.net.HttpURLConnection;
import ib.c;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.io.IOException;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class f extends c	// class@001133
{
    public int a;
    public String b;
    public final Map c;
    public final ExecutorService d;
    public final b e;

    public void f(){
       super(null, null, RealtimeSinceBootClock.get());
    }
    public void f(int p0){
       super(null, null, RealtimeSinceBootClock.get());
       this.a = p0;
    }
    public void f(String p0,Map p1,b p2){
       super();
       this.d = Executors.newFixedThreadPool(3);
       this.e = p2;
       this.c = null;
       this.b = null;
    }
    public static String g(String p0,Object[] p1){
       return String.format(Locale.getDefault(), p0, p1);
    }
    public s a(i p0,c0 p1){
       return new f$a(p0, p1);
    }
    public void b(s p0,int p1){
       p0.h = this.e.now();
    }
    public Map d(s p0,int p1){
       HashMap hashMap = new HashMap(4);
       hashMap.put("queue_time", Long.toString((p0.g - p0.f)));
       hashMap.put("fetch_time", Long.toString((p0.h - p0.g)));
       hashMap.put("total_time", Long.toString((p0.h - p0.f)));
       hashMap.put("image_size", Integer.toString(p1));
       return hashMap;
    }
    public void e(s p0,n$a p1){
       p0.f = this.e.now();
       p0.b().k(new e(this, this.d.submit(new d(this, p0, p1)), p1));
    }
    public final HttpURLConnection f(Uri p0,int p1){
       Map$Entry uEntry;
       String str;
       Object[] objArray;
       String str1;
       try{
          Uri uri = null;
          URL uRL = (p0 == null)? uri: new URL(p0.toString());
          HttpURLConnection httpURLConne = uRL.openConnection();
          f tb = this.b;
          if (tb != null) {
             httpURLConne.setRequestProperty("User-Agent", tb);
          }
          tb = this.c;
          if (tb != null) {
             Iterator iterator = tb.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                String key = uEntry.getKey();
                httpURLConne.setRequestProperty(key, uEntry.getValue());
             }
          }
          httpURLConne.setConnectTimeout(this.a);
          int responseCode = httpURLConne.getResponseCode();
          uEntry = (responseCode >= 200 && responseCode < 300)? 1: 0;
          if (uEntry) {
             return httpURLConne;
          }else if(responseCode != 307 && responseCode != 308){
             switch (responseCode){
                 case 300:
                 case 302:
                 case 303:
                 case 301:
                   break;
                 default:
                   str = null;
             }
             if (str) {
                str = httpURLConne.getHeaderField("Location");
                httpURLConne.disconnect();
                if (str != null) {
                   uri = Uri.parse(str);
                }
                String scheme = p0.getScheme();
                if (p1 > 0 && (uri != null && !(uri.getScheme()).equals(scheme))) {
                   return this.f(uri, (p1 - 1));
                }else if(!p1){
                   objArray = new Object[]{p0.toString()};
                   str1 = f.g("URL %s follows too many redirects", objArray);
                }else {
                   objArray = new Object[]{p0.toString(),Integer.valueOf(responseCode)};
                   str1 = f.g("URL %s returned %d without a valid redirect", objArray);
                }
                throw new IOException(str1);
             }else {
                httpURLConne.disconnect();
                Object[] objArray1 = new Object[]{p0.toString(),Integer.valueOf(responseCode)};
                throw new IOException(String.format("Image URL %s returned HTTP code %d", objArray1));
             }
          }
          str = 1;
          goto label_006e ;
       }catch(java.net.MalformedURLException e8){
          throw new RuntimeException(e8);
       }
    }
}
