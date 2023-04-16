package com.kuaishou.commercial.d;
import oq8.h;
import com.kuaishou.commercial.k;
import java.lang.Object;
import oq8.h$a;
import java.util.Objects;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiAdService;
import nq8.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.template.manage.template.TemplateException;
import java.lang.Throwable;
import sq8.g;
import nq8.c;
import pq8.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import android.content.SharedPreferences;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.commercial.g;
import cw.m;
import erd.g;
import crd.b;

public final class d implements h	// class@0014b6
{
    public final k a;

    public void d(k p0){
       this.a = p0;
    }
    public final void a(h$a p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       KwaiAdService kwaiAdServic = b.a(0x311225af);
       a uoa = a.a();
       Objects.requireNonNull(uoa);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "4";
       String str1 = PatchProxy.apply(null, uoa, a.class, str);
       if (str1 != patchProxyRe) {
       }else {
          String str2 = "";
          if (uoa.b == null) {
             g.c("ADTKTemplateApi", str2, new TemplateException("getAPIResultMd5 must be initialized").setErrorType("init"));
             str1 = str2;
          }else {
             c e = uoa.a.e;
             f uof = f.class;
             Object obj = PatchProxy.applyOneRefs(e, null, uof, str);
             if (obj != patchProxyRe) {
                str1 = obj;
             }else if(TextUtils.isEmpty(f.a)){
                Object obj1 = PatchProxy.applyOneRefs(e, null, uof, "5");
                if (obj1 != patchProxyRe) {
                   str2 = obj1;
                }else {
                   SharedPreferences sharedPrefer = f.a(e);
                   if (sharedPrefer != null) {
                      str2 = sharedPrefer.getString("ad_key_api_result_md5", str2);
                   }
                }
                f.a = str2;
             }
             str1 = f.a;
          }
       }
       kwaiAdServic.requestTKTemplate(str1, RequestTiming.COLD_START).subscribeOn(d.b).subscribe(new g(ta, p0), new m(ta, p0));
       return;
    }
}
