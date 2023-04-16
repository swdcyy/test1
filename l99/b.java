package l99.b;
import erd.g;
import com.yxcorp.gifshow.atlas_detail.vertical.VerticalPhotosFragment;
import java.lang.Object;
import com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCoverFrameReadyEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCostMonitorHelper;

public final class b implements g	// class@002cd5
{
    public final VerticalPhotosFragment b;

    public void b(VerticalPhotosFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, VerticalPhotosFragment.class, "33")) {
       }else if(tb.w != null){
          tb.w = true;
          PhotoDetailCostMonitorHelper.e(tb);
          PhotoDetailCostMonitorHelper.g();
       }
       return;
    }
}
