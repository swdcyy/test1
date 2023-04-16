package l09.a;
import nx8.j;
import androidx.fragment.app.FragmentActivity;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import l09.b;
import mxb.o;
import nx8.l;
import mrd.c;

public final class a extends j	// class@002c5e
{

    public void a(){
       super();
    }
    public int e(FragmentActivity p0,BaseFeed p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "activity");
       a.p(p1, "baseFeed");
       new b().a(p0, this, o.c, p1);
       return 23;
    }
}
