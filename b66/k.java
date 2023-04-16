package b66.k;
import java.util.Random;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.lang.Object;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qe6.b;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.utility.TextUtils;
import ekd.a0;
import h30.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.framework.network.util.SafeModeLogEncryptor;
import android.util.Base64;
import com.kwai.framework.model.user.QCurrentUser;
import b66.s;
import gb6.a;
import z56.c;
import wkd.b;
import b66.l;
import com.yxcorp.gifshow.log.h;
import b66.n;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import b66.n$a;
import z1.k;
import brd.t;
import cjd.e;
import erd.o;
import b66.f;
import erd.g;
import b66.j;
import b66.g;
import cjd.a;
import b66.h;
import b66.e;
import b66.c;
import b66.i;
import b66.d;
import erd.a;
import crd.b;

public class k	// class@000425
{
    public static int a;
    public static final Random b;
    public static z c;

    static {
       k.b = new Random();
       k.c = b.b(c.f("SystemStartUp"));
    }
    public void k(){
       super();
    }
    public static void a(RequestTiming p0){
       String str1;
       Object obj2;
       String str3;
       HashMap hashMap;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       Map$Entry obj1 = null;
       if (PatchProxy.applyVoidOneRefs(obj, obj1, ok, "1")) {
          return;
       }
       if (b.a()) {
          String str = a0.c(TextUtils.L(SystemUtil.m(a.b())));
          str1 = TextUtils.k(a.d());
          Application uApplication = a.b();
          String str2 = PatchProxy.applyOneRefs(uApplication, obj1, ok, "2");
          if (str2 != patchProxyRe) {
          }else {
             List list = SystemUtil.j(uApplication);
             str2 = (q.f(list))? obj1: Base64.encodeToString(SafeModeLogEncryptor.b.a((a.a.q(list)).getBytes()), 0);
          }
          obj2 = str2;
          str3 = str1;
          str1 = str;
       }else {
          str1 = obj1;
          obj2 = str1;
          str3 = obj2;
       }
       s os = new s();
       a uoa = os.a();
       l ol = b.a(0x595ed338);
       String i = a.i;
       String l = a.l;
       String sessionId = b.a(0x4b316083).getSessionId();
       int s = a.s;
       String str4 = uoa.a();
       long l1 = uoa.b();
       String str5 = QCurrentUser.ME.getId();
       Iterator obj3 = PatchProxy.applyOneRefs(obj, obj1, n.class, "3");
       if (obj3 != patchProxyRe) {
          hashMap = obj3;
       }else {
          HashMap hashMap1 = new HashMap();
          obj3 = n.a.entrySet().iterator();
          while (obj3.hasNext()) {
             obj1 = obj3.next();
             Object obj4 = (obj1.getValue() instanceof n$a)? obj1.getValue().a(obj): obj1.getValue().get();
             if (obj4 != null) {
                hashMap1.put(obj1.getKey(), obj4);
             }
          }
          hashMap = hashMap1;
       }
       ol.a(i, l, sessionId, str1, obj2, str3, s, str4, l1, hashMap, p0).map(new e()).observeOn(k.c).map(os).doOnSubscribe(f.b).map(new j(str5)).doOnNext(a.a(g.b)).doAfterNext(h.b).doOnError(a.a(e.b)).subscribe(c.a, i.b, d.b);
       return;
    }
}
