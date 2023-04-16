package com.yxcorp.gifshow.webview.yoda.function.a;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import oe6.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import oyc.a;
import java.util.Map;
import n3d.a;

public class a extends c	// class@0017b3
{
    public WeakReference f;

    public void a(YodaBaseWebView p0,Activity p1){
       super();
       this.f = new WeakReference(p1);
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       a uoa = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       a uoa1 = a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,p3,oobject3};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "1")) {
             return;
          }
       }
       if (uoa.f.get() == null || uoa.f.get().isFinishing()) {
          this.o(p0, p1, p2, 0x1e84a, "current page is finished", p4);
          return;
       }else if(!TextUtils.x(a.f())){
          this.p(p0, oobject1, oobject2, oobject3);
          return;
       }else {
          BindPhoneParams$b uob = new BindPhoneParams$b();
          uob.n(i);
          BindPhoneParams uBindPhonePa = uob.a();
          uoa1 = new a(this, p0, p1, p2, p4);
          d.a(-1712118428).ew(uoa.f.get(), uBindPhonePa, null, "h5", v13);
          return;
       }
    }
}
