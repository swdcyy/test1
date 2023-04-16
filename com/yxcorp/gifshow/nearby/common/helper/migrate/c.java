package com.yxcorp.gifshow.nearby.common.helper.migrate.c;
import java.util.HashMap;
import com.yxcorp.gifshow.nearby.common.helper.migrate.a;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import com.yxcorp.gifshow.nearby.common.helper.migrate.MigrateEvents;
import lsb.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import nrb.a;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import bsb.a;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import nrb.c;
import brd.t;
import nrb.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class c	// class@002112
{
    public static boolean a;
    public static final HashMap b;
    public static final x c;

    static {
       c.b = new HashMap();
       c.c = Suppliers.a(a.b);
    }
    public void c(){
       super();
    }
    public static void a(){
       c.a = false;
    }
    public static void b(MigrateEvents p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "2")) {
          return;
       }
       int i = c.c().indexOf(p0);
       if (i < 0) {
          return;
       }
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             if (c.c().get(i1).isConsume()) {
                return;
             }else {
                i1 = i1 + 1;
             }
          }else {
             CityInfo mCityName = a.l(u.f()).mCityName;
             HashMap b = c.b;
             if (!mCityName.equals(b.get(p0))) {
                b.put(p0, mCityName);
                p1.invoke();
             }
             if (p0.isConsume()) {
                c.a();
                break ;
             }
             break ;
          }
       }
       return;
    }
    public static List c(){
       Object obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.c.get();
    }
    public static void d(String p0,String p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "4")) {
          return;
       }
       b.a(0x20c76ffc).b(p0, p1).subscribe(new d(p2), Functions.d());
       return;
    }
}
