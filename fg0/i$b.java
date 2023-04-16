package fg0.i$b;
import java.lang.Runnable;
import fg0.i;
import androidx.fragment.app.Fragment;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import fg0.h;
import kotlin.jvm.internal.a;

public final class i$b implements Runnable	// class@002326
{
    public final i b;
    public final Fragment c;
    public final BaseFeed d;

    public void i$b(i p0,Fragment p1,BaseFeed p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i$b.class, "1")) {
          return;
       }
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "LiveTaskManagerImpl", "onLiveFragmentResume mRunnable run", false, 4, null);
       i$b tc = this.c;
       boolean b1 = (tc instanceof BaseFragment)? tc.Vg().c(): true;
       if (b1) {
          TaskCenterLogUtil.d(b, "LiveTaskManagerImpl", "onLiveFragmentResume mRunnable isSelected", false, 4, null);
          i$b td = this.d;
          if (!PatchProxy.applyVoidOneRefs(td, objArray, h.class, "2")) {
             a.p(td, "liveFeed");
             h.b = true;
             h.c = td;
          }
          this.b.i(this.d, this.c);
       }
       return;
    }
}
