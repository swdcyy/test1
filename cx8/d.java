package cx8.d;
import io.reactivex.g;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cx8.a;
import cx8.a$a;
import cx8.d$a;
import erd.f;
import java.lang.CharSequence;
import fg6.a;
import cx8.d$b;
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
import com.kwai.poi.service.PoiDataServiceManager$getKeywordsPois$1;
import ee6.a;
import java.lang.Integer;
import com.kwai.poi.service.model.PoiServiceRequestConfig;
import msd.l;
import com.kwai.poi.service.utils.PoiServicesUtilsKt;

public final class d implements g	// class@002013
{
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public void d(String p0,String p1,String p2,String p3,String p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void subscribe(v p0){
       ArrayList uArrayList;
       Object obj = this;
       d obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, d.class, "1")) {
          return;
       }
       a.p(obj1, "emit");
       a c = a.c;
       a$a uoa = a.a(c);
       a.m(uoa);
       uoa.e(obj1);
       obj1.setCancellable(new d$a(obj));
       obj1 = obj.c;
       int i = 0;
       if (obj1 != null) {
          Gson gson = (obj1.length() > 0)? 1: null;
          if (gson == 1) {
             a$a obj2 = a.a.i(obj.c, new d$b().getType());
             a.o(obj2, "Gsons.KWAI_GSON.fromJson¡­ist<Distance>>\(\) {}.type\)");
             uArrayList = c.b(obj2);
          label_0059 :
             KLocation kLocation = j8.b();
             String str = j8.g(null, obj.d, obj.e);
             Object[] objArray = new Object[i];
             a.c("LocationAPI", "locationSearchNew\(\) location = "+kLocation+','+" extra = "+str+",  mediaLocations = "+uArrayList, objArray);
             obj1 = obj.b;
             if (obj1 == null) {
                String str1 = "";
             }
             d uod = obj1;
             d f = obj.f;
             obj2 = a.a(c);
             a.m(obj2);
             c = a.class;
             if (PatchProxy.isSupport(c)) {
                Object[] objArray1 = new Object[]{"poster","search",uod,f,kLocation,uArrayList,str,obj2};
                if (PatchProxy.applyVoid(objArray1, null, c, "3")) {
                label_00fa :
                   return;
                }
             }
             a.p("poster", "poiBiz");
             a.p("search", "poiSubBiz");
             a.p(uod, "keyword");
             a.p(obj2, "resultCallback");
             PoiServicesUtilsKt.d("poster", "search", uod, kLocation, uArrayList, f, str, "", Integer.valueOf(1), a.a, new PoiDataServiceManager$getKeywordsPois$1(obj2));
             goto label_00fa ;
          }
       }
       uArrayList = null;
       goto label_0059 ;
    }
}
