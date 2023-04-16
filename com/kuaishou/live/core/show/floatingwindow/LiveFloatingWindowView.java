package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView;
import ml8.d;
import android.widget.FrameLayout;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView$c;
import s82.w0;
import android.view.ViewConfiguration;
import va1.n0;
import java.lang.String;
import java.lang.StringBuilder;
import android.view.WindowManager$LayoutParams;
import z12.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.WindowManager;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$m;
import ekd.m1;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import s82.v0;
import android.view.View$OnClickListener;
import s82.u0;
import java.lang.Math;
import pq3.d;
import lnc.a1;
import android.view.ViewOutlineProvider;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import lnc.i9;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import wkd.b;
import qb1.a;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.User;
import wb5.g;
import java.lang.CharSequence;
import d61.c0;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView$b;
import android.animation.Animator;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import android.content.res.Configuration;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.Float;
import java.lang.System;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView$d;

public final class LiveFloatingWindowView extends FrameLayout implements d	// class@000b73
{
    public User A;
    public LiveFloatingWindowView$d B;
    public final w0 C;
    public LivePlayTextureView b;
    public ImageView c;
    public ImageView d;
    public View e;
    public KwaiImageView f;
    public TextView g;
    public LottieAnimationView h;
    public WindowManager i;
    public int j;
    public int k;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public WindowManager$LayoutParams u;
    public LiveFloatingWindowManager$m v;
    public a w;
    public boolean x;
    public int y;
    public int z;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;

