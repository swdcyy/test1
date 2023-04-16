package o75.f0;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.chat.kwailink.data.PacketData;
import com.kwai.chat.kwailink.base.b;
import com.kwai.chat.kwailink.utils.EventReporter;
import java.util.Map;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import java.lang.Boolean;
import java.util.Set;
import java.util.Iterator;
import o75.e0;
import java.util.List;
import java.util.Collections;
import java.util.Map$Entry;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.IllegalArgumentException;

public class f0	// class@001fbb
{
    public static final Map a;
    public static final Map b;
    public static final Map c;

    static {
       f0.a = new ConcurrentHashMap();
       f0.b = new ConcurrentHashMap();
       f0.c = new ConcurrentHashMap();
    }
    public void f0(){
       super();
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          p0 = "0";
       }
       return p0;
    }
    public static void b(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, f0.class, "18")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       String str = f0.a(p0.k());
       String str1 = p0.a();
       if (p0.o() && (p0.q() && b.h())) {
          EventReporter.onPushStat(p0.k(), str1, "mainReceived");
       }
    label_0036 :
       if (f0.a.isEmpty() && (f0.b.isEmpty() && f0.c.isEmpty())) {
          return;
       }else {
          a.e("PacketRouter", "route, subBiz="+str+", command="+str1+", seqNo="+p0.j());
          if (TextUtils.isEmpty(str1)) {
             return;
          }else {
             int i = (((f0.d(str, str1, p0) | (f0.c(str, str1, p0) | f0.e(str, str1, p0))) | f0.c("$", str1, p0)) | f0.e("$", str1, p0)) | f0.d("$", str1, p0);
             if (p0.o() && (p0.q() && (b.h() && i))) {
                EventReporter.onPushStat(p0.k(), str1, "bizReceived");
             }
          label_00bc :
             return;
          }
       }
    }
    public static boolean c(String p0,String p1,PacketData p2){
       Map obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, f0.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = f0.a.get(p0);
       boolean b = false;
       if (obj != null && !obj.isEmpty()) {
          Set set = obj.get(p1);
          if (set != null && !set.isEmpty()) {
             Iterator iterator = set.iterator();
             while (iterator.hasNext()) {
                e0 uoe0 = iterator.next();
                a.e("PacketRouter", "routeByCommand, subBiz="+p0+", command="+p1+", seqNo="+p2.j()+", listener="+uoe0);
                uoe0.a(Collections.singletonList(p2));
             }
             return true;
          }
       }
       return b;
    }
    public static boolean d(String p0,String p1,PacketData p2){
       Set obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, f0.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = f0.c.get(p0);
       if (obj == null || obj.isEmpty()) {
          return false;
       }
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          e0 uoe0 = iterator.next();
          a.e("PacketRouter", "routeByGlobal, subBiz="+p0+", command="+p1+", seqNo="+p2.j()+", listener="+uoe0);
          uoe0.a(Collections.singletonList(p2));
       }
       return true;
    }
    public static boolean e(String p0,String p1,PacketData p2){
       Iterator obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, f0.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       Map map = f0.b.get(p0);
       if (map != null && !map.isEmpty()) {
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             if (p1.startsWith(key)) {
                Set value = uEntry.getValue();
                if (value == null || value.isEmpty()) {
                }else {
                   obj = value.iterator();
                   while (obj.hasNext()) {
                      e0 uoe0 = obj.next();
                      a.e("PacketRouter", "routeByPrefix, subBiz="+p0+", command="+p1+", seqNo="+p2.j()+", prefix="+key+", listener="+uoe0);
                      uoe0.a(Collections.singletonList(p2));
                   }
                   b = 1;
                }
             }
          }
       }
       return b;
    }
    public static void f(e0 p0){
       CopyOnWriteArraySet uCopyOnWrite;
       f0 uof0 = f0.class;
       Set obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uof0, "13")) {
          return;
       }
       String str = "$";
       if (!PatchProxy.applyVoidTwoRefs(p0, str, obj, uof0, "5")) {
          Map c = f0.c;
          _monitor_enter(c);
          str = f0.a(str);
          obj = c.get(str);
          if (obj == null) {
             uCopyOnWrite = new CopyOnWriteArraySet();
             c.put(str, uCopyOnWrite);
          }
          uCopyOnWrite.add(p0);
          _monitor_exit(c);
       }
       return;
    }
    public static void g(e0 p0,String p1,Set p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, f0.class, "7")) {
          return;
       }
       _monitor_enter(p3);
       p1 = f0.a(p1);
       Map map = p3.get(p1);
       if (map == null) {
          map = new ConcurrentHashMap();
          p3.put(p1, map);
       }
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Set set = map.get(str);
          if (set == null) {
             set = new CopyOnWriteArraySet();
             map.put(str, set);
          }
          set.add(p0);
       }
       _monitor_exit(p3);
       return;
    }
    public static void h(Set p0){
       String str;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, null, f0.class, "16")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          str = iterator.next();
          if (!str.startsWith("Push.")) {
             throw new IllegalArgumentException("command\("+str+"\) doesn\'t start with \(Push.\)");
          }
          if (str.endsWith(".")) {
             throw new IllegalArgumentException("command\("+str+"\) ends with \(.\)");
          }
          i = str.indexOf("..");
          if (i == -1) {
             continue ;
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("command\("+str+"\) has consecutive \(.\) on index "+i+" and "+(i + 1));
    }
}
