package com.yxcorp.gifshow.camera.record.mix.widget.MixRecordButton;
import com.yxcorp.gifshow.widget.record.BaseRecordButton;
import android.content.Context;
import android.util.AttributeSet;
import android.animation.AnimatorSet;
import th0.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.record.RecordRoundProgressView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.record.CaptureShadowView;
import com.yxcorp.utility.n;

public class MixRecordButton extends BaseRecordButton	// class@000e68
{
    public CaptureShadowView p;
    public View q;
    public View r;
    public View s;
    public View t;
    public RecordRoundProgressView u;
    public boolean v;
    public AnimatorSet w;
    public TimeInterpolator x;
    public boolean y;

    public void MixRecordButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.v = false;
       this.w = new AnimatorSet();
       this.x = new e();
       this.y = true;
    }
    public boolean c(){
       return this.y;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MixRecordButton.class, "4")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().y("MixRecordButton", "onRecordInit", objArray1);
       if (!PatchProxy.applyVoid(objArray, this, MixRecordButton.class, "7")) {
          this.q.setAlpha(0x3f800000);
          this.r.setAlpha(0x3f800000);
          this.s.setAlpha(0);
          this.t.setScaleX(0x3f800000);
          this.t.setScaleY(0x3f800000);
          this.u.setAlpha(0);
       }
       this.v = false;
       super.d();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixRecordButton.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a2bba);
       this.u = m1.f(p0, 0x7f0a2bbe);
       this.q = m1.f(p0, 0x7f0a2bb6);
       this.r = m1.f(p0, 0x7f0a2bb5);
       this.s = m1.f(p0, 0x7f0a2bbb);
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, MixRecordButton.class, "11")) {
          return;
       }
       if (this.w.isStarted() || this.w.isRunning()) {
          this.w.cancel();
       }
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, MixRecordButton.class, "12")) {
          return;
       }
       super.onAttachedToWindow();
       CaptureShadowView uCaptureShad = m1.f(this.getRootView(), R.id.capture_btn_shadow);
       this.p = uCaptureShad;
       n.Y(uCaptureShad, 4, false);
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MixRecordButton.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       if (!PatchProxy.applyVoid(objArray, this, MixRecordButton.class, "3")) {
          MixRecordButton tu = this.u;
          if (tu != null) {
             tu.setStrokeWidth(2.53f);
          }
       }
       return;
    }
    public void setSupportFollowHandAndZoom(boolean p0){
       this.y = p0;
    }
}
