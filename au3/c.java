package au3.c;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$c;
import com.kuaishou.merchant.container.halfcontainer.BottomSheetDialogContainerFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import au3.g;
import java.util.Objects;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior;
import java.lang.Float;
import du3.b;

public class c implements ContainerBottomSheetBehavior$c	// class@0002c9
{
    public final BottomSheetDialogContainerFragment a;

    public void c(BottomSheetDialogContainerFragment p0){
       this.a = p0;
       super();
    }
    public void c(View p0,int p1){
       c ta;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       if (p1 == 5) {
          this.a.dismissAllowingStateLoss();
       }
       DialogContainerFragment b = this.a.B;
       if (b instanceof g) {
          if (p1 != 1) {
             b.Pg(p1, 0xbf800000);
          }
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.isSupport(BottomSheetDialogContainerFragment.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), ta, BottomSheetDialogContainerFragment.class, "10") && !ta.B.wb())) {
             BottomSheetDialogContainerFragment k = ta.K;
             if (k == 3 || k == 4) {
                ta.H.setState(k);
             }
          }
       }
    label_0063 :
       if (p1 != 1) {
          ta.K = p1;
       }
       return;
    }
    public void f(View p0,float p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoc, "2")) {
          return;
       }
       DialogContainerFragment b = this.a.B;
       if (b instanceof g) {
          b.Pg(1, p1);
       }
       this.a.Nh(p1);
       return;
    }
    public boolean g(View p0,View p1){
       return b.a(this, p0, p1);
    }
    public boolean h(View p0){
       return b.b(this, p0);
    }
}
