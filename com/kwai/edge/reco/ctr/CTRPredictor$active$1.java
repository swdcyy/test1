package com.kwai.edge.reco.ctr.CTRPredictor$active$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.edge.reco.ctr.CTRPredictor;
import java.lang.CharSequence;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import com.kwai.edge.reco.ctr.config.CTRPredictConfig;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import android.os.SystemClock;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Map;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import qj5.d;
import nsd.u;
import java.util.List;
import qrd.l1;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import fg6.a;
import com.google.gson.Gson;
import oe6.g;

public final class CTRPredictor$active$1 extends Lambda implements l	// class@000d30
{
    public static final CTRPredictor$active$1 INSTANCE;

    static {
       CTRPredictor$active$1.INSTANCE = new CTRPredictor$active$1();
    }
    public void CTRPredictor$active$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(String p0){
       String str;
       String obj = PatchProxy.applyOneRefs(p0, this, CTRPredictor$active$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pipeline");
       CTRPredictor v = CTRPredictor.v;
       obj = CTRPredictor.b(v);
       CtrPredictionRuntimeConfig uCtrPredicti = (obj == null || !obj.length())? 1: null;
       if (!uCtrPredicti && v.l().d().disableCancelIfLastInferenceRuning == null) {
          str = CTRPredictor.b(v);
          a.m(str);
          EveManagerWrapper.e.e("PageCtrPrediction", str);
          CTRPredictor.j(v, null);
       }
       CTRPredictor.j(v, String.valueOf(SystemClock.elapsedRealtime()));
       CTRPredictor.p = CTRPredictor.b(v);
       Log.g("CTRPredictor", "current inferId is "+CTRPredictor.b(v));
       str = CTRPredictor.b(v);
       a.m(str);
       CTRPredictor.f(v).put(str, new ArrayList());
       str = CTRPredictor.b(v);
       a.m(str);
       CTRPredictor.e(v).put(str, new ArrayList());
       Map map = CTRPredictor.i(v);
       str = CTRPredictor.b(v);
       a.m(str);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = CTRPredictor.a(v).iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          a.o(obj1, "it");
          d uod = new d(obj1, 0, 0, 6, null);
          uArrayList.add(v3);
       }
       map.put(str, uArrayList);
       v = CTRPredictor.v;
       if (v.l().d().d()) {
          g.a(CTRPredictor.g(v).edit().putString("resultPageInfo", a.a.q(CTRPredictor.i(v).get(CTRPredictor.d(v)))));
       }
       v = CTRPredictor.b(v);
       a.m(v);
       return v;
    }
}
