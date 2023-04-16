package com.yxcorp.gifshow.detail.playtime.DetailPlayTimeInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import java.util.List;
import com.kwai.framework.init.CoreInitModule;
import com.kwai.framework.download.DownloadManagerInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import t3a.b;
import erd.g;
import crd.b;

public class DetailPlayTimeInitModule extends TTIInitModule	// class@001657
{
    public static final int q;

    public void DetailPlayTimeInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       Object obj = PatchProxy.apply(null, this, DetailPlayTimeInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, DetailPlayTimeInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class,DownloadManagerInitModule.class};
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailPlayTimeInitModule.class, "1")) {
          return;
       }
       RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new b(this));
       return;
    }
}
