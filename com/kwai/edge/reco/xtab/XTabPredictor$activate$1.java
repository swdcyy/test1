package com.kwai.edge.reco.xtab.XTabPredictor$activate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import wj5.c;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import android.os.SystemClock;

public final class XTabPredictor$activate$1 extends Lambda implements l	// class@000d5a
{
    public static final XTabPredictor$activate$1 INSTANCE;

    static {
       XTabPredictor$activate$1.INSTANCE = new XTabPredictor$activate$1();
    }
    public void XTabPredictor$activate$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(String p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, XTabPredictor$activate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pipeline");
       c o = c.o;
       obj = c.b(o);
       obj = (obj == null || !obj.length())? 1: null;
       if (!obj) {
          Log.g("XTabPredictor", "cancel last infer: "+c.b(o));
          String str = c.b(o);
          a.m(str);
          EveManagerWrapper.e.e("XTabEveTask", str);
          c.d(o, null);
       }
       c.d(o, String.valueOf(SystemClock.elapsedRealtime()));
       Log.g("XTabPredictor", "current inferId is "+c.b(o));
       o = c.b(o);
       a.m(o);
       return o;
    }
}
