package com.yxcorp.gifshow.helper.FriendClapNewView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import com.yxcorp.gifshow.helper.FriendClapNewView$a;
import com.yxcorp.gifshow.helper.FriendClapNewView$b;
import com.yxcorp.gifshow.helper.FriendClapNewView$c;
import com.yxcorp.gifshow.helper.FriendClapNewView$d;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import h2.b;
import java.lang.Runnable;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.util.rx.RxBus;
import qra.e;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import qra.g;
import android.view.View$OnTouchListener;

public class FriendClapNewView extends FrameLayout implements d	// class@001627
{
    public LottieAnimationView b;
    public LottieAnimationView c;
    public View d;
    public View e;
    public TextView f;
    public KwaiImageView g;
    public KwaiImageView h;
    public f i;
    public f j;
    public final Runnable k;
    public final Runnable l;
    public final Runnable m;
    public final Runnable n;
    public static final int o;

    public void FriendClapNewView(Context p0){
       super(p0);
       this.k = new FriendClapNewView$a(this);
       this.l = new FriendClapNewView$b(this);
       this.m = new FriendClapNewView$c(this);
       this.n = new FriendClapNewView$d(this);
    }
    public void FriendClapNewView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k = new FriendClapNewView$a(this);
       this.l = new FriendClapNewView$b(this);
       this.m = new FriendClapNewView$c(this);
       this.n = new FriendClapNewView$d(this);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FriendClapNewView.class, "13")) {
          return;
       }
       if (this.b.p()) {
          this.b.f();
       }
       if (this.c.p()) {
          this.c.f();
       }
       FriendClapNewView ti = this.i;
       if (ti != null && ti.h()) {
          this.i.b();
       }
       ti = this.j;
       if (ti != null && ti.h()) {
          this.j.b();
       }
       this.removeCallbacks(this.k);
       this.removeCallbacks(this.l);
       this.removeCallbacks(this.m);
       this.removeCallbacks(this.n);
       if (!PatchProxy.applyVoid(objArray, this, FriendClapNewView.class, "11") && this.getParent() instanceof ViewGroup) {
          this.getParent().removeView(this);
       }
       RxBus.f.b(new e());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendClapNewView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1236);
       this.c = m1.f(p0, 0x7f0a170b);
       this.d = m1.f(p0, 0x7f0a070d);
       this.e = m1.f(p0, 0x7f0a058a);
       this.f = m1.f(p0, 0x7f0a059b);
       this.g = m1.f(p0, 0x7f0a170c);
       this.h = m1.f(p0, 0x7f0a3637);
       this.d.setOnTouchListener(new g(this));
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, FriendClapNewView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
}
