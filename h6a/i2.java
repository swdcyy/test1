package h6a.i2;
import joc.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import java.lang.Object;
import android.view.MotionEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import android.view.View;
import v6a.o0;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class i2 implements d	// class@002593
{
    public final SlidePlayPhotoDetailVMFragment a;

    public void i2(SlidePlayPhotoDetailVMFragment p0){
       this.a = p0;
    }
    public final boolean a(MotionEvent p0,boolean p1){
       i2 ta = this.a;
       Objects.requireNonNull(ta);
       SlidePlayPhotoDetailVMFragment obj = PatchProxy.applyOneRefsWithListener(p0, ta, SlidePlayPhotoDetailVMFragment.class, "47");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(ta.P == null && r1.t5(ta.K.mPhoto.mEntity)){
          ta.P = ta.j.findViewById(0x7f0a3101);
       }
       obj = ta.P;
       if (obj != null && !obj.getVisibility()) {
          o0 o = ta.N.o;
          if (o != null && o.getAdapter() != null) {
             if (ta.N.o.getLayoutManager().i0() > 0) {
                PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "47");
             }else {
                int[] ointArray = new int[2];
                ta.P.getLocationOnScreen(ointArray);
                if (p0.getRawY() - (float)ointArray[1] > 0 && p0.getRawY() - (float)(ointArray[1] + ta.P.getHeight()) < 0) {
                   b = true;
                }
                PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "47");
             }
          }
       }
       PatchProxy.onMethodExit(SlidePlayPhotoDetailVMFragment.class, "47");
       return b;
    }
}
