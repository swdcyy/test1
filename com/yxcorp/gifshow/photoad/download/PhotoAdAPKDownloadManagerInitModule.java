package com.yxcorp.gifshow.photoad.download.PhotoAdAPKDownloadManagerInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import o56.d;
import com.yxcorp.gifshow.photoad.download.b;
import java.lang.Runnable;
import com.kwai.framework.init.c;

public class PhotoAdAPKDownloadManagerInitModule extends TTIInitModule	// class@000f76
{
    public static final int q;

    public void PhotoAdAPKDownloadManagerInitModule(){
       super();
    }
    public int f0(){
       return 6;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, PhotoAdAPKDownloadManagerInitModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdAPKDownloadManagerInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, PhotoAdAPKDownloadManagerInitModule.class, "2") && d.i) {
          c.b(new b(this));
       }
       return;
    }
}
