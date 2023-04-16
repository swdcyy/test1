package com.kuaishou.render.engine.tk.MerchantTkContainer;
import com.kuaishou.tachikoma.api.container.TKContainer;
import android.app.Activity;
import android.view.ViewGroup;
import java.lang.String;
import bx4.h;
import com.yxcorp.utility.SystemUtil;
import zu4.a;
import android.content.Context;
import zw4.a;
import ww4.b;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.render.engine.communication.event.SPBEventCenter;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import lu4.a;
import lu4.d;
import nu4.e;
import nu4.b;
import nu4.h;

public class MerchantTkContainer extends TKContainer	// class@000ef1
{
    public String U;
    public String V;

    public void MerchantTkContainer(Activity p0,ViewGroup p1,String p2,String p3,h p4){
       super(p0, p1, p2, p3, p4);
       p4.m(p3);
       p4.r("0.8.81");
       if (SystemUtil.I()) {
          this.g0(new a(p0.getApplicationContext()));
       }
       return;
    }
    public boolean W(){
       return false;
    }
    public b b0(long p0,b p1){
       return null;
    }
    public void onDestroy(){
       Iterator iterator;
       Map$Entry obj;
       if (PatchProxy.applyVoid(null, this, MerchantTkContainer.class, "3")) {
          return;
       }
       SPBEventCenter sPBEventCent = SPBEventCenter.d();
       Objects.requireNonNull(sPBEventCent);
       String str = "container";
       if (!PatchProxy.applyVoidOneRefs(this, sPBEventCent, SPBEventCenter.class, "11")) {
          a.p(this, str);
          LinkedHashMap linkedHashMa1 = new LinkedHashMap();
          iterator = sPBEventCent.a.entrySet().iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             a value1 = obj.getValue();
             Object obj1 = (value1 instanceof d && a.g(value1.h, this))? 1: null;
             if (obj1) {
                linkedHashMa1.put(obj.getKey(), obj.getValue());
             }
          }
          iterator = linkedHashMa1.entrySet().iterator();
          while (iterator.hasNext()) {
             sPBEventCent.a.remove(iterator.next().getKey());
          }
       }
       e uoe = e.c();
       Objects.requireNonNull(uoe);
       if (!PatchProxy.applyVoidOneRefs(this, uoe, e.class, "13")) {
          a.p(this, str);
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          iterator = uoe.a.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             b value = uEntry.getValue();
             obj = (value instanceof h && a.g(value.j, this))? 1: null;
             if (obj) {
                linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
             }
          }
          iterator = linkedHashMa.entrySet().iterator();
          while (iterator.hasNext()) {
             uoe.a.remove(iterator.next().getKey());
          }
       }
       if (!this.isDestroyed()) {
          super.onDestroy();
       }
       return;
    }
}
