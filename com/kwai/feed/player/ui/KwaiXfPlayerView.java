package com.kwai.feed.player.ui.KwaiXfPlayerView;
import sc6.e;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.BitSet;
import b56.t;
import b56.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import b56.i0;
import crd.a;
import b56.d;
import b56.r;
import b56.a;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import java.util.Objects;
import android.view.ViewStub;
import android.view.ViewParent;
import com.kwai.library.widget.emptyview.KwaiPlayerFailedStateView;
import android.view.View$OnClickListener;
import ekd.p0;
import java.util.Iterator;
import java.util.Set;
import b56.e0;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.utility.n;
import com.yxcorp.utility.Log;
import com.kwai.framework.player.core.b;
import z46.f;
import z46.i;
import com.kwai.framework.player.core.b$a;
import b56.u;
import z46.f$a;
import b56.v;
import z46.i$b;

public class KwaiXfPlayerView extends FrameLayout implements e	// class@0014b8
{
    public long b;
    public b c;
    public KwaiContentFrame d;
    public FrameLayout e;
    public KwaiXfControlPanel f;
    public FrameLayout g;
    public Set h;
    public View i;
    public FrameLayout j;
    public Set k;
    public boolean l;
    public i0 m;
    public a n;
    public f o;
    public BitSet p;
    public i q;
    public boolean r;
    public final Runnable s;
    public final b$a t;
    public static final int u;

