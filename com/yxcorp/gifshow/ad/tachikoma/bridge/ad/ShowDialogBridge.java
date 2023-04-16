package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ShowDialogBridge;
import a59.e;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ShowDialogBridge$a;
import nsd.u;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ShowDialogBridge$mEasyTk$2;
import msd.a;
import qrd.p;
import qrd.s;
import org.json.JSONObject;
import a59.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import fg6.a;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.DialogParams;
import com.google.gson.Gson;
import java.lang.Throwable;
import yx.j0;
import com.kwai.library.widget.popup.common.c;
import x49.n;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ShowDialogBridge$b;
import erd.g;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ShowDialogBridge$c;
import u07.t$a;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ShowDialogBridge$d;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ShowDialogBridge$e;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import java.lang.StringBuilder;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.Long;
import android.widget.FrameLayout;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import x49.o;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ShowDialogBridge$initTkDialog$easyTkBridgeContext$1;
import mxb.u;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import msd.l;
import io.reactivex.subjects.PublishSubject;
import android.view.ViewGroup;
import x49.n$b;
import z49.o0;
import x49.q;

public final class ShowDialogBridge extends e	// class@001828
{
    public final p b;
    public c c;
    public f d;
    public static final ShowDialogBridge$a e;

    static {
       ShowDialogBridge.e = new ShowDialogBridge$a(null);
    }
    public void ShowDialogBridge(f p0){
       a.p(p0, "bridgeContext");
       super();
       this.d = p0;
       this.b = s.c(ShowDialogBridge$mEasyTk$2.INSTANCE);
    }
    public String a(){
       return "showAdTKDialog";
    }
    public Object c(JSONObject p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, ShowDialogBridge.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       String str = "data";
       try{
          a.p(p0, str);
          Activity uActivity = this.d.b();
          if (uActivity != null) {
             String str1 = p0.getJSONObject("dialogParams").toString();
             a.o(str1, "data.getJSONObject\(\"dialogParams\"\).toString\(\)");
             this.m(uActivity, a.a.h(str1, DialogParams.class));
          }else {
             return "";
          }
       }catch(java.lang.Exception e4){
          j0.b("ShowDialogBridge", "failed to build dialog", e4);
          this.i();
       }
       return "";
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, ShowDialogBridge.class, "3")) {
          return;
       }
       ShowDialogBridge tc = this.c;
       if (tc != null) {
          tc.o();
       }
       this.c = null;
       this.k();
       return;
    }
    public final n j(){
       Object obj = PatchProxy.apply(null, this, ShowDialogBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, ShowDialogBridge.class, "7")) {
          return;
       }
       QPhoto qPhoto = this.d.e();
       if (qPhoto != null) {
          BaseFeed entity = qPhoto.getEntity();
          if (entity != null) {
             i0.a().e(141, entity).d(ShowDialogBridge$b.b).a();
          }
       }
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, ShowDialogBridge.class, "6")) {
          return;
       }
       QPhoto qPhoto = this.d.e();
       if (qPhoto != null) {
          BaseFeed entity = qPhoto.getEntity();
          if (entity != null) {
             i0.a().e(140, entity).d(ShowDialogBridge$c.b).a();
          }
       }
       return;
    }
    public final void m(Activity p0,DialogParams p1){
       String str1;
       c uoc = this;
       Object[] obj = p0;
       Object[] obj1 = p1;
       ShowDialogBridge showDialogBr = ShowDialogBridge.class;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, uoc, showDialogBr, "4")) {
          return;
       }
       c uoc1 = null;
       String str = "ShowDialogBridge";
       int i = 0;
       if (uoc.c != null) {
          Object[] objArray = new Object[i];
          j0.c(str, "duplicate popup shown", objArray);
          ShowDialogBridge c = uoc.c;
          a.m(c);
          c.o();
          uoc.c = uoc1;
       }
       t$a uoa = new t$a(obj);
       uoa.G(ShowDialogBridge$d.a);
       boolean b = true;
       uoa.z(b);
       uoa.A(b);
       uoa.J(new ShowDialogBridge$e(uoc));
       int dialogType = (obj1 != null)? p1.getDialogType(): 0;
       if (dialogType) {
          obj1 = new Object[i];
          j0.c(str, "Illegal dialogType "+dialogType, obj1);
       }else {
          a.o(uoa, "dialogBuilder");
          if (!PatchProxy.applyVoidTwoRefs(uoa, obj1, uoc, showDialogBr, "5")) {
             Activity uActivity = uoc.d.b();
             QPhoto qPhoto = uoc.d.e();
             PhotoAdvertisement photoAdverti = k.B(qPhoto);
             if (uActivity == null || qPhoto == null) {
                obj = new Object[i];
                j0.c(str, "Illegal bridgeContext", obj);
             }else if(obj1 != null){
                str1 = p1.getTemplateId();
             }else {
                str1 = uoc1;
             }
             if (str1 != null && str1.length()) {
                b = false;
             }
             if (b) {
                StringBuilder str2 = "Illegal templateId for ";
                if (photoAdverti != null) {
                   uoc1 = Long.valueOf(photoAdverti.mCreativeId);
                }
                obj1 = new Object[i];
                j0.c(str, str2+uoc1+": "+str1, obj1);
             }else {
                FrameLayout uFrameLayout = new FrameLayout(uActivity);
                uFrameLayout.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
                obj1 = new Object[i];
                j0.f(str, "initTkContainer begin", obj1);
                Activity uActivity1 = uoc.d.b();
                a.m(uActivity1);
                QPhoto qPhoto1 = uoc.d.e();
                a.m(qPhoto1);
                if (n$b.a(this.j(), uActivity1, uFrameLayout, qPhoto1, str1, new o(null, null, null, null, null, new ShowDialogBridge$initTkDialog$easyTkBridgeContext$1(uoc), null, 95, null), null, 0, 96, 0)) {
                   this.j().c(new o0(uoc, uoa, uFrameLayout));
                }
             }
          }
       }
       return;
    }
}
