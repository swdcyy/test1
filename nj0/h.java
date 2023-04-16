package nj0.h;
import erd.g;
import com.kuaishou.krn.delegate.k;
import java.lang.Object;
import iu6.a;
import com.kuaishou.krn.delegate.KrnDelegate;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.model.BundleType;
import com.kwai.kxb.BundleSource;
import lj0.c;

public final class h implements g	// class@003335
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       KrnDelegate e = tb.e;
       BundleType uBundleType = PatchProxy.applyOneRefs(p0, tb, k.class, "14");
       if (uBundleType != PatchProxyResult.class) {
       }else if((p0.b()).equals("NETWORK")){
          uBundleType = BundleType.DOWNLOADING;
       }else if(p0.f() == BundleSource.PRESET){
          uBundleType = BundleType.INTERNAL;
       }else {
          uBundleType = BundleType.DOWNLOADED;
       }
       e.C(uBundleType);
       return;
    }
}
