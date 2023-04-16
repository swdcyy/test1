package com.kwai.sdk.kbar.core.QRCodeView;
import android.hardware.Camera$PreviewCallback;
import com.kwai.sdk.kbar.core.a$a;
import fo7.a$a;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.System;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import com.kwai.sdk.kbar.core.QRCodeView$c;
import android.os.Handler;
import com.kwai.sdk.kbar.core.CameraPreview;
import com.kwai.sdk.kbar.core.ScanBoxView;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.content.res.Resources;
import android.view.View;
import android.graphics.BitmapFactory;
import do7.a;
import android.text.TextPaint;
import android.view.SurfaceView;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.hardware.Camera$Parameters;
import android.hardware.Camera;
import android.graphics.Rect;
import java.lang.Math;
import java.util.List;
import java.lang.Object;
import java.lang.Integer;
import java.util.Timer;
import com.kwai.sdk.kbar.core.QRCodeView$d;
import java.util.TimerTask;
import java.lang.Exception;
import com.kwai.sdk.kbar.qrdetection.a;
import com.google.gson.JsonObject;
import do7.d;
import com.kwai.sdk.kbar.qrdetection.DecodeRet;
import fo7.a;
import com.kwai.sdk.kbar.core.QRCodeView$b;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.sdk.kbar.core.QRCodeView$e;
import com.kwai.sdk.kbar.core.QRCodeView$f;
import android.hardware.Camera$Size;
import com.kwai.sdk.kbar.core.QRCodeView$a;
import com.kwai.sdk.kbar.core.a;
import java.util.concurrent.Future;

public abstract class QRCodeView extends RelativeLayout implements Camera$PreviewCallback, a$a, a$a	// class@001613
{
    public Camera b;
    public CameraPreview c;
    public ScanBoxView d;
    public QRCodeView$f e;
    public Handler f;
    public boolean g;
    public ValueAnimator h;
    public a i;
    public long j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public Timer o;
    public Timer p;
    public boolean q;
    public int r;
    public final ExecutorService s;
    public Runnable t;
    public static final long[] u;

