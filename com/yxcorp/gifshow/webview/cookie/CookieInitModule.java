package com.yxcorp.gifshow.webview.cookie.CookieInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uv8.g1;
import q87.c;
import com.kwai.yoda.kernel.cookie.YodaCookie;
import java.util.Objects;
import rb7.c;
import ry7.f;
import rb7.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zf6.h;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.webview.cookie.c;
import com.yxcorp.gifshow.webview.cookie.b;
import erd.g;
import crd.b;
import y96.i;
import zxc.a;
import com.yxcorp.gifshow.webview.cookie.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import qk.t0;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.Exception;

public class CookieInitModule extends a	// class@001749
{
    public static b q;

    public void CookieInitModule(){
       super();
    }
    public static void l0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, CookieInitModule.class, "6")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       g1.C().w("CookieInitModule", "try init", objArray1);
       YodaCookie f = YodaCookie.f;
       Objects.requireNonNull(f);
       if (!PatchProxy.applyVoid(objArray, f, YodaCookie.class, "13")) {
          c.c.e(new f());
       }
       return;
    }
    public int f0(){
       return 20;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CookieInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, CookieInitModule.class, "2")) {
          RxBus f = RxBus.f;
          z a = d.a;
          f.f(h.class).observeOn(a).subscribe(c.b, b.b);
          f.f(i.class).observeOn(a).subscribe(new a(this));
       }
       return;
    }
    public void onEventMainThread(i p0){
       String str;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, CookieInitModule.class, "4")) {
          return;
       }
       try{
          p0 = p0.a;
          if (!PatchProxy.applyVoidOneRefs(p0, null, g.class, "14")) {
             if (TextUtils.isEmpty(p0)) {
                str = "";
             }
             b = false;
             t0 ot0 = g.a.iterator();
             while (ot0.hasNext()) {
                HashMap hashMap = new HashMap();
                hashMap.put("weblogger_switch", str);
                YodaCookie.f.q(ot0.next(), hashMap, b, b);
             }
          }
       }catch(java.lang.Exception e6){
          Object[] objArray = new Object[b];
          g1.C().w("CookieInjectManager", "LogCookieHelper UnsupportedEncodingException e = "+e6.getMessage(), objArray);
       }
       return;
    }
}
