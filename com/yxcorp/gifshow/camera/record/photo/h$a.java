package com.yxcorp.gifshow.camera.record.photo.h$a;
import com.yxcorp.utility.AsyncTask;
import com.yxcorp.gifshow.camera.record.photo.h;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.camerasdk.models.DisplayLayout;
import com.yxcorp.gifshow.camerasdk.TakePictureSource;
import hg9.n;
import java.io.File;
import k2b.e0;
import java.util.concurrent.Semaphore;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.InterruptedException;
import va9.a;
import hg9.r;
import com.kwai.camerasdk.models.CaptureImageMode;
import p65.g;
import java.util.concurrent.TimeUnit;
import x8c.a;
import w46.b;
import q87.c;
import android.graphics.Bitmap;
import java.lang.StringBuilder;

public class h$a extends AsyncTask	// class@000ead
{
    public boolean A;
    public int B;
    public Bitmap C;
    public final h D;
    public final Semaphore p;
    public final q q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final DisplayLayout v;
    public final TakePictureSource w;
    public final n x;
    public final File y;
    public final WeakReference z;

    public void h$a(h p0,q p1,int p2,int p3,DisplayLayout p4,TakePictureSource p5,n p6,File p7,int p8,boolean p9,e0 p10){
       this.D = p0;
       super();
       this.p = new Semaphore(2);
       this.B = 0;
       this.C = null;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
       this.t = p8;
       this.u = p9;
       this.z = new WeakReference(p10);
    }
    public Object b(Object[] p0){
       p0 = PatchProxy.applyOneRefs(p0, this, h$a.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          int i = 0;
          this.B = i;
          try{
             this.p.acquire(2);
          }catch(java.lang.InterruptedException e0){
             e0.printStackTrace();
          }
          try{
             if (!this.q.M()) {
                Object[] objArray = new Object[]{"[photo]"};
                a.a("capture camera not open", objArray);
                this.B = 3;
             }else {
                this.q.g1(new r(this), this.r, this.s, this.v, this.w, CaptureImageMode.kCaptureNextFrame, this.t, this.u);
                int i1 = (this.q.U(this.w))? 7000: 3000;
                long l = (long)i1;
                TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
                if (!this.p.tryAcquire(l, mILLISECONDS)) {
                   this.B = 4;
                   i = new Object[i];
                   a.D().t("PictureCapture", "ERROR_CODE_TIMEOUT 1", i);
                }else if(this.C != null){
                   Object[] objArray1 = new Object[i];
                   a.D().w("PictureCapture", "onCaptureBitmapSuccess", objArray1);
                   this.x.t0(this.y, this.C, this.t);
                }
                if (!this.p.tryAcquire(l, mILLISECONDS)) {
                   this.B = 4;
                   i = new Object[i];
                   a.D().t("PictureCapture", "ERROR_CODE_TIMEOUT 2", i);
                }
             }
          }catch(java.lang.InterruptedException e12){
             e12.printStackTrace();
          }
          i = null;
       }
       return p0;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "3")) {
          return;
       }
       h$a tD = this.D;
       if (tD.d == this) {
          tD.d = null;
       }
       return;
    }
    public void j(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "2")) {
       }else if(!this.g()){
          p0 = this.y;
          String str = "[photo]";
          int i = 1;
          int i1 = 0;
          if (p0 != null && p0.exists()) {
             p0 = new Object[]{str,"capture success"};
             a.b(p0);
             Object[] objArray = new Object[i1];
             a.D().w("PictureCapture", "onCaptureAndSaveFileSuccess", objArray);
             this.x.x0(this.y, this.C, this.t);
             this.C = null;
          }else if(this.y != null || this.A == null){
             this.x.n0(this.B);
             Object[] objArray1 = new Object[i];
             objArray1[i1] = str;
             a.a("capture failed "+this.B, objArray1);
          }
       }
       p0 = this.D;
       if (p0.d == this) {
          p0.d = null;
       }
       return;
    }
}
