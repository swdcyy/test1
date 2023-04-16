package com.yxcorp.gifshow.webview.yoda.utils.c;
import xz7.c;
import java.lang.Object;
import java.util.Map;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import com.yxcorp.gifshow.webview.cookie.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import ua6.b;
import ua6.b$a;
import ia0.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.retrofit.e;
import wkd.b;
import ia0.g;
import com.yxcorp.retrofit.f;
import qk.t0;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

public final class c implements c	// class@0017cb
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       HashMap hashMap = PatchProxy.apply(null, null, g.class, "9");
       if (hashMap != PatchProxyResult.class) {
       }else {
          hashMap = new HashMap();
          b$a c = b.c;
          String str = c.a().e().k();
          if (!TextUtils.isEmpty(str)) {
             hashMap.put("kuaishou.h5_st", str);
          }
          if (e.h().e()) {
             hashMap.putAll(c.a().b());
          }else {
             b.a(-1961311520).e().b(hashMap);
          }
          HashMap hashMap1 = new HashMap();
          t0 ot0 = g.c.iterator();
          while (ot0.hasNext()) {
             String str1 = ot0.next();
             String str2 = hashMap.get(str1);
             if (str2 == null) {
                str2 = "";
             }
             hashMap1.put(str1, str2);
          }
          hashMap = hashMap1;
       }
       p0.putAll(hashMap);
       return;
    }
}
