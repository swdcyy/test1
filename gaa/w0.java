package gaa.w0;
import r8c.u$c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import nm6.d;
import r8c.g;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPreInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import android.os.Bundle;
import gaa.r0;
import java.lang.Runnable;
import ekd.k1;
import gaa.s0;
import r8c.n;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import jkd.c;
import gaa.t0;

public class w0 implements u$c	// class@002452
{
    public final GifshowActivity a;
    public final QPhoto b;
    public final QPreInfo c;
    public final g d;
    public final d e;
    public n f;
    public u g;
    public boolean h;
    public int i;
    public int j;
    public float k;
    public float l;
    public int m;
    public File n;

    public void w0(GifshowActivity p0,QPhoto p1,d p2,g p3){
       super();
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = 0;
       this.m = 100;
       this.n = null;
       this.a = p0;
       this.b = p1;
       this.d = p3;
       this.c = p2.e();
       this.e = p2;
    }
    public void a(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(w0.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, w0.class, "7")) {
          return;
       }
       this.m = p1;
       this.k = (float)p0;
       Object[] objArray = new Object[0];
       a.D().w("EditSourcePhotoDownloadDispatcher", "onProgress progress:"+p0+",totalSize:"+p1+",forceFake:"+p2, objArray);
       this.d((int)this.k, this.m, p2);
       return;
    }
    public void b(File p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w0.class, "4")) {
          return;
       }
       k1.o(new r0(this, p0));
       return;
    }
    public void c(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditSourcePhotoDownloadDispatcher", "onProgress exportFile:"+p0, objArray);
       k1.o(new s0(this, p0));
       return;
    }
    public void d(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(w0.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, w0.class, "8")) {
          return;
       }
       float f = (float)p1;
       float f1 = f / 0x3f333333;
       float f2 = (float)p0 + (this.l * (f1 - f));
       Object[] objArray = new Object[0];
       a.D().w("EditSourcePhotoDownloadDispatcher", "realProgress, downloadSize:"+p0+",progress:"+f2+",downloadTotalSize:"+p1+",forceFake:"+p2+",totalSize:"+f1, objArray);
       this.f.b((int)f2, (int)f1, p2);
       return;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, w0.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditSourcePhotoDownloadDispatcher", "onCancel", objArray);
       this.h = true;
       this.f.d();
       a.d().k(new PlayEvent(this.b, PlayEvent$Status.RESUME, 17));
       if (this.e.c() != null) {
          this.e.c().onCancel();
       }
       return;
    }
    public void onFailed(){
       if (PatchProxy.applyVoid(null, this, w0.class, "6")) {
          return;
       }
       this.f.d();
       k1.o(t0.b);
       a.d().k(new PlayEvent(this.b, PlayEvent$Status.RESUME, 17));
       if (this.e.c() != null) {
          this.e.c().onFail(0, "");
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, w0.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditSourcePhotoDownloadDispatcher", "onStart", objArray);
       this.f.c();
       return;
    }
}
