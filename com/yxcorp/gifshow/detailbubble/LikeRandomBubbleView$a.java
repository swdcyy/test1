package com.yxcorp.gifshow.detailbubble.LikeRandomBubbleView$a;
import com.yxcorp.gifshow.detailbubble.LikeRandomBubbleView;
import android.widget.FrameLayout;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import com.yxcorp.gifshow.detailbubble.LikeRandomBubbleView$c;
import android.graphics.Matrix;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import android.os.Build$VERSION;
import com.airbnb.lottie.LottieAnimationView;
import android.content.Context;
import android.view.ViewParent;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Integer;
import com.yxcorp.gifshow.detailbubble.LikeRandomBubbleView$a$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.cdnresource.f;
import android.widget.FrameLayout$LayoutParams;
import qrd.l1;
import android.view.ViewGroup$LayoutParams;

public final class LikeRandomBubbleView$a	// class@001a93
{
    public final Paint a;
    public final LikeRandomBubbleView$c b;
    public final Matrix c;
    public long d;
    public LottieAnimationView e;
    public boolean f;
    public final FrameLayout g;
    public final Bitmap h;
    public final int i;
    public final int j;
    public final LikeRandomBubbleView k;

    public void LikeRandomBubbleView$a(LikeRandomBubbleView p0,FrameLayout p1,Bitmap p2,int p3,int p4){
       a.p(p1, "parentView");
       a.p(p2, "bitmap");
       this.k = p0;
       super();
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       this.a = new Paint();
       this.b = new LikeRandomBubbleView$c();
       this.c = new Matrix();
       this.d = -1;
    }
    public final void a(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LikeRandomBubbleView$a.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       if (this.d - null < 0) {
          this.d = SystemClock.uptimeMillis();
          LikeRandomBubbleView$a tk = this.k;
          if (tk.f != null && (tk.g != null && Build$VERSION.SDK_INT >= 23)) {
             tk = this.e;
             if (tk == null) {
                LottieAnimationView lottieAnimat = new LottieAnimationView(this.g.getContext());
             }
             ViewGroup parent = tk.getParent();
             if (parent != null) {
                parent.removeView(tk);
             }
             LikeRandomBubbleView$a tk1 = this.k;
             LikeRandomBubbleView f = tk1.f;
             a.m(f);
             LikeRandomBubbleView g = this.k.g;
             a.m(g);
             int i = g.intValue();
             f.f(tk1.h, tk, f, i, new LikeRandomBubbleView$a$a(tk), new ClientContent$ContentPackage(), true, this.k.i);
             int l = LikeRandomBubbleView.l;
             FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(l, l);
             l = l / 2;
             layoutParams.leftMargin = this.i - l;
             layoutParams.topMargin = this.j - l;
             this.g.addView(tk, layoutParams);
             this.e = tk;
          }
       }
       float f1 = (float)(SystemClock.uptimeMillis() - this.d);
       boolean b = true;
       if (f1 - 0x44098000 > 0) {
          this.f = b;
          LikeRandomBubbleView$a te = this.e;
          ViewParent parent1 = (te != null)? te.getParent(): null;
          if (parent1 != null) {
             parent1.removeView(this.e);
          }
       }else if(!this.h.isRecycled()){
          int i1 = 255;
          float f2 = 300.00f;
          if (f1 - f2 < 0) {
             LikeRandomBubbleView$a ta = this.a;
             float f3 = 150.00f;
             if (f1 - f3 < 0) {
                i1 = (int)((f1 / f3) * (float)i1);
             }
             ta.setAlpha(i1);
             this.c.reset();
             this.c.setScale(this.b.getInterpolation((f1 / f2)), this.b.getInterpolation((f1 / f2)), (float)(this.h.getWidth() / 2), (float)(this.h.getHeight() / 2));
             this.c.postTranslate(((float)this.i - (float)(this.h.getWidth() / 2)), ((float)this.j - (float)(this.h.getHeight() / 2)));
             p0.drawBitmap(this.h, this.c, this.a);
          }else {
             f1 = f1 - f2;
             f2 = 250.00f;
             if (f1 - f2 < 0) {
                f1 = f1 / f2;
                float f4 = (float)b;
                this.a.setAlpha((int)((f4 - f1) * (float)i1));
                f1 = (f1 * 0x3f000000) + f4;
                this.c.reset();
                this.c.setScale(f1, f1, (float)(this.h.getWidth() / 2), (float)(this.h.getHeight() / 2));
                this.c.postTranslate(((float)this.i - (float)(this.h.getWidth() / 2)), ((float)this.j - (float)(this.h.getHeight() / 2)));
                p0.drawBitmap(this.h, this.c, this.a);
             }
          }
       }
       return;
    }
    public final int b(){
       return this.i;
    }
    public final int c(){
       return this.j;
    }
    public final boolean d(){
       return this.f;
    }
}
