package com.kuaishou.live.core.voiceparty.core.audience.aryalogic.DefaultSnowFactory$defaultSnowFactory$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.aryainstance.config.SnowConfig;
import jw4.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ap2.h;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import qs5.d;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import brd.t;
import com.kwai.plugin.dva.work.c;
import tr.d;
import jw4.e;

public final class DefaultSnowFactory$defaultSnowFactory$1 extends Lambda implements p	// class@0013b6
{
    public static final DefaultSnowFactory$defaultSnowFactory$1 INSTANCE;

    static {
       DefaultSnowFactory$defaultSnowFactory$1.INSTANCE = new DefaultSnowFactory$defaultSnowFactory$1();
    }
    public void DefaultSnowFactory$defaultSnowFactory$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final a invoke(String p0,SnowConfig p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h obj = PatchProxy.applyTwoRefs(p0, p1, this, DefaultSnowFactory$defaultSnowFactory$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "aryaSign");
       a.p(p1, "config");
       obj = h.a;
       Objects.requireNonNull(obj);
       Object[] objArray = null;
       Object obj1 = PatchProxy.apply(objArray, obj, h.class, "2");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(!LiveSnowManager.f() || !d.d("live_anchor_plugin")){
          b.B(LiveLogTag.LIVE_ARYA_SO_LOAD, "prepareForMicSeat failed snow not ready");
          b = false;
          LiveSnowManager.h(b, objArray);
          d.g("live_anchor_plugin", 30);
       }else {
          b = true;
       }
       if (b) {
          d uod = obj.a(p1);
          Object obj2 = PatchProxy.applyTwoRefs(p0, uod, objArray, LiveSnowManager.class, "2");
          if (obj2 != patchProxyRe) {
             objArray = obj2;
          }else if(!LiveSnowManager.e()){
             objArray = e.a(p0, uod);
          }
       }
       return objArray;
    }
}
