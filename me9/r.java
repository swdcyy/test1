package me9.r;
import erd.o;
import me9.q$h;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.MagicGenerateUrlResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import me9.q$b;
import java.lang.RuntimeException;

public final class r implements o	// class@003018
{
    public final q$h b;

    public void r(q$h p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, r.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          List resUrl = p0.getResUrl();
          r or = (resUrl == null || resUrl.isEmpty())? 1: null;
          if (!or) {
             this.b.c.d = p0.getResUrl();
             integer = Integer.valueOf(100);
          }else {
             throw new RuntimeException("generateUrl failed");
          }
       }
       return integer;
    }
}
