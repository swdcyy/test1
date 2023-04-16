package q90.f$c;
import io.reactivex.g;
import q90.f;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import q90.f$c$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class f$c implements g	// class@00298a
{
    public final f b;
    public final KSFeedListFragment c;

    public void f$c(f p0,KSFeedListFragment p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       f$c tb = this.b;
       tb.A.observe(tb.X8(), new f$c$a(p0));
       f$c tc = this.c;
       if (tc != null) {
          tc.a();
       }
       return;
    }
}
