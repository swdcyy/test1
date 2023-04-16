package com.yxcorp.gifshow.ad.AdProcess$j;
import com.yxcorp.gifshow.ad.AdProcess$b;
import com.yxcorp.gifshow.ad.AdProcess;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import mxb.j;
import android.app.Activity;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import java.util.List;
import nx8.f;

public final class AdProcess$j extends AdProcess$b	// class@0014e8
{
    public final AdProcess b;
    public final DownloadTask c;

    public void AdProcess$j(AdProcess p0,DownloadTask p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AdProcess$j.class, "2")) {
          return;
       }
       super.a();
       i0.a().b(this.b.d().getAdLogWrapper(), 435);
       this.c.setAllowedNetworkTypes(2);
       AdProcessUtils.a(this.b.c(), this.b.d());
       f.h(this.c, this.b.e());
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, AdProcess$j.class, "1")) {
          return;
       }
       super.b();
       this.c.setAllowedNetworkTypes(3);
       f.h(this.c, this.b.e());
       return;
    }
}
