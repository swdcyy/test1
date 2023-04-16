package aw6.d;
import java.util.HashMap;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import zv6.t;
import java.util.List;
import zv6.t$a;

public class d	// class@000389
{
    public static final Map a;

    static {
       d.a = new HashMap();
    }
    public void d(){
       super();
    }
    public static void a(LifecycleOwner p0,LifecycleObserver p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "4")) {
          return;
       }
       Objects.toString(p0);
       Objects.toString(p1);
       p0.getLifecycle().getObserverCount();
       p0.getLifecycle().addObserver(p1);
       p0.getLifecycle().getObserverCount();
       return;
    }
    public static String b(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getClass().getSimpleName()+p0.hashCode()+"#"+"activity";
    }
    public static String c(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getClass().getSimpleName()+p0.hashCode()+"#"+"fragment";
    }
    public static SlidePlayViewModel d(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return d.e(d.c(p0));
    }
    public static SlidePlayViewModel e(String p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, d.class, "7");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (!TextUtils.x(p0)) {
          obj = d.a.get(p0);
       }
       return obj;
    }
    public static void f(String p0,SlidePlayViewModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "1")) {
          return;
       }
       Map a = d.a;
       a.size();
       Iterator iterator = a.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          "sMap key:"+str+",value:"+d.a.get(str);
       }
       d.a.put(p0, p1);
       return;
    }
    public static SlidePlayViewModel g(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uod, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, null, uod, "6");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = d.a.remove(p0);
       }
       if (obj1 != null && !PatchProxy.applyVoid(null, obj1, SlidePlayViewModel.class, "170")) {
          obj1.f = null;
          obj1.h = null;
          SlidePlayViewModel l = obj1.l;
          Objects.requireNonNull(l);
          if (!PatchProxy.applyVoid(null, l, t.class, "50")) {
             l.a.clear();
             l.c.clear();
             l.b.clear();
             l.d.clear();
             t f = l.f;
             if (f != null && !PatchProxy.applyVoid(null, f, t$a.class, "24")) {
                f.d.clear();
             }
          }
          obj1.i.clear();
       }
       return obj1;
    }
    public static void h(LifecycleOwner p0,LifecycleObserver p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "5")) {
          return;
       }
       Objects.toString(p0);
       Objects.toString(p1);
       if (p0.getLifecycle() instanceof LifecycleRegistry) {
          p0.getLifecycle().getObserverCount();
       }
       p0.getLifecycle().removeObserver(p1);
       if (p0.getLifecycle() instanceof LifecycleRegistry) {
          p0.getLifecycle().getObserverCount();
       }
       return;
    }
}
