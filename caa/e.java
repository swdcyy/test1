package caa.e;
import caa.h;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import daa.b;
import vfa.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import trd.c1;
import java.util.List;
import com.yxcorp.gifshow.easteregg.manager.BusinessConfigManager;
import java.util.Iterator;
import java.lang.Iterable;
import daa.e;
import java.util.Collection;
import daa.l;
import com.yxcorp.gifshow.easteregg.model.ConditionConfig;
import baa.c;
import java.lang.Integer;
import daa.g;
import caa.f;
import java.util.Objects;
import java.util.Map;
import baa.i;
import com.yxcorp.gifshow.easteregg.model.PokeGroup;
import baa.i$a;
import daa.j;
import com.yxcorp.gifshow.easteregg.core.FireworkScriptGroupConverter;
import com.yxcorp.gifshow.easteregg.manager.ConditionConfigManager;
import java.lang.Boolean;
import com.yxcorp.gifshow.easteregg.manager.EasterEggManager$prepare$1;
import com.yxcorp.gifshow.easteregg.manager.EasterEggManager$prepare$2;
import java.util.ArrayList;
import trd.u;
import caa.g;
import brd.t;
import t45.d;
import brd.z;
import caa.b;
import erd.g;
import caa.c;
import msd.a;
import caa.d;
import msd.l;
import crd.b;

public final class e	// class@00058d
{
    public static final Set a;
    public static boolean b;
    public static boolean c;
    public static final e d;

    static {
       e.d = new e();
       e.a = h.a;
    }
    public void e(){
       super();
    }
    public static final b a(Context p0,String p1,b p2){
       f obj3;
       int i;
       i$a a;
       f c;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       String str = "businessName";
       a.p(p1, str);
       a.p(p2, "condition");
       Set set = c1.f(p2);
       Object obj1 = PatchProxy.applyThreeRefs(p0, p1, set, null, e.class, "9");
       if (obj1 != PatchProxyResult.class) {
       }else {
          a.p(p0, "context");
          a.p(p1, str);
          str = "conditions";
          a.p(set, str);
          List list = BusinessConfigManager.a(p1);
          obj1 = null;
          if (list != null) {
             Object obj2 = PatchProxy.applyThreeRefs(p0, set, list, null, e.class, "8");
             if (obj2 != PatchProxyResult.class) {
                obj1 = obj2;
             }else {
                a.p(p0, "context");
                a.p(set, str);
                a.p(list, "configs");
                Iterator iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj3 = iterator.next();
                      obj2 = obj3;
                      i = 0;
                      if (!set instanceof Collection || !set.isEmpty()) {
                         Iterator iterator1 = set.iterator();
                         while (iterator1.hasNext()) {
                            b uob = iterator1.next();
                            l ol = e.b(obj2.a());
                            ConditionConfig uConditionCo = (ol != null)? ol.a(): obj1;
                            if (c.a(uob, uConditionCo)) {
                               i = 1;
                               break ;
                            }
                         }
                      }
                      if (!i) {
                         continue ;
                      }
                   }else {
                      obj3 = obj1;
                   }
                   if (obj3 != null) {
                      e pokeId = obj3.pokeId;
                      e uoe = e.class;
                      if (PatchProxy.isSupport(uoe)) {
                         uoe = PatchProxy.applyOneRefs(Integer.valueOf(pokeId), obj1, uoe, "4");
                         if (uoe != PatchProxyResult.class) {
                         }else {
                         label_00cd :
                            c = f.c;
                            Objects.requireNonNull(c);
                            obj3 = f.class;
                            if (PatchProxy.isSupport(obj3)) {
                               c = PatchProxy.applyOneRefs(Integer.valueOf(pokeId), c, obj3, "2");
                               if (c != PatchProxyResult.class) {
                               }
                            }
                            Map a1 = f.a;
                            if (a1 != null) {
                               a1 = a1.get(Integer.valueOf(pokeId));
                            }else {
                               a1 = obj1;
                            }
                         }
                      }else {
                         goto label_00cd ;
                      }
                      if (uoe != null) {
                         a = i.a;
                         PokeGroup pokeGroup = uoe.a();
                         Objects.requireNonNull(a);
                         a = PatchProxy.applyTwoRefs(p0, pokeGroup, a, i$a.class, "1");
                         if (a != PatchProxyResult.class) {
                            obj1 = a;
                            break ;
                         }else {
                            a.p(p0, "context");
                            a.p(pokeGroup, "pokeGroup");
                            if (pokeGroup instanceof j) {
                               obj1 = FireworkScriptGroupConverter.b.b(p0, pokeGroup);
                               break ;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return obj1;
    }
    public static final l b(int p0){
       ConditionConfigManager obj1;
       Object obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object obj = null;
       if (PatchProxy.isSupport(uoe)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uoe, "5");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = ConditionConfigManager.b;
       Objects.requireNonNull(obj1);
       if (PatchProxy.isSupport(ConditionConfigManager.class)) {
          obj2 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj1, ConditionConfigManager.class, "2");
          if (obj2 != patchProxyRe) {
          label_0046 :
             return obj2;
          }
       }
       Map a = ConditionConfigManager.a;
       if (a != null) {
          obj = a.get(Integer.valueOf(p0));
       }
       obj2 = obj;
       goto label_0046 ;
    }
    public static final boolean c(String p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "businessName");
       a.p(p1, "condition");
       List list = BusinessConfigManager.a(p0);
       boolean b = false;
       if (list != null && !list.isEmpty()) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             l ol = e.b(iterator.next().a());
             ConditionConfig uConditionCo = (ol != null)? ol.a(): null;
             if (c.a(p1, uConditionCo)) {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public static final boolean d(){
       return e.b;
    }
    public static final void e(Context p0){
       Set a;
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "3")) {
          return;
       }
       EasterEggManager$prepare$1 iNSTANCE = EasterEggManager$prepare$1.INSTANCE;
       EasterEggManager$prepare$2 iNSTANCE1 = EasterEggManager$prepare$2.INSTANCE;
       if (!PatchProxy.applyVoidThreeRefs(p0, iNSTANCE, iNSTANCE1, null, e.class, "1")) {
          a.p(p0, "app");
          a.p(iNSTANCE, "onSuccess");
          a.p(iNSTANCE1, "onError");
          if (!e.b && !e.c) {
             boolean b = true;
             e.c = b;
             a = e.a;
             ArrayList uArrayList = new ArrayList(u.Y(a, 10));
             Iterator iterator = a.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().a(p0));
             }
             t.concat(uArrayList).takeLast(b).subscribeOn(d.c).observeOn(d.a).doOnError(b.b).subscribe(new c(iNSTANCE), new d(iNSTANCE1));
          }
       }
       return;
    }
}
