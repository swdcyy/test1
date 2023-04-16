package com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager;
import ml8.d;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import bd9.d;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import com.yxcorp.gifshow.camera.record.base.d;
import bd9.f;
import cd9.f;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import android.graphics.RectF;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import qr4.i;
import qr4.m$k0;
import qr4.m$c0;
import android.view.View;
import ekd.m1;
import android.view.ViewStub;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.widget.ImageView;
import android.widget.TextView;
import cd9.e;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import oc9.w;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import oa0.a;
import android.content.SharedPreferences;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import cd9.g;
import erd.g;
import crd.b;
import eoc.f;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import tg9.b;
import java.lang.Boolean;
import android.app.Activity;
import lnc.a1;
import com.yxcorp.utility.n;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import j8c.a;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import android.content.Context;
import java.lang.Integer;
import java.lang.Long;
import q87.c;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.camera.record.duet.controller.b;
import java.lang.Runnable;
import ekd.k1;

public class DuetLayoutManager extends d0 implements d	// class@000dbb
{
    public View A;
    public ImageView o;
    public ViewStub p;
    public TextView q;
    public CameraView r;
    public View s;
    public d t;
    public DuetLayoutPanel u;
    public DuetLayoutManager$LayoutMode v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public void DuetLayoutManager(CameraPageType p0,b p1,d p2){
       super(p0, p1);
       this.v = DuetLayoutManager$LayoutMode.LEFT;
       this.t = p2;
       this.d.n(f.class, new f(this));
    }
    public static boolean n2(RectF p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       RectF left = p0.left;
       if (left >= 0 && left - 0x3f800000 <= 0) {
          left = p0.top;
          if (left >= 0 && left - 0x3f800000 <= 0) {
             left = p0.right;
             if (left >= 0 && left - 0x3f800000 <= 0) {
                p0 = p0.bottom;
                if (p0 >= 0 && p0 - 0x3f800000 <= 0) {
                   b = true;
                }
             }
          }
       }
       return b;
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DuetLayoutManager.class, "16")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0 = p0.e;
       if (p0 == null) {
          return;
       }
       if (this.i2() != null) {
          DuetLayoutManager$LayoutMode mTag = this.i2().mTag;
          if (PatchProxy.applyOneRefs(mTag, p0, VideoContext.class, "94") != PatchProxyResult.class) {
          }else {
             VideoContext.b();
             p0.d0();
             Objects.requireNonNull(mTag);
             int i = -1;
             switch (mTag.hashCode()){
                 case 2193:
                   if (mTag.equals("DU")) {
                      i = 0;
                   }
                   break;
                 case 2438:
                   if (mTag.equals("LR")) {
                      i = 1;
                   }
                   break;
                 case 2618:
                   if (mTag.equals("RL")) {
                      i = 2;
                   }
                   break;
                 case 2703:
                   if (mTag.equals("UD")) {
                      i = 3;
                   }
                   break;
                 case 0x13577:
                   if (mTag.equals("PIP")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   p0.a = 4;
                   break;
                 case 1:
                   p0.a = 1;
                   break;
                 case 2:
                   p0.a = 2;
                   break;
                 case 3:
                   p0.a = 3;
                   break;
                 case 4:
                   p0.a = 5;
                   break;
                 default:
                   p0.a = 0;
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DuetLayoutManager.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a36e0);
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a36da, 0x7f0a36d9);
       viewStubInfl.d(p0);
       this.o = viewStubInfl.b(0x7f0a36d8);
       this.q = viewStubInfl.b(0x7f0a36de);
       m1.a(p0, new e(this), R.id.same_frame_layout_btn_container);
       return;
    }
    public final RectF g2(RectF p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DuetLayoutManager.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float f = (float)this.r.getWidth();
       float f1 = p0.left * f;
       float f2 = (float)this.r.getHeight();
       float f3 = p0.top * f2;
       return new RectF(f1, f3, (f * p0.right), (f2 * p0.bottom));
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, DuetLayoutManager.class, "17")) {
          return;
       }
       this.o2(0, 0);
       return;
    }
    public DuetLayoutManager$LayoutMode i2(){
       return this.v;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DuetLayoutManager.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.s = p0.findViewById(0x7f0a0616);
       }
       super.k(p0);
       this.doBindView(p0);
       CameraView cameraView = this.d.b().z7().getCameraView();
       this.r = cameraView;
       cameraView.setVisibility(8);
       if (!a.a.getBoolean("same_frame_origin_layout_tip", false)) {
          DuetLayoutManager tp = this.p;
          this.A = (tp != null)? tp.inflate(): p0.findViewById(0x7f0a36df);
       }
    label_0050 :
       this.h2();
       this.Y1(f.a(PanelShowEvent.class, new g(this)));
       return;
    }
    public final c k2(){
       Object obj = PatchProxy.apply(null, this, DuetLayoutManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getSupportFragmentManager();
    }
    public b l2(){
       Object obj = PatchProxy.apply(null, this, DuetLayoutManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.j();
    }
    public void m2(boolean p0,boolean p1){
       DuetLayoutManager uDuetLayoutM = DuetLayoutManager.class;
       if (PatchProxy.isSupport(uDuetLayoutM) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uDuetLayoutM, "7")) {
          return;
       }
       if (a1.i(this.e) && this.u != null) {
          n.Y(this.e.findViewById(R.id.sameframe_touch_view), 4, false);
          e uoe = this.k2().beginTransaction();
          if (p0) {
             uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
          }
          e uoe1 = uoe.u(this.u);
          try{
             uoe1.m();
             this.k2().executePendingTransactions();
          }catch(java.lang.Exception e5){
             String str = "DuetLayoutManager";
             a.D().e(str, "error", e5);
             PostUtils.D(str, " ÊÕÆðÃæ°åÊ§°Ü", e5);
          }
          this.u = null;
          if (p1) {
             RxBus.f.b(new PanelShowEvent(CameraPageType.VIDEO, PanelShowEvent$PanelType.SAME_FRAME_LAYOUT_PANEL, this.e, false));
          }
       }
    label_007e :
       return;
    }
    public final void o2(int p0,long p1){
       DuetLayoutManager uDuetLayoutM = DuetLayoutManager.class;
       if (PatchProxy.isSupport(uDuetLayoutM) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, uDuetLayoutM, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("duet", "tryApplyLayoutMode", objArray);
       if (p0 > 10) {
          Object[] objArray1 = new Object[0];
          a.D().w("duet", "tryApplyLayoutMode retry too many times "+p0, objArray1);
          return;
       }else {
          k1.r(new b(this, p0), p1);
          return;
       }
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, DuetLayoutManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.u == null) {
          return false;
       }
       this.m2(true, true);
       return true;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, DuetLayoutManager.class, "2")) {
          return;
       }
       super.onPause();
       this.m2(false, true);
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, DuetLayoutManager.class, "15")) {
          return;
       }
       this.h2();
       return;
    }
}
