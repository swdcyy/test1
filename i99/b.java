package i99.b;
import erd.g;
import com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalPhotosFragment;
import java.lang.Object;
import com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCoverFrameReadyEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCostMonitorHelper;

public final class b implements g	// class@002651
{
    public final HorizontalPhotosFragment b;

    public void b(HorizontalPhotosFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, HorizontalPhotosFragment.class, "31")) {
       }else if(tb.x != null){
          tb.x = true;
          PhotoDetailCostMonitorHelper.e(tb);
          PhotoDetailCostMonitorHelper.g();
       }
       return;
    }
}
