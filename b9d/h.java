package b9d.h;
import erd.r;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.RecommendResponse;
import com.yxcorp.plugin.search.module.ModuleResponse;
import d9d.a;
import java.util.Collection;
import ekd.q;

public final class h implements r	// class@0003c2
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0.mIsFromCache == null && (p0 != a.b && !q.f(p0.mHomeGuideConfigList)))? true: false;
       return b;
    }
}
