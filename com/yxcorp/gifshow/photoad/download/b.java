package com.yxcorp.gifshow.photoad.download.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.photoad.download.PhotoAdAPKDownloadManagerInitModule;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.photoad.download.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nxb.r;
import java.util.concurrent.Callable;
import brd.t;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import nxb.p;
import erd.o;
import t45.d;
import nxb.o;

public final class b implements Runnable	// class@000f7a
{
    public final PhotoAdAPKDownloadManagerInitModule b;

    public void b(PhotoAdAPKDownloadManagerInitModule p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.n();
       Objects.requireNonNull(oh);
       if (PatchProxy.applyVoid(null, oh, h.class, "5")) {
       }else {
          t.fromCallable(new r(oh)).subscribeOn(oh.b).subscribe(Functions.d(), Functions.d());
       }
       h.n().h().map(new p(tb)).observeOn(d.a).subscribe(new o(tb), Functions.d());
       return;
    }
}
