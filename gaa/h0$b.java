package gaa.h0$b;
import exb.b;
import gaa.h0;
import voc.i;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.yxcorp.gifshow.photo.download.task.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import cq.a;
import q87.c;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;
import jkd.c;
import nm6.d;
import java.lang.Throwable;
import e17.i;
import java.lang.Float;
import java.lang.Math;
import gaa.m0;
import java.lang.Runnable;
import ekd.k1;
import fxb.b;
import java.lang.StringBuilder;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import wba.b0;
import java.util.ArrayList;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import lnc.a1;
import java.util.concurrent.TimeUnit;
import java.lang.reflect.Type;
import gaa.n0;

public class h0$b implements b	// class@002433
{
    public final i a;
    public final File b;
    public final int c;
    public final String d;
    public final h0 e;

    public void h0$b(h0 p0,i p1,File p2,int p3,String p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void a(){
    }
    public void b(DownloadPhotoInfoResponse p0){
    }
    public void c(b p0){
    }
    public void onCancel(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h0$b.class, "4")) {
          return;
       }
       h0$b te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(objArray, te, h0.class, "10")) {
          Object[] objArray1 = new Object[0];
          a.D().w("EditSourcePictureDownloadDispatcher", "onCancel", objArray1);
          te.i = true;
          a.d().k(new PlayEvent(te.b, PlayEvent$Status.RESUME, 17));
          if (te.g.c() != null) {
             te.g.c().onCancel();
          }
          te.f();
       }
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0$b.class, "3")) {
          return;
       }
       this.e.e();
       i.a(R.style.arg_RES_7f11066a, 0x7f1043cb);
       return;
    }
    public void onProgress(float p0){
       h0$b uob = h0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (this.e.h == null) {
          int i = Math.min(99, (int)(p0 * 100.00f));
          k1.o(new m0(this.a, i));
          StringBuilder str = "单图下载进度"+i;
          Object[] objArray = new Object[0];
          b.C().w("EditSourcePictureDownloadDispatcher", str+"downloadListener hashcode"+this.hashCode(), objArray);
       }
       return;
    }
    public void onStart(){
    }
    public void onSuccess(){
       int i2;
       if (PatchProxy.applyVoid(null, this, h0$b.class, "2")) {
          return;
       }
       h0$b te = this.e;
       int i = 1;
       int i1 = te.l + i;
       te.l = i1;
       h0 h = te.h;
       if (h == i || h == 2) {
          i2 = Math.round((((float)i1 / (float)te.m) * 100.00f));
          Object[] objArray = new Object[0];
          b.C().w("EditSourcePictureDownloadDispatcher", "图集下载进度"+i2+"downloadListener hashcode"+this.hashCode(), objArray);
       }else {
          i2 = 100;
       }
       Size size = b0.a(this.b.getAbsolutePath());
       this.e.t.add(this.c, this.b.getAbsolutePath());
       this.e.u.add(this.c, size.b+":"+size.c);
       b.a(0x5f2ddeb4).c(this.d, this.b.getAbsolutePath(), String.class, (a1.k() + TimeUnit.DAYS.toMillis(1)));
       k1.o(new n0(this.a, i2));
       return;
    }
}
