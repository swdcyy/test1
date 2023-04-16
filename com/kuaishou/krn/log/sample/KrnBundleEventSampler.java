package com.kuaishou.krn.log.sample.KrnBundleEventSampler;
import dk0.b;
import com.kuaishou.krn.log.sample.KrnBundleEventSampler$mLogConfigList$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.krn.log.sample.KrnBundleEventSampler$a;
import java.lang.Double;
import java.lang.Math;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import com.kuaishou.krn.experiment.ExpConfigKt;
import fk0.j;
import java.lang.Integer;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class KrnBundleEventSampler implements b	// class@0008f4
{
    public static final p a;
    public static final KrnBundleEventSampler b;

    static {
       KrnBundleEventSampler.b = new KrnBundleEventSampler();
       KrnBundleEventSampler.a = s.c(KrnBundleEventSampler$mLogConfigList$2.INSTANCE);
    }
    public void KrnBundleEventSampler(){
       super();
    }
    public boolean a(String p0,Object p1){
       List obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnBundleEventSampler.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "key");
       a.p(p1, "value");
       obj = this.c();
       boolean b = false;
       if (!obj instanceof Collection || !obj.isEmpty()) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             if (KrnBundleEventSampler.b.d(iterator.next(), p0, p1)) {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public boolean b(String p0,Object p1){
       Object obj1;
       boolean b;
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnBundleEventSampler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "key");
       a.p(p1, "value");
       obj = this.c().iterator();
       while (true) {
          if (obj.hasNext()) {
             obj1 = obj.next();
             if (!KrnBundleEventSampler.b.d(obj1, p0, p1)) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          b = true;
          if (obj1 == null) {
             return b;
          }else {
             KrnBundleEventSampler$a sampleRatio = obj1.sampleRatio;
             a.m(sampleRatio);
             double d = sampleRatio.doubleValue();
             if (d <= 0) {
                return false;
             }else if(d - 0x3ff0000000000000 >= 0){
                return b;
             }else if(Double.compare(Math.random(), d) <= 0){
                b = false;
             }
             int i = (!p1 instanceof KrnLogCommonParams)? 0: p1;
             if (i) {
                i.sampleRatio = Double.valueOf(d);
             }
             if (ExpConfigKt.s()) {
                if (!p1 instanceof j) {
                   p1 = null;
                }
                if (p1 != null) {
                   p1.sampleRatio = Double.valueOf(d);
                   break ;
                }
             }
             break ;
          }
       }
       return b;
    }
    public final List c(){
       Object obj = PatchProxy.apply(null, this, KrnBundleEventSampler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KrnBundleEventSampler.a.getValue();
    }
    public final boolean d(KrnBundleEventSampler$a p0,String p1,Object p2){
       Integer integer;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KrnBundleEventSampler.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       v1 = p2 instanceof KrnLogCommonParams;
       Object[] objArray = null;
       Object obj1 = (!obj)? objArray: p2;
       if (obj1) {
          integer = PatchProxy.apply(objArray, obj1, KrnLogCommonParams.class, "9");
          if (integer != patchProxyRe) {
          }else {
             integer = Integer.valueOf(obj1.mResult);
          }
       }else {
          integer = objArray;
       }
       if (integer != null && integer.intValue() != 1) {
          return false;
       }else {
          KrnBundleEventSampler$a integer1 = p0.customEventKeys;
          a.m(integer1);
          if (!integer1.contains("*") && !integer1.contains(p1)) {
             return false;
          }else {
             p0 = p0.bundleIds;
             a.m(p0);
             Object[] objArray1 = (!obj)? objArray: p2;
             objArray1 = (objArray1 != null)? objArray1.a(): objArray;
             if (ExpConfigKt.s() && objArray1 == null) {
                if (!p2 instanceof j) {
                   p2 = objArray;
                }
                if (p2 != null) {
                   objArray = p2.bundleId;
                }
                objArray1 = objArray;
             }
             if (!p0.contains("*") && !CollectionsKt___CollectionsKt.H1(p0, objArray1)) {
                return false;
             }else {
                return true;
             }
          }
       }
    }
}
