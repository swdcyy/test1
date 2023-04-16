package com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule;
import com.kwai.framework.init.TTIInitModule;
import com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule$b;
import nsd.u;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule$d;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.kuaishou.gifshow.network.degrade.RequestTiming;

public final class ResourceDownloadInitModule extends TTIInitModule	// class@001dcb
{
    public boolean q;
    public boolean r;
    public static final ResourceDownloadInitModule$b s;

    static {
       ResourceDownloadInitModule.s = new ResourceDownloadInitModule$b(null);
    }
    public void ResourceDownloadInitModule(){
       super();
       this.r = true;
    }
    public int f0(){
       return 21;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceDownloadInitModule.class, "1")) {
          return;
       }
       e.g(new ResourceDownloadInitModule$d(this), "ResourceDownloadInitModule");
       return;
    }
    public final RequestTiming n0(){
       RequestTiming cOLD_START;
       if (this.r != null) {
          this.r = false;
          cOLD_START = RequestTiming.COLD_START;
       }else {
          cOLD_START = RequestTiming.ON_FOREGROUND;
       }
       return cOLD_START;
    }
}