    static {
       QRCodeView.u = new long[4]{255,255,255,255};
    }
    public void QRCodeView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void QRCodeView(Context p0,AttributeSet p1,int p2){
       Bitmap uBitmap;
       super(p0, p1, p2);
       this.g = false;
       this.i = null;
       this.j = System.currentTimeMillis();
       this.k = 0;
       this.r = 0;
       this.s = c.f("KBarThread");
       this.t = new QRCodeView$c(this);
       this.f = new Handler();
       this.c = new CameraPreview(this.getContext());
       ScanBoxView scanBoxView = new ScanBoxView(this.getContext());
       this.d = scanBoxView;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.u4);
       int indexCount = typedArray.getIndexCount();
       int i = 0;
       ScanBoxView scanBoxView1 = 8;
       int i1 = 6;
       while (i < indexCount) {
          int index = typedArray.getIndex(i);
          if (index == 30) {
             scanBoxView.p = typedArray.getDimensionPixelSize(index, scanBoxView.p);
          }else if(index == 7){
             scanBoxView.l = typedArray.getDimensionPixelSize(index, scanBoxView.l);
          }else if(index == i1){
             scanBoxView.k = typedArray.getDimensionPixelSize(index, scanBoxView.k);
          }else if(index == 24){
             scanBoxView.q = typedArray.getDimensionPixelSize(index, scanBoxView.q);
          }else if(index == 21){
             scanBoxView.m = typedArray.getDimensionPixelSize(index, scanBoxView.m);
          }else if(index == 19){
             scanBoxView.i = typedArray.getColor(index, scanBoxView.i);
          }else if(index == 5){
             scanBoxView.j = typedArray.getColor(index, scanBoxView.j);
          }else if(index == 22){
             scanBoxView.r = typedArray.getColor(index, scanBoxView.r);
          }else if(index == 23){
             scanBoxView.s = typedArray.getDimensionPixelSize(index, scanBoxView.s);
          }else if(index == 15){
             scanBoxView.t = typedArray.getBoolean(index, scanBoxView.t);
          }else if(index == 9){
             scanBoxView.u = typedArray.getDrawable(index);
          }else if(index == 4){
             scanBoxView.w = typedArray.getDimensionPixelSize(index, scanBoxView.w);
          }else if(index == 3){
             scanBoxView.x = typedArray.getColor(index, scanBoxView.x);
          }else if(!index){
             scanBoxView.y = typedArray.getInteger(index, scanBoxView.y);
          }else if(index == 11){
             scanBoxView.z = typedArray.getBoolean(index, scanBoxView.z);
          }else if(index == 29){
             scanBoxView.A = typedArray.getDimensionPixelSize(index, scanBoxView.A);
          }else if(index == 2){
             scanBoxView.o = typedArray.getDimensionPixelSize(index, scanBoxView.o);
          }else if(index == 10){
             scanBoxView.B = typedArray.getBoolean(index, scanBoxView.B);
          }else if(index == 1){
             scanBoxView.D = typedArray.getString(index);
          }else if(index == 20){
             scanBoxView.C = typedArray.getString(index);
          }else if(index == 28){
             scanBoxView.F = typedArray.getDimensionPixelSize(index, scanBoxView.F);
          }else if(index == 26){
             scanBoxView.G = typedArray.getColor(index, scanBoxView.G);
          }else if(index == 18){
             scanBoxView.H = typedArray.getBoolean(index, scanBoxView.H);
          }else if(index == 27){
             scanBoxView.I = typedArray.getDimensionPixelSize(index, scanBoxView.I);
          }else if(index == 17){
             scanBoxView.J = typedArray.getBoolean(index, scanBoxView.J);
          }else if(index == 16){
             scanBoxView.L = typedArray.getBoolean(index, scanBoxView.L);
          }else if(index == 25){
             scanBoxView.K = typedArray.getColor(index, scanBoxView.K);
          }else if(index == 13){
             scanBoxView.M = typedArray.getBoolean(index, scanBoxView.M);
          }else if(index == 14){
             scanBoxView.N = typedArray.getBoolean(index, scanBoxView.N);
          }else if(index == scanBoxView1){
             scanBoxView.O = typedArray.getDrawable(index);
          }else if(index == 12){
             scanBoxView.W0 = typedArray.getBoolean(index, scanBoxView.W0);
          }
          i = i + 1;
       }
       typedArray.recycle();
       ScanBoxView o = scanBoxView.O;
       if (o != null) {
          scanBoxView.U = o.getBitmap();
       }
       if (scanBoxView.U == null) {
          uBitmap = BitmapFactory.decodeResource(scanBoxView.getResources(), R.drawable.arg_RES_7f081dd8);
          scanBoxView.U = uBitmap;
          scanBoxView.U = a.h(uBitmap, scanBoxView.r);
       }
       indexCount = 90;
       uBitmap = a.a(scanBoxView.U, indexCount);
       scanBoxView.V = uBitmap;
       uBitmap = a.a(uBitmap, indexCount);
       scanBoxView.V = uBitmap;
       scanBoxView.V = a.a(uBitmap, indexCount);
       o = scanBoxView.u;
       if (o != null) {
          scanBoxView.S = o.getBitmap();
       }
       if (scanBoxView.S == null) {
          uBitmap = BitmapFactory.decodeResource(scanBoxView.getResources(), R.drawable.arg_RES_7f081dd9);
          scanBoxView.S = uBitmap;
          scanBoxView.S = a.h(uBitmap, scanBoxView.r);
       }
       scanBoxView.T = a.a(scanBoxView.S, indexCount);
       scanBoxView.p = scanBoxView.p + scanBoxView.A;
       scanBoxView.W = ((float)scanBoxView.l * 0x3f800000) / 2.00f;
       scanBoxView.h.setTextSize((float)scanBoxView.F);
       scanBoxView.h.setColor(scanBoxView.G);
       scanBoxView.setIsBarcode(scanBoxView.B);
       this.c.setId(R.id.qrcv_camera_preview);
       this.addView(this.c);
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(p0, p1);
       layoutParams.addRule(i1, this.c.getId());
       layoutParams.addRule(scanBoxView1, this.c.getId());
       this.addView(this.d, layoutParams);
       this.m = false;
       c.j = true;
       return;
    }
    public void a(int p0,int p1,int[] p2){
       Rect rect1;
       double d2;
       double d7;
       QRCodeView qRCodeView = this;
       int i = p0;
       int i1 = p1;
       String str = "startZoom: w"+i+" h "+i1;
       try{
          Log.d("KBAR_QRCodeView", str);
          Camera$Parameters parameters = qRCodeView.b.getParameters();
          Rect rect = qRCodeView.d.b(i);
          int i2 = 2;
          int i3 = 3;
          double d = Math.sqrt((double)((((i1 * i1) + (i1 * i1)) / 4) * 4)) / Math.sqrt((double)((p2[i2] * p2[i2]) + (p2[i3] * p2[i3])));
          Rect left = rect.left;
          double d1 = (double)i1 / 2.00f;
          i1 = 1;
          if (Math.abs((d1 - (double)p2[i1])) > 0) {
             rect1 = left;
             d2 = (d1 - (double)left) / Math.abs((d1 - (double)p2[i1]));
          label_007a :
             Camera$Parameters parameters1 = parameters;
             double d3 = (Math.abs(((d1 - (double)p2[i1]) - (double)p2[i3])) > 0)? (d1 - (double)rect1) / Math.abs(((d1 - (double)p2[1]) - (double)p2[i3])): d;
             rect = rect.top;
             double d4 = (double)i;
             double d5 = d4 / 2.00f;
             double d6 = d5 - (double)p2[0];
             try{
                if (Math.abs(d6) > 0) {
                   d7 = d4;
                   d6 = (d5 - (double)rect) / Math.abs((d5 - (double)p2[0]));
                }else {
                   d7 = d4;
                   d6 = d;
                }
                double d8 = d6;
                d6 = (Math.abs(((d5 - (double)p2[0]) - (double)p2[2])) > 0)? (d5 - (double)rect) / Math.abs(((d5 - (double)p2[0]) - (double)p2[2])): d;
                d6 = Math.min(Math.min(Math.min(Math.min(d, d2), d3), d8), d6);
                try{
                   i1 = this;
                   if (((double)Math.abs((p2[0] + p2[2])) * d6) - (double)Math.abs(i1.d.b((int)((d7 * d6) + 0x3ff0000000000000)).bottom) > 0) {
                      d6 = 0x3ff0000000000000;
                   }
                   List zoomRatios = parameters1.getZoomRatios();
                   int zoom = parameters1.getZoom();
                   i2 = zoomRatios.get(zoom).intValue();
                   if (d6 - 0x3ff0000000000000 > 0) {
                      i = (int)((double)i2 * d6);
                      int i4 = zoom;
                      i2 = zoom + 10;
                      while (i4 < i2 && i4 < zoomRatios.size()) {
                         if (zoomRatios.get(i4).intValue() > i) {
                            i4 = i4 - 1;
                            break ;
                         }
                         i4 = i4 + 1;
                      }
                      if (i4 > zoom && i1.q != null) {
                         Camera$Parameters parameters2 = parameters1;
                         try{
                            parameters2.setZoom(i4);
                            i1.b.setParameters(parameters2);
                            i1.q = false;
                            QRCodeView p = i1.p;
                            if (p != null) {
                               p.cancel();
                               i1.p = null;
                            }
                            i1.r = 0;
                            Timer timer = new Timer();
                            i1.p = timer;
                            timer.schedule(new QRCodeView$d(i1), 1, 1000);
                         }catch(java.lang.Exception e0){
                            try{
                               e0.printStackTrace();
                               Log.d("KBAR_QRCodeView", "setZoom failed: "+e0.getMessage());
                            }catch(java.lang.Exception e0){
                            }
                         }
                      }
                   }
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.Exception e0){
                i1 = this;
             }
          }else {
             rect1 = left;
             d2 = d;
             goto label_007a ;
          }
       }catch(java.lang.Exception e0){
          i1 = qRCodeView;
       }
    label_01d9 :
       return;
    }
    public void b(a p0){
       Log.b("KBAR_QRCodeView", "upload info"+p0.a());
    }
    public String d(byte[] p0,int p1,int p2,int p3,int p4,int p5,int p6){
       return d.a(this, p0, p1, p2, p3, p4, p5, p6);
    }
    public DecodeRet[] f(byte[] p0,int p1,int p2,int p3,int p4,int p5,int p6){
       QRCodeView qRCodeView = this;
       int i = p1;
       int i1 = p2;
       int i2 = p5;
       int i3 = p6;
       QRCodeView i4 = qRCodeView.i;
       if (i4 == null || !i4.i()) {
          return null;
       }
       Log.d("KBAR_QRCodeView", "mmuDecode: w"+i+" h "+i1+" "+p3+" "+p4+" "+i2+" "+i3);
       Log.b("KBAR_QRCodeView", "screen info:"+this.getMeasuredWidth()+":"+this.getMeasuredHeight());
       return qRCodeView.i.b(p0, p1, p2, 1, 1, 0, 0, 0, p3, p4, p5, p6, 0);
    }
    public boolean getIsScanBarcodeStyle(){
       return this.d.getIsBarcode();
    }
    public ScanBoxView getScanBoxView(){
       return this.d;
    }
    public int[] i(byte[] p0,int p1,int p2){
       QRCodeView qRCodeView = this;
       int i = p1;
       int i1 = p2;
       String str = "KBAR_QRCodeView";
       Log.d(str, "detectRect: w"+i+" h "+i1);
       QRCodeView i2 = qRCodeView.i;
       if (i2 == null || !i2.i()) {
          Log.d(str, "detectRect: w111"+i+" h 111"+i1);
          return null;
       }else {
          Rect left = qRCodeView.d.b(this.getHeight()).left;
          Rect top = qRCodeView.d.b(this.getHeight()).top;
          int i3 = qRCodeView.d.b(this.getHeight()).right - left;
          int i4 = qRCodeView.d.b(this.getHeight()).bottom - top;
          Log.b(str, "calDetectRect scanRect:\("+left+","+top+","+i3+","+i4+"\)");
          float[] uofloatArray = new float[4];
          float f = (float)i;
          float f1 = 0x3f800000;
          float f2 = (float)i1;
          float f3 = (f * f1) / f2;
          float f4 = (float)this.getMeasuredHeight();
          float f5 = (float)this.getMeasuredWidth();
          if (((f4 * f1) / f5) - f3 < 0) {
             f3 = f3 * f5;
             uofloatArray[0] = (float)left / f5;
             uofloatArray[1] = ((float)top + ((f3 - f4) / 2.00f)) / f3;
             uofloatArray[2] = (float)i3 / f5;
             uofloatArray[3] = (float)i4 / f3;
          }else {
             f5 = f / f3;
             uofloatArray[0] = ((float)left + ((f5 - f2) / 2.00f)) / f5;
             uofloatArray[1] = (float)top / f;
             uofloatArray[2] = (float)i3 / f5;
             uofloatArray[3] = (float)i4 / f;
          }
          Log.b(str, "rect ratio:"+uofloatArray[0]+","+uofloatArray[1]+","+uofloatArray[2]+","+uofloatArray[3]);
          uofloatArray[3] = Math.min(f1, (uofloatArray[3] * 0x3fa00000));
          int i5 = (int)(uofloatArray[1] * f);
          i4 = (int)(uofloatArray[3] * f);
          Log.b(str, "rect ratio:"+(int)(((f1 - uofloatArray[0]) - uofloatArray[2]) * f2)+","+i5+","+i4+","+(int)(uofloatArray[2] * f2));
          return qRCodeView.i.d(p0, p1, p2, 1, 1, 0, 0, 0, 0, 0, Math.min((i5 + i4), i), p2);
       }
    }
    public void j(DecodeRet[] p0){
       k1.o(new QRCodeView$b(this, p0));
    }
    public void k(int p0,int p1){
       this.post(new QRCodeView$e(this, p0, p1));
    }
    public void n(String p0){
       d.b(this, p0);
    }
    public void o(byte[] p0,int p1,int p2){
       boolean b1;
       Log.d("KBAR_QRCodeView", "handleAmbientBrightness: w "+p1+" h "+p2);
       QRCodeView tc = this.c;
       if (tc != null && tc.b()) {
          long l = System.currentTimeMillis();
          if ((l - this.j) - 150 < 0) {
             return;
          }else {
             this.j = l;
             l = 0;
             long l1 = (long)(p1 * p2);
             int i = 10;
             if (Math.abs(((float)p0.length - ((float)l1 * 0x3fc00000))) - 0x3727c5ac < 0) {
                boolean b = false;
                int i1 = 0;
                while ((long)i1 - l1 < 0) {
                   long l2 = (long)p0[i1] & 255;
                   l = l + l2;
                   i1 = i1 + 10;
                }
                l = l / (l1 / (long)i);
                long[] u = QRCodeView.u;
                p2 = this.k % u.length;
                this.k = p2;
                u[p2] = l;
                l1 = 1;
                this.k = p2 + l1;
                p2 = u.length;
                i = 0;
                while (true) {
                   if (i < p2) {
                      if (u[i] - 60 > 0) {
                         b1 = false;
                      label_0089 :
                         Log.g("KBAR_QRCodeView", "摄像头环境亮度为："+l+" isDarkEnv: "+b1);
                         StringBuilder str = "[mDelegate != null]: ";
                         i = (this.e != null)? true: false;
                         str = str+i+" [enviromentBrightness != isDarkEnv]: ";
                         if (this.m != b1) {
                            b = true;
                         }
                         Log.g("KBAR_QRCodeView", str+b+" [!torchIsOpen]: "+(this.l ^ l1)+" [!isZooming]: "+(l1 ^ this.n));
                         QRCodeView te = this.e;
                         if (te != null && (this.m != b1 && (this.l == null && this.n == null))) {
                            this.m = b1;
                            te.a(b1);
                            break ;
                         }
                      }else {
                         i = i + 1;
                      }
                   }else {
                      b1 = true;
                      goto label_0089 ;
                   }
                }
             }
          }
       }
       return;
    }
    public void onPreviewFrame(byte[] p0,Camera p1){
       if (this.g != null) {
          QRCodeView tc = this.c;
          if (tc != null && tc.b()) {
             try{
                Camera$Parameters parameters = p1.getParameters();
                Camera$Size previewSize = parameters.getPreviewSize();
                boolean b = parameters.isZoomSupported();
                this.post(new QRCodeView$a(this, p0, previewSize));
                a uoa = new a(p0, previewSize.width, previewSize.height, b, this);
                this.s.submit(v7);
             }catch(java.lang.Exception e9){
                e9.printStackTrace();
             }
          }
       }
    }
    public void setDelegate(QRCodeView$f p0){
       this.e = p0;
    }
}
