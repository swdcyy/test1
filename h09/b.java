package h09.b;
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
import h09.b$a;
import android.app.Activity;
import brd.t;
import ul9.a;
import h09.b$b;
import erd.g;
import crd.b;

public final class b extends j	// class@00252c
{

    public void b(){
       super();
    }
    public int e(FragmentActivity p0,BaseFeed p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "activity");
       a.p(p1, "baseFeed");
       a.f(p0, "commercial_popar", 0, 0, 12, null).onTerminateDetach().subscribe(new b$b(new b$a(this)));
       return 24;
    }
}
