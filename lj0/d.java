package lj0.d;
import java.lang.Object;
import com.facebook.react.bridge.ReactContext;
import lj0.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import com.kuaishou.krn.context.KrnContextBindingManager;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.ListIterator;
import sj0.b;
import com.facebook.react.a;
import ik0.m;
import android.app.Activity;
import ik0.g;
import java.lang.Integer;
import com.kuaishou.krn.context.KrnViewTagManager;
import java.util.Map;
import com.kuaishou.krn.c;
import com.google.gson.Gson;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import nsd.u;
import java.lang.CharSequence;
import trd.t0;
import lj0.d$a;
import java.lang.reflect.Type;
import el.a;

public final class d	// class@002f7a
{
    public static WeakReference a;
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public static final c a(ReactContext p0){
       WeakReference a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       KrnContextBindingManager obj1 = PatchProxy.applyOneRefs(p0, obj, d.class, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0 == null) {
          a = d.a;
          if (a != null) {
             obj = a.get();
          }
          return obj;
       }else {
          obj1 = KrnContextBindingManager.b;
          _monitor_enter(obj1);
          Object obj2 = PatchProxy.applyOneRefs(p0, obj1, KrnContextBindingManager.class, "3");
          if (obj2 != patchProxyRe) {
             _monitor_exit(obj1);
          }else {
             a.p(p0, "reactContext");
             List a1 = KrnContextBindingManager.a;
             ListIterator listIterator = a1.listIterator(a1.size());
             while (true) {
                if (listIterator.hasPrevious()) {
                   obj2 = listIterator.previous();
                   c uoc = obj2.get();
                   int i = 0;
                   if (uoc != null) {
                      a.o(uoc, "it.get\(\) ?: return@findLast false");
                      if (a.g(uoc.i().i().n(), p0)) {
                         m om = uoc.l();
                         Activity activity = (om != null)? om.getActivity(): obj;
                         if (a.g(activity, p0.getCurrentActivity())) {
                            i = 1;
                         }
                      }
                   }
                   if (!i) {
                      continue ;
                   }
                }else {
                   obj2 = obj;
                }
                if (obj2 != null) {
                   obj = obj2.get();
                }
                _monitor_exit(obj1);
                obj2 = obj;
                break ;
             }
          }
          return obj2;
       }
    }
    public static final c b(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uod, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return KrnViewTagManager.INSTANCE.get(Integer.valueOf(p0));
    }
    public static final m c(int p0){
       d uod = d.class;
       m om = null;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), om, uod, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       c uoc = d.b(p0);
       if (uoc != null) {
          om = uoc.l();
       }
       return om;
    }
    public static final Map d(int p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uod, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       c uoc = d.b(p0);
       String str = PatchProxy.applyOneRefs(uoc, null, uod, "3");
       if (str != patchProxyRe) {
       }else if(uoc == null){
          str = "";
       }else {
          c uoc1 = c.b();
          a.o(uoc1, "KrnManager.get\(\)");
          str = uoc1.e().q(new KrnLogCommonParams(uoc, null, 2, null));
          a.o(str, "KrnManager.get\(\).gson.to¡­CommonParams\(krnContext\)\)");
       }
       Map map = (!str.length())? 1: null;
       if (map) {
          return t0.z();
       }else {
          uoc = c.b();
          a.o(uoc, "KrnManager.get\(\)");
          Object obj1 = uoc.e().i(str, new d$a().getType());
          a.o(obj1, "KrnManager.get\(\).gson.fr¡­<String, Any>>\(\) {}.type\)");
          return obj1;
       }
    }
    public final void e(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       WeakReference a = d.a;
       c uoc = (a != null)? a.get(): null;
       if (a.g(uoc, p0) ^ 0x01) {
          d.a = new WeakReference(p0);
       }
       return;
    }
}
