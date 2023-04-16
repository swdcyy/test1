package com.facebook.react.uimanager.i;
import java.lang.Object;
import java.util.List;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ze.v0;
import java.util.Iterator;
import com.facebook.react.uimanager.ViewManager;
import hg.b$b;
import hg.b;
import java.lang.Boolean;
import java.util.HashMap;
import vd.d;
import java.lang.StringBuilder;
import hg.a;
import java.util.Set;

public class i	// class@001350
{

    public void i(){
       super();
    }
    public static Map a(List p0,Map p1,Map p2){
       Map obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = obj.b();
       Map map = obj.a();
       Map map1 = obj.c();
       if (p1 != null) {
          p1.putAll(map);
       }
       if (p2 != null) {
          p2.putAll(map1);
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ViewManager viewManager = iterator.next();
          String name = viewManager.getName();
          b.a(0, "UIManagerModuleConstantsHelper.createConstants").d("ViewManager", name).d("Lazy", Boolean.FALSE).e();
          Map map2 = i.b(viewManager, null, null, p1, p2);
          if (!map2.isEmpty()) {
             obj.put(name, map2);
          }
          b.b(0, "UIManagerModuleConstantsHelper.createConstants");
       }
       obj.put("genericBubblingEventTypes", map);
       obj.put("genericDirectEventTypes", map1);
       return obj;
    }
    public static Map b(ViewManager p0,Map p1,Map p2,Map p3,Map p4){
       Object[] objArray;
       i oi = i.class;
       object oobject = null;
       if (PatchProxy.isSupport(oi)) {
          objArray = new Object[]{p0,oobject,oobject,p3,p4};
          oi = PatchProxy.apply(objArray, oobject, oi, "4");
          if (oi != PatchProxyResult.class) {
             return oi;
          }
       }
       HashMap hashMap = d.b();
       objArray = p0.getExportedCustomBubblingEventTypeConstants();
       if (objArray != null) {
          i.c(p3, objArray);
          i.c(objArray, oobject);
          hashMap.put("bubblingEventTypes", objArray);
       }
       objArray = p0.getExportedCustomDirectEventTypeConstants();
       if (objArray != null) {
          i.c(p4, objArray);
          i.c(objArray, oobject);
          hashMap.put("directEventTypes", objArray);
       }
       objArray = p0.getExportedViewConstants();
       if (objArray != null) {
          hashMap.put("Constants", objArray);
       }
       objArray = p0.getCommandsMap();
       if (objArray != null) {
          hashMap.put("Commands", objArray);
       }
       a.a(0, "getNativeProps-"+p0.getName());
       objArray = p0.getNativeProps();
       if (!objArray.isEmpty()) {
          hashMap.put("NativeProps", objArray);
       }
       a.c(0, "getNativeProps-"+p0.getName());
       return hashMap;
    }
    public static void c(Map p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, "5")) {
          return;
       }
       if (p0 == null || (p1 != null && !p1.isEmpty())) {
          Iterator iterator = p1.keySet().iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             Object obj1 = p1.get(obj);
             Object obj2 = p0.get(obj);
             if (obj2 != null && (obj1 instanceof Map && obj2 instanceof Map)) {
                i.c(obj2, obj1);
             }else {
                p0.put(obj, obj1);
             }
          }
       }
       return;
    }
}
