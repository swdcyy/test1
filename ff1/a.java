package ff1.a;
import java.lang.String;
import ok.x;
import java.lang.Object;
import androidx.collection.ArrayMap;
import ff1.c;
import java.util.Map;
import ff1.b;
import ff1.d;
import df1.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.o;

public class a	// class@002317
{
    public final Map a;

    public void a(String p0,x p1){
       super();
       ArrayMap uArrayMap = new ArrayMap();
       this.a = uArrayMap;
       uArrayMap.put("highFrequency_followAuthor", new c(p0));
       uArrayMap.put("highFrequency_followAuthor_v2", new c(p0));
       uArrayMap.put("highFrequency_joinFansGroup", new b(p1));
       uArrayMap.put("highFrequency_joinFansGroup_v2", new b(p1));
       uArrayMap.put("highFrequency_sendGift", new d());
       uArrayMap.put("highFrequency_sendGift_v2", new d());
    }
    public boolean a(c p0){
       o obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.get(p0.h());
       boolean b = true;
       if (obj == null) {
          return b;
       }
       if (!obj.apply(p0)) {
          b = false;
       }
       return b;
    }
}
