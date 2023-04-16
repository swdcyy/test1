package hh1.a$c;
import erd.g;
import yg1.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yg1.f;
import android.util.Log;
import kotlin.jvm.internal.a;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class a$c implements g	// class@0026aa
{
    public final a b;
    public final String c;

    public void a$c(a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          String stackTraceSt = Log.getStackTraceString(p0);
          a.o(stackTraceSt, "Log.getStackTraceString\(it\)");
          f uof = new f(0, stackTraceSt, null, 4, null);
          this.b.a(this.c, v0);
          b.I(LiveGiftTag.GIFT_NAMING, "[LiveGiftNamingNetworkDataSource][fetch] error ", p0);
       }
       return;
    }
}
