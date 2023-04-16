package p80.v$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import p80.v;
import java.lang.Integer;
import p80.d;
import com.kuaishou.webkit.extension.KwSdk;
import java.util.HashMap;
import java.util.ArrayList;
import nsd.u;
import kotlin.jvm.internal.a;
import wq.a;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import qrd.l1;

public final class v$a implements Runnable	// class@0028e0
{
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public void v$a(int p0,String p1,String p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, v$a.class, "1")) {
          return;
       }
       v$a b = obj.b;
       v$a c = obj.c;
       v$a d = obj.d;
       v$a e = obj.e;
       if (!PatchProxy.isSupport(v.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(b), c, d, e, null, v.class, "19")) {
          if (e == null) {
             e = "";
          }
          v$a uoa = e;
          String versionName = KwSdk.getVersionName();
          if (versionName == null) {
             versionName = "";
          }
          d uod = new d(uoa, versionName, null, null, 12, null);
          a c1 = v.c;
          a.o(c1, "sRecentUrlsQueue");
          _monitor_enter(c1);
          if (b == null) {
             ArrayList uArrayList = (d == null || !d.length())? 1: null;
             if (!uArrayList) {
                c1.remove(d);
                c1.add(d);
                int i = 400;
                a.o(c1, "sRecentUrlsQueue");
                v.e.clear();
                Iterator iterator = CollectionsKt___CollectionsKt.G4(c1).iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   i = i + str.length();
                   if (i <= 1000) {
                      v.e.add(str);
                   }
                }
             }
          }
          v2.recentUrls = v.e;
          _monitor_exit(c1);
          HashMap d1 = v.d;
          _monitor_enter(d1);
          if (b == 1 && (c != null && d != null)) {
             d1.put(c, d);
          }
       label_00b3 :
          v2.assistantInfo = d1;
          _monitor_exit(d1);
          v.g(v2);
       }
       return;
    }
}
