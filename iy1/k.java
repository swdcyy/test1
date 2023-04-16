package iy1.k;
import iy1.l;
import jy1.b;
import java.lang.String;
import jy1.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.common.base.Optional;
import v91.n;
import jy1.j;
import ok.h;
import iy1.i;
import java.lang.Integer;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import iy1.l$a;
import iy1.j;
import java.util.Map;
import ok.x;
import d61.r;

public final class k	// class@0029c8
{

    static {
    }
    public static b a(l p0){
       String str = p0.b();
       Optional optional = PatchProxy.applyOneRefs(str, null, k.class, "1");
       if (optional != PatchProxyResult.class) {
       }else {
          optional = n.d(str).transform(new j(str));
       }
       return optional.or(b.a);
    }
    public static int b(l p0){
       return n.d(p0.b()).transform(i.b).or(Integer.valueOf(-1)).intValue();
    }
    public static l c(int p0){
       return k.f(p0);
    }
    public static Integer d(LiveMessageFrequencyConfig$FrequencyConfig p0){
       return k.e(p0);
    }
    public static Integer e(LiveMessageFrequencyConfig$FrequencyConfig p0){
       return Integer.valueOf(p0.mPriority);
    }
    public static l f(int p0){
       return new l$a(p0);
    }
    public static l g(int p0){
       return r.b(l.a, Integer.valueOf(p0), new j(p0));
    }
}
