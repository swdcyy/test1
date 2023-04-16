package com.kwai.framework.network.keyconfig.KeyConfigInitModule;
import com.kwai.framework.init.a;
import com.kwai.framework.network.keyconfig.KeyConfigInitModule$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import java.util.List;
import com.kwai.framework.network.RetrofitInitModule;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.kwai.framework.network.keyconfig.KeyConfigInitModule$d;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.kwai.framework.network.keyconfig.KeyConfigInitModule$b;
import erd.g;
import crd.b;
import eda.l;
import com.kwai.framework.network.keyconfig.KeyConfigInitModule$execute$2;
import ob6.n;
import msd.l;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.kwai.framework.network.keyconfig.KeyConfigInitModule$c;
import t45.c;

public final class KeyConfigInitModule extends a	// class@0017de
{
    public boolean q;
    public static final KeyConfigInitModule$a r;

    static {
       KeyConfigInitModule.r = new KeyConfigInitModule$a(null);
    }
    public void KeyConfigInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       Object obj = PatchProxy.apply(null, this, KeyConfigInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 21;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, KeyConfigInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{RetrofitInitModule.class};
       return CollectionsKt__CollectionsKt.P(obj);
    }
    public final void l0(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KeyConfigInitModule.class, "6")) {
          return;
       }
       c.b(new KeyConfigInitModule$d(p0));
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, KeyConfigInitModule.class, "1")) {
          return;
       }
       if (this.q != null) {
          return;
       }
       this.q = true;
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f.g(n.class, mAIN).subscribe(new KeyConfigInitModule$b(this));
       t ot = f.g(l.class, mAIN);
       ot.subscribe(new n(new KeyConfigInitModule$execute$2(this)));
       if (!SystemUtil.L(a.b())) {
          return;
       }
       c.a(KeyConfigInitModule$c.b);
       return;
    }
    public int priority(){
       return 0;
    }
}
