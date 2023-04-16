package com.yxcorp.gifshow.camerasdk.CameraSdkInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camerasdk.k;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class CameraSdkInitModule extends TTIInitModule	// class@001000
{
    public static final int q;

    public void CameraSdkInitModule(){
       super();
    }
    public int f0(){
       return 2;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraSdkInitModule.class, "1")) {
          return;
       }
       e.g(k.b, "CameraSdkInit");
       return;
    }
}
