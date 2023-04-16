package c03.h;
import erd.g;
import c03.k;
import c03.k$a;
import java.lang.Object;
import com.kuaishou.live.basic.resourcemanager.LiveCommonResourceResult;
import java.util.List;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.util.Map;

public final class h implements g	// class@00048e
{
    public final k b;
    public final k$a c;

    public void h(k p0,k$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tc = this.c;
       b.S(this.b.a, "[checkDependResourceReady] ", "liveCommonResourceResult", p0);
       tc.a(p0.mResMap);
       tc.b(p0.mIsAllSuccess);
    }
}
