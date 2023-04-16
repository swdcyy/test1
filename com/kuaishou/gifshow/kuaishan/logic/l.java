package com.kuaishou.gifshow.kuaishan.logic.l;
import erd.g;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.encode.RxExportApi;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.util.Iterator;
import pca.h2;
import java.lang.Long;
import gq.a;
import java.lang.StringBuilder;
import q87.c;

public final class l implements g	// class@001a5c
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, RxExportApi.class, "1")) {
       }else {
          HashMap hashMap = new HashMap();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             h2 oh2 = iterator.next();
             String str = oh2.a();
             Long longx = hashMap.get(str);
             long l = oh2.b();
             if (longx == null || l - longx.longValue() > 0) {
                hashMap.put(str, Long.valueOf(l));
             }
          }
          p0 = p0.iterator();
          while (p0.hasNext()) {
             h2 oh21 = p0.next();
             Long longx1 = hashMap.get(oh21.a());
             if (longx1 != null) {
                Object[] objArray = new Object[0];
                a.D().w("RxExportApi", "buildTasks: set max duration="+longx1+" for="+oh21.a, objArray);
                oh21.i = longx1.longValue();
             }
          }
       }
       return;
    }
}
