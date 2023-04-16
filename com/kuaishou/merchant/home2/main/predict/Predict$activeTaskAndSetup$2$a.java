package com.kuaishou.merchant.home2.main.predict.Predict$activeTaskAndSetup$2$a;
import erd.g;
import java.lang.Object;
import sm7.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a04.j;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ml5.a;
import java.util.Map;
import a04.a;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import a04.l;
import ot3.u0;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import java.util.Set;
import java.util.Iterator;
import com.google.gson.JsonElement;
import sm7.p;
import sm7.m;

public final class Predict$activeTaskAndSetup$2$a implements g	// class@001815
{
    public static final Predict$activeTaskAndSetup$2$a b;

    static {
       Predict$activeTaskAndSetup$2$a.b = new Predict$activeTaskAndSetup$2$a();
    }
    public void Predict$activeTaskAndSetup$2$a(){
       super();
    }
    public void accept(Object p0){
       boolean b;
       Map map;
       a uoa1;
       Map map1;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, Predict$activeTaskAndSetup$2$a.class, str)) {
       }else {
          j k = j.k;
          Objects.requireNonNull(k);
          j oj = j.class;
          if (!PatchProxy.applyVoidOneRefs(p0, k, oj, "6")) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             JsonObject obj = PatchProxy.applyOneRefs(p0, k, oj, "11");
             String str1 = "Result";
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(p0 != null){
                uoa1 = p0.f();
                if (uoa1 != null) {
                   map1 = uoa1.d();
                   if (map1 != null) {
                   label_0062 :
                      b = a.g(map1.get(str1), str);
                   }
                }
             }
             uoa1 = a.d;
             Objects.requireNonNull(uoa1);
             map1 = PatchProxy.apply(null, uoa1, a.class, str);
             if (map1 != patchProxyRe) {
                goto label_0062 ;
             }else {
                Pair[] pairArray = new Pair[]{r0.a(str1, "0")};
                map1 = t0.j0(pairArray);
                goto label_0062 ;
             }
             j.e = b;
             j.c.onNext(Boolean.valueOf(b));
             l i = l.i;
             Objects.requireNonNull(i);
             l ol = l.class;
             if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), p0, i, ol, "4")) {
                l.d = u0.b();
                l.f = b;
                obj = new JsonObject();
                l.h = obj;
                obj.a0(str1, Integer.valueOf(l.f));
                obj = new JsonObject();
                a uoa = p0.f();
                if (uoa != null) {
                   map = uoa.d();
                   if (map != null) {
                   label_00c0 :
                      Iterator iterator = map.keySet().iterator();
                      while (iterator.hasNext()) {
                         str1 = iterator.next();
                         obj.c0(str1, map.get(str1));
                      }
                      l.h.G("ModelInfo", obj);
                      obj = new JsonObject();
                      p0 = p0.c();
                      if (p0 != null) {
                         p0 = p0.a();
                         if (p0 != null) {
                         label_00fb :
                            Iterator iterator1 = p0.keySet().iterator();
                            while (iterator1.hasNext()) {
                               String str2 = iterator1.next();
                               m om = p0.get(str2);
                               str1 = (om != null)? om.a(): null;
                               obj.c0(str2, str1);
                            }
                            l.h.G("PackageInfo", obj);
                         }
                      }
                      p0 = t0.z();
                      goto label_00fb ;
                   }
                }
                map = t0.z();
                goto label_00c0 ;
             }
          }
       }
       return;
    }
}
