package com.yxcorp.gifshow.corona.common.monitor.CostDebugView;
import android.view.SurfaceHolder$Callback;
import java.lang.Runnable;
import android.view.SurfaceView;
import com.yxcorp.gifshow.corona.common.monitor.CostDebugView$a;
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
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.os.SystemClock;
import java.lang.Long;
import cq9.a;
import java.lang.Throwable;
import q87.c;
import java.lang.StringBuilder;
import java.lang.Thread;
import java.lang.Integer;

public final class CostDebugView extends SurfaceView implements SurfaceHolder$Callback, Runnable	// class@00125b
{
    public boolean b;
    public String c;
    public String d;
    public String e;
    public String f;
    public final Paint g;
    public boolean h;
    public SurfaceHolder i;
    public Canvas j;
    public HashMap k;
    public static final CostDebugView$a l;

    static {
       CostDebugView.l = new CostDebugView$a(null);
    }
    public void CostDebugView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void CostDebugView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void CostDebugView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.c = "click start : ";
       this.d = "switch start: ";
       this.e = "switch end: ";
       this.f = "click cost: ";
       Paint paint = new Paint();
       this.g = paint;
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
       this.i = holder;
       if (holder != null) {
          holder.addCallback(this);
          this.setZOrderOnTop(true);
          holder.setFormat(-3);
       }
       return;
    }
    public void CostDebugView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final boolean getReset(){
       return this.b;
    }
    public final String getT1Msg(){
       return this.c;
    }
    public final String getT2Msg(){
       return this.d;
    }
    public final String getT3Msg(){
       return this.e;
    }
    public final String getT4Msg(){
       return this.f;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, CostDebugView.class, "9")) {
          return;
       }
       while (this.h != null) {
          if (!PatchProxy.applyVoid(null, this, CostDebugView.class, "5")) {
             int i = 0;
             CostDebugView ti = this.i;
             Canvas uCanvas = (ti != null)? ti.lockCanvas(): null;
             this.j = uCanvas;
             if (uCanvas != null) {
                uCanvas.drawColor(i, PorterDuff$Mode.CLEAR);
                float f = (float)uCanvas.getWidth() / 2.00f;
                float f1 = (float)uCanvas.getHeight() / 18.00f;
                float f2 = this.g.descent() + this.g.ascent();
                f2 = f2 / 2.00f;
                f1 = f1 - f2;
                uCanvas.drawText(new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Long.valueOf(SystemClock.elapsedRealtime())), f, f1, this.g);
                int i1 = uCanvas.getHeight() * 3;
                f1 = (float)i1 / 18.00f;
                f2 = this.g.descent() + this.g.ascent();
                f2 = f2 / 2.00f;
                f1 = f1 - f2;
                uCanvas.drawText(this.c, f, f1, this.g);
                i1 = uCanvas.getHeight() * 5;
                f1 = (float)i1 / 18.00f;
                f2 = this.g.descent() + this.g.ascent();
                f2 = f2 / 2.00f;
                f1 = f1 - f2;
                uCanvas.drawText(this.d, f, f1, this.g);
                i1 = uCanvas.getHeight() * 7;
                f1 = (float)i1 / 18.00f;
                float f3 = this.g.descent() + this.g.ascent();
                f3 = f3 / 2.00f;
                f1 = f1 - f3;
                uCanvas.drawText(this.e, f, f1, this.g);
             }
             ti = this.i;
             if (ti != null) {
                ti.unlockCanvasAndPost(this.j);
             }
          }
       label_0117 :
          long l = 16;
          try{
             Thread.sleep(l);
          }catch(java.lang.InterruptedException e0){
             goto label_000c ;
          }
       }
       return;
    }
    public final void setReset(boolean p0){
       this.b = p0;
    }
    public final void setT1Msg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CostDebugView.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void setT2Msg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CostDebugView.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.d = p0;
       return;
    }
    public final void setT3Msg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CostDebugView.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void setT4Msg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CostDebugView.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.f = p0;
       return;
    }
    public void surfaceChanged(SurfaceHolder p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CostDebugView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CostDebugView.class, "7")) {
          return;
       }
       a.p(p0, "holder");
       return;
    }
    public void surfaceCreated(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CostDebugView.class, "6")) {
          return;
       }
       a.p(p0, "holder");
       this.h = true;
       new Thread(this).start();
       return;
    }
    public void surfaceDestroyed(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CostDebugView.class, "8")) {
          return;
       }
       a.p(p0, "holder");
       this.h = false;
       return;
    }
}
