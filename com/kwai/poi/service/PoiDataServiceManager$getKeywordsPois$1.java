package com.kwai.poi.service.PoiDataServiceManager$getKeywordsPois$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import ee6.a;
import java.lang.Object;
import ie6.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.poi.manager.a;
import tkd.b;
import tkd.d;
import je6.a;
import brd.t;
import java.util.concurrent.TimeUnit;
import me6.b;
import me6.c;
import erd.g;
import crd.b;

public final class PoiDataServiceManager$getKeywordsPois$1 extends Lambda implements l	// class@0013b1
{
    public final a $resultCallback;

    public void PoiDataServiceManager$getKeywordsPois$1(a p0){
       this.$resultCallback = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, PoiDataServiceManager$getKeywordsPois$1.class, "1")) {
          return;
       }
       a.p(p0, "requestConfig");
       PoiDataServiceManager$getKeywordsPois$1 t$resultCall = this.$resultCallback;
       if (!PatchProxy.applyVoidTwoRefs(p0, t$resultCall, null, a.class, "5")) {
          a.p(p0, "queryConfig");
          a.p(t$resultCall, "resultCallback");
          a = a.a;
          if (a.c()) {
             d.a(0x42537b97).Zn(p0, t$resultCall);
          }else {
             a.d().timeout(800, TimeUnit.MILLISECONDS).subscribe(new b(p0, t$resultCall), new c(p0, t$resultCall));
          }
       }
       return;
    }
}
