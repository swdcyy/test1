package com.kwai.performance.fluency.page.monitor.view.TimestampView;
import android.view.SurfaceHolder$Callback;
import java.lang.Runnable;
import android.view.SurfaceView;
import com.kwai.performance.fluency.page.monitor.view.TimestampView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import android.widget.LinearLayout$LayoutParams;
import qrd.l1;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Paint$Align;
import android.view.SurfaceHolder;
import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.os.SystemClock;
import java.lang.Long;
import java.lang.Throwable;
import yf7.h;
import java.lang.Thread;

public final class TimestampView extends SurfaceView implements SurfaceHolder$Callback, Runnable	// class@0010d8
{
    public boolean b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public final Paint k;
    public boolean l;
    public SurfaceHolder m;
    public Canvas n;
    public HashMap o;
    public static final TimestampView$a p;

    static {
       TimestampView.p = new TimestampView$a(null);
    }
    public void TimestampView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void TimestampView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void TimestampView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.c = "";
       this.d = "t-1 end: ";
       this.e = "t-x end: ";
       this.f = "t0 end: ";
       this.g = "t1 end: ";
       this.h = "t2 end: ";
       this.i = "t3 end: ";
       this.j = "";
       Paint paint = new Paint();
       this.k = paint;
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, 380);
       layoutParams.setMargins(0, 50, 0, 0);
       this.setLayoutParams(layoutParams);
       this.setPadding(30, 30, 30, 30);
       this.setBackgroundColor(0xff000000);
       this.setAlpha(0x3f4ccccd);
       paint.setColor(0xffff0000);
       paint.setTextAlign(Paint$Align.CENTER);
       paint.setTextSize(42.00f);
       SurfaceHolder holder = this.getHolder();
       this.m = holder;
       if (holder != null) {
          holder.addCallback(this);
          this.setZOrderOnTop(true);
          holder.setFormat(-3);
       }
       return;
    }
    public void TimestampView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final String getErrorMsg(){
       return this.j;
    }
    public final String getPageCode(){
       return this.c;
    }
    public final boolean getReset(){
       return this.b;
    }
    public final String getT0Msg(){
       return this.f;
    }
    public final String getT1Msg(){
       return this.g;
    }
    public final String getT2Msg(){
       return this.h;
    }
    public final String getT3Msg(){
       return this.i;
    }
    public final String getT_1Msg(){
       return this.d;
    }
    public final String getT_xMsg(){
       return this.e;
    }
    public void run(){
       while (this.l != null) {
          TimestampView tm = this.m;
          Canvas uCanvas = (tm != null)? tm.lockCanvas(): null;
          this.n = uCanvas;
          if (uCanvas != null) {
             uCanvas.drawColor(0, PorterDuff$Mode.CLEAR);
             float f = (float)uCanvas.getWidth() / 2.00f;
             float f1 = (float)uCanvas.getHeight() / 18.00f;
             float f2 = this.k.descent() + this.k.ascent();
             f2 = f2 / 2.00f;
             f1 = f1 - f2;
             uCanvas.drawText(new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Long.valueOf(SystemClock.elapsedRealtime())), f, f1, this.k);
             int i = uCanvas.getHeight() * 3;
             f1 = (float)i / 18.00f;
             f2 = this.k.descent() + this.k.ascent();
             f2 = f2 / 2.00f;
             f1 = f1 - f2;
             uCanvas.drawText(this.c, f, f1, this.k);
             i = uCanvas.getHeight() * 5;
             f1 = (float)i / 18.00f;
             f2 = this.k.descent() + this.k.ascent();
             f2 = f2 / 2.00f;
             f1 = f1 - f2;
             uCanvas.drawText(this.d, f, f1, this.k);
             i = uCanvas.getHeight() * 7;
             f1 = (float)i / 18.00f;
             f2 = this.k.descent() + this.k.ascent();
             f2 = f2 / 2.00f;
             f1 = f1 - f2;
             uCanvas.drawText(this.e, f, f1, this.k);
             i = uCanvas.getHeight() * 9;
             f1 = (float)i / 18.00f;
             f2 = this.k.descent() + this.k.ascent();
             f2 = f2 / 2.00f;
             f1 = f1 - f2;
             uCanvas.drawText(this.f, f, f1, this.k);
             i = uCanvas.getHeight() * 11;
             f1 = (float)i / 18.00f;
             f2 = this.k.descent() + this.k.ascent();
             f2 = f2 / 2.00f;
             f1 = f1 - f2;
             uCanvas.drawText(this.g, f, f1, this.k);
             i = uCanvas.getHeight() * 13;
             f1 = (float)i / 18.00f;
             f2 = this.k.descent() + this.k.ascent();
             f2 = f2 / 2.00f;
             f1 = f1 - f2;
             uCanvas.drawText(this.h, f, f1, this.k);
             i = uCanvas.getHeight() * 15;
             f1 = (float)i / 18.00f;
             f2 = this.k.descent() + this.k.ascent();
             f2 = f2 / 2.00f;
             f1 = f1 - f2;
             uCanvas.drawText(this.i, f, f1, this.k);
             i = uCanvas.getHeight() * 17;
             f1 = (float)i / 18.00f;
             float f3 = this.k.descent() + this.k.ascent();
             f3 = f3 / 2.00f;
             f1 = f1 - f3;
             uCanvas.drawText(this.j, f, f1, this.k);
          }
          tm = this.m;
          if (tm != null) {
             TimestampView tn = this.n;
             tm.unlockCanvasAndPost(tn);
          }
       label_0166 :
          long l = 16;
          try{
             Thread.sleep(l);
          }catch(java.lang.InterruptedException e0){
             goto label_0000 ;
          }
       }
       return;
    }
    public final void setErrorMsg(String p0){
       a.p(p0, "<set-?>");
       this.j = p0;
    }
    public final void setPageCode(String p0){
       a.p(p0, "<set-?>");
       this.c = p0;
    }
    public final void setReset(boolean p0){
       this.b = p0;
    }
    public final void setT0Msg(String p0){
       a.p(p0, "<set-?>");
       this.f = p0;
    }
    public final void setT1Msg(String p0){
       a.p(p0, "<set-?>");
       this.g = p0;
    }
    public final void setT2Msg(String p0){
       a.p(p0, "<set-?>");
       this.h = p0;
    }
    public final void setT3Msg(String p0){
       a.p(p0, "<set-?>");
       this.i = p0;
    }
    public final void setT_1Msg(String p0){
       a.p(p0, "<set-?>");
       this.d = p0;
    }
    public final void setT_xMsg(String p0){
       a.p(p0, "<set-?>");
       this.e = p0;
    }
    public void surfaceChanged(SurfaceHolder p0,int p1,int p2,int p3){
       a.p(p0, "holder");
    }
    public void surfaceCreated(SurfaceHolder p0){
       a.p(p0, "holder");
       this.l = true;
       new Thread(this).start();
    }
    public void surfaceDestroyed(SurfaceHolder p0){
       a.p(p0, "holder");
       this.l = false;
    }
}
