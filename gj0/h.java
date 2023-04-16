package gj0.h;
import erd.r;
import gj0.d;
import java.lang.Object;
import iu6.a;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class h implements r	// class@0024f6
{
    public final d b;

    public void h(d p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       boolean b;
       h tb = this.b;
       Object obj = PatchProxy.applyTwoRefs(p0, tb, null, KrnReactRootPreloadManager.class, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0.h() >= tb.minVersion){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
