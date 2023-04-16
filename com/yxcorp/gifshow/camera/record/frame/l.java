package com.yxcorp.gifshow.camera.record.frame.l;
import com.kwai.camerasdk.videoCapture.CameraController$d;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import com.yxcorp.gifshow.camera.record.base.d;
import zg9.c;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Long;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kd9.f0;
import com.kwai.library.widget.popup.common.c;
import fd9.a;
import kd9.h0;
import erd.g;
import crd.b;
import eoc.f;
import wd9.a;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import android.view.ViewGroup;
import qxc.b;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import lnc.s6;
import android.graphics.drawable.Drawable;
import lnc.a1;
import pi9.i;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.record.frame.i;
import java.lang.Runnable;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import kd9.i0;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import yb9.b;
import yb9.b$a;
import oc9.w;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import com.yxcorp.gifshow.camerasdk.q;
import j8c.a;
import q87.c;
import java.lang.Integer;
import android.content.Context;
import androidx.fragment.app.Fragment;
import o56.a;
import java.lang.IllegalStateException;
import android.content.res.Resources;
import android.widget.TextView;
import java.lang.CharSequence;

public class l extends d0 implements CameraController$d	// class@000dea
{
    public j A;
    public boolean B;
    public ViewGroup o;
    public TextImageView p;
    public ImageView q;
    public View r;
    public View s;
    public c t;
    public c u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public c$e z;

