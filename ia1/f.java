package ia1.f;
import erd.g;
import java.util.List;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.common.core.basic.resource.e;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.util.Collection;
import s02.a;

public final class f implements g	// class@00287b
{
    public final List b;

    public void f(List p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e.a(8, null);
       LiveResourceFileUtil.b.removeAll(this.b);
       a.a(true);
    }
}
