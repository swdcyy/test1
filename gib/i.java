package gib.i;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.componet.prettify.beauty.IMBeautifyResponse;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import dc5.c;
import gib.c;

public final class i implements o	// class@002af5
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public Object apply(Object p0){
       IMBeautifyResponse iMBeautifyRe = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (iMBeautifyRe != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          c.g("IMBeautyDataStore", "syncBeautifyData onErrorReturn "+p0);
          iMBeautifyRe = c.a();
       }
       return iMBeautifyRe;
    }
}
