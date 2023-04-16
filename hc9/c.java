package hc9.c;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hc9.f;
import com.yxcorp.gifshow.camera.record.base.d;
import android.content.Intent;
import android.app.Activity;
import ye9.j;
import ee9.m;
import lnc.s6;
import ic9.c;
import lnc.n4;
import xf9.a;
import a1c.a;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nc9.b;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import lnc.o5;
import g1c.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import lnc.d7;
import o56.c;
import o56.a;
import hc9.e;
import ee9.l;
import oc9.t;
import jc9.j;
import bf9.h;
import ee9.a;
import hc9.b;
import com.yxcorp.gifshow.camera.record.base.b$a;
import ke9.b;
import hc9.a;
import android.view.View;
import k36.c;
import k36.f;
import kc9.a;
import fg6.a;
import com.google.gson.Gson;
import j8c.a;
import w46.b;
import android.text.TextUtils;
import kc9.b;
import java.lang.Integer;

public class c extends e0	// class@002584
{
    public boolean q;
    public final e r;
    public final e s;

    public void c(CameraPageType p0,b p1){
       Object[] objArray1;
       m om;
       m om1;
       a uoa;
       Intent intent;
       c uoc = c.class;
       super(p0, p1);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "3";
       Object[] obj = PatchProxy.apply(objArray, this, uoc, str);
       f uof = null;
       CameraPageType uCameraPageT = 1;
       if (obj != patchProxyRe) {
          objArray = obj;
       }else {
          d te1 = this.e;
          obj = (te1 == null)? objArray: te1.getIntent();
          if (this.q == null && obj != null) {
             this.q = uCameraPageT;
             if (j.b(this.e.getIntent())) {
                om1 = new m();
                om1.a(uCameraPageT);
             }else if(s6.H()){
                om1 = c.D(obj);
             }else {
                om1 = objArray;
             }
             if (om1 == null && !obj.getBooleanExtra("magicFaceNotAutoApply", uof)) {
                om1 = m.E(obj);
                if (om1 == null) {
                   om1 = m.F(obj);
                   if (om1 != null) {
                      n4.d(obj);
                   }
                }
             }
             if (om1 == null) {
                om1 = a.C(obj, uof);
             }
             if (om1 == null) {
                uoa = a.class;
                String obj1 = PatchProxy.applyOneRefs(obj, objArray, uoa, str);
                if (obj1 != patchProxyRe) {
                   uoa = obj1;
                }else {
                   obj1 = "filterId";
                   if (TextUtils.x(j0.f(obj, obj1))) {
                      om1 = objArray;
                   }else {
                      a uoa1 = new a();
                      uoa1.a(b.d(obj));
                      obj1 = String.valueOf(j0.f(obj, obj1));
                      if (!PatchProxy.applyVoidOneRefs(obj1, uoa1, uoa, "2")) {
                         FilterConfig uFilterConfi = new FilterConfig();
                         uFilterConfi.mFilterId = o5.b(obj1, uof);
                         uoa1.x(obj1, uFilterConfi);
                      }
                      uoa1.t(uCameraPageT);
                      uoa = uoa1;
                   }
                }
             }
             if (uoa == null) {
                uoa = a.class;
                MakeupSuite obj2 = PatchProxy.applyOneRefs(obj, objArray, uoa, str);
                if (obj2 != patchProxyRe) {
                   objArray = obj2;
                }else {
                   String str1 = "makeUpId";
                   if (!TextUtils.x(j0.f(obj, str1))) {
                      objArray = new a();
                      objArray.a(b.d(obj));
                      str1 = String.valueOf(j0.f(obj, str1));
                      if (!PatchProxy.applyVoidOneRefs(str1, objArray, uoa, "2")) {
                         obj2 = new MakeupSuite();
                         obj2.mId = str1;
                         objArray.x(str1, obj2);
                      }
                      objArray.t(uCameraPageT);
                   }
                }
                om1 = objArray;
             }
             if (om1 != null && d7.a.j(obj)) {
                om1.u(uCameraPageT);
             }
             if (om1 == null || (a.a().c() || j0.a(this.e.getIntent(), "showDebugInfo", uof))) {
                om1.v((int)((float)j0.b(this.e.getIntent(), "delayedTimeInSecond", uof) * 1000.00f));
             }
             if (om1 != null) {
                objArray = om1;
             }else {
                objArray = new f();
             }
          }
       }
       patchProxyRe = objArray instanceof m;
       if (patchProxyRe && objArray.C()) {
          uof = 1;
       }
       obj = (uof)? objArray: new m();
       e uoe = new e(obj);
       this.r = uoe;
       uCameraPageT = CameraPageType.VIDEO;
       this.L0(new l(uCameraPageT, p1, uoe));
       uof = (uof)? new f(): objArray;
       e uoe1 = new e(uof);
       this.s = uoe1;
       this.L0(new j(uCameraPageT, p1, uoe1));
       d te = this.e;
       if (te != null && (j.b(te.getIntent()) && patchProxyRe)) {
          this.L0(new h(uCameraPageT, p1, objArray, uoe1));
       }
    label_019d :
       if (!PatchProxy.applyVoidTwoRefs(uoe, uoe1, this, uoc, "4")) {
          this.d.n(a.class, new b(uoe1, uoe));
          this.d.n(b.class, new a(this));
       }
       return;
    }
    public void k(View p0){
       m om;
       a uoa;
       Object[] objArray;
       c uoc = c.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, str)) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(null, this, uoc, "2")) {
          f uof = c.d().e("updateDefaultMagicFace");
          f uof1 = c.d().e("updateDefaultMusic");
          c.d().b("updateDefaultMagicFace");
          c.d().b("updateDefaultMusic");
          boolean b = true;
          if (uof != null) {
             om = PatchProxy.applyOneRefs(uof, null, a.class, str);
             if (om != patchProxyRe) {
             }else {
                try{
                   uoa = a.a.h(uof.c(), a.class);
                }catch(com.google.gson.JsonSyntaxException e0){
                   objArray = new Object[0];
                   a.D().t("FlyWheelDefaultMagicApplyEvent", "", objArray);
                   uoa = null;
                }
                if (uoa == null || TextUtils.isEmpty(uoa.mMagicFaceId)) {
                label_00d1 :
                   objArray = null;
                }else {
                   om = new m();
                   om.a(uoa.mMagicDownloadSliderStyle);
                   om.G(uoa.mMagicFaceId, uoa.mChildMagicFaceId);
                   om.t(b);
                }
             }
          }else if(uof1 != null){
             b uob = b.class;
             om = PatchProxy.applyOneRefs(uof1, null, uob, str);
             if (om != patchProxyRe) {
             }else {
                try{
                   uob = a.a.h(uof1.c(), uob);
                }catch(com.google.gson.JsonSyntaxException e0){
                   objArray = new Object[0];
                   a.D().t("FlyWheelDefaultMusicApplyEvent", "", objArray);
                   uob = null;
                }
                if (uob == null || TextUtils.isEmpty(uob.mMusicId)) {
                   goto label_00d1 ;
                }else {
                   om = new a();
                   om.a(0);
                   om.D(Integer.valueOf(uob.mMusicType), uob.mMusicId);
                   om.t(b);
                }
             }
          }else {
             goto label_00d1 ;
          }
          if (om != null) {
             if (!om instanceof m || !om.C()) {
                b = 0;
             }
             if (b) {
                this.r.d(0, null);
                this.s.l(new f());
                this.r.l(om);
             }else {
                this.s.l(om);
                this.s.d(0, null);
                this.r.l(new m());
             }
          }
       }
       super.k(p0);
       return;
    }
}
