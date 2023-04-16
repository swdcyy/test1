package a04.h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a04.j;
import a04.a;
import kotlin.Pair;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;

public final class h implements g	// class@00000e
{
    public final boolean b;

    public void h(boolean p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          j.k.e(a.d.b(), this.b);
          a.g(MerchantHomeLogBiz.Predict, "MerchantHomePreloadPredict", "request location error");
       }
       return;
    }
}
