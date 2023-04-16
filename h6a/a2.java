package h6a.a2;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import java.lang.Object;
import rd5.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import uw9.o;
import q87.c;
import v6a.z7;
import de5.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public final class a2 implements g	// class@002573
{
    public final SlidePlayHorizontalPhotosVMFragment b;

    public void a2(SlidePlayHorizontalPhotosVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a2 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefsWithListener(p0, tb, SlidePlayHorizontalPhotosVMFragment.class, "42")) {
       }else {
          FragmentActivity activity = tb.getActivity();
          if (activity != null && (tb.J != null && (activity.isFinishing() || activity.hashCode() == p0.b))) {
             PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "42");
          }else {
             p0 = p0.a;
             tb.R = (p0 != null)? tb.R + 1: tb.R - 1;
             if (p0 != null && (tb.Q == null && tb.R >= 1)) {
                if (!PatchProxy.applyVoidWithListener(null, tb, SlidePlayHorizontalPhotosVMFragment.class, "44")) {
                   Object[] objArray = new Object[0];
                   o.C().t("HorizontalDetailFragment", "release when another detail create", objArray);
                   tb.Q = true;
                   tb.K.b.u();
                   tb.L.hasReleasePlayerBackground();
                   PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "44");
                }
             }else if(p0 == null && (tb.Q != null && tb.R < 1)){
                tb.Nh("detail destroyed");
             }
             PatchProxy.onMethodExit(SlidePlayHorizontalPhotosVMFragment.class, "42");
          }
       }
       return;
    }
}
