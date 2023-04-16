package com.yxcorp.gifshow.tti.module.RefreshLiveAuthStatus;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.tti.module.i;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class RefreshLiveAuthStatus extends TTIInitModule	// class@001dc6
{
    public static final int q;

    public void RefreshLiveAuthStatus(){
       super();
    }
    public int f0(){
       return 3;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RefreshLiveAuthStatus.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, RefreshLiveAuthStatus.class, "2")) {
          e.g(i.b, "RefreshLiveAuthStatus");
       }
       return;
    }
}
