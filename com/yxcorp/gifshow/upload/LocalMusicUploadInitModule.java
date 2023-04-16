package com.yxcorp.gifshow.upload.LocalMusicUploadInitModule;
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
import android.app.Activity;
import com.yxcorp.gifshow.upload.a0;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import org.greenrobot.eventbus.a;
import b76.a;
import eda.l;
import dnc.s0;
import erd.g;
import crd.b;
import eoc.f;
import eda.n;
import dnc.t0;
import com.yxcorp.gifshow.upload.z;
import com.kwai.framework.init.e;

public class LocalMusicUploadInitModule extends TTIInitModule	// class@001e44
{
    public b q;
    public b r;
    public static final int s;

    public void LocalMusicUploadInitModule(){
       super();
    }
    public int f0(){
       return 12;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, LocalMusicUploadInitModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalMusicUploadInitModule.class, "3")) {
          return;
       }
       c.b(a0.b);
       a.d().t(this);
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalMusicUploadInitModule.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, LocalMusicUploadInitModule.class, "1")) {
          if (this.q == null) {
             this.q = f.a(l.class, new s0(this));
          }
          if (this.r == null) {
             this.r = f.a(n.class, new t0(this));
          }
       }
       e.g(z.b, "LocalMusicUploadInitModule");
       return;
    }
}