    static {
       LiveFloatingWindowView.D = n.c(a.a().a(), 0x42f00000);
       LiveFloatingWindowView.E = n.c(a.a().a(), 210.00f);
       LiveFloatingWindowView.F = n.c(a.a().a(), 50.00f);
       LiveFloatingWindowView.G = 0;
    }
    public void LiveFloatingWindowView(LiveFloatingWindowView$c p0){
       super(p0.a);
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = true;
       this.x = true;
       this.C = new w0(ViewConfiguration.get(this.getContext()).getScaledTouchSlop());
       this.y = p0.j;
       this.z = p0.k;
       this.j = n.A(a.a().a());
       this.k = n0.f();
       this.l = n0.e();
       this.v = p0.h;
       this.w = p0.i;
       this.A = p0.l;
       this.a(p0.a, p0.b, p0.c, p0.d, p0.e, p0.f, p0.g);
       String[] stringArray = new String[]{p0.b+"",p0.c+"",this.u.width+"",this.u.height+"",this.u.x+"",this.u.y+""};
       e.c("LiveFloatingWindowView", "init", stringArray);
       this.g();
    }
    public static boolean d(int p0){
       boolean b = (p0)? true: false;
       return b;
    }
    public final void a(Context p0,int p1,int p2,int p3,int p4,int p5,int p6){
       if (PatchProxy.isSupport(LiveFloatingWindowView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, LiveFloatingWindowView.class, "5")) {
             return;
          }
       }
       this.addView(a.c(p0, R.layout.arg_RES_7f0d0d16, null));
       this.doBindView(this);
       this.u = new WindowManager$LayoutParams();
       this.i = a.a().a().getSystemService("window");
       p0.type = (SystemUtil.a(26))? 2038: 2003;
       LiveFloatingWindowView tu = this.u;
       tu.format = 1;
       tu.flags = 520;
       tu.gravity = 51;
       this.b(p1, p2);
       this.k(p3, p4, p5, p6);
       this.j();
       tu = this.v;
       if (tu != null) {
          LiveFloatingWindowView tu1 = this.u;
          tu.a(tu1.x, tu1.y);
          tu1 = this.u;
          this.v.b(tu1.width, tu1.height);
       }
       return;
    }
    public final void b(int p0,int p1){
       LiveFloatingWindowView tu1;
       int e;
       if (PatchProxy.isSupport(LiveFloatingWindowView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveFloatingWindowView.class, "6")) {
          return;
       }
       if (LiveFloatingWindowView.d(this.z)) {
          LiveFloatingWindowView tu = this.u;
          p1 = LiveFloatingWindowView.D;
          tu.width = p1;
          tu.height = p1;
          return;
       }else if(p0 > p1){
          tu1 = this.u;
          e = LiveFloatingWindowView.E;
          tu1.width = e;
          tu1.height = (e * p1) / p0;
       }else {
          tu1 = this.u;
          e = LiveFloatingWindowView.E;
          tu1.width = (p0 * e) / p1;
          tu1.height = e;
       }
       return;
    }
    public boolean c(){
       boolean b = (this.y == 3)? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1cd9);
       this.c = m1.f(p0, 0x7f0a1cd7);
       this.d = m1.f(p0, 0x7f0a1cdb);
       this.e = m1.f(p0, 0x7f0a1cd3);
       this.f = m1.f(p0, 0x7f0a1cd4);
       this.g = m1.f(p0, 0x7f0a1cd8);
       this.h = m1.f(p0, 0x7f0a1cd6);
       m1.a(p0, new v0(this), R.id.live_floating_window_close_view);
       this.c.setVisibility(0);
       this.d.setVisibility(0);
       m1.a(p0, new u0(this), R.id.live_floating_window_mute_view);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowView.class, "19")) {
          return;
       }
       if (this.v != null && (this.q == null || this.c())) {
          this.v.d();
       }
       this.q = true;
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowView.class, "18")) {
          return;
       }
       LiveFloatingWindowView tu = this.u;
       WindowManager$LayoutParams x = tu.x;
       float f = 0x3f333333;
       float f1 = 0x3f800000;
       if (x < null) {
          tu.alpha = (x > ((- tu.width) / 3))? f1 - (((float)Math.abs(x) * f) / (float)(this.u.width / 3)): 0.30f;
       }else {
          LiveFloatingWindowView tk = this.k;
          WindowManager$LayoutParams width = tu.width;
          if (x > (tk - width)) {
             tu.alpha = (x < (tk - ((width * 2) / 3)))? f1 - (((float)(x - (tk - width)) * f) / (float)(width / 3)): 0.30f;
          }else {
             tu.alpha = f1;
          }
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowView.class, "29")) {
          return;
       }
       d uod = new d((float)a1.e(4.00f), (this.k - this.u.width), this.getMaxY(), this.k, this.l);
       this.b.setOutlineProvider(v7);
       this.setClipToOutline(true);
       return;
    }
    public final int getMaxY(){
       int i;
       int g;
       if (this.t != null) {
          i = (this.l - this.j) - this.u.height;
          g = LiveFloatingWindowView.G;
       }else {
          i = this.k;
          g = this.u.height;
       }
       return (i - g);
    }
    public final int getMinY(){
       return LiveFloatingWindowView.F;
    }
    public void h(boolean p0){
       if (PatchProxy.isSupport(LiveFloatingWindowView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveFloatingWindowView.class, "24")) {
          return;
       }
       if (this.r != null) {
          return;
       }
       this.q = false;
       this.x = p0;
       try{
          this.i.addView(this, this.u);
          this.r = true;
       }catch(android.view.WindowManager$BadTokenException e0){
          this.r = e0;
          LiveFloatingWindowView tv = this.v;
          if (tv != null) {
             LiveFloatingWindowCloseType uNKNOWN = (i9.a(this.getContext()))? LiveFloatingWindowCloseType.UNKNOWN: LiveFloatingWindowCloseType.NO_FLOAT_WINDOW_PERMISSION;
             tv.c(uNKNOWN);
          }
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowView.class, "20")) {
          return;
       }
       LiveFloatingWindowView tv = this.v;
       if (tv != null) {
          tv.c(LiveFloatingWindowCloseType.SLIDE_CLOSE);
       }
       b.a(-1409211934).a();
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowView.class, "4")) {
          return;
       }
       if (LiveFloatingWindowView.d(this.z)) {
          this.e.setVisibility(0);
          LiveFloatingWindowView tz = this.z;
          if (tz == 2) {
             this.e.setBackgroundResource(R.drawable.arg_RES_7f0811c2);
          }else if(tz == 1){
             this.e.setBackgroundResource(R.drawable.arg_RES_7f0811c7);
          }
          tz = this.A;
          if (tz != null) {
             g.b(this.f, tz, HeadImageSize.SMALL);
             this.g.setText(this.A.mName);
             this.h.setAnimationFromUrl(c0.a.b("/udata/pkg/kwai-client-image/live_floating_window/live_floating_window_lift_rhythm.json"));
             this.h.setRepeatCount(-1);
             this.h.s();
          }
       }else {
          this.e.setVisibility(8);
          this.h.f();
       }
       return;
    }
    public final void k(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveFloatingWindowView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveFloatingWindowView.class, "8")) {
          return;
       }
       int i = this.getMaxY() - p3;
       p3 = this.getMinY();
       LiveFloatingWindowView tu = this.u;
       int i1 = (this.k - tu.width) - p2;
       if (p0 == -1 && p1 == -1) {
          tu.x = i1;
          tu.y = i;
          return;
       }else if(p0 > i1){
          p0 = i1;
       }else if(p0 < 0){
          p0 = 0;
       }
       if (p1 < p3) {
          p1 = p3;
       }else if(p1 > i){
          p1 = i;
       }
       tu.x = p0;
       tu.y = p1;
       return;
    }
    public final void l(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveFloatingWindowView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveFloatingWindowView.class, "17")) {
          return;
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       int[] ointArray = new int[]{p0,p2};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       valueAnimato.addUpdateListener(new LiveFloatingWindowView$a(this));
       ointArray = new int[]{p1,p3};
       ValueAnimator valueAnimato1 = ValueAnimator.ofInt(ointArray);
       valueAnimato1.addUpdateListener(new LiveFloatingWindowView$b(this));
       Animator[] uAnimatorArr = new Animator[]{valueAnimato,valueAnimato1};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setDuration(300);
       uAnimatorSet.start();
       return;
    }
    public void m(int p0,int p1){
       if (PatchProxy.isSupport(LiveFloatingWindowView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveFloatingWindowView.class, "3")) {
          return;
       }
       b.d0(LiveLogTag.FLOATING_WINDOW, "updateViewSize", "videoWidth", Integer.valueOf(p0), "videoHeight", Integer.valueOf(p1));
       if (!LiveFloatingWindowView.d(this.z)) {
          this.n(p0, p1);
       }
       return;
    }
    public final void n(int p0,int p1){
       if (PatchProxy.isSupport(LiveFloatingWindowView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveFloatingWindowView.class, "12")) {
          return;
       }
       this.b(p0, p1);
       LiveFloatingWindowView tu = this.u;
       WindowManager$LayoutParams x = tu.x;
       WindowManager$LayoutParams y = tu.y;
       if (!PatchProxy.isSupport(LiveFloatingWindowView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(x), Integer.valueOf(y), this, LiveFloatingWindowView.class, "7")) {
          this.k(x, y, 0, 0);
       }
       this.i.updateViewLayout(this, this.u);
       tu = this.v;
       if (tu != null) {
          LiveFloatingWindowView tu1 = this.u;
          tu.a(tu1.x, tu1.y);
          tu1 = this.u;
          this.v.b(tu1.width, tu1.height);
       }
       b.f0(LiveLogTag.FLOATING_WINDOW, "updateViewSizeInner", "videoWidth", Integer.valueOf(p0), "videoHeight", Integer.valueOf(p1), "floatingWindowWidth", Integer.valueOf(this.u.width), "floatingWindowHeight", Integer.valueOf(this.u.height));
       return;
    }
    public void onCancelPendingInputEvents(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowView.class, "10")) {
          return;
       }
       super.onCancelPendingInputEvents();
       if (!PatchProxy.applyVoid(null, this, LiveFloatingWindowView.class, "11")) {
          LiveFloatingWindowView tB = this.B;
          if (tB != null) {
             this.removeCallbacks(tB);
          }
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       LiveFloatingWindowView tu;
       LiveFloatingWindowView tk;
       WindowManager$LayoutParams height;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowView.class, "15")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (p0.orientation == 2) {
          this.t = false;
          tu = this.u;
          tk = this.k;
          height = tu.height;
          if (tu.y > (tk - height)) {
             tu.y = tk - height;
             this.i.updateViewLayout(this, tu);
          }
       }else {
          this.t = true;
          tu = this.u;
          tk = this.k;
          height = tu.width;
          if (tu.x > (tk - height)) {
             tu.x = tk - height;
             this.i.updateViewLayout(this, tu);
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       LiveFloatingWindowView tu;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveFloatingWindowView obj = PatchProxy.applyOneRefs(p0, this, LiveFloatingWindowView.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          Object[] objArray = null;
          if (action != 1) {
             if (action == 0.00f) {
                this.m = p0.getRawX();
                this.n = p0.getRawY() - (float)this.j;
                if (!PatchProxy.applyVoid(objArray, this, LiveFloatingWindowView.class, "14")) {
                   tu = this.u;
                   tu.x = (int)(this.m - this.o);
                   tu.y = (int)(this.n - this.p);
                   if (!this.c()) {
                      this.f();
                   }
                   this.i.updateViewLayout(this, this.u);
                   tu = this.v;
                   if (tu != null) {
                      obj = this.u;
                      tu.a(obj.x, obj.y);
                   }
                }
                this.C.onMoveEvent(p0);
             }
          }else {
             LiveFloatingWindowView tC = this.C;
             Objects.requireNonNull(tC);
             w0 ow0 = w0.class;
             Object obj1 = PatchProxy.apply(objArray, tC, ow0, "3");
             int i = 0;
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                b.e0(LiveLogTag.FLOATING_WINDOW, "getViewClickOpen", "touchSlop", Integer.valueOf(tC.a), "floatingWindowTouchWidth", Float.valueOf(Math.abs((tC.c - tC.e))), "floatingWindowTouchHeight", Float.valueOf(Math.abs((tC.d - tC.f))));
                Boolean uBoolean = PatchProxy.apply(objArray, tC, ow0, "4");
                if (uBoolean != patchProxyRe) {
                }else if(tC.h != null){
                   ow0 = 0x43480000;
                   b = (((float)System.currentTimeMillis() - tC.g) - ow0 <= 0 && (Math.abs((tC.c - tC.e)) - (float)tC.b >= 0 || (Math.abs((tC.d - tC.f)) - (float)tC.b < 0 || (((float)System.currentTimeMillis() - tC.g) - ow0 > 0 && (Math.abs((tC.c - tC.e)) - (float)tC.a < 0 && Math.abs((tC.d - tC.f)) - (float)tC.a < 0)))))? true: false;
                   uBoolean = Boolean.valueOf(b);
                }else {
                   uBoolean = Boolean.FALSE;
                }
                b = uBoolean.booleanValue();
             }
             if (b) {
                if (this.B == null) {
                   this.B = new LiveFloatingWindowView$d(this);
                }
                if (!this.post(this.B)) {
                   this.e();
                }
             }else if(PatchProxy.applyVoid(objArray, this, LiveFloatingWindowView.class, "16")){
                tC = (this.t != null)? this.k: this.l;
                tu = this.u;
                WindowManager$LayoutParams x = tu.x;
                WindowManager$LayoutParams y = tu.y;
                WindowManager$LayoutParams width = tu.width;
                int i1 = (- width) / 3;
                if (x <= i1) {
                   if (!this.c()) {
                      this.i();
                   }
                }else if(x > i1 && x < null){
                   if (x <= (tC - width) || x >= (tC - ((width * 2) / 3))) {
                      if (x > (tC - ((width * 2) / 3))) {
                         if (this.c()) {
                            width = this.u.width;
                         }else {
                            this.i();
                         }
                      }else {
                         i = x;
                      }
                   }
                   i = tC - width;
                }
                if (this.u.y < this.getMinY()) {
                   y = this.getMinY();
                }else if(this.u.y > this.getMaxY()){
                   y = this.getMaxY();
                }
                tC = this.v;
                if (tC != null) {
                   tC.a(i, y);
                }
                tC = this.u;
                this.l(tC.x, tC.y, i, y);
             }
          }
       }else {
          this.o = p0.getX();
          this.p = p0.getY();
          this.C.onDownEvent(p0);
          this.m = p0.getRawX();
          this.n = p0.getRawY() - (float)this.j;
       }
       return true;
    }
    public void setFloatingWindowStyle(int p0){
       if (PatchProxy.isSupport(LiveFloatingWindowView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveFloatingWindowView.class, "2")) {
          return;
       }
       if (this.z == p0) {
          return;
       }
       this.z = p0;
       if (LiveFloatingWindowView.d(p0)) {
          this.n(LiveFloatingWindowView.D, LiveFloatingWindowView.D);
       }
       this.j();
       return;
    }
    public void setLiveFloatingWindowPlayListener(LiveFloatingWindowManager$m p0){
       this.v = p0;
    }
}
