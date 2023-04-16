package com.yxcorp.gifshow.init.module.KcardInitModule;
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
import com.kwai.framework.model.user.QCurrentUser;
import o56.d;
import wkd.b;
import kka.h;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import sxa.o;
import erd.g;
import crd.b;

public class KcardInitModule extends TTIInitModule	// class@001987
{
    public static final int q;

    public void KcardInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 5;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, KcardInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(KcardInitModule.class, "4");
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KcardInitModule.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoidWithListener(null, this, KcardInitModule.class, "1")) {
          if (!QCurrentUser.ME.isLogined()) {
             PatchProxy.onMethodExit(KcardInitModule.class, "1");
          }else if(d.i){
             b.a(-1592356291).j(RequestTiming.COLD_START);
          }
          RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new o(this));
          PatchProxy.onMethodExit(KcardInitModule.class, "1");
       }
       PatchProxy.onMethodExit(KcardInitModule.class, "2");
       return;
    }
}
