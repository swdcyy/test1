package com.kwai.feature.platform.misc.albumcontrol.AlbumControlInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.platform.misc.priavykit.PrivacyKitInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.albumcontrol.a;
import m06.a;
import java.util.Objects;
import kotlin.jvm.internal.a;

public class AlbumControlInitModule extends TTIInitModule	// class@000afb
{

    public void AlbumControlInitModule(){
       super();
    }
    public int f0(){
       return 21;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, AlbumControlInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{PrivacyKitInitModule.class};
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumControlInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, AlbumControlInitModule.class, "3")) {
          Log.g("AlbumControlInitModule", "AlbumControlInitModule, init...");
          p0 = a.b;
          a uoa = new a(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uoa, p0, a.class, "2")) {
             a.q(uoa, "access");
             a.a = uoa;
          }
       }
       return;
    }
}
