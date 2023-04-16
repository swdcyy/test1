package c24.o;
import cb4.e;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.Map;
import ot3.l0;
import fg6.a;
import c24.o$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.live.basic.router.SandeagoData;
import java.lang.Integer;
import com.kuaishou.merchant.live.marketing.sandeago.o;

public final class o implements e	// class@000490
{

    public void o(){
       super();
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       String obj = PatchProxy.applyOneRefs(p0, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          Map map = p0.c().c();
          obj = l0.i("liveStreamId", map);
          String str = l0.i("data", map);
          if (str != null) {
             List list = a.a.i(str, new o$a().getType());
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             if (list != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   SandeagoData sandeagoData = iterator.next();
                   String mId = sandeagoData.getMId();
                   linkedHashMa.put(mId, Integer.valueOf(sandeagoData.getMStock()));
                }
             }
             o.H().l(obj, linkedHashMa);
          }
       }
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
