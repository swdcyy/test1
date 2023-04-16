package ba6.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.u1;
import w96.d;
import java.lang.StringBuilder;
import q87.c;

public final class d implements g	// class@00044e
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else if(p0 != null){
          b.a(0x4b316083).X0();
          u1.V("URT_CONFIG_ERROR", p0.toString(), 1);
          Object[] objArray = new Object[0];
          d.C().t("UrtConfigManager", "°æ±¾ºÅ£º"+p0.getMessage(), objArray);
       }
       return;
    }
}
