package com.kwai.performance.fluency.fps.monitor.debug.DebugInfoView;
import android.view.SurfaceHolder$Callback;
import java.lang.Runnable;
import android.view.SurfaceView;
import com.kwai.performance.fluency.fps.monitor.debug.DebugInfoView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.Paint;
import java.util.concurrent.CopyOnWriteArrayList;
import android.widget.LinearLayout$LayoutParams;
import qrd.l1;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Paint$Align;
import android.view.SurfaceHolder;
import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Number;
import java.lang.Throwable;
import yf7.h;
import java.lang.Thread;

public final class DebugInfoView extends SurfaceView implements SurfaceHolder$Callback, Runnable	// class@00106c
{
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public final Paint l;
    public boolean m;
    public SurfaceHolder n;
    public Canvas o;
    public int p;
    public int q;
    public final CopyOnWriteArrayList r;
    public static final DebugInfoView$a s;

    static {
       DebugInfoView.s = new DebugInfoView$a(null);
    }
    public void DebugInfoView(Context p0){
       a.p(p0, "context");
       super(p0, null, 0, 6, null);
    }
    public void DebugInfoView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0, 4, null);
    }
    public void DebugInfoView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = "场景: ";
       this.c = "实时帧耗时: ";
       this.d = "短卡时长: ";
       this.e = "短卡数: ";
       this.f = "长卡时长: ";
       this.g = "长卡数: ";
       this.h = "轻卡时长: ";
       this.i = "轻卡数: ";
       this.j = "总卡顿时长: ";
       this.k = "总卡顿数: ";
       Paint paint = new Paint();
       this.l = paint;
       this.p = 600;
       this.q = 800;
       this.r = new CopyOnWriteArrayList();
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(this.p, this.q);
       layoutParams.setMargins(0, 50, 0, 0);
       this.setLayoutParams(layoutParams);
       this.setPadding(30, 30, 30, 30);
       this.setBackgroundColor(0xff000000);
       this.setAlpha(0x3f4ccccd);
       paint.setColor(0xffff0000);
       paint.setTextAlign(Paint$Align.LEFT);
       paint.setTextSize(35.00f);
       SurfaceHolder holder = this.getHolder();
       this.n = holder;
       if (holder == null) {
       }else {
          holder.addCallback(this);
          this.setZOrderOnTop(true);
          holder.setFormat(-3);
       }
       return;
    }
    public void DebugInfoView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final String getBigBlockCount(){
       return this.g;
    }
    public final String getBigBlockTime(){
       return this.f;
    }
    public final String getRealCost(){
       return this.c;
    }
    public final String getScene(){
       return this.b;
    }
    public final String getSmallBlockCount(){
       return this.e;
    }
    public final String getSmallBlockTime(){
       return this.d;
    }
    public final String getTinyBlockCount(){
       return this.i;
    }
    public final String getTinyBlockTime(){
       return this.h;
    }
    public final String getTotalBlockCount(){
       return this.k;
    }
    public final String getTotalBlockTime(){
       return this.j;
    }
    public void run(){
       int i4;
       DebugInfoView uDebugInfoVi = this;
       while (uDebugInfoVi.m != null) {
          DebugInfoView n = uDebugInfoVi.n;
          Canvas uCanvas = (n == null)? null: n.lockCanvas();
          uDebugInfoVi.o = uCanvas;
          if (uCanvas != null) {
             int i = 0;
             uCanvas.drawColor(i, PorterDuff$Mode.CLEAR);
             uDebugInfoVi.l.setTextAlign(Paint$Align.RIGHT);
             int i1 = 0xffff0000;
             uDebugInfoVi.l.setColor(i1);
             DebugInfoView o1 = uDebugInfoVi.o;
             a.m(o1);
             float f = (float)16;
             float f1 = (float)uDebugInfoVi.q - f;
             o1.drawLine(0, f1, (float)uDebugInfoVi.p, f1, uDebugInfoVi.l);
             float f2 = (float)uDebugInfoVi.q - f;
             float f3 = (float)13;
             f2 = f2 + f3;
             uCanvas.drawText("16", (float)uDebugInfoVi.p, f2, uDebugInfoVi.l);
             DebugInfoView o2 = uDebugInfoVi.o;
             a.m(o2);
             float f4 = (float)84;
             float f5 = (float)uDebugInfoVi.q - f4;
             o2.drawLine(0, f5, (float)uDebugInfoVi.p, f5, uDebugInfoVi.l);
             f1 = (float)uDebugInfoVi.q - f4;
             f1 = f1 + f3;
             uCanvas.drawText("84", (float)uDebugInfoVi.p, f1, uDebugInfoVi.l);
             o2 = uDebugInfoVi.o;
             a.m(o2);
             f4 = (float)233;
             f5 = (float)uDebugInfoVi.q - f4;
             o2.drawLine(0, f5, (float)uDebugInfoVi.p, f5, uDebugInfoVi.l);
             f1 = (float)uDebugInfoVi.q - f4;
             f1 = f1 + f3;
             uCanvas.drawText("233", (float)uDebugInfoVi.p, f1, uDebugInfoVi.l);
             ArrayList uArrayList = new ArrayList(uDebugInfoVi.r);
             int i2 = uArrayList.size();
             if (i2 > 0 && i2 > 0) {
                while (true) {
                   int i3 = i + 1;
                   DebugInfoView l1 = uDebugInfoVi.l;
                   if (uArrayList.get(i).floatValue() - 0x41800000 > 0) {
                      i4 = 0xffff0000;
                   label_00ce :
                      l1.setColor(i4);
                      o2 = uDebugInfoVi.o;
                      a.m(o2);
                      float f6 = (float)i * 4.00f;
                      float f7 = (float)uDebugInfoVi.q - uArrayList.get(i).floatValue();
                      o2.drawLine(f6, f7, f6, (float)uDebugInfoVi.q, uDebugInfoVi.l);
                      if (i3 < i2) {
                         i = i3;
                      }
                   }else {
                      i4 = -16711936;
                      goto label_00ce ;
                   }
                }
             }
             uDebugInfoVi.l.setColor(i1);
             uDebugInfoVi.l.setTextAlign(Paint$Align.LEFT);
             float f8 = 20.00f;
             float f9 = (float)uCanvas.getHeight() / 0x41f00000;
             f4 = uDebugInfoVi.l.descent() + uDebugInfoVi.l.ascent();
             f2 = 2.00f;
             f4 = f4 / f2;
             f9 = f9 - f4;
             uCanvas.drawText(this.getScene(), f8, f9, uDebugInfoVi.l);
             i1 = uCanvas.getHeight() * 3;
             f9 = (float)i1 / 0x41f00000;
             f4 = uDebugInfoVi.l.descent() + uDebugInfoVi.l.ascent();
             f4 = f4 / f2;
             f9 = f9 - f4;
             uCanvas.drawText(this.getRealCost(), f8, f9, uDebugInfoVi.l);
             i1 = uCanvas.getHeight() * 5;
             f9 = (float)i1 / 0x41f00000;
             f4 = uDebugInfoVi.l.descent() + uDebugInfoVi.l.ascent();
             f4 = f4 / f2;
             f9 = f9 - f4;
             uCanvas.drawText(this.getTinyBlockCount(), f8, f9, uDebugInfoVi.l);
             i1 = uCanvas.getHeight() * 7;
             f9 = (float)i1 / 0x41f00000;
             f4 = uDebugInfoVi.l.descent() + uDebugInfoVi.l.ascent();
             f4 = f4 / f2;
             f9 = f9 - f4;
             uCanvas.drawText(this.getTinyBlockTime(), f8, f9, uDebugInfoVi.l);
             i1 = uCanvas.getHeight() * 9;
             f9 = (float)i1 / 0x41f00000;
             f4 = uDebugInfoVi.l.descent() + uDebugInfoVi.l.ascent();
             f4 = f4 / f2;
             f9 = f9 - f4;
             uCanvas.drawText(this.getSmallBlockCount(), f8, f9, uDebugInfoVi.l);
             i1 = uCanvas.getHeight() * 11;
             f9 = (float)i1 / 0x41f00000;
             f4 = uDebugInfoVi.l.descent() + uDebugInfoVi.l.ascent();
             f4 = f4 / f2;
             f9 = f9 - f4;
             uCanvas.drawText(this.getSmallBlockTime(), f8, f9, uDebugInfoVi.l);
             i1 = uCanvas.getHeight() * 13;
             f9 = (float)i1 / 0x41f00000;
             f4 = uDebugInfoVi.l.descent() + uDebugInfoVi.l.ascent();
             f4 = f4 / f2;
             f9 = f9 - f4;
             uCanvas.drawText(this.getBigBlockCount(), f8, f9, uDebugInfoVi.l);
             i1 = uCanvas.getHeight() * 15;
             f9 = (float)i1 / 0x41f00000;
             f4 = uDebugInfoVi.l.descent() + uDebugInfoVi.l.ascent();
             f4 = f4 / f2;
             f9 = f9 - f4;
             uCanvas.drawText(this.getBigBlockTime(), f8, f9, uDebugInfoVi.l);
             i1 = uCanvas.getHeight() * 17;
             f9 = (float)i1 / 0x41f00000;
             f4 = uDebugInfoVi.l.descent() + uDebugInfoVi.l.ascent();
             f4 = f4 / f2;
             f9 = f9 - f4;
             uCanvas.drawText(this.getTotalBlockCount(), f8, f9, uDebugInfoVi.l);
             i1 = uCanvas.getHeight() * 19;
             f9 = (float)i1 / 0x41f00000;
             float f10 = uDebugInfoVi.l.descent() + uDebugInfoVi.l.ascent();
             f10 = f10 / f2;
             f9 = f9 - f10;
             uCanvas.drawText(this.getTotalBlockTime(), f8, f9, uDebugInfoVi.l);
          }
          n = uDebugInfoVi.n;
          if (n != null) {
             DebugInfoView o = uDebugInfoVi.o;
             n.unlockCanvasAndPost(o);
          }
       label_026d :
          long l = 16;
          try{
             Thread.sleep(l);
          }catch(java.lang.InterruptedException e0){
             goto label_0002 ;
          }
       }
       return;
    }
    public final void setBigBlockCount(String p0){
       a.p(p0, "<set-?>");
       this.g = p0;
    }
    public final void setBigBlockTime(String p0){
       a.p(p0, "<set-?>");
       this.f = p0;
    }
    public final void setRealCost(String p0){
       a.p(p0, "<set-?>");
       this.c = p0;
    }
    public final void setScene(String p0){
       a.p(p0, "<set-?>");
       this.b = p0;
    }
    public final void setSmallBlockCount(String p0){
       a.p(p0, "<set-?>");
       this.e = p0;
    }
    public final void setSmallBlockTime(String p0){
       a.p(p0, "<set-?>");
       this.d = p0;
    }
    public final void setTinyBlockCount(String p0){
       a.p(p0, "<set-?>");
       this.i = p0;
    }
    public final void setTinyBlockTime(String p0){
       a.p(p0, "<set-?>");
       this.h = p0;
    }
    public final void setTotalBlockCount(String p0){
       a.p(p0, "<set-?>");
       this.k = p0;
    }
    public final void setTotalBlockTime(String p0){
       a.p(p0, "<set-?>");
       this.j = p0;
    }
    public void surfaceChanged(SurfaceHolder p0,int p1,int p2,int p3){
       a.p(p0, "holder");
    }
    public void surfaceCreated(SurfaceHolder p0){
       a.p(p0, "holder");
       this.m = true;
       new Thread(this).start();
    }
    public void surfaceDestroyed(SurfaceHolder p0){
       a.p(p0, "holder");
       this.m = false;
    }
}