    public void l(CameraPageType p0,b p1,c$e p2){
       super(p0, p1);
       d tf = this.f;
       if (tf instanceof c) {
          this.A = tf.E6();
       }
       this.z = p2;
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, l.class, "27")) {
          return;
       }
       this.m2((this.a2() ^ 0x01));
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, l.class, "25")) {
          return;
       }
       l tr = this.r;
       if (tr != null && tr.isEnabled()) {
          this.l2(false);
       }
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, l.class, "30")) {
          return;
       }
       this.h2();
       return;
    }
    public void N(long p0,long p1){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, l.class, "26")) {
          return;
       }
       l tr = this.r;
       if (tr != null && (!tr.isEnabled() && this.w == null)) {
          this.l2(true);
       }
    label_002b :
       return;
    }
    public void O(long p0){
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, l.class, "28")) {
          return;
       }
       if (this.z.u1() == CameraFramePageType.KTV) {
          this.m2((this.a2() ^ 1));
          return;
       }else {
          this.m2(1);
          return;
       }
    }
    public final PopupInterface$c g2(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ol, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f0(this, p0);
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, l.class, "22")) {
          return;
       }
       l tt = this.t;
       if (tt != null && tt.K()) {
          this.t.q(4);
       }
       return;
    }
    public boolean i2(){
       boolean b = (this.c == CameraPageType.VIDEO && this.B == null)? true: false;
       return b;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       super.k(p0);
       this.Y1(f.a(a.class, new h0(this)));
       this.B = this.d.d(a.i).a;
       l tA = this.A;
       View view = null;
       SideBarViewBinder sideBarViewB = (tA != null && tA.r2() != null)? this.A.r2(): view;
       if (sideBarViewB != null) {
          view = sideBarViewB.C();
       }
       this.o = b.a(view, p0, 0x7f0a0635);
       this.q = p0.findViewById(0x7f0a3c4b);
       this.p = p0.findViewById(0x7f0a3c4c);
       this.s = p0.findViewById(0x7f0a3c4d);
       if (s6.m()) {
          l tq = this.q;
          int i = 0x7f081bd0;
          if (tq != null) {
             tq.setImageResource(i);
          }
          tq = this.p;
          if (tq != null) {
             tq.setTopDrawable(a1.f(i));
             i.b(this.p);
          }
       }
       this.r = (this.i2())? this.p: this.q;
       this.m2(this.z.z1());
       if (this.u != null && !this.i2()) {
          this.u.s(RecordBubbleItem.FRAME);
       }
       this.b2(new i(this));
       this.Y1(f.a(PanelShowEvent.class, new i0(this)));
       return;
    }
    public final boolean k2(){
       d obj = PatchProxy.apply(null, this, l.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       int i = 0;
       if (obj != null && j0.b(obj.getIntent(), "camera_page_source", i) == 21) {
          i = true;
       }
       return i;
    }
    public final void l2(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "15")) {
          return;
       }
       if (p0 && !this.o2()) {
          return;
       }
       ol = this.r;
       if (ol != null) {
          ol.setEnabled(p0);
       }
       if (!p0) {
          this.h2();
       }
       return;
    }
    public void m2(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "14")) {
          return;
       }
       int i = 0;
       int i1 = (this.z.z1() && !this.k2())? 1: 0;
       int i2 = p0 & i1;
       ol = this.s;
       if (ol != null) {
          ol.setEnabled(i2);
       }
       b uob = this.d.h();
       l ts = this.s;
       if (!i2) {
          i = 8;
       }
       uob.e(ts, i, null);
       return;
    }
    public void n2(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "12")) {
          return;
       }
       AnimCameraView uAnimCameraV = this.d.b().z7();
       if (uAnimCameraV != null && uAnimCameraV.getCameraView() != null) {
          uAnimCameraV.getCameraView().setIsLongpressEnabled(p0);
       }
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "6")) {
          return;
       }
       super.nb(p0);
       this.h.j(this);
       return;
    }
    public final boolean o2(){
       boolean b = (this.w == null && this.x == null)? true: false;
       return b;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, l.class, "5")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().s("FrameSwitchController", "onDestroyView", objArray);
       this.h2();
       this.h.d0(this);
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       super.onPause();
       this.h2();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       super.onResume();
       l tt = this.t;
       if (tt != null && tt.K()) {
          this.t.q(4);
       }
       return;
    }
    public final void p2(int p0){
       CharSequence uCharSequenc;
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ol, "19")) {
          return;
       }
       if (this.r != null && this.f.getContext() != null) {
          if (!p0) {
             if (!a.d()) {
                return;
             }else {
                throw new IllegalStateException("illegal frame mode");
             }
          }else {
             Resources resources = this.e.getResources();
             boolean b = s6.m();
             Drawable uDrawable = null;
             if (p0 != 1) {
                if (p0 != 2) {
                   if (p0 != 3) {
                      if (p0 != 4 && p0 != 5) {
                         uCharSequenc = uDrawable;
                      }else if(b){
                         p0 = 0x7f081c06;
                      }else {
                         p0 = 0x7f081c05;
                      }
                      uDrawable = resources.getDrawable(p0);
                      uCharSequenc = resources.getString(R.string.arg_RES_7f10049a);
                   }else if(b){
                      p0 = 0x7f081bc8;
                   }else {
                      p0 = 0x7f081bc7;
                   }
                   uDrawable = resources.getDrawable(p0);
                   uCharSequenc = resources.getString(R.string.arg_RES_7f100496);
                }else if(b){
                   p0 = 0x7f081bcc;
                }else {
                   p0 = 0x7f081bcb;
                }
                uDrawable = resources.getDrawable(p0);
                uCharSequenc = resources.getString(R.string.arg_RES_7f100497);
             }else if(b){
                p0 = 0x7f081bd0;
             }else {
                p0 = 0x7f081bcf;
             }
             uDrawable = resources.getDrawable(p0);
             uCharSequenc = resources.getString(R.string.arg_RES_7f100498);
             if (this.i2()) {
                boolean b1 = this.p.isEnabled();
                if (!PatchProxy.isSupport(ol) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b1), uDrawable, this, ol, "20") && !b1)) {
                   float f = 0x42ff0000;
                   if (uDrawable != null) {
                      uDrawable.mutate().setAlpha((int)f);
                   }
                }
                this.p.setTopDrawable(uDrawable);
                this.p.setText(uCharSequenc);
             }else {
                this.q.setImageDrawable(uDrawable);
             }
          }
       }
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, l.class, "29")) {
          return;
       }
       this.h2();
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       super.w1(p0);
       this.u = this.d.b().V7();
       return;
    }
}
