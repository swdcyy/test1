package com.yxcorp.gifshow.camera.record.frame.n;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import ed9.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import java.lang.Integer;
import android.view.ViewParent;
import android.view.ViewStub;
import h80.h;
import h80.k;
import android.view.View;
import android.widget.TextView;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import sm6.b;
import com.yxcorp.gifshow.camera.record.frame.n$a;
import java.lang.Enum;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import hd9.n;
import hf9.b;
import hf9.b$a;
import com.yxcorp.utility.n;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import kd9.r0;
import erd.g;
import crd.b;
import eoc.f;
import lm6.h;
import kd9.q0;
import com.yxcorp.gifshow.camera.record.CameraLogger;

public class n extends d0	// class@000ded
{
    public ViewStub o;
    public View p;
    public c$e q;
    public final f r;

    public void n(CameraPageType p0,b p1,c$e p2){
       super(p0, p1);
       this.q = p2;
       this.r = new f(p0);
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, n.class, "11")) {
          return;
       }
       this.i2();
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, n.class, "9")) {
          return;
       }
       if (this.q.u1() == CameraFramePageType.KTV) {
          return;
       }
       this.k2();
       return;
    }
    public void g2(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, "7")) {
          return;
       }
       on = this.o;
       if (on != null && on.getParent() != null) {
          h oh = k.c();
          if (oh != null && !oh.j()) {
             return;
          }else {
             View view = this.o.inflate();
             this.p = view;
             TextView textView = view.findViewById(R.id.camera_place_holder_text);
             if (textView != null) {
                textView.setText(p0);
             }
             View view1 = this.p.findViewById(R.id.camera_place_holder_indicator);
             if (view1 != null) {
                view1.setBackgroundResource(R.drawable.arg_RES_7f08044e);
             }
             Object[] objArray = new Object[0];
             a.D().s("PlaceHolderController", "addPlaceHolderContainer"+this.q.t1(), objArray);
             b.v(this.p, this.q.t1());
          }
       }
       return;
    }
    public void h2(){
       int i1;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "8")) {
          return;
       }
       int i = n$a.a[this.q.u1().ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4 && this.c == CameraPageType.LIVE_COVER) {
                   this.g2(R.string.arg_RES_7f10090a);
                }
             }else {
                this.g2(R.string.arg_RES_7f104338);
             }
          }else if(this.p != null){
             objArray = new Object[0];
             a.D().A("PlaceHolderController", "mPlaceHolderTab not null when doSpecialAdaption", objArray);
          }else {
             this.i2();
          }
       }else {
          Object obj = PatchProxy.apply(objArray, this, on, "12");
          if (obj != PatchProxyResult.class) {
             i1 = obj.intValue();
          }else if(this.d.d(n.j).h != null){
             i1 = 0x7f101cd6;
          }else if(this.d.d(b.c.a()).a()){
             i1 = 0x7f103d8d;
          }else {
             i1 = 0x7f101011;
          }
          this.g2(i1);
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, n.class, "6")) {
          return;
       }
       n.Y(this.p, 8, false);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       super.k(p0);
       int i = 0x7f0a062e;
       ViewStub viewStub = p0.findViewById(i);
       this.o = viewStub;
       if (viewStub != null && viewStub.getParent() instanceof RelativeLayout) {
          RelativeLayout$LayoutParams layoutParams = this.o.getLayoutParams();
          int i1 = -1;
          layoutParams.addRule(11, i1);
          layoutParams.addRule(12, i1);
          this.o.setLayoutParams(layoutParams);
       }
       if (this.q.u1() == CameraFramePageType.KTV && this.o == null) {
          Object[] objArray = new Object[0];
          a.D().w("PlaceHolderController", "BindView not init mPlaceHolderTabStub and reInit by findViewId", objArray);
          this.o = p0.findViewById(i);
       }
       if (b.t(this.e)) {
          n to = this.o;
          if (to != null && to.getLayoutParams() != null) {
             to.height = b.e(this.e);
          }
       }
       this.Y1(f.a(PanelShowEvent.class, new r0(this)));
       this.Y1(f.a(h.class, new q0(this)));
       return;
    }
    public void k2(){
       if (PatchProxy.applyVoid(null, this, n.class, "4")) {
          return;
       }
       if (this.q.q1() && !CameraLogger.d(this.d)) {
          this.l2();
       }
       return;
    }
    public void l2(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       n tp = this.p;
       if (tp != null) {
          tp.bringToFront();
          n.Y(this.p, 0, true);
       }
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, n.class, "10")) {
          return;
       }
       this.i2();
       return;
    }
}
