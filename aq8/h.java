package aq8.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Set;
import java.util.Map;
import aq8.e;
import java.lang.ClassLoader;
import java.lang.StringBuilder;
import java.lang.Throwable;
import zp8.a;
import cq8.b;
import java.util.Iterator;
import cq8.d;
import java.lang.Boolean;
import com.tachikoma.core.TKProviderCollector;
import cq8.g;
import java.util.concurrent.ConcurrentHashMap;
import aq8.c;
import cq8.h;
import java.util.Arrays;
import java.util.Collection;
import java.lang.RuntimeException;

public class h	// class@00030e
{
    public static final List a;
    public static final List b;
    public static final List c;
    public static final Map d;
    public static final Map e;
    public static final Map f;
    public static final List g;
    public static final Set h;

    static {
       h.a = new ArrayList();
       h.b = new ArrayList();
       h.c = new ArrayList();
       h.d = new HashMap();
       h.e = new HashMap();
       h.f = new HashMap();
       h.g = new LinkedList();
       h.h = new HashSet();
    }
    public void h(){
       super();
    }
    public static String[] a(){
       String[] stringArray;
       List obj = PatchProxy.apply(null, null, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = h.g;
       if (obj.isEmpty()) {
          stringArray = new String[0];
          return h.f.keySet().toArray(stringArray);
       }else {
          stringArray = new String[0];
          return obj.toArray(stringArray);
       }
    }
    public static e b(String p0){
       h oh = h.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, oh, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return oh.getClassLoader().loadClass(p0).newInstance();
    }
    public static b c(String p0){
       b obj = PatchProxy.applyOneRefs(p0, null, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = h.f.get(p0);
       if (obj != null) {
          return obj;
       }
       obj = h.d.get(p0);
       if (obj != null) {
          return obj;
       }
       obj = h.e.get(p0);
       if (obj != null) {
          return obj;
       }
       Iterator iterator = h.c.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (uod.c(p0)) {
             obj = uod.init(p0);
             h.f.put(p0, obj);
             break ;
          }
       }
       return obj;
    }
    public static void d(boolean p0){
       Iterator iterator;
       Iterator iterator1;
       Set h;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, oh, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, oh, "10")) {
          h.g(new TKProviderCollector());
          if (!PatchProxy.applyVoid(null, null, oh, "8")) {
             String[] stringArray = new String[]{"com.tachikoma.plugin","com.tachikoma.component"};
             h.f(stringArray);
             h = h.h;
             _monitor_enter(h);
             Iterator iterator2 = h.iterator();
             while (iterator2.hasNext()) {
                h.h(iterator2.next());
             }
             _monitor_exit(h);
          }
       }
       List a = h.a;
       h.e(a);
       h.e(h.b);
       if (!PatchProxy.applyVoid(null, null, oh, "19")) {
          iterator1 = a.iterator();
          while (iterator1.hasNext()) {
             h.d.putAll(iterator1.next().a());
          }
       }
       if (!PatchProxy.applyVoid(null, null, oh, "20")) {
          iterator1 = h.b.iterator();
          while (iterator1.hasNext()) {
             h.e.putAll(iterator1.next().a());
          }
       }
       if (p0) {
          if (!PatchProxy.applyVoid(null, null, oh, "12")) {
             iterator = h.c.iterator();
             while (iterator.hasNext()) {
                h.g.addAll(Arrays.asList(iterator.next().b()));
             }
          }
       }else if(PatchProxy.applyVoid(null, null, oh, "2")){
          List c = h.c;
          h.e(c);
          if (!PatchProxy.applyVoid(null, null, oh, "21")) {
             iterator = c.iterator();
             while (iterator.hasNext()) {
                h.f.putAll(iterator.next().a());
             }
          }
       }
       return;
    }
    public static void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, h.class, "9")) {
          return;
       }
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             iterator.next().init();
          }
       }
       return;
    }
    public static void f(String[] p0){
       Set h;
       if (PatchProxy.applyVoidOneRefs(p0, null, h.class, "4")) {
          return;
       }
       h = h.h;
       _monitor_enter(h);
       int i = (p0 == null || !p0.length)? 1: 0;
       if (i) {
          _monitor_exit(h);
          return;
       }else {
          h.addAll(Arrays.asList(p0));
          _monitor_exit(h);
          return;
       }
    }
    public static void g(e p0){
       c uoc;
       List a;
       h oh = h.class;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, oh, "11")) {
          return;
       }
       Iterator iterator = p0.collectProviders().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          uoc = iterator.next();
          if (uoc instanceof g) {
             if (PatchProxy.applyVoidOneRefs(uoc, obj, oh, "14")) {
                continue ;
             }else {
                a = h.a;
                if (!a.contains(uoc)) {
                   a.add(uoc);
                }
             }
          }else if(uoc instanceof h){
             if (PatchProxy.applyVoidOneRefs(uoc, obj, oh, "15")) {
                continue ;
             }else {
                a = h.b;
                if (!a.contains(uoc)) {
                   a.add(uoc);
                }
             }
          }else if(uoc instanceof d){
             if (PatchProxy.applyVoidOneRefs(uoc, obj, oh, "16")) {
                continue ;
             }else {
                a = h.c;
                if (!a.contains(uoc)) {
                   a.add(uoc);
                }
             }
          }else {
             break ;
          }
       }
       throw new RuntimeException("Unknown provider: "+uoc);
    }
    public static void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, h.class, "18")) {
          return;
       }
       e uoe = h.b(p0+".TKProviderCollector");
       if (uoe != null) {
          h.g(uoe);
       }
       return;
    }
}
