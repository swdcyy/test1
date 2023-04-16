package cu1.d;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MediatorLiveData;
import cu1.d$a;
import androidx.lifecycle.Observer;
import ut1.c;
import ut1.o;
import java.lang.Long;
import java.util.Map;
import ut1.f;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import ut1.k;
import java.util.Set;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ut1.l;
import java.util.Map$Entry;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Number;
import lnc.a1;
import java.lang.Boolean;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Objects;
import eu1.c;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import android.graphics.Rect;
import usd.q;
import sp5.b;

public final class d	// class@001e52
{

    public static final LiveData a(LiveData p0){
       MediatorLiveData obj = PatchProxy.applyOneRefs(p0, null, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$filterNullValue");
       obj = new MediatorLiveData();
       obj.addSource(p0, new d$a(obj));
       return obj;
    }
    public static final o b(String p0,c p1){
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, d.class, "17");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       try{
          a.p(p0, "userIdStr");
          long l = Long.parseLong(p0);
          if (p1 != null) {
             c b = p1.b;
             if (b != null) {
                obj = b.get(Long.valueOf(l));
             }
          }
          return obj;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public static final String c(f p0){
       k ok;
       String str;
       List list = null;
       Object obj = PatchProxy.applyOneRefs(p0, list, d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.l().values().size() != 2) {
          ok = list;
       }else {
          Iterator iterator = p0.l().values().iterator();
          ok = list;
          while (iterator.hasNext()) {
             k ok1 = iterator.next();
             int i2 = a.g(String.valueOf(p0.b()), ok1.e()) ^ 1;
             if (i2) {
                ok = ok1;
             }
          }
       }
       if (ok != null) {
          Map map = ok.f();
          if (map != null) {
             Set set = map.keySet();
             if (set != null) {
                list = CollectionsKt___CollectionsKt.G5(set);
             }
          }
       }
       int i = 0;
       int i1 = (list != null)? list.size(): 0;
       if (i1 == 1) {
          a.m(list);
          str = list.get(i);
       }else {
          str = "";
       }
       return str;
    }
    public static final l d(String p0,Map p1){
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       if (p1 != null) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             obj = iterator.next().getValue().f().entrySet().iterator();
             while (true) {
                if (obj.hasNext()) {
                   Map$Entry uEntry = obj.next();
                   if (a.g(p0, uEntry.getValue().c().mId)) {
                      return uEntry.getValue();
                   }
                }else {
                   continue ;
                }
             }
          }
       }
       return null;
    }
    public static final int e(){
       Object obj = PatchProxy.apply(null, null, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (a1.d(0x7f07085a) + a1.d(0x7f07085b));
    }
    public static final String f(String p0,Map p1){
       Map$Entry obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             Iterator iterator1 = obj.getValue().f().entrySet().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   if (a.g(p0, iterator1.next().getValue().c().mId)) {
                      return obj.getValue().e();
                   }
                }else {
                   continue ;
                }
             }
          }
       }
       return "";
    }
    public static final k g(Map p0,String p1,boolean p2){
       k obj;
       k ok1;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, d.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p1 = d.f(p1, p0);
       obj = null;
       if (p0 != null) {
          Iterator iterator = p0.values().iterator();
          int i = obj;
          while (iterator.hasNext()) {
             k ok = iterator.next();
             if (a.g(p1, ok.e())) {
                obj = ok;
             }else {
                i = ok;
             }
          }
          ok1 = obj;
          obj = i;
       }else {
          ok1 = obj;
       }
       if (p2) {
          obj = ok1;
       }
       return obj;
    }
    public static final k h(f p0,String p1,boolean p2){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, d.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Map map = (p0 != null)? p0.l(): null;
       return d.g(map, p1, p2);
    }
    public static final UserInfo i(String p0,Map p1){
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       if (p1 != null) {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             obj = iterator.next().getValue().f().entrySet().iterator();
             while (true) {
                if (obj.hasNext()) {
                   Map$Entry uEntry = obj.next();
                   if (a.g(p0, uEntry.getValue().c().mId)) {
                      return uEntry.getValue().c();
                   }
                }else {
                   continue ;
                }
             }
          }
       }
       return null;
    }
    public static final int j(View p0){
       ViewGroup$LayoutParams layoutParams = null;
       Object obj = PatchProxy.applyOneRefs(p0, layoutParams, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null) {
          layoutParams = p0.getLayoutParams();
       }
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$LayoutParams layoutParams1 = p0.getLayoutParams();
          Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          return (layoutParams1.leftMargin + layoutParams1.rightMargin);
       }else {
          return 0;
       }
    }
    public static final int k(View p0){
       ViewGroup$LayoutParams width;
       ViewGroup$LayoutParams obj = PatchProxy.applyOneRefs(p0, null, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null) {
          obj = p0.getLayoutParams();
          if (obj != null) {
             width = obj.width;
          label_0025 :
             return width;
          }
       }
       width = d.j(p0) + 0;
       goto label_0025 ;
    }
    public static final LiveMultiPkViewStyle l(c p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Iterator obj = null;
       Rect obj1 = PatchProxy.applyOneRefs(p0, obj, uod, "15");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       a.p(p0, "liveMultiPkUIInfo");
       Iterator obj2 = PatchProxy.applyOneRefs(p0, obj, uod, "16");
       if (obj2 != patchProxyRe) {
          i = obj2.intValue();
       }else {
          i = Integer.MAX_VALUE;
          obj2 = p0.b().l().values().iterator();
          while (obj2.hasNext()) {
             obj = obj2.next().f().values().iterator();
             while (obj.hasNext()) {
                obj1 = p0.e().get(obj.next().c().mId);
                if (obj1 != null) {
                   i = q.u(i, obj1.width());
                }
             }
          }
       }
       LiveMultiPkViewStyle nORMAL = (((float)i / (float)p0.c().a) - 0x3eae147b >= 0)? LiveMultiPkViewStyle.NORMAL: LiveMultiPkViewStyle.SIMPLE;
       return nORMAL;
    }
}
