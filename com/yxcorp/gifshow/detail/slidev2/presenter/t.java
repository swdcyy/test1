package com.yxcorp.gifshow.detail.slidev2.presenter.t;
import com.yxcorp.gifshow.detail.slidev2.presenter.g0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.entity.QPhoto;
import android.widget.ImageView;
import uc6.c;
import sd5.d;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.p1;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Boolean;
import lnc.i3;
import ekd.y0;
import android.os.Looper;
import b8a.j1;
import java.lang.Runnable;
import ekd.m1;
import android.view.ViewGroup;
import sd5.c;
import im8.a;

public class t extends g0	// class@0019d4
{
    public Bitmap P;
    public y0 Q;
    public d R;

    public void t(){
       super();
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, t.class, "2")) {
          return;
       }
       super.J8();
       t tP = this.P;
       if (tP != null && !tP.isRecycled()) {
          this.P.recycle();
       }
       this.P = null;
       return;
    }
    public void V8(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "5")) {
          return;
       }
       int i = 3;
       int i1 = 2;
       if (this.s.isImageType()) {
          this.q.getLocationOnScreen(p0);
          p0[i1] = this.q.getMeasuredWidth();
          p0[i] = this.q.getMeasuredHeight();
       }else {
          View view = this.R.N().m();
          view.getLocationOnScreen(p0);
          p0[i1] = view.getMeasuredWidth();
          p0[i] = view.getMeasuredHeight();
       }
       p0[1] = p0[1] + p1.f(this.getActivity());
       return;
    }
    public Bitmap W8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ot, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!this.s.isImageType()) {
          return this.R.N().a();
       }
       ot = PatchProxy.apply(objArray, this, ot, "7");
       if (ot != patchProxyRe) {
       }else if(this.P == null){
          int measuredWidt = this.q.getMeasuredWidth();
          int measuredHeig = this.q.getMeasuredHeight();
          if (measuredWidt <= 0) {
             measuredWidt = 1;
          }
          if (measuredHeig <= 0) {
             measuredHeig = 1;
          }
          this.P = Bitmap.createBitmap(measuredWidt, measuredHeig, Bitmap$Config.ARGB_8888);
       }
       this.q.draw(new Canvas(this.P));
       ot = this.P;
       return ot;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, t.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ENLARGE_PHOTO_CARD";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.s.getEntity());
       u1.M("", this.M, 1, uElementPack, uContentPack, null);
       return;
    }
    public void Y8(boolean p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ot, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SIMPLIFY_SCREEN";
       i3 oi3 = i3.f();
       String str = (p0)? "ON": "OFF";
       oi3.d("status", str);
       oi3.d("hand_gesture", "SLIDE");
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.s.getEntity());
       u1.M("", this.M, 1, uElementPack, uContentPack, null);
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       if (this.s.isImageType()) {
          return;
       }
       if (this.Q == null) {
          this.Q = new y0(Looper.getMainLooper(), 33, new j1(this));
       }
       this.Q.d();
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       if (this.s.isImageType()) {
          return;
       }
       t tQ = this.Q;
       if (tQ != null) {
          tQ.e();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       super.doBindView(p0);
       d uod = c.a(m1.f(p0, R.id.texture_view_frame));
       this.R = uod;
       this.W7(uod);
       return;
    }
}
