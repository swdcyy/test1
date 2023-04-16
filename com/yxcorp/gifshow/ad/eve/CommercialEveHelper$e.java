package com.yxcorp.gifshow.ad.eve.CommercialEveHelper$e;
import erd.o;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import q29.a;
import java.lang.Enum;
import java.lang.IllegalStateException;

public final class CommercialEveHelper$e implements o	// class@001766
{
    public final RequestTiming b;

    public void CommercialEveHelper$e(RequestTiming p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, CommercialEveHelper$e.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "successLoaded");
          if (p0.booleanValue()) {
             int i = a.a[this.b.ordinal()];
             int i1 = 2;
             if (i != 1) {
                if (i != i1) {
                   i1 = -1;
                }
             }else {
                i1 = 0;
             }
             integer = Integer.valueOf(i1);
          }else {
             throw new IllegalStateException("invokerColdAndWarmLaunched AdLaunchPredict plugin loaded failed".toString());
          }
       }
       return integer;
    }
}
