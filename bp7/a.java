package bp7.a;
import uo7.i;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import uo7.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import uo7.c0;
import bp7.a$a;
import erd.g;

public final class a extends i	// class@000438
{

    public void a(ShareAnyResponse$ShareObject p0,k p1){
       a.p(p0, "shareData");
       a.p(p1, "ksConf");
       super(p0, p1);
    }
    public t s(){
       t obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.just(this.getConfiguration()).doOnNext(new a$a(this));
       a.o(obj, "Observable.just\(configur¡­reMessage\)\)\n      }\n    }");
       return obj;
    }
}
