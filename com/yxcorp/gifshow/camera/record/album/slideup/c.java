package com.yxcorp.gifshow.camera.record.album.slideup.c;
import vb9.o;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior$c;
import oc9.e0;
import lnc.a1;
import android.view.animation.DecelerateInterpolator;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import ed9.f;
import vb9.q;
import com.yxcorp.gifshow.camera.record.album.slideup.list.h;
import vb9.b;
import com.yxcorp.gifshow.camera.record.album.slideup.list.h$a;
import oc9.t;
import com.yxcorp.gifshow.camera.record.base.d;
import vb9.m;
import vb9.d;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import android.view.View;
import vb9.n;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.album.slideup.AlbumSlideUpBehavior;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import j8c.a;
import q87.c;
import android.app.Activity;
import com.kwai.feature.post.api.util.g;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.gifshow.camera.record.widget.FocusView;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Iterator;
import vb9.p;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import vb9.a;
import oc9.d0;
import java.lang.Float;
import com.yxcorp.gifshow.model.config.ShowAlbum;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import xf6.g;
import xf6.l;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.camera.record.album.slideup.a;
import java.lang.Runnable;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import wc9.v;
import sg9.h;
import sg9.i;
import com.yxcorp.gifshow.camerasdk.q;
import android.animation.AnimatorSet;
import bh9.s;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import ci9.m;
import zb9.p0;
import zb9.p0$a;
import xi9.n;
import ng9.a;
import vb9.g;
import erd.g;
import crd.b;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import vb9.j;
import eoc.f;
import ed9.e;
import vb9.k;
import ad9.a;
import vb9.f;
import java.util.Objects;
import kd9.s;
import kd9.l0;
import vb9.h;
import com.yxcorp.gifshow.camera.record.widget.CameraRootFrameLayout$a;
import com.yxcorp.gifshow.camera.record.widget.CameraRootFrameLayout;
import android.content.Intent;
import gi9.a;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;
import brd.t;
import vb9.i;
import vb9.l;

public class c extends e0 implements o, BottomSheetBehavior$c	// class@001ccf
{
    public View A;
    public AlbumSlideUpBehavior B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean G;
    public b H;
    public b I;
    public final f q;
    public final q r;
    public CameraRootFrameLayout s;
    public AnimCameraView t;
    public CameraScrollTabViewGroup u;
    public CameraScrollTabViewGroupV2 v;
    public View w;
    public View x;
    public View y;
    public View z;
    public static final int J;
    public static final Interpolator K;
    public static final int L;

