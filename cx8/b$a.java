package cx8.b$a;
import ee6.a;
import brd.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import jq.a;
import com.yxcorp.gifshow.activity.share.model.LocationResponse;
import brd.g;
import ce6.a;
import java.util.ArrayList;
import gx8.c;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.model.mix.Location;

public final class b$a implements a	// class@00200c
{
    public final v a;

    public void b$a(v p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       a.p(p1, "errMsg");
       b$a ta = this.a;
       a.o(ta, "emitter");
       int i = 0;
       Object[] objArray = new Object[i];
       a.a("LocationAPI", "onPoiQueryFailed\(\) "+"errCode="+p0+", errMsg="+p1+" + emitter.isDisposed="+ta.isDisposed(), objArray);
       ta = this.a;
       a.o(ta, "emitter");
       if (ta.isDisposed()) {
          Object[] objArray1 = new Object[i];
          a.c("LocationAPI", "onPoiQueryFailed\(\) emitter.isDisposed", objArray1);
          return;
       }else {
          this.a.onNext(new LocationResponse());
          this.a.onComplete();
          return;
       }
    }
    public void b(a p0,ArrayList p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b$a.class, "2")) {
          return;
       }
       a.p(p0, "poiQueryTask");
       StringBuilder str = "onPoiQuerySuccess\(\)  poiInfos "+"size=";
       Integer integer = (p1 != null)? Integer.valueOf(p1.size()): null;
       b$a ta = this.a;
       a.o(ta, "emitter");
       int i = 0;
       Object[] objArray = new Object[i];
       a.c("LocationAPI", str+integer+" emitter.isDisposed="+ta.isDisposed()+' '+"poiQueryTask page="+p0.a4(), objArray);
       b$a ta1 = this.a;
       a.o(ta1, "emitter");
       if (ta1.isDisposed()) {
          Object[] objArray1 = new Object[i];
          a.c("LocationAPI", "onPoiQuerySuccess\(\) emitter.isDisposed", objArray1);
          return;
       }else {
          LocationResponse locationResp = c.a(p1, p2);
          p1 = new ArrayList();
          a.o(locationResp, "response");
          List items = locationResp.getItems();
          a.o(items, "response.items");
          p1.addAll(items);
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             iterator.next().mCheckType = 1;
          }
          locationResp.setLocations(p1);
          this.a.onNext(locationResp);
          this.a.onComplete();
          return;
       }
    }
}
