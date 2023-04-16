package com.yxcorp.gifshow.easteregg.manager.ConditionConfigManager;
import caa.g;
import java.lang.Object;
import android.content.Context;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qrd.l1;
import wkd.b;
import aaa.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.yxcorp.gifshow.easteregg.manager.ConditionConfigManager$a;
import erd.o;
import com.yxcorp.gifshow.easteregg.manager.ConditionConfigManager$prepare$2;
import caa.a;
import msd.l;
import erd.g;
import com.yxcorp.gifshow.easteregg.manager.ConditionConfigManager$b;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.easteregg.manager.ConditionConfigManager$c;

public final class ConditionConfigManager implements g	// class@001ad4
{
    public static Map a;
    public static final ConditionConfigManager b;

    static {
       ConditionConfigManager.b = new ConditionConfigManager();
    }
    public void ConditionConfigManager(){
       super();
    }
    public t a(Context p0){
       t ot;
       a uoa;
       ConditionConfigManager$prepare$2 obj = PatchProxy.applyOneRefs(p0, this, ConditionConfigManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "app");
       l1 ol1 = (ConditionConfigManager.a != null)? 1: null;
       if (ol1) {
          ot = t.just(l1.a);
          a.o(ot, "Observable.just\(Unit\)");
       }else {
          ot = b.a(-828662326).a(RequestTiming.DEFAULT).map(ConditionConfigManager$a.b);
          obj = ConditionConfigManager$prepare$2.INSTANCE;
          if (obj != null) {
             uoa = new a(obj);
          }
          ot = ot.doOnNext(uoa).map(ConditionConfigManager$b.b).subscribeOn(d.c).observeOn(d.a).doOnNext(ConditionConfigManager$c.b);
          a.o(ot, "Singleton.get\(EasterEggA¡­{ conditionConfigs = it }");
       }
       return ot;
    }
    public boolean isReady(){
       boolean b = (ConditionConfigManager.a != null)? true: false;
       return b;
    }
}
