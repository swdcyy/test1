package bz7.f$a;
import java.lang.Object;
import nsd.u;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.yoda.session.logger.HybridDataItem;
import bz7.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bz7.g;
import kotlin.jvm.internal.a;
import rz7.a;
import java.lang.Float;
import rz7.a$a;
import java.lang.Long;
import java.lang.System;
import rb7.c;
import bz7.e;
import rb7.a;
import hz7.b;
import hz7.c;
import hz7.a;
import cz7.a;

public final class f$a	// class@0003a9
{

    public void f$a(){
       super();
    }
    public void f$a(u p0){
       super();
    }
    public final void a(List p0){
       Iterator obj;
       g a;
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "5")) {
          return;
       }
       ArrayList uArrayList = (p0.isEmpty())? 1: null;
       if (uArrayList) {
          return;
       }else {
          uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          boolean b = false;
          while (iterator.hasNext()) {
             obj = iterator.next();
             d d = d.d;
             String key = obj.getKey();
             Objects.requireNonNull(d);
             List obj1 = PatchProxy.applyOneRefs(key, d, d.class, "2");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else if(key == null || !key.length()){
                d = 1;
             }else {
                d = null;
             }
             if (d) {
                b = false;
             }else {
                obj1 = d.b;
                if (obj1 != null) {
                   Iterator iterator1 = obj1.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         Object obj2 = iterator1.next();
                         if (a.g(obj2.eventKey, key)) {
                            b = obj2;
                         }
                      }
                      if (b != null) {
                         if (b.a == null) {
                            b.a = Boolean.valueOf(a.a.b(b.sampleRatio));
                         }
                         a = b.a;
                         if (a != null) {
                            b = a.booleanValue();
                         }
                      }
                   }
                }
             label_0099 :
                b = true;
             }
             if (b) {
                uArrayList.add(obj);
             }else {
                continue ;
             }
          }
          if (uArrayList.isEmpty()) {
             boolean b1 = b;
          }
          if (uArrayList) {
             ArrayList uArrayList1 = new ArrayList();
             obj = uArrayList.iterator();
             while (obj.hasNext()) {
                Object obj3 = obj.next();
                Object obj4 = (obj3.getEventClientTimeStamp() == null)? 1: null;
                if (obj4) {
                   uArrayList1.add(obj3);
                }
             }
             iterator = uArrayList1.iterator();
             while (iterator.hasNext()) {
                iterator.next().setEventClientTimeStamp(Long.valueOf(System.currentTimeMillis()));
             }
             c.c.e(new e(uArrayList));
          }
          return;
       }
    }
    public final void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       HybridDataItem hybridDataIt = new HybridDataItem();
       hybridDataIt.setKey("hy");
       c uoc = new c();
       uoc.size = p0.size;
       uoc.updateTime = Long.valueOf(p0.updateTime);
       uoc.startUpTime = Long.valueOf(p0.startupToUpdate);
       uoc.downloadCost = Long.valueOf(p0.costTime);
       hybridDataIt.setValue(uoc);
       a uoa = new a();
       uoa.hyId = p0.hyId;
       uoa.version = String.valueOf(p0.hyVersion);
       uoa.resultType = p0.resultType;
       uoa.loadType = String.valueOf(p0.loadType);
       uoa.isPatch = p0.isPatch;
       uoa.errorMessage = p0.message;
       hybridDataIt.setDimension(uoa);
       hybridDataIt.setEventClientTimeStamp(Long.valueOf(System.currentTimeMillis()));
       uArrayList.add(hybridDataIt);
       this.a(uArrayList);
       return;
    }
    public final void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "3")) {
          return;
       }
       HybridDataItem hybridDataIt = new HybridDataItem();
       hybridDataIt.setKey("webView_init_fail");
       a uoa = new a();
       uoa.msg = p0;
       uoa.errorTriggerType = p1;
       hybridDataIt.setDimension(uoa);
       if (!PatchProxy.applyVoidOneRefs(hybridDataIt, this, f$a.class, "4")) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(hybridDataIt);
          this.a(uArrayList);
       }
       return;
    }
}
