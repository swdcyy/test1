package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter$c;
import a09.b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import im8.f;
import b09.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo;
import java.lang.System;
import b09.f;
import erd.g;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.q;
import com.yxcorp.gifshow.ad.tachikoma.a;
import yx.j0;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import rx4.i;
import x49.s;
import com.kuaishou.tk.api.b;
import java.lang.StringBuilder;

public final class AdPlayEndTKPresenter$c implements b	// class@0015ed
{
    public final AdPlayEndTKPresenter a;

    public void AdPlayEndTKPresenter$c(AdPlayEndTKPresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdPlayEndTKPresenter$c.class, "1")) {
          return;
       }
       AdPlayEndTKPresenter$c ta = this.a;
       Objects.requireNonNull(ta);
       AdPlayEndTKPresenter uAdPlayEndTK = AdPlayEndTKPresenter.class;
       if (PatchProxy.applyVoid(objArray, ta, uAdPlayEndTK, "11") || (ta.R8() && !ta.X8())) {
          AdPlayEndTKPresenter w = ta.w;
          if (w == null) {
             a.S("mIsPlayEndScreenPrepare");
          }
          w.set(Boolean.TRUE);
          g og = new g(ta);
          if (!PatchProxy.applyVoidOneRefs(og, ta, uAdPlayEndTK, "22")) {
             if (!ta.R8() || ta.X8()) {
                Object[] objArray1 = new Object[0];
                j0.f("TachikomaPlayEnd", "renderTachikomaView not allow ", objArray1);
             }else {
                uAdPlayEndTK = ta.q;
                if (uAdPlayEndTK == null) {
                   a.S("mPhoto");
                }
                PhotoAdvertisement photoAdverti = k.B(uAdPlayEndTK);
                if (photoAdverti != null) {
                   PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
                   if (adData != null) {
                      adData = adData.mRequestEApiInfo;
                      if (adData != null) {
                         adData.setExpireIfDataNullWhenShowed();
                      }
                   }
                }
                uAdPlayEndTK = ta.G;
                if (uAdPlayEndTK != null) {
                   ta.I.b(uAdPlayEndTK, new f(System.currentTimeMillis(), ta, og));
                }
             }
          }
       }
    label_008c :
       return;
    }
    public boolean b(){
       AdPlayEndTKPresenter$c a;
       Object obj = this;
       Object[] objArray = null;
       String str = "3";
       Object obj1 = PatchProxy.apply(objArray, obj, AdPlayEndTKPresenter$c.class, str);
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       boolean b = obj.a.R8();
       boolean b1 = obj.a.S8();
       b uob = d.a(0x256720e1);
       a.o(uob, "PluginManager.get\(TKPlugin::class.java\)");
       boolean b2 = uob.k4();
       int i = 0;
       if (!b2) {
          a = obj.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(objArray, a, AdPlayEndTKPresenter.class, str)) {
             AdPlayEndTKPresenter g = a.G;
             if (g != null) {
                s os = new s();
                b uob1 = b.b();
                a.o(uob1, "TKPluginManager.getInstance\(\)");
                boolean b3 = uob1.d();
                String str1 = (!b3)? "tkPlugin": "soInit";
                os.l(str1);
                PhotoAdvertisement$TkTemplateInfo templateId = g.templateId;
                a.o(templateId, "it.templateId");
                os.h(templateId, g.templateVersionCode, i);
                os.f();
                if (!b3) {
                   b uob2 = b.b();
                   g = a.G;
                   if (g != null) {
                      objArray = g.templateId;
                   }
                   uob2.f("ad", objArray, 0, 6001, "TK Plugin not ready");
                }
             }
          }
       }
       Object[] objArray1 = new Object[i];
       j0.f("TachikomaPlayEnd", "canShowPlayEndView\(\) canShowPlayEnd : "+b+' '+"enableShowTkPlayEnd : "+b1+" initSuccess:"+b2, objArray1);
       if (b && (b1 && b2)) {
          i = true;
       }
    label_00bf :
       return i;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, AdPlayEndTKPresenter$c.class, "2")) {
          return;
       }
       this.a.W8();
       return;
    }
}
