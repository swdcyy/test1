package com.yxcorp.gifshow.init.module.RobustInitModule2$PatchEventReporter;
import pm7.c;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.RobustInitModule2$1;
import rm7.a;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Throwable;
import org.json.JSONObject;
import pxa.e;
import com.yxcorp.gifshow.init.module.RobustInitModule2$RobustLogger;
import q87.c;
import rm7.k;
import com.kwai.dva.dex2oat.Dex2OatManager;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bj5.a;
import bj5.a$b;
import k2b.u1;
import com.yxcorp.gifshow.init.module.RobustInitModule2;

public class RobustInitModule2$PatchEventReporter implements c	// class@0011cf
{

    public void RobustInitModule2$PatchEventReporter(){
       super();
    }
    public void RobustInitModule2$PatchEventReporter(RobustInitModule2$1 p0){
       super();
    }
    public void onEvent(a p0,String p1,Object[] p2){
       int i;
       String str;
       HashMap hashMap = new HashMap();
       hashMap.put("robustId", p1);
       hashMap.put("ReportValue", p0.i());
       try{
          i = 0;
          str = new Gson().q(hashMap);
       }catch(java.lang.Exception e0){
          HashMap hashMap1 = new HashMap();
          Iterator iterator = str.entrySet().iterator();
       label_002c :
          if (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry.getValue() instanceof Throwable) {
                hashMap1.put(uEntry.getKey(), uEntry.getValue().toString());
                goto label_002c ;
             }else {
                hashMap1.put(uEntry.getKey(), uEntry.getValue());
                goto label_002c ;
             }
          }else {
             str = new JSONObject(hashMap1).toString();
             Object[] objArray = new Object[2];
             objArray[i] = p0.b();
             objArray[1] = str;
             e.C().e(RobustInitModule2$RobustLogger.j("PatchEventReporter"), String.format("onEvent exception:%s,realValue=%s", objArray), e0);
          }
       }
       if (p0 instanceof k) {
          Dex2OatManager a = Dex2OatManager.a;
          Objects.requireNonNull(a);
          Object obj = PatchProxy.apply(null, a, Dex2OatManager.class, "11");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.c().c();
          if (b) {
             Object[] objArray1 = new Object[i];
             e.C().w("RobustInitModule2", "dex2oat has been disabled, will restore.", objArray1);
             a.e();
             u1.R("dva_clashed_with_robust", "{}", i);
          }
       }
       RobustInitModule2.onEvent(p0.b(), str);
       return;
    }
}
