package o34.d;
import o34.e;
import java.lang.Object;
import o34.f$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;

public abstract class d implements e	// class@00372c
{
    public ComponentInfo a;

    public void d(){
       super();
    }
    public boolean b(f$a p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.equals(p0.name(), "liveCartRemoveAction")) {
          String str = p0.a().get("id");
          if (TextUtils.isEmpty(str)) {
             return false;
          }else {
             obj = this.c().iterator();
             while (obj.hasNext()) {
                Object obj1 = obj.next();
                if (obj1 instanceof ComponentInfo && TextUtils.equals(obj1.getId(), str)) {
                   this.a = obj1;
                   return true;
                }
             }
          }
       }
       return false;
    }
    public abstract List c();
}
