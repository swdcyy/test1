package com.yxcorp.gifshow.v3.widget.PictureSelectView;
import androidx.constraintlayout.widget.ConstraintLayout;
import lnc.a1;
import android.content.Context;
import t36.f;
import axc.s;
import axc.t;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$d;
import java.lang.Boolean;
import axc.p;
import t36.f$a;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import axc.q;
import axc.r;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.widget.g$b;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import com.yxcorp.gifshow.v3.widget.g;
import com.yxcorp.gifshow.v3.widget.g$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$b;
import androidx.recyclerview.widget.RecyclerView$r;
import axc.u;
import java.lang.Runnable;
import g9c.a;
import axc.v;
import axc.w;
import androidx.recyclerview.widget.RecyclerView$n;
import k17.b;
import java.lang.Math;
import axc.o;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.MotionEvent;

public class PictureSelectView extends ConstraintLayout	// class@00165c
{
    public RecyclerView B;
    public KwaiImageView C;
    public g D;
    public int E;
    public int F;
    public int G;
    public RecyclerView$n H;
    public f I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public g$a R;
    public Runnable S;
    public static final int T;
    public static final int U;
    public static final int V;

    static {
       PictureSelectView.T = a1.d(0x7f07030a);
       PictureSelectView.U = a1.d(0x7f0702e3);
       PictureSelectView.V = a1.e(2.00f);
    }
    public void PictureSelectView(Context p0){
       super(p0);
       this.E = 1;
       this.F = a1.d(0x7f07017f);
       this.G = a1.d(0x7f07017e);
       this.I = new f();
       this.J = 0;
       this.K = false;
       this.L = false;
       this.M = false;
       this.N = false;
       this.O = false;
       this.P = true;
       this.Q = 0;
       this.R = new s(this);
       this.S = new t(this);
       this.Q();
    }
    public void PictureSelectView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.E = 1;
       this.F = a1.d(0x7f07017f);
       this.G = a1.d(0x7f07017e);
       this.I = new f();
       this.J = 0;
       this.K = false;
       this.L = false;
       this.M = false;
       this.N = false;
       this.O = false;
       this.P = true;
       this.Q = 0;
       this.R = new s(this);
       this.S = new t(this);
       this.Q();
    }
    public void PictureSelectView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.E = 1;
       this.F = a1.d(0x7f07017f);
       this.G = a1.d(0x7f07017e);
       this.I = new f();
       this.J = 0;
       this.K = false;
       this.L = false;
       this.M = false;
       this.N = false;
       this.O = false;
       this.P = true;
       this.Q = 0;
       this.R = new s(this);
       this.S = new t(this);
       this.Q();
    }
    public static void L(PictureSelectView p0){
       p0.O(true);
    }
    public static void M(PictureSelectView p0,int p1){
       p0.P = false;
       if (p0.L == null && p0.K == null) {
          boolean b = true;
          p0.M = b;
          PictureSelectView e = p0.E;
          if (p1 > ((p0.J + e) - b)) {
             p1 = (p1 - e) + b;
          }
          if (!PatchProxy.isSupport(PictureSelectView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), p0, PictureSelectView.class, "11")) {
             LinearLayoutManager layoutManage = p0.B.getLayoutManager();
             if (layoutManage != null) {
                p0.J = p1;
                View view = layoutManage.findViewByPosition(p1);
                if (view != null) {
                   p0.L = b;
                   int[] ointArray = new int[2];
                   view.getLocationInWindow(ointArray);
                   view = ointArray[0] - ((a1.h() / 2) - ((p0.E * p0.F) / 2));
                   if (!view) {
                      p0.L = false;
                   }else {
                      p0.B.smoothScrollBy(view, false);
                   }
                }
             }
          }
       }
    label_0066 :
       return;
    }
    public void N(PictureSelectView$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureSelectView.class, "15")) {
          return;
       }
       this.I.d(p0);
       return;
    }
    public void O(boolean p0){
       int i;
       PictureSelectView tF;
       if (PatchProxy.isSupport(PictureSelectView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PictureSelectView.class, "4")) {
          return;
       }
       if (this.B.getLayoutManager() == null) {
          this.I.s0(new p(this));
          return;
       }else {
          View view = PatchProxy.apply(null, this, PictureSelectView.class, "5");
          if (view != PatchProxyResult.class) {
          }else {
             float f = (float)this.getWidth() / 2.00f;
             float f1 = (float)this.getHeight() / 2.00f;
             View view1 = this.B.findChildViewUnder(f, f1);
             if (view1 == null) {
                float f2 = (float)PictureSelectView.U;
                view1 = this.B.findChildViewUnder((f - f2), f1);
                if (view1 == null) {
                   view = this.B.findChildViewUnder((f + f2), f1);
                }
             }
             view = view1;
          }
          if (view == null) {
             this.I.s0(new q(this));
             return;
          }else {
             int left = view.getLeft();
             if (!(this.E % 2)) {
                if (((this.getWidth() / 2) - left) > (this.F / 2)) {
                   i = this.getWidth() / 2;
                   tF = this.F;
                }else {
                   i = this.getWidth() / 2;
                label_00a8 :
                   left = left - i;
                   if (!left) {
                      this.I.s0(new r(this));
                      return;
                   }else if(p0){
                      this.K = true;
                      this.Y();
                      this.B.smoothScrollBy(left, 0);
                   }else {
                      this.B.scrollBy(left, 0);
                   }
                   return;
                }
             }else {
                i = this.getWidth() / 2;
                tF = this.F / 2;
             }
             i = i - tF;
             goto label_00a8 ;
          }
       }
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, PictureSelectView.class, "17")) {
          return;
       }
       this.I.b();
       return;
    }
    public final void Q(){
       if (PatchProxy.applyVoid(null, this, PictureSelectView.class, "1")) {
          return;
       }
       a.d(this.getContext(), R.layout.arg_RES_7f0d1153, this, true);
       this.B = this.findViewById(0x7f0a3ed0);
       this.C = this.findViewById(0x7f0a382a);
       this.a0(this.E);
       this.getViewTreeObserver().addOnGlobalLayoutListener(new PictureSelectView$a(this));
       return;
    }
    public void R(g$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureSelectView.class, "2")) {
          return;
       }
       this.B.setLayoutManager(new NpaLinearLayoutManager(this.getContext(), 0, 0));
       g og = new g(p0, this.R);
       this.D = og;
       this.B.setAdapter(og);
       this.X();
       this.B.setOverScrollMode(2);
       this.B.addOnScrollListener(new PictureSelectView$b(this));
       return;
    }
    public boolean S(){
       return this.O;
    }
    public void T(){
       if (PatchProxy.applyVoid(null, this, PictureSelectView.class, "13")) {
          return;
       }
       this.D.k0();
       return;
    }
    public void U(int p0){
       if (PatchProxy.isSupport(PictureSelectView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PictureSelectView.class, "14")) {
          return;
       }
       this.D.l0(p0);
       return;
    }
    public void V(int p0){
       if (PatchProxy.isSupport(PictureSelectView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PictureSelectView.class, "10")) {
          return;
       }
       LinearLayoutManager layoutManage = this.B.getLayoutManager();
       if (layoutManage == null) {
          return;
       }
       this.J = p0;
       int i = (a1.h() / 2) - (((this.E + 1) * this.F) / 2);
       if (p0 <= 0) {
          layoutManage.scrollToPositionWithOffset(0, i);
          this.B.post(new u(this));
          return;
       }else if(p0 >= (this.D.getItemCount() - this.E)){
          layoutManage.scrollToPositionWithOffset((this.D.getItemCount() - this.E), i);
          this.B.post(new v(this));
          return;
       }else {
          layoutManage.scrollToPositionWithOffset(this.J, (i + PictureSelectView.U));
          this.B.post(new w(this));
          return;
       }
    }
    public void W(){
       if (PatchProxy.applyVoid(null, this, PictureSelectView.class, "12")) {
          return;
       }
       this.N = true;
       this.B.stopScroll();
       return;
    }
    public final void X(){
       if (PatchProxy.applyVoid(null, this, PictureSelectView.class, "6")) {
          return;
       }
       this.B.removeItemDecoration(this.H);
       int u = PictureSelectView.U;
       b uob = new b(0, ((((a1.h() / 2) + u) - a1.d(0x7f07029e)) - ((this.F * this.E) / 2)), ((((a1.h() / 2) + u) - a1.d(0x7f07029e)) - ((this.F * this.E) / 2)), u);
       this.H = uob;
       this.B.addItemDecoration(uob);
       return;
    }
    public void Y(){
       if (PatchProxy.applyVoid(null, this, PictureSelectView.class, "7")) {
          return;
       }
       LinearLayoutManager layoutManage = this.B.getLayoutManager();
       if (layoutManage == null) {
          return;
       }
       float f = 2.00f;
       View view = this.B.findChildViewUnder((((float)this.getWidth() / f) - (float)PictureSelectView.V), ((float)this.getHeight() / f));
       if (view == null) {
          return;
       }
       this.J = Math.max(0, Math.min((layoutManage.getPosition(view) - ((this.E - 1) / 2)), (this.D.getItemCount() - this.E)));
       this.I.s0(new o(this));
       return;
    }
    public void Z(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureSelectView.class, "8")) {
          return;
       }
       this.D.W0(p0);
       this.D.k0();
       return;
    }
    public void a0(int p0){
       if (PatchProxy.isSupport(PictureSelectView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PictureSelectView.class, "9")) {
          return;
       }
       this.E = p0;
       ConstraintLayout$LayoutParams layoutParams = this.C.getLayoutParams();
       PictureSelectView tE = this.E;
       int t = PictureSelectView.T;
       layoutParams.width = ((this.F * tE) + (t * 2)) + ((tE - 1) * PictureSelectView.U);
       layoutParams.height = this.G + (t * 2);
       this.C.setLayoutParams(layoutParams);
       this.C.invalidate();
       this.X();
       this.V(this.J);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PictureSelectView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.P = false;
       return super.dispatchTouchEvent(p0);
    }
    public int getProgress(){
       return this.J;
    }
    public void reset(){
       this.P = true;
    }
}
