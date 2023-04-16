package com.yxcorp.gifshow.widget.CommentVoteView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.CommentVoteView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import qrd.l1;
import android.graphics.RectF;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.widget.CommentVoteView$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.widget.CommentVoteView$c;
import android.animation.Animator$AnimatorListener;
import android.graphics.Canvas;
import android.view.ViewGroup;
import java.lang.Number;
import java.lang.Integer;
import android.view.View;

public final class CommentVoteView extends FrameLayout	// class@001807
{
    public boolean b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public final Path g;
    public final Paint h;
    public float i;
    public final RectF j;
    public Animator k;
    public static final CommentVoteView$a l;

    static {
       CommentVoteView.l = new CommentVoteView$a(null);
    }
    public void CommentVoteView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
       this.b = true;
       this.f = true;
       this.g = new Path();
       Paint paint = new Paint();
       paint.setAntiAlias(true);
       paint.setStyle(Paint$Style.FILL);
       this.h = paint;
       this.i = 0x3f800000;
       this.j = new RectF();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.U, 0, 0);
       a.o(typedArray, "context.obtainStyledAttr¡­le.CommentVoteView, 0, 0\)");
       this.setVoteColor(typedArray.getColor(2, -7829368));
       this.b = typedArray.getBoolean(5, 0);
       this.f = typedArray.getBoolean(0, 0);
       this.c = typedArray.getDimension(true, 0);
       this.d = typedArray.getDimension(3, 0);
       this.e = typedArray.getDimension(4, 0);
       typedArray.recycle();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, CommentVoteView.class, "7")) {
          return;
       }
       CommentVoteView tk = this.k;
       if (tk != null) {
          if (tk != null) {
             tk.end();
          }
          this.k = null;
       }
       return;
    }
    public final RectF b(float p0,float p1){
       if (PatchProxy.isSupport(CommentVoteView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, CommentVoteView.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       CommentVoteView te = this.e;
       float f = (float)2;
       float f1 = te * f;
       float f2 = te * f;
       this.j.set(0, 0, f1, f2);
       this.j.offset(p0, p1);
       return this.j;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, CommentVoteView.class, "5")) {
          return;
       }
       this.a();
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       valueAnimato.setInterpolator(new AccelerateDecelerateInterpolator());
       valueAnimato.setDuration(500);
       valueAnimato.addUpdateListener(new CommentVoteView$b(this));
       valueAnimato.addListener(new CommentVoteView$c(this));
       valueAnimato.start();
       this.k = valueAnimato;
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentVoteView.class, "3")) {
          return;
       }
       CommentVoteView ti = this.i;
       if (PatchProxy.isSupport(CommentVoteView.class) && (!PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(ti), this, CommentVoteView.class, "4") && p0 != null)) {
          p0.save();
          p0.clipPath(this.g);
          float f = (float)p0.getWidth() + this.c;
          float f1 = (this.f != null)? ti - (float)1: (float)1 - ti;
          p0.translate((f * f1), 0);
          p0.drawPath(this.g, this.h);
          p0.restore();
       }
       super.dispatchDraw(p0);
       return;
    }
    public final float getVoteArrowWidth(){
       return this.c;
    }
    public final int getVoteColor(){
       Object obj = PatchProxy.apply(null, this, CommentVoteView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.h.getColor();
    }
    public final float getVoteExtraOffset(){
       return this.d;
    }
    public final float getVoteRadius(){
       return this.e;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CommentVoteView.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CommentVoteView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CommentVoteView.class, "8")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (!PatchProxy.applyVoid(null, this, CommentVoteView.class, "9")) {
          CommentVoteView tg = this.g;
          tg.reset();
          CommentVoteView uCommentVote = 0x43870000;
          float f = 180.00f;
          int i = 2;
          if (this.b != null) {
             if (this.f != null) {
                tg.moveTo(0, this.e);
                tg.arcTo(this.b(0, 0), f, 90.00f);
                tg.lineTo(((float)this.getWidth() + this.d), 0);
                tg.lineTo((((float)this.getWidth() + this.d) - this.c), (float)this.getHeight());
                tg.lineTo(this.e, (float)this.getHeight());
                tg.arcTo(this.b(0, ((float)this.getHeight() - ((float)i * this.e))), 90.00f, 90.00f);
                tg.close();
             }else {
                tg.moveTo((- this.d), (float)this.getHeight());
                tg.lineTo(((- this.d) + this.c), 0);
                tg.lineTo(((float)this.getWidth() - this.e), 0);
                f = (float)i;
                tg.arcTo(this.b(((float)this.getWidth() - (this.e * f)), 0), uCommentVote, 90.00f);
                tg.lineTo((float)this.getWidth(), ((float)this.getHeight() - this.e));
                tg.arcTo(this.b(((float)this.getWidth() - (this.e * f)), ((float)this.getHeight() - (f * this.e))), 0, 90.00f);
                tg.close();
             }
          }else {
             tg.moveTo(0, this.e);
             tg.arcTo(this.b(0, 0), f, 90.00f);
             tg.lineTo(((float)this.getWidth() - this.e), 0);
             f = (float)i;
             tg.arcTo(this.b(((float)this.getWidth() - (this.e * f)), 0), uCommentVote, 90.00f);
             tg.lineTo((float)this.getWidth(), ((float)this.getHeight() - this.e));
             tg.arcTo(this.b(((float)this.getWidth() - (this.e * f)), ((float)this.getHeight() - (this.e * f))), 0, 90.00f);
             tg.lineTo(this.e, (float)this.getHeight());
             tg.arcTo(this.b(0, ((float)this.getHeight() - (f * this.e))), 90.00f, 90.00f);
             tg.close();
          }
       }
       return;
    }
    public final void setShowVoteArrow(boolean p0){
       this.b = p0;
    }
    public final void setVoteArrowRight(boolean p0){
       this.f = p0;
    }
    public final void setVoteArrowWidth(float p0){
       this.c = p0;
    }
    public final void setVoteColor(int p0){
       if (PatchProxy.isSupport(CommentVoteView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CommentVoteView.class, "2")) {
          return;
       }
       this.h.setColor(p0);
       return;
    }
    public final void setVoteExtraOffset(float p0){
       this.d = p0;
    }
    public final void setVoteRadius(float p0){
       this.e = p0;
    }
}
