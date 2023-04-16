package cx8.c$b;
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

public final class c$b implements a	// class@00200f
{
    public final v a;

    public void c$b(v p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       a.p(p1, "errMsg");
       int i = 0;
       Object[] objArray = new Object[i];
       a.a("LocationAPI", "onPoiQueryFailed\(\) "+"errCode="+p0+", errMsg="+p1+" + emitter.isDisposed="+this.a.isDisposed(), objArray);
       if (this.a.isDisposed()) {
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
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$b.class, "2")) {
          return;
       }
       a.p(p0, "poiQueryTask");
       StringBuilder str = "onPoiQuerySuccess\(\)  poiInfos "+"size=";
       Integer integer = (p1 != null)? Integer.valueOf(p1.size()): null;
       Object[] objArray = new Object[0];
       a.c("LocationAPI", str+integer+" emitter.isDisposed="+this.a.isDisposed()+' '+"poiQueryTask page="+p0.a4(), objArray);
       if (this.a.isDisposed()) {
          Object[] objArray1 = new Object[0];
          a.c("LocationAPI", "onPoiQuerySuccess\(\) emitter.isDisposed", objArray1);
          return;
       }else {
          this.a.onNext(c.a(p1, p2));
          this.a.onComplete();
          return;
       }
    }
}
