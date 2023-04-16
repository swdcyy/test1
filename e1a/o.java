package e1a.o;
import com.kwai.component.feedstaggercard.experiment.HomeCardExperimentUtil;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.Number;
import androidx.collection.LruCache;
import qvb.i;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import java.lang.System;
import java.lang.StringBuilder;

public class o	// class@002052
{
    public static long a;
    public static long b;
    public static LruCache c;

    static {
       Number number = PatchProxy.apply(null, null, HomeCardExperimentUtil.class, "2");
       if (number != PatchProxyResult.class) {
       }else {
          number = HomeCardExperimentUtil.b.getValue();
       }
       o.b = (number.longValue() * 60) * 1000;
       o.c = new LruCache(3);
    }
    public void o(){
       super();
    }
    public static void a(i p0,QPhoto p1,int p2){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, o.class, "1")) {
          return;
       }
       if (!o.c.size()) {
          o.a = System.currentTimeMillis();
       }
       o.c.put(p1.getPhotoId()+p2, p0);
       return;
    }
}