    public void KwaiXfPlayerView(Context p0){
       super(p0, null);
    }
    public void KwaiXfPlayerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiXfPlayerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 400;
       this.h = new HashSet();
       this.k = new HashSet();
       this.p = new BitSet();
       this.s = new t(this);
       this.t = new s(this);
       this.setMotionEventSplittingEnabled(false);
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfPlayerView.class, "17")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d0779, this);
          this.d = this.findViewById(0x7f0a45d0);
          this.e = this.findViewById(0x7f0a45d1);
          this.f = this.findViewById(0x7f0a45d4);
          this.g = this.findViewById(0x7f0a45e2);
          this.i = this.findViewById(0x7f0a45d9);
          FrameLayout uFrameLayout = this.findViewById(R.id.xf_error_overlay);
          this.j = uFrameLayout;
          uFrameLayout.setVisibility(8);
          this.m = new i0(this.j);
          this.n = new a();
          this.f.getCenterProgressView().f(new r(this));
       }
       return;
    }
    public void a(boolean p0){
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.isSupport(KwaiXfPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiXfPlayerView.class, "1")) {
          return;
       }
       if (p0 && this.getBackground() == null) {
          this.setBackgroundColor(0xff000000);
          this.r = true;
       }else if(!p0 && this.r != null){
          this.setBackground(null);
          this.r = false;
       }
       this.d.a(p0);
       this.f.a(p0);
       this.m.a(p0);
       if (p0) {
          layoutParams = this.i.getLayoutParams();
          layoutParams.width = a1.d(0x7f07031d);
          layoutParams.height = a1.d(0x7f07031d);
          this.i.setLayoutParams(layoutParams);
       }else {
          layoutParams = this.i.getLayoutParams();
          layoutParams.width = a1.d(0x7f0702e8);
          layoutParams.height = a1.d(0x7f0702e8);
          this.i.setLayoutParams(layoutParams);
       }
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiXfPlayerView.class, "20")) {
          return;
       }
       KwaiXfPlayerView tl = this.l;
       int i = 0;
       if (!this.j.isEnabled()) {
          tl = null;
       }
       KwaiXfPlayerView kwaiXfPlayer = 1;
       if (tl != null) {
          if (!PatchProxy.applyVoid(objArray, this, KwaiXfPlayerView.class, "21")) {
             tl = this.f;
             Objects.requireNonNull(tl);
             if (!PatchProxy.applyVoid(objArray, tl, KwaiXfControlPanel.class, "80")) {
                tl.n("hide");
                tl.d = i;
                tl.z();
             }
             this.j.setVisibility(i);
             tl = this.m;
             Objects.requireNonNull(tl);
             if (!PatchProxy.applyVoid(objArray, tl, i0.class, "6") && tl.h == null) {
                tl.h = kwaiXfPlayer;
                ViewStub viewStub = tl.b.findViewById(R.id.xf_play_failed_stub);
                if (viewStub.getParent() != null) {
                   viewStub.inflate();
                }
                KwaiPlayerFailedStateView kwaiPlayerFa = tl.b.findViewById(R.id.player_failed_state_view);
                tl.g = kwaiPlayerFa;
                if (kwaiPlayerFa != null) {
                   kwaiPlayerFa.f(tl.d);
                }
                if (tl.i != null && (!PatchProxy.applyVoid(objArray, tl, i0.class, "7") && tl.g != null)) {
                   if (p0.C(tl.b.getContext())) {
                      tl.g.d(R.string.arg_RES_7f105040);
                   }else {
                      tl.g.d(R.string.arg_RES_7f105050);
                   }
                   tl.g.b(tl.f);
                }
             }
          }
       }else if(PatchProxy.applyVoid(objArray, this, KwaiXfPlayerView.class, "22")){
          tl = this.f;
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoid(objArray, tl, KwaiXfControlPanel.class, "81")) {
             tl.n("show");
             tl.d = kwaiXfPlayer;
             tl.z();
          }
          this.j.setVisibility(8);
       }
    label_00ea :
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this.j);
       }
       return;
    }
    public void c(int p0,boolean p1){
       if (PatchProxy.isSupport(KwaiXfPlayerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, KwaiXfPlayerView.class, "23")) {
          return;
       }
       if (p1) {
          this.p.clear(p0);
       }else {
          this.p.set(p0);
       }
       this.f();
       return;
    }
    public final void d(int p0){
       if (PatchProxy.isSupport(KwaiXfPlayerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiXfPlayerView.class, "26")) {
          return;
       }
       if (p0 == this.i.getVisibility()) {
          return;
       }
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this.i);
       }
       return;
    }
    public final void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiXfPlayerView.class, "25")) {
          return;
       }
       this.g("doLoadingChanged "+this.p.cardinality());
       int visibility = this.i.getVisibility();
       if (!this.p.cardinality()) {
          this.i.setVisibility(0);
          KwaiXfPlayerView tf = this.f;
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoid(objArray, tf, KwaiXfControlPanel.class, "82")) {
             tf.n("onLoadingShow");
             tf.e(1, true, false, false, false);
          }
       }else {
          this.i.setVisibility(8);
          this.f.p();
       }
       this.d(visibility);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, KwaiXfPlayerView.class, "24")) {
          return;
       }
       k1.m(this.s);
       if (!this.i.isEnabled()) {
          n.W(this.i, 8, 0);
          this.f.p();
          this.d(this.i.getVisibility());
          return;
       }else if(!this.p.cardinality()){
          k1.r(this.s, this.b);
       }else {
          this.e();
       }
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfPlayerView.class, "27")) {
          return;
       }
       Log.g("KwaiXfPlayerView", this.hashCode()+" playerview: "+p0);
       return;
    }
    public KwaiContentFrame getContentFrame(){
       return this.d;
    }
    public FrameLayout getContentOverlay(){
       return this.e;
    }
    public KwaiXfControlPanel getControlPanel(){
       return this.f;
    }
    public i0 getErrorPanelViewModel(){
       return this.m;
    }
    public FrameLayout getPlayTopOverlay(){
       return this.g;
    }
    public final void h(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfPlayerView.class, "19")) {
          return;
       }
       KwaiXfPlayerView to = this.o;
       if (to != null) {
          to.d();
       }
       to = this.q;
       if (to != null) {
          to.e();
       }
       this.l = false;
       this.p.clear();
       if (p0 != null) {
          p0.n(this.t);
       }
       return;
    }
    public void setPlayer(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfPlayerView.class, "3")) {
          return;
       }
       this.g("setPlayer "+p0);
       this.h(this.c);
       this.c = p0;
       this.d.setPlayer(p0);
       this.f.setPlayer(this.c);
       KwaiXfPlayerView tc = this.c;
       if (!PatchProxy.applyVoidOneRefs(tc, this, KwaiXfPlayerView.class, "18") && tc != null) {
          tc.m(this.t);
          f uof = new f(tc, false, new u(this));
          this.o = uof;
          uof.a();
          this.q = new i(tc, new v(this), false);
          if (!PatchProxy.applyVoid(null, this, KwaiXfPlayerView.class, "4")) {
             this.f.q();
          }
       }
       return;
    }
}
