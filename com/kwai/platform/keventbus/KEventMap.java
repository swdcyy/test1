package com.kwai.platform.keventbus.KEventMap;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.platform.keventbus.KEventConfig;
import java.lang.reflect.Method;
import kotlin.jvm.internal.a;
import java.lang.ClassNotFoundException;

public final class KEventMap	// class@001289
{
    public static final HashMap a;
    public static final HashMap b;
    public static final KEventMap c;

    static {
       KEventMap kEventMap = new KEventMap();
       KEventMap.c = kEventMap;
       KEventMap.a = new HashMap();
       KEventMap.b = new HashMap();
       if (PatchProxy.applyVoid(null, kEventMap, KEventMap.class, "1")) {
       }else {
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          KEventConfig.class.getMethod("init", uClassArray).invoke(null, objArray);
       }
    }
    public void KEventMap(){
       super();
    }
    public final HashMap a(){
       return KEventMap.b;
    }
    public final void putEventType(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KEventMap.class, "3")) {
          return;
       }
       a.p(p0, "type");
       String str = "clsStr";
       try{
          a.p(p1, str);
          Class uClass = Class.forName(p1);
          KEventMap.a.put(p0, uClass);
          KEventMap.b.put(uClass, p0);
       }catch(java.lang.ClassNotFoundException e3){
          e3.printStackTrace();
       }
       return;
    }
}
