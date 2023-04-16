package com.yxcorp.gifshow.detail.init.PlayProgressInitModule;
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
import wkd.b;
import tkd.b;
import tkd.d;
import g1a.a;

public class PlayProgressInitModule extends TTIInitModule	// class@001571
{

    public void PlayProgressInitModule(){
       super();
    }
    public int f0(){
       return 28;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, PlayProgressInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayProgressInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, PlayProgressInitModule.class, "2") && (d.i && !d.d)) {
          b.a(-1917741477);
       }
    label_0027 :
       d.a(-647739804).VC();
       return;
    }
}
