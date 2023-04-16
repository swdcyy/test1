package com.kuaishou.krn.bridges.yoda.KrnYodaModule;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.krn.bridges.yoda.a;
import java.lang.String;
import com.kuaishou.krn.bridges.yoda.IFunction;
import com.kuaishou.krn.bridges.yoda.CanIUseFunction;
import com.facebook.react.bridge.Callback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Long;
import java.lang.Exception;
import java.util.Map;
import android.os.SystemClock;

public class KrnYodaModule extends KrnBridge	// class@000839
{
    public final Map mCustomFunctionMap;
    public final Map mSystemFunctionMap;

    public void KrnYodaModule(ReactApplicationContext p0){
       super(p0);
       this.mSystemFunctionMap = new ConcurrentHashMap();
       this.mCustomFunctionMap = new ConcurrentHashMap();
       this.registerSystemFunction("tool", "setClientLog", new a());
       this.registerSystemFunction("tool", "canIUse", new CanIUseFunction(this));
    }
    public final void functionExecute(IFunction p0,long p1,String p2,String p3,String p4,Callback p5){
       KrnYodaModule krnYodaModul = KrnYodaModule.class;
       if (PatchProxy.isSupport(krnYodaModul)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, krnYodaModul, "2")) {
             return;
          }
       }
       if (p0 != null) {
          try{
             p0.c(p1);
             p0.a(p2, p3, p4, p5);
          }catch(com.kuaishou.krn.bridges.yoda.IFunction$IllegalCallException e5){
             IFunction.b(p5, 0x1e855, e5.toString());
          }catch(java.lang.Exception e5){
             IFunction.b(p5, 0x1e84a, e5.toString());
          }
       }else {
          IFunction.b(p5, 0x1e84c, "function not exist");
       }
    }
    public String getName(){
       return "yoda";
    }
    public Map getSystemFunctionMap(){
       return this.mSystemFunctionMap;
    }
    public void invoke(String p0,String p1,String p2,Callback p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KrnYodaModule.class, "1")) {
          return;
       }
       long l = SystemClock.elapsedRealtime();
       Map map = this.mSystemFunctionMap.get(p0);
       int i = 0;
       IFunction iFunction = (map != null)? map.get(p1): i;
       map = this.mCustomFunctionMap.get(p0);
       IFunction iFunction1 = (map != null)? map.get(p1): i;
       if (iFunction == null && iFunction1 == null) {
          this.functionExecute(null, l, p0, p1, p2, p3);
       }else if(iFunction != null){
          this.functionExecute(iFunction, l, p0, p1, p2, p3);
       }else {
          this.functionExecute(iFunction1, l, p0, p1, p2, p3);
       }
       return;
    }
    public final void registerSystemFunction(String p0,String p1,IFunction p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KrnYodaModule.class, "3")) {
          return;
       }
       KrnYodaModule tmSystemFunc = this.mSystemFunctionMap;
       if (tmSystemFunc != null) {
          Map map = tmSystemFunc.get(p0);
          if (map == null) {
             map = new ConcurrentHashMap();
          }
          map.put(p1, p2);
          this.mSystemFunctionMap.put(p0, map);
       }
       return;
    }
}
