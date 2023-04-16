package com.yxcorp.gifshow.tti.module.UploadContactsServiceInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.tti.module.k;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.tti.module.l;

public class UploadContactsServiceInitModule extends TTIInitModule	// class@001dd2
{
    public static final int q;

    public void UploadContactsServiceInitModule(){
       super();
    }
    public int f0(){
       return 13;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UploadContactsServiceInitModule.class, "1")) {
          return;
       }
       e.g(k.b, "LoadContactsFromDiskInitModule");
       if (!QCurrentUser.ME.isLogined()) {
          return;
       }
       e.g(l.b, "UploadContactsServiceInitModule");
       return;
    }
}
