package com.facebook.react.modules.network.e;
import java.net.CookieHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.network.e$b;
import com.kuaishou.webkit.CookieManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kuaishou.webkit.CookieSyncManager;
import java.lang.Throwable;
import cb.a;
import java.lang.Runnable;
import com.facebook.react.modules.network.e$a;
import java.lang.Void;
import android.os.AsyncTask;
import java.net.URI;
import java.util.Map;
import java.util.Collections;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import com.facebook.react.modules.network.d;
import com.kuaishou.webkit.ValueCallback;

public class e extends CookieHandler	// class@0012d5
{
    public final e$b a;
    public final ReactContext b;
    public CookieManager c;
    public static final boolean d;

    static {
       e.d = false;
    }
    public void e(ReactContext p0){
       super();
       this.b = p0;
       this.a = new e$b(this);
    }
    public static CookieManager a(e p0){
       return p0.b();
    }
    public final CookieManager b(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = this.b;
          if (!PatchProxy.applyVoidOneRefs(obj, objArray, e.class, "11") && e.d) {
             CookieSyncManager.createInstance(obj).sync();
          }
          try{
             CookieManager instance = CookieManager.getInstance();
             this.c = instance;
             if (e.d) {
                instance.removeExpiredCookie();
             }
          }catch(java.lang.IllegalArgumentException e0){
             return e.d;
          }catch(java.lang.Exception e0){
             a.h("ReactNative", "getCookieManager error", e0);
             goto label_0042 ;
          }
       }
       return this.c;
    }
    public void c(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       Void[] voidArray = new Void[0];
       new e$a(this, this.b, p0).execute(voidArray);
       return;
    }
    public Map get(URI p0,Map p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       CookieManager uCookieManag = this.b();
       if (uCookieManag == null) {
          return Collections.emptyMap();
       }
       String cookie = uCookieManag.getCookie(p0.toString());
       if (TextUtils.isEmpty(cookie)) {
          return Collections.emptyMap();
       }
       return Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }
    public void put(URI p0,Map p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       String str = p0.toString();
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          if (key != null) {
             String obj = PatchProxy.applyOneRefs(key, null, e.class, "8");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(key.equalsIgnoreCase("Set-cookie") || key.equalsIgnoreCase("Set-cookie2")){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                List value = uEntry.getValue();
                if (PatchProxy.applyVoidTwoRefs(str, value, this, e.class, "6")) {
                   continue ;
                }else {
                   CookieManager uCookieManag = this.b();
                   if (uCookieManag == null) {
                      continue ;
                   }else if(e.d){
                      this.c(new d(this, value, uCookieManag, str));
                   }else {
                      Iterator iterator1 = value.iterator();
                      while (iterator1.hasNext()) {
                         obj = iterator1.next();
                         if (PatchProxy.applyVoidTwoRefs(str, obj, this, e.class, "7")) {
                            continue ;
                         }else {
                            CookieManager uCookieManag1 = this.b();
                            if (uCookieManag1 != null) {
                               uCookieManag1.setCookie(str, obj, null);
                            }else {
                               continue ;
                            }
                         }
                      }
                      uCookieManag.flush();
                      this.a.a();
                   }
                }
             }
          }
       }
       return;
    }
}
