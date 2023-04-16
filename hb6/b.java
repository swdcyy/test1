package hb6.b;
import java.lang.Object;
import hb6.a;
import hb6.d;
import java.lang.String;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import o56.c;
import o56.a;
import xf6.e;
import qk.g0;
import ta6.c;
import q87.c;
import java.lang.reflect.Type;
import java.util.List;
import ta6.a;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import java.util.ArrayList;

public class b	// class@001743
{
    public a a;
    public d b;

    public void b(){
       super();
       this.a = new a();
       this.b = new d();
    }
    public Collection a(String p0){
       g0 obj2;
       Collection uCollection;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       a uoa = a.class;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, uoa, "2");
       if (obj1 != patchProxyRe) {
       }else {
          int i = 0;
          obj1 = (a.a().c() && e.d())? 1: null;
          if (obj1) {
             obj2 = PatchProxy.applyOneRefs(p0, obj, uoa, "4");
             if (obj2 != patchProxyRe) {
                obj1 = obj2;
             }else {
                _monitor_enter(obj);
                if (obj.c == null) {
                   obj.c = obj.b();
                }
                uCollection = obj.c.get(p0);
                _monitor_exit(obj);
             }
          }else {
             obj1 = PatchProxy.applyOneRefs(p0, obj, uoa, "3");
             if (obj1 != patchProxyRe) {
             }else {
                _monitor_enter(obj);
                if (obj.b.isEmpty()) {
                   obj2 = PatchProxy.apply(null, obj, uoa, "5");
                   if (obj2 != patchProxyRe) {
                   }else {
                      Object[] objArray = new Object[i];
                      c.C().w("HostFailoverIpMapProvider", "GetFailoverHostIpMap from sharedPreference.", objArray);
                      obj2 = a.c(a.e(obj.a));
                   }
                   obj.b = obj2;
                   if (obj2.isEmpty()) {
                      obj.b = obj.a();
                   }
                }
                uCollection = obj.b.get(p0);
                _monitor_exit(obj);
             }
          }
          obj1 = uCollection;
       }
       return obj1;
    }
    public Collection b(String p0){
       g0 obj2;
       Collection uCollection;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       d uod = d.class;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, uod, "2");
       if (obj1 != patchProxyRe) {
       }else {
          int i = 0;
          obj1 = (a.a().c() && e.d())? 1: null;
          if (obj1) {
             obj2 = PatchProxy.applyOneRefs(p0, obj, uod, "5");
             if (obj2 != patchProxyRe) {
                obj1 = obj2;
             }else {
                _monitor_enter(obj);
                if (obj.e == null) {
                   obj.e = obj.a();
                }
                uCollection = obj.e.get(p0);
                _monitor_exit(obj);
             }
          }else {
             obj1 = PatchProxy.applyOneRefs(p0, obj, uod, "4");
             if (obj1 != patchProxyRe) {
             }else {
                Object obj3 = PatchProxy.apply(null, obj, uod, "11");
                b = (obj3 != patchProxyRe)? obj3.booleanValue(): a.t().d("enableOptimalDns", i);
                if (!b) {
                   uCollection = new ArrayList();
                }else {
                   _monitor_enter(obj);
                   if (obj.b.isEmpty()) {
                      obj2 = PatchProxy.apply(null, obj, uod, "6");
                      if (obj2 != patchProxyRe) {
                      }else {
                         Object[] objArray = new Object[i];
                         c.C().w("HostOptimalIpMapProvider", "GetOptimalHostIpMap from sharedPreference.", objArray);
                         obj2 = d.d(a.e(obj.a));
                      }
                      obj.b = obj2;
                      obj.b("Read");
                   }
                   uCollection = obj.b.get(p0);
                   _monitor_exit(obj);
                }
             }
          }
          obj1 = uCollection;
       }
       return obj1;
    }
}
