package com.kwai.video_clip.widget.VideoSelectView;
import android.view.View;
import o79.i;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.RectF;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint$Style;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import ww7.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Canvas;
import android.graphics.Xfermode;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.MotionEvent;
import com.kwai.video_clip.widget.VideoSelectView$a;

public class VideoSelectView extends View	// class@00110d
{
    public PorterDuffXfermode b;
    public RectF c;
    public RectF d;
    public Paint e;
    public Paint f;
    public ValueAnimator g;
    public int h;
    public boolean i;
    public float j;
    public float k;
    public float l;
    public int m;
    public float n;
    public float o;
    public boolean p;
    public VideoSelectView$a q;
    public static final int r;

    static {
       VideoSelectView.r = i.c(0x7f0704b4);
    }
    public void VideoSelectView(Context p0){
       super(p0, null);
    }
    public void VideoSelectView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void VideoSelectView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new PorterDuffXfermode(PorterDuff$Mode.DST_OUT);
       this.c = new RectF();
       this.d = new RectF();
       this.e = new Paint();
       this.f = new Paint();
       this.h = 130;
       if (PatchProxy.applyVoid(null, this, VideoSelectView.class, "1")) {
       }else {
          this.f.setStyle(Paint$Style.FILL);
          this.f.setColor(i.a(R.color.arg_RES_7f060b95));
          this.e.setStyle(Paint$Style.STROKE);
          this.e.setColor(i.a(R.color.arg_RES_7f060b97));
          this.e.setStrokeWidth(((float)VideoSelectView.r * 2.00f));
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, VideoSelectView.class, "8")) {
          return;
       }
       VideoSelectView tg = this.g;
       if (tg != null && tg.isRunning()) {
          this.g.cancel();
       }
       tg = this.h;
       int[] ointArray = new int[2];
       int i = 0;
       ointArray[0] = tg;
       int i1 = 130;
       if (this.p == null) {
          i = 130;
       }
       ointArray[1] = i;
       this.g = ObjectAnimator.ofInt(ointArray);
       Log.b("KuaiShanVideoSelectView", "startMaskAnimation: startAlpha="+tg+",mIsScrolling="+this.p);
       float f = 130.00f;
       float f1 = (this.p != null)? (float)tg: (float)(i1 - tg);
       this.g.setDuration((long)((f1 / f) * 300.00f));
       this.g.addUpdateListener(new c(this));
       this.g.start();
       return;
    }
    public float[] getSelectResult(){
       float[] obj = PatchProxy.apply(null, this, VideoSelectView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new float[2];
       int i = 0x3f000000;
       float f = 2.00f;
       if (this.i != null) {
          obj[0] = i;
          obj[1] = ((this.d.top - (float)VideoSelectView.r) + ((float)this.m / f)) / (float)this.getHeight();
          Log.b("KuaiShanVideoSelectView", "getSelectResult: top="+this.d.top);
       }else {
          obj[0] = ((this.d.left - (float)VideoSelectView.r) + ((float)this.m / f)) / (float)this.getWidth();
          obj[1] = i;
       }
       Log.b("KuaiShanVideoSelectView", " getSelectResult = "+obj[0]+","+obj[1]);
       return obj;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSelectView.class, "5")) {
          return;
       }
       super.onDraw(p0);
       p0.drawRect(this.c, this.f);
       this.f.setXfermode(this.b);
       p0.drawRoundRect(this.d, 0, 0, this.f);
       this.f.setXfermode(null);
       p0.restoreToCount(p0.saveLayer(this.c, this.f, 31));
       p0.drawRoundRect(this.d, 0, 0, this.e);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i1;
       int i = 2;
       if (PatchProxy.isSupport(VideoSelectView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, VideoSelectView.class, "3")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (!PatchProxy.applyVoid(null, this, VideoSelectView.class, "4")) {
          String str = "KuaiShanVideoSelectView";
          Log.b(str, "initRect\(\) called height="+this.getHeight()+",width="+this.getWidth());
          this.c.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
          if (this.i != null) {
             this.m = (int)((float)this.getWidth() / this.l);
             i1 = (int)((this.k * (float)this.getHeight()) - (float)(this.m / i));
             p3 = VideoSelectView.r;
             float f = (float)p3;
             this.d.set(f, (float)(i1 + p3), (float)(this.getWidth() - p3), (float)((this.m + i1) - p3));
             Log.b(str, "initRect: startY = "+i1);
          }else {
             this.m = (int)((float)this.getHeight() * this.l);
             VideoSelectView tm = this.m;
             i1 = (int)(((float)this.getWidth() * this.j) - (float)(tm / 2));
             p3 = VideoSelectView.r;
             this.d.set((float)(i1 + p3), (float)p3, (float)((i1 + tm) - p3), (float)(this.getHeight() - p3));
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float y;
       VideoSelectView to;
       RectF top;
       float f;
       int r;
       VideoSelectView obj = PatchProxy.applyOneRefs(p0, this, VideoSelectView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                label_00d8 :
                   this.p = false;
                   obj = this.q;
                   if (obj != null) {
                      obj.a(false);
                   }
                   this.a();
                   this.invalidate();
                }
             }else if(this.p == null){
                this.p = true;
                obj = this.q;
                if (obj != null) {
                   obj.a(true);
                }
                this.a();
             }
             if (this.i != null) {
                y = p0.getY();
                to = this.o;
             }else {
                y = p0.getX();
                to = this.n;
             }
             action = (int)(y - to);
             if (!PatchProxy.isSupport(VideoSelectView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(action), this, VideoSelectView.class, "7")) {
                if (this.i != null) {
                   top = this.d.top;
                   f = (float)action + top;
                   r = VideoSelectView.r;
                   if (f - (float)r < 0) {
                      action = r - (int)top;
                   }else if(f - (float)((this.getHeight() - this.m) + r) > 0){
                      action = ((this.getHeight() - this.m) + r) - (int)this.d.top;
                   }
                   this.d.offset(0, (float)action);
                }else {
                   top = this.d.left;
                   f = (float)action + top;
                   r = VideoSelectView.r;
                   if (f - (float)r < 0) {
                      action = r - (int)top;
                   }else if(f - (float)((this.getWidth() - this.m) + r) > 0){
                      action = ((this.getWidth() - this.m) + r) - (int)this.d.left;
                   }
                   this.d.offset((float)action, 0);
                }
                this.invalidate();
             }
             this.n = p0.getX();
             this.o = p0.getY();
          }else {
             goto label_00d8 ;
          }
       }else {
          this.n = p0.getX();
          this.o = p0.getY();
       }
       return true;
    }
    public void setRatioOrientation(boolean p0){
       this.i = p0;
    }
    public void setScrollListener(VideoSelectView$a p0){
       this.q = p0;
    }
}
