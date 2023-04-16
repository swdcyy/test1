package com.facebook.react.uimanager.k;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.m;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.Throwable;
import cb.a;
import com.facebook.react.uimanager.k$e;
import com.facebook.react.uimanager.k$b;
import com.facebook.react.uimanager.k$d;
import com.facebook.react.uimanager.k$a;

public class k	// class@001373
{
    public static final Map a;
    public static final Map b;

    static {
       k.a = new ConcurrentHashMap();
       k.b = new ConcurrentHashMap();
    }
    public void k(){
       super();
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, k.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, m.class, "1")) {
          m.a.clear();
          m.b.clear();
       }
       k.a.clear();
       k.b.clear();
       return;
    }
    public static Object b(Class p0){
       Object obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, k.class, "8");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = p0.getName();
       try{
          return Class.forName(obj1+"$$PropsSetter").newInstance();
       }catch(java.lang.ClassNotFoundException e0){
          a.x("ViewManagerPropertyUpdater", "Could not find generated setter for "+p0);
          return obj;
       }catch(java.lang.InstantiationException e4){
       }catch(java.lang.IllegalAccessException e4){
       }
       throw new RuntimeException("Unable to instantiate methods getter for "+obj1, e4);
    }
    public static k$e c(Class p0){
       Map obj = PatchProxy.applyOneRefs(p0, null, k.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = k.a;
       k$e uoe = obj.get(p0);
       if (uoe == null) {
          uoe = k.b(p0);
          if (uoe == null) {
             uoe = new k$b(p0);
          }
          obj.put(p0, uoe);
       }
       return uoe;
    }
    public static k$d d(Class p0){
       Map obj = PatchProxy.applyOneRefs(p0, null, k.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = k.b;
       k$d uod = obj.get(p0);
       if (uod == null) {
          uod = k.b(p0);
          if (uod == null) {
             uod = new k$a(p0);
          }
          obj.put(p0, uod);
       }
       return uod;
    }
}
