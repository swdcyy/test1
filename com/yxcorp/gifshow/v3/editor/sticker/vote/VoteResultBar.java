package com.yxcorp.gifshow.v3.editor.sticker.vote.VoteResultBar;
import android.widget.ProgressBar;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import java.lang.Float;

public class VoteResultBar extends ProgressBar	// class@0012c7
{
    public GradientDrawable b;
    public GradientDrawable c;
    public Path d;
    public Rect e;
    public Rect f;
    public float g;
    public static final int[] h;
    public static final int[] i;

    static {
       VoteResultBar.h = new int[2]{0xffff254e,0xffff6359};
       VoteResultBar.i = new int[2]{0xff4766ff,0xff3847ff};
    }
    public void VoteResultBar(Context p0){
       super(p0, null);
    }
    public void VoteResultBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoteResultBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new GradientDrawable(GradientDrawable$Orientation.LEFT_RIGHT, VoteResultBar.h);
       this.c = new GradientDrawable(GradientDrawable$Orientation.LEFT_RIGHT, VoteResultBar.i);
       this.d = new Path();
       this.e = new Rect();
       this.f = new Rect();
       this.b.setShape(0);
       this.b.setGradientType(0);
       this.c.setShape(0);
       this.c.setGradientType(0);
    }
    public final void a(Canvas p0,GradientDrawable p1,Rect p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, VoteResultBar.class, "2")) {
          return;
       }
       p0.save();
       p2.set(0, 0, this.getWidth(), this.getHeight());
       p1.setBounds(p2);
       VoteResultBar tg = this.g;
       this.c(p1, tg, tg, tg, tg);
       p1.draw(p0);
       p0.restore();
       return;
    }
    public final void b(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteResultBar.class, "3")) {
          return;
       }
       int progress = this.getProgress();
       if (progress <= 0) {
          return;
       }
       if (progress >= this.getMax()) {
          this.a(p0, this.c, this.e);
          return;
       }else {
          p0.save();
          int i = (int)((float)this.getHeight() * 0x3f400000);
          progress = Math.min((((this.getWidth() * progress) / this.getMax()) + (i / 2)), (int)((float)this.getWidth() - this.g));
          this.d.reset();
          this.d.moveTo(0, 0);
          this.d.lineTo((float)progress, 0);
          this.d.lineTo((float)(progress - i), (float)this.getHeight());
          this.d.lineTo(0, (float)this.getHeight());
          this.d.close();
          p0.clipPath(this.d);
          this.e.set(0, 0, progress, this.getHeight());
          this.c.setBounds(this.e);
          VoteResultBar tg = this.g;
          this.c(this.c, tg, 0, tg, 0);
          this.c.draw(p0);
          p0.restore();
          return;
       }
    }
    public final void c(GradientDrawable p0,float p1,float p2,float p3,float p4){
       if (PatchProxy.isSupport(VoteResultBar.class)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, VoteResultBar.class, "4")) {
             return;
          }
       }
       float[] uofloatArray = new float[]{p1,p1,p2,p2,p4,p4,p3,p3};
       p0.setCornerRadii(uofloatArray);
       return;
    }
    public synchronized void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteResultBar.class, "1")) {
          return;
       }
       super.onDraw(p0);
       this.g = (float)this.getHeight() / 2.00f;
       this.a(p0, this.b, this.f);
       this.b(p0);
       return;
    }
}
