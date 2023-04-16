package com.yxcorp.gifshow.photo.download.task.q0;
import exb.e;
import com.yxcorp.gifshow.photo.download.task.n0;
import brd.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.File;
import fyd.a;
import com.yxcorp.gifshow.photo.download.task.exception.DownloadException;
import android.app.Application;
import o56.a;
import java.lang.Throwable;
import brd.g;
import java.lang.Long;
import java.lang.Float;
import ixb.m2;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.photo.download.task.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.utils.c;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import exb.d;
import ixb.l2;

public class q0 implements e	// class@000f14
{
    public final v a;
    public final n0 b;

    public void q0(n0 p0,v p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q0.class, "2")) {
          return;
       }
       File uFile = new File(p0);
       uFile.exists();
       if (!uFile.exists()) {
          this.a.onError(new DownloadException(-100002, a.b().getString(R.string.arg_RES_7f1043c5)));
          return;
       }else {
          this.a.onNext(uFile);
          this.a.onComplete();
          return;
       }
    }
    public void c(long p0,float p1){
       if (PatchProxy.isSupport(q0.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Float.valueOf(p1), this, q0.class, "1")) {
          return;
       }
       k1.o(new m2(this, (p1 * 0x3f4ccccd)));
       return;
    }
    public void d(Throwable p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, q0.class, "3")) {
          return;
       }
       this.a.onError(p0);
       c.d(this.b.b, false);
       return;
    }
    public void e(ClientStat$CdnResourceLoadStatEvent p0){
       d.b(this, p0);
    }
    public boolean f(){
       return d.a(this);
    }
    public void onCancel(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0.class, "4")) {
          return;
       }
       k1.o(new l2(this));
       return;
    }
    public void onStart(String p0){
       d.c(this, p0);
    }
}
