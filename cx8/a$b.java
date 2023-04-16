package cx8.a$b;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cx8.a;
import cx8.a$a;
import cx8.a$b$a;
import erd.f;
import java.lang.CharSequence;
import fg6.a;
import cx8.a$b$b;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.List;
import java.util.ArrayList;
import gx8.c;
import com.kwai.poi.service.model.KLocation;
import lnc.j8;
import java.lang.StringBuilder;
import jq.a;
import lk7.a;
import java.lang.Integer;
import com.kwai.poi.service.model.PoiServiceRequestConfig;
import ie6.a$a;
import com.kwai.poi.service.utils.PoiServicesUtilsKt;
import ie6.a;
import ee6.a;
import com.kwai.framework.poi.manager.a;

public final class a$b implements g	// class@00200a
{
    public final String b;
    public final String c;
    public final String d;

    public void a$b(String p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       ArrayList uArrayList;
       Object obj = this;
       a$b obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$b.class, "1")) {
          return;
       }
       a.p(obj1, "emit");
       a c = a.c;
       a$a uoa = a.a(c);
       a.m(uoa);
       uoa.e(obj1);
       obj1.setCancellable(a$b$a.a);
       obj1 = obj.b;
       int i = 1;
       if (obj1 != null) {
          Gson gson = (obj1.length() > 0)? 1: null;
          if (gson == i) {
             a$a obj2 = a.a.i(obj.b, new a$b$b().getType());
             a.o(obj2, "Gsons.KWAI_GSON.fromJson¡­ist<Distance>>\(\) {}.type\)");
             uArrayList = c.b(obj2);
          label_0056 :
             KLocation kLocation = j8.b();
             String str = j8.g(null, obj.c, obj.d);
             Object[] objArray = new Object[0];
             a.c("LocationAPI", "locationRecommendNew\(\) location = "+kLocation+','+" extra = "+str+",  mediaLocations = "+uArrayList, objArray);
             obj2 = a.a(c);
             a.m(obj2);
             c = a.class;
             if (PatchProxy.isSupport(c)) {
                Object[] objArray1 = new Object[]{"poster","nearby",kLocation,uArrayList,str,obj2};
                if (PatchProxy.applyVoid(objArray1, null, c, "2")) {
                label_00e3 :
                   return;
                }
             }
             a.p("poster", "poiBiz");
             a.p("nearby", "poiSubBiz");
             a.p(obj2, "resultCallback");
             a.b(PoiServicesUtilsKt.c("poster", "nearby", kLocation, uArrayList, str, false, null, null, a.a, 224, null).a(), obj2);
             goto label_00e3 ;
          }
       }
       uArrayList = null;
       goto label_0056 ;
    }
}
