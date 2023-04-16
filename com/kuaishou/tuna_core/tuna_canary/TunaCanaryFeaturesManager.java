package com.kuaishou.tuna_core.tuna_canary.TunaCanaryFeaturesManager;
import yx5.a;
import com.kuaishou.tuna_core.tuna_canary.TunaCanaryFeaturesManager$a;
import nsd.u;
import java.lang.Object;
import java.util.LinkedHashSet;
import com.kuaishou.tuna_core.tuna_canary.TunaCanaryFeaturesManager$mIsLowPhone$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_core.tuna_canary.TunaCanaryFeaturesManager$b;
import java.util.Set;
import com.kwai.feature.api.tuna.canary.TunaCanaryFeatureTag;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import fg6.a;
import com.kuaishou.tuna_core.tuna_canary.TunaCanaryFeaturesManager$c;
import com.google.gson.Gson;
import k2b.u1;
import com.google.gson.JsonArray;
import kotlin.Result;
import com.google.gson.JsonElement;
import java.lang.Throwable;
import qrd.j0;
import com.kwai.framework.exceptionhandler.ExceptionClues;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.tuna_canary.TunaCanaryFeaturesManager$updateExceptionsClues$1;
import c15.b;

public class TunaCanaryFeaturesManager implements a	// class@00112a
{
    public final Set a;
    public final p b;
    public static final TunaCanaryFeaturesManager$a c;

    static {
       TunaCanaryFeaturesManager.c = new TunaCanaryFeaturesManager$a(null);
    }
    public void TunaCanaryFeaturesManager(){
       super();
       this.a = new LinkedHashSet();
       this.b = s.c(TunaCanaryFeaturesManager$mIsLowPhone$2.INSTANCE);
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TunaCanaryFeaturesManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "featureID");
       boolean b = (this.a.remove(new TunaCanaryFeaturesManager$b(p0)))? this.i(): false;
       return b;
    }
    public boolean b(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TunaCanaryFeaturesManager tunaCanaryFe = TunaCanaryFeaturesManager.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, tunaCanaryFe, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "featureID");
       Object obj1 = PatchProxy.applyTwoRefs(p0, null, this, tunaCanaryFe, "3");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "featureID");
          b = (this.a.add(new TunaCanaryFeaturesManager$b(p0, null)))? this.i(): false;
       }
       return b;
    }
    public boolean c(Collection p0,TunaCanaryFeatureTag p1){
       TunaCanaryFeaturesManager obj = PatchProxy.applyTwoRefs(p0, p1, this, TunaCanaryFeaturesManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "featureIDs");
       obj = this.a;
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(new TunaCanaryFeaturesManager$b(iterator.next(), p1));
       }
       boolean b = (obj.addAll(uArrayList))? this.i(): false;
       return b;
    }
    public boolean d(TunaCanaryFeatureTag p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, TunaCanaryFeaturesManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "tag");
       obj = this.a.iterator();
       boolean b = false;
       int i = 0;
       while (obj.hasNext()) {
          boolean b1 = (obj.next().a == p0)? true: false;
          if (b1) {
             obj.remove();
             i = 1;
          }
       }
       if (i) {
          b = this.i();
       }
       return b;
    }
    public boolean e(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TunaCanaryFeaturesManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "featureIDs");
       return this.c(p0, null);
    }
    public void f(String p0){
       TunaCanaryFeaturesManager tunaCanaryFe = TunaCanaryFeaturesManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tunaCanaryFe, "9")) {
          return;
       }
       if (p0 != null) {
          Gson a = a.a;
          Boolean uBoolean = PatchProxy.apply(null, this, tunaCanaryFe, "1");
          if (uBoolean == PatchProxyResult.class) {
             uBoolean = this.b.getValue();
          }
          u1.R("CANARY_FEATURE_SHOWN", a.q(new TunaCanaryFeaturesManager$c(p0, uBoolean.booleanValue())), 10);
       }
       return;
    }
    public boolean g(Collection p0){
       TunaCanaryFeaturesManager obj = PatchProxy.applyOneRefs(p0, this, TunaCanaryFeaturesManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "featureIDs");
       obj = this.a;
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(new TunaCanaryFeaturesManager$b(iterator.next()));
       }
       boolean b = (obj.removeAll(uArrayList))? this.i(): false;
       return b;
    }
    public boolean h(String p0,TunaCanaryFeatureTag p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TunaCanaryFeaturesManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "featureID");
       boolean b = (this.a.add(new TunaCanaryFeaturesManager$b(p0, p1)))? this.i(): false;
       return b;
    }
    public final boolean i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TunaCanaryFeaturesManager tunaCanaryFe = TunaCanaryFeaturesManager.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, tunaCanaryFe, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object[] objArray1 = PatchProxy.apply(objArray, this, tunaCanaryFe, "11");
       if (objArray1 != patchProxyRe) {
       }else {
          JsonElement jsonElement = new Gson().x(this.a);
          a.o(jsonElement, "Gson\(\).toJsonTree\(mFeaturesSet\)");
          Object obj1 = Result.constructor-impl(jsonElement.q());
          if (!Result.isFailure-impl(obj1)) {
             objArray = obj1;
          }
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          String str = "canaryFeatures";
          if (!objArray1.size()) {
             ExceptionClues.c.b(str);
          }else {
             ExceptionClues.c.c(str, objArray1);
          }
          b.b(KsLogTunaCoreTag.TUNA_CANARY.appendTag("TunaCanaryFeaturesManager"), new TunaCanaryFeaturesManager$updateExceptionsClues$1(objArray1));
          return true;
       }else {
          return false;
       }
    }
}