    static {
       c.J = a1.e(28.00f);
       c.K = new DecelerateInterpolator(0x3fc00000);
       c.L = a1.d(0x7f07032a);
    }
    public void c(CameraPageType p0,b p1){
       super(p0, p1);
       this.q = new f(CameraPageType.VIDEO);
       this.r = new q();
       this.F = false;
       this.L0(new h(p0, p1, new b(this)));
       this.d.n(m.class, new d(this));
    }
    public void F0(View p0){
       n.e(this, p0);
    }
    public boolean I0(MotionEvent p0){
       return n.a(this, p0);
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       super.I7();
       c tB = this.B;
       if (tB != null && tB.k()) {
          this.B.g(4, false);
       }
       return;
    }
    public boolean J1(MotionEvent p0){
       boolean b1;
       Object[] objArray;
       int b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.i2()) {
          Object obj1 = PatchProxy.applyOneRefs(p0, this, uoc, "16");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(!this.k2()){
             objArray = new Object[b];
             a.D().s("AlbumSlideUpController", "isEnabled is false, can\'t slide up!", objArray);
          }else if(!p0.getAction()){
             int i = 4;
             View[] viewArray = new View[i];
             viewArray[b] = this.w;
             viewArray[1] = this.x;
             viewArray[2] = this.y;
             viewArray[3] = this.e.findViewById(0x7f0a29cd);
             Object obj2 = PatchProxy.applyTwoRefs(p0, viewArray, null, g.class, "29");
             if (obj2 != patchProxyRe) {
                b2 = obj2.booleanValue();
             }else {
                b2 = 0;
                while (true) {
                   if (b2 < i) {
                      if (g.q(p0, viewArray[b2])) {
                         b2 = true;
                      }else {
                         b2 = b2 + 1;
                      }
                   }else {
                      b2 = false;
                   }
                }
                return b;
             }
             if (b2) {
                objArray = new Object[b];
                a.D().s("AlbumSlideUpController", "ACTION_DOWN is in Buttons Area, can\'t slide up!", objArray);
             }
          }
          if (!p0.getAction() && this.B.getState() == 3) {
             c tA = this.A;
             if (tA != null && p0.getRawY() - (float)(n.p(tA)[1] + this.A.getHeight()) > 0) {
                objArray = new Object[b];
                a.D().s("AlbumSlideUpController", "ACTION_DOWN is below AlbumToolView, can\'t slide up!", objArray);
             }
          }
          c tt = this.t;
          if (tt != null) {
             FocusView focusView = tt.getCameraView().getFocusView();
             if (focusView != null && focusView.j != null) {
                objArray = new Object[b];
                a.D().s("AlbumSlideUpController", "FocusView is showing, can\'t slide up!", objArray);
             }
          }
          if (this.F != null) {
             objArray = new Object[b];
             a.D().s("AlbumSlideUpController", "Filter slide show, can\'t slide up!", objArray);
          }else {
             objArray = new Object[b];
             a.D().s("AlbumSlideUpController", "interceptSlideUpByMotionEvent FALSE", objArray);
             b1 = false;
          }
          b1 = true;
          if (!b1) {
          }
       }
       b = true;
       goto label_010a ;
    }
    public void Z(){
       n.d(this);
    }
    public void c(View p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("AlbumSlideUpController", "onStateChanged newState:"+p1, objArray);
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "23")) {
          Iterator iterator = this.getChildren().iterator();
          while (iterator.hasNext()) {
             t ot = iterator.next();
             if (ot instanceof p) {
                ot.c(p0, p1);
             }
          }
       }
       int i = 3;
       if (p1 == i && this.E != i) {
          this.E = p1;
       }else {
          i = 4;
          if (p1 == i && this.E != i) {
             this.E = p1;
             this.d.b().V7().u(RecordBubbleItem.BLOCK_ANY);
          }
       }
       this.d.m(new a(p1, this.E));
       return;
    }
    public void d5(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "13")) {
          return;
       }
       super.d5(p0);
       Object[] objArray = new Object[0];
       a.D().w("AlbumSlideUpController", "setRecordMode, mode:"+p0, objArray);
       if (!this.f2()) {
          c tB = this.B;
          if (tB != null && tB.getState() != 4) {
             this.B.g(4, 0);
          }
       }
       return;
    }
    public void f(View p0,float p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoc, "19")) {
          return;
       }
       if (p1 - 0x3f7d70a4 > 0) {
          p1 = 0x3f800000;
       }else if(p1 - 0x3c23d70a < 0){
          p1 = 0;
       }
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoc, "24")) {
          Iterator iterator = this.getChildren().iterator();
          while (iterator.hasNext()) {
             t ot = iterator.next();
             if (ot instanceof p) {
                ot.f(p0, p1);
             }
          }
       }
       return;
    }
    public final void g2(ShowAlbum p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "3")) {
          return;
       }
       if (SystemUtil.K() && (a.d() && g.b())) {
          p0 = new ShowAlbum();
          p0.mEnableAlbumTool = true;
          boolean b = false;
          p0.mAutoShowAlbumTool = l.c("key_auto_show_album_tool", b);
          p0.mUseAlbumLabelFilter = l.c("key_use_album_label_filter", b);
          p0.mEnableAlbumShowNewPhoto = l.c("key_auto_show_album_tool_on_new_photo", b);
       }
    label_003e :
       boolean b1 = PostExperimentUtils.O0(p0);
       this.C = b1;
       if (!b1) {
          return;
       }else if(PatchProxy.applyVoidOneRefs(p0, this, uoc, "21")){
          Iterator iterator = this.getChildren().iterator();
          while (iterator.hasNext()) {
             t ot = iterator.next();
             if (ot instanceof p) {
                ot.S(p0);
             }
          }
       }
       return;
    }
    public final void h2(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.b2(new a(this));
       return;
    }
    public final boolean i2(){
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       int i = 0;
       if (!this.k2()) {
          objArray = new Object[i];
          a.D().s("AlbumSlideUpController", "isEnabled is false, can\'t slide up!", objArray);
          return b;
       }else if(!this.f.isResumed()){
          objArray = new Object[i];
          a.D().s("AlbumSlideUpController", "mFragment isn\'t resumed, can\'t slide up!", objArray);
          return b;
       }else if(!this.f2()){
          objArray = new Object[i];
          a.D().s("AlbumSlideUpController", "it is not videoMode, can\'t slide up!", objArray);
          return b;
       }else if(this.q.a()){
          objArray = new Object[i];
          a.D().s("AlbumSlideUpController", "isPanelShowing, can\'t slide up!", objArray);
          return b;
       }else if(this.d.b().V7() != null){
          objArray = this.d.b().V7().h();
       }
       if (objArray != null && objArray.d() != RecordBubbleItem.AUTO_SHOW_ALBUM_TOOL) {
          objArray = new Object[i];
          a.D().s("AlbumSlideUpController", "has bubble showing, can\'t slide up!", objArray);
          return b;
       }else if(this.G != null){
          objArray = new Object[i];
          a.D().s("AlbumSlideUpController", "AutoDownloadBar showing, can\'t slide up!", objArray);
          return b;
       }else if(this.d.d(v.e).b != null){
          objArray = new Object[i];
          a.D().s("AlbumSlideUpController", "mIsCountDowning, can\'t slide up!", objArray);
          return b;
       }else if(this.d.d(i.a()).a()){
          objArray = new Object[i];
          a.D().s("AlbumSlideUpController", "isRelayStickerUsing, can\'t slide up!", objArray);
          return b;
       }else {
          obj = this.h;
          if (obj != null && obj.isRecording()) {
             objArray = new Object[i];
             a.D().s("AlbumSlideUpController", "isRecording, can\'t slide up!", objArray);
             return b;
          }else if(this.a2()){
             objArray = new Object[i];
             a.D().s("AlbumSlideUpController", "hasRecorded, can\'t slide up!", objArray);
             return b;
          }else {
             c tw = this.w;
             if (tw != null && !tw.getVisibility()) {
                AnimatorSet tag = this.w.getTag(R.id.bottom_animator);
                if (tag != null && tag.isRunning()) {
                   objArray = new Object[i];
                   a.D().s("AlbumSlideUpController", "ActionBarLayout anim is running, can\'t slide up!", objArray);
                   return b;
                }
             }
             if (this.d.d(s.c).b != null) {
                objArray = new Object[i];
                a.D().s("AlbumSlideUpController", "SpeedLayoutShowing, can\'t slide up!", objArray);
                return b;
             }else {
                tw = this.u;
                if (tw != null && tw.i()) {
                   objArray = new Object[i];
                   a.D().s("AlbumSlideUpController", "mTabRadioGroup is moving, can\'t slide up!", objArray);
                   return b;
                }else {
                   tw = this.v;
                   if (tw != null && tw.y()) {
                      objArray = new Object[i];
                      a.D().s("AlbumSlideUpController", "mSnapShotRadioGroup is moving, can\'t slide up!", objArray);
                      return b;
                   }else if(this.d.d(m.b).a != null){
                      objArray = new Object[i];
                      a.D().s("AlbumSlideUpController", "mTimeModeTabRadioGroup is moving, can\'t slide up!", objArray);
                      return b;
                   }else if(this.d.d(p0.j.a()).c()){
                      objArray = new Object[i];
                      a.D().s("AlbumSlideUpController", "CameraAssistant is on, can\'t slide up!", objArray);
                      return b;
                   }else {
                      obj = this.g;
                      if (obj != null && obj.r()) {
                         objArray = new Object[i];
                         a.D().s("AlbumSlideUpController", "MagicFace is loaded, can\'t slide up!", objArray);
                         return b;
                      }else {
                         objArray = new Object[i];
                         a.D().s("AlbumSlideUpController", "interceptSlideUpByPage FALSE", objArray);
                         return i;
                      }
                   }
                }
             }
          }
       }
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       super.k(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("AlbumSlideUpController", "onViewCreated", objArray);
       this.Y1(this.d.l(a.class, new g(this)));
       this.Y1(f.a(PanelShowEvent.class, new j(this)));
       this.Y1(f.a(e.class, new k(this)));
       this.Y1(this.d.l(a.class, new f(this)));
       if (this.D != null) {
          Object[] objArray1 = new Object[i];
          a.D().w("AlbumSlideUpController", "data loaded, need init View", objArray1);
          this.l2();
       }
       return;
    }
    public boolean k1(MotionEvent p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyOneRefs(p0, this, c.class, "17");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       this.r.onMotionEvent(p0);
       if (p0.getAction() == 1) {
          obj = this.B;
          if (obj != null && obj.getState() == 3) {
             if (!this.r.a() && (g.q(p0, this.w) || g.q(p0, this.u))) {
                this.B.g(4, false);
             }else {
                obj = this.u;
                if (obj != null && obj.i()) {
                   this.B.g(4, false);
                }else {
                   obj = this.B;
                   Objects.requireNonNull(obj);
                   Object obj1 = PatchProxy.apply(null, obj, AlbumSlideUpBehavior.class, "2");
                   boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.Q.a();
                   if (!b && !g.q(p0, this.A)) {
                      this.B.g(4, true);
                   }
                }
             }
          }
       }
       return false;
    }
    public final boolean k2(){
       return this.C;
    }
    public final void l2(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AlbumSlideUpController", "onDataLoaded", objArray);
       this.D = true;
       if (this.d.d(s.g).f != null) {
          this.h2();
       }else {
          b uob = this.d.l(l0.class, new h(this));
          this.I = uob;
          this.Y1(uob);
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().w("AlbumSlideUpController", "onDestroyView", objArray);
       c tB = this.B;
       if (tB != null) {
          tB.g(4, 0);
       }
       tB = this.s;
       if (tB != null) {
          tB.setTouchEventListener(null);
       }
       this.B = null;
       this.s = null;
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       super.onPause();
       Object[] objArray = new Object[0];
       a.D().w("AlbumSlideUpController", "onPause", objArray);
       c tB = this.B;
       if (tB != null && (tB.getState() == 2 || this.B.getState() == 1)) {
          this.B.g(4, 0);
       }
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       super.q1();
       c tB = this.B;
       if (tB != null && tB.k()) {
          this.B.g(4, false);
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.w1(p0);
       Object[] objArray = new Object[0];
       a.D().w("AlbumSlideUpController", "onCreate", objArray);
       this.H = this.d.g(a.class).timeout(2000, TimeUnit.MILLISECONDS).subscribe(new i(this), new l(this));
       return;
    }
}
