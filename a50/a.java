package a50.a;
import com.kuaishou.eve.kit.api.collect.ConcurrentEvictingQueue;
import android.content.SharedPreferences;
import oe6.n;
import java.lang.String;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import a50.a$b;
import java.lang.reflect.Type;
import el.a;
import java.lang.Object;
import java.util.List;
import java.util.Collection;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import qk.p;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.UUID;
import java.util.Queue;
import a50.a$a;
import java.lang.Runnable;
import t45.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import m56.f;
import android.os.SystemClock;
import m56.g;

public final class a	// class@000026
{
    public static final Queue a;
    public static long b;
    public static final a c;

    static {
       List list;
       String str = "EveSessionManager";
       a.c = new a();
       ConcurrentEvictingQueue uConcurrentE = ConcurrentEvictingQueue.create(10);
       try{
          String str1 = n.b().getString("SESSION_ID_LIST", "");
          if (str1 != null) {
             list = DataKt.a().i(str1, new a$b().getType());
             if (list != null) {
                uConcurrentE.addAll(list);
             }
          }
          Log.g(str, "init with old sessionIds:"+uConcurrentE);
       }catch(java.lang.Exception e2){
          uConcurrentE.clear();
          Log.e(str, "get sessionIds from sp error, clear list", e2);
       }
       a.o(uConcurrentE, "ConcurrentEvictingQueue.¡­clear list\", e\)\n    }\n  }");
       a.a = uConcurrentE;
       a.b = -1;
    }
    public void a(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       a.a.add(str);
       Log.g("EveSessionManager", "createNewSession "+str);
       c.a(a$a.b);
       return;
    }
    public final String b(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectionsKt___CollectionsKt.c3(a.a);
    }
    public final void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       a.p(p0, "e");
       Log.g("EveSessionManager", "onBackground");
       a.b = SystemClock.elapsedRealtime();
       return;
    }
    public final void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.p(p0, "e");
       Log.g("EveSessionManager", "onForground");
       if (a.b > 0 && (SystemClock.elapsedRealtime() - a.b) - 0x493e0 > 0) {
          a.b = -1;
          Log.g("EveSessionManager", "forground refresh session with interval:300000");
          this.a();
       }
       return;
    }
}
