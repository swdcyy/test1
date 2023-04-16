package ai9.i;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.camerasdk.ErrorCode$Result;
import ai9.i$a;
import com.yxcorp.gifshow.camera.record.base.d;
import ai9.j;
import ai9.f;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import oc9.t;
import oc9.s;
import android.widget.FrameLayout;
import zb9.p0;
import zb9.p0$a;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import yh9.j;
import oc9.w;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import java.lang.Boolean;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import ai9.h;
import msd.l;
import com.kwai.feature.post.funnel.PostCommonFunnel;
import android.view.View;
import com.yxcorp.gifshow.camerasdk.p$a;
import com.yxcorp.gifshow.camerasdk.p$c;
import com.yxcorp.gifshow.camerasdk.q;
import android.app.Activity;
import pi9.p;
import w46.b;
import kd9.s;
import nc9.b;
import com.yxcorp.gifshow.camera.record.widget.RecordButton;
import e17.i;
import tkd.b;
import tkd.d;
import bq.a;
import ce9.l;
import wc9.v;
import com.kwai.camerasdk.videoCapture.CameraController;
import ji9.a;
import lnc.n4;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import zb9.k;
import k2b.e0;
import wc9.r;
import com.yxcorp.gifshow.camera.record.CameraLogger$VideoRecStartType;
import zb9.k$a;
import oa0.a;
import ai9.b;
import android.view.View$OnClickListener;
import ai9.g;
import com.yxcorp.gifshow.widget.record.BaseRecordButton$b;
import com.yxcorp.gifshow.widget.record.BaseRecordButton;
import ai9.c;
import c35.p;
import c35.l;
import com.kuaishou.viewbinder.IViewBinder;
import android.view.View$OnLongClickListener;
import ai9.a;
import ekd.m1;
import ai9.d;
import qi9.f;
import aj9.b;
import java.lang.Float;
import oc9.b0;
import oc9.a0;

public class i extends d0	// class@0000d1
{
    public RecordButton o;
    public int p;
    public final f q;

    public void i(CameraPageType p0,b p1){
       super(p0, p1);
       this.p = ErrorCode$Result.kOk.getCode();
       this.q = new i$a(this);
       this.d.n(j.class, new f(this));
    }
    public void N(long p0,long p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, oi, "7")) {
          return;
       }
       s.f(this, p0, p1);
       i to = this.o;
       if (to != null) {
          to.setTag(R.id.view_status_tag, "FinalFinish");
       }
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       this.p = ErrorCode$Result.kOk.getCode();
       return;
    }
    public void g2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "9")) {
          return;
       }
       if (this.d.d(p0.j.a()).c()) {
          objArray = CameraLogger.h();
       }
       CameraLogger.z(406, "click_discard_video", objArray);
       if (this.d.d(j.i).h != null || !this.d.b().q2()) {
          this.d.b().s0();
       }else {
          this.d.b().E0();
       }
       return;
    }
    public boolean h2(){
       return true;
    }
    public void i2(boolean p0,boolean p1){
       int i;
       l a;
       Object obj = this;
       int b = p0;
       boolean b1 = p1;
       StabilityType stabilityTyp = StabilityType.class;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), obj, oi, "8")) {
          return;
       }
       i = 0;
       Object[] objArray = new Object[i];
       a.D().s("post-log", "onRecordButtonClick:isClick="+b+",needConfirmRecordError="+b1, objArray);
       PostFunnelManager.j.a().d().l(h.b);
       View view = null;
       PostCommonFunnel.b.b(view, "camera_record_btn_press");
       obj.h.t0(view, view);
       String str = "RecordBtnController";
       if (b1 && obj.p != ErrorCode$Result.kOk.getCode()) {
          p.i(obj.e, obj.p, obj.d.b());
          Object[] objArray1 = new Object[i];
          a.D().t(str, "onClickRecordButton need show record error dialog "+obj.p, objArray1);
          return;
       }else {
          j oj = obj.d.d(j.i);
          if (oj.f - 0x3f800000 && obj.d.d(s.g).a == null) {
             if (b.b(obj.d)) {
                Object[] objArray2 = new Object[i];
                a.D().t(str, "sample video is not prepared!", objArray2);
                obj.o.d();
                i.a(R.style.arg_RES_7f11066a, 0x7f103dfa);
                return;
             }else {
                d.a(0x7c418b06).pT();
                l ol = obj.d.d(l.i);
                a = ol.a;
                if (obj.d.d(v.e).b != null) {
                   if (b) {
                      CameraLogger.x(3, CameraLogger.d(obj.d), obj.o, (obj.h.isFrontCamera() ^ 0x01), false, "canceled", a, obj.d.d(a.b).a, StabilityType.getStabilityTypeLog(obj.d.c(stabilityTyp)), null, n4.e(obj.e), obj.f, ol.g);
                   }
                   obj.d.m(new r(b));
                   return;
                }else if(b){
                   i o = obj.o;
                   if (o != null && o.getTag() == null) {
                      obj.o.setTag(CameraLogger$VideoRecStartType.SingleClickRecord);
                   }
                   b = CameraLogger.d(obj.d);
                   i = (!b && obj.d.d(p0.j.a()).c())? 3: b;
                   Object obj1 = obj.d.d(k.l.a());
                   i o1 = obj.o;
                   int i1 = obj.h.isFrontCamera() ^ 0x01;
                   String str1 = (a.f0())? "enabled": "unabled";
                   CameraLogger.x(3, i, o1, i1, false, str1, a, obj.d.d(a.b).a, StabilityType.getStabilityTypeLog(obj.d.c(stabilityTyp)), obj1, n4.e(obj.e), obj.f, ol.g);
                }
                if (obj.h.isRecording()) {
                   if (oj.g != null) {
                      obj.d.b().A0();
                   }
                }else if(obj.h.R()){
                   if (obj.d.b().R0()) {
                      obj.d.b().q1();
                   }else {
                      obj.d.b().y();
                   }
                }
             }
          }
          return;
       }
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.k(p0);
       RecordButton recordButton = p0.findViewById(R.id.record_btn_layout);
       this.o = recordButton;
       recordButton.setOnClickListener(new b(this));
       this.o.b(new g(this));
       a uoa = null;
       i to = this.o;
       c uoc = new c(this);
       if (!PatchProxy.applyVoidThreeRefs(null, to, uoc, null, p.class, "3") && to != null) {
          to.setOnLongClickListener(new l(uoa, uoc));
       }
       m1.a(p0, new a(this), R.id.delete_segment_btn);
       m1.d(p0, new d(this), R.id.delete_segment_btn);
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       super.nb(p0);
       d th = this.h;
       if (th != null) {
          th.G(this.q);
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       super.onDestroyView();
       d th = this.h;
       if (th != null) {
          th.I(this.q);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       super.onResume();
       if (!this.o.isEnabled()) {
          i to = this.o;
          boolean b = (Float.compare(this.d.d(j.i).a, 0x3f800000) < 0)? true: false;
          to.setEnabled(b);
       }
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       a0.m(this);
       this.p = ErrorCode$Result.kOk.getCode();
       return;
    }
}
