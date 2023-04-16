package bb6.c$a;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bjd.d;
import com.yxcorp.retrofit.cdn.CdnHostGroupManagerImpl;
import java.util.Objects;
import qrd.p;
import bb6.d;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import bb6.a;
import com.yxcorp.retrofit.cdn.CdnHostGroup;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import mjd.a;
import bjd.c;
import android.content.Context;
import trd.t0;
import java.util.LinkedHashMap;
import trd.s0;
import java.lang.Iterable;
import java.util.List;
import java.util.Collection;
import qrd.l1;

public final class c$a implements x	// class@000454
{
    public static final c$a b;

    static {
       c$a.b = new c$a();
    }
    public void c$a(){
       super();
    }
    public Object get(){
       CdnHostGroupManagerImpl a;
       boolean i1;
       CdnHostGroupManagerImpl d;
       Object[] objArray = null;
       CdnHostGroupManagerImpl uCdnHostGrou = PatchProxy.apply(objArray, this, c$a.class, "1");
       if (uCdnHostGrou != PatchProxyResult.class) {
       }else {
          Objects.requireNonNull(CdnHostGroupManagerImpl.f);
          uCdnHostGrou = CdnHostGroupManagerImpl.e.getValue();
          Map map = d.b.a();
          ArrayList uArrayList = new ArrayList(map.size());
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().getValue().a());
          }
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          Objects.requireNonNull(uCdnHostGrou);
          a.q(uApplication, "context");
          a.q(uArrayList, "predefinedHostGroups");
          a = uCdnHostGrou.a;
          _monitor_enter(a);
          a.c("CdnHostGroupManager", "initialize.");
          uCdnHostGrou.b.clear();
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             CdnHostGroup uCdnHostGrou1 = iterator1.next();
             uCdnHostGrou.c.put(uCdnHostGrou1.getTypeName(), uCdnHostGrou1);
          }
          c uoc = new c(uApplication);
          uCdnHostGrou.d = uoc;
          map = uoc.a();
          if (map == null) {
             map = t0.z();
          }
          CdnHostGroupManagerImpl c = uCdnHostGrou.c;
          LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(c.size()));
          iterator1 = c.entrySet().iterator();
          int i = 0;
          while (iterator1.hasNext()) {
             CdnHostGroup obj = iterator1.next();
             Map$Entry key = obj.getKey();
             String key1 = obj.getKey();
             obj = obj.getValue();
             CdnHostGroup uCdnHostGrou2 = map.get(key1);
             if (uCdnHostGrou2 != null) {
                if (!uCdnHostGrou2.isPredefined() || !a.g(uCdnHostGrou2.getVersion(), obj.getVersion())) {
                   if (!uCdnHostGrou2.isPredefined()) {
                      i1 = uCdnHostGrou2.getHostList().isEmpty() ^ 1;
                      if (!i1) {
                      }
                   }else {
                   }
                }
                i1 = true;
             label_0109 :
                if (!i1) {
                   uCdnHostGrou2 = objArray;
                }
                if (uCdnHostGrou2 != null) {
                   obj = uCdnHostGrou2;
                label_0112 :
                   linkedHashMa.put(key, obj);
                }
             }
             i = 1;
             goto label_0112 ;
          }
          uCdnHostGrou.b.putAll(linkedHashMa);
          if (i) {
             d = uCdnHostGrou.d;
             if (d != null) {
                d.b(uCdnHostGrou.b);
             }
          }
          _monitor_exit(a);
       }
       return uCdnHostGrou;
    }
}
