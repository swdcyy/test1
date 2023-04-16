package com.yxcorp.gifshow.photo.download.task.e;
import exb.e;
import com.yxcorp.gifshow.photo.download.task.f$a;
import ywb.f;
import brd.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photo.download.task.b;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import ywb.f$c;
import fxb.d;
import java.io.File;
import brd.g;
import java.lang.Long;
import java.lang.Float;
import ixb.i;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Throwable;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.photo.download.task.f;
import java.lang.Boolean;
import com.yxcorp.gifshow.photo.download.PhotoResourceDownloadTask$DownloadTaskException;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import com.yxcorp.gifshow.photo.download.task.exception.NoSpaceException;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import exb.d;
import ywb.e;
import q87.c;
import ixb.h;

public class e implements e	// class@000ef5
{
    public final float a;
    public final f b;
    public final v c;
    public final f$a d;

    public void e(f$a p0,float p1,f p2,v p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       this.d.c.e.mDownloadUrl = p1;
       b.h.d(this.b.f(), 7);
       this.c.onNext(new File(p0));
       this.c.onComplete();
       return;
    }
    public void c(long p0,float p1){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Float.valueOf(p1), this, e.class, "1")) {
          return;
       }
       k1.o(new i(this, (this.a * p1)));
       return;
    }
    public void d(Throwable p0,String p1,String p2){
       boolean b;
       NoSpaceException noSpaceExcep1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "3")) {
          return;
       }
       p1.mDownloadUrl = p2;
       b.h.d(this.b.f(), 8);
       e tc = this.c;
       f$a c = this.d.c;
       Objects.requireNonNull(c);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NoSpaceException noSpaceExcep = PatchProxy.applyOneRefs(p0, c, f.class, "4");
       if (noSpaceExcep != patchProxyRe) {
       }else {
          noSpaceExcep = PatchProxy.applyOneRefs(p0, null, f.class, "3");
          if (noSpaceExcep != patchProxyRe) {
             b = noSpaceExcep.booleanValue();
          }else if(p0 instanceof PhotoResourceDownloadTask$DownloadTaskException){
             b = (p0.mErrorCode == -1151)? true: false;
          }else {
             b = PostWorkErrorTips.a(p0);
          }
          if (b) {
             noSpaceExcep1 = new NoSpaceException();
          }
          noSpaceExcep = noSpaceExcep1;
       }
       tc.onError(noSpaceExcep);
       return;
    }
    public void e(ClientStat$CdnResourceLoadStatEvent p0){
       d.b(this, p0);
    }
    public boolean f(){
       return d.a(this);
    }
    public void onCancel(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       this.d.c.e.mDownloadUrl = p0;
       b.h.d(this.b.f(), 9);
       Object[] objArray = new Object[0];
       e.C().w(f.k, "executeFileDownloadTask download cancel isJointProgress:", objArray);
       k1.o(new h(this));
       return;
    }
    public void onStart(String p0){
       d.c(this, p0);
    }
}
