package au3.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.container.halfcontainer.BottomSheetDialogContainerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.container.halfcontainer.model.HalfContainerParams;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior;

public class b extends m	// class@0002c8
{
    public final BottomSheetDialogContainerFragment c;

    public void b(BottomSheetDialogContainerFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b tc = this.c;
       BottomSheetDialogContainerFragment h = tc.H;
       if (h != null && tc.I.g == null) {
          h.setState(5);
       }
       return;
    }
}
