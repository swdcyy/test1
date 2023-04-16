package lw9.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.designercreation.preview.fragment.ItemPreviewFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import ow9.a;
import kotlin.jvm.internal.a;
import android.app.Activity;
import android.view.View;
import androidx.core.view.ViewKt;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;

public final class a implements Runnable	// class@002eaf
{
    public final ItemPreviewFragment b;

    public void a(ItemPreviewFragment p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       FragmentActivity activity = this.b.getActivity();
       if (activity != null) {
          a.o(activity, "activity");
          if (a.a.b(activity)) {
             ItemPreviewFragment e = this.b.E;
             if (e != null) {
                ViewKt.g(e, true);
             }
             e = this.b.D;
             if (e != null) {
                e.setBackground(objArray);
             }
             e = this.b.D;
             if (e != null) {
                ViewGroup$LayoutParams layoutParams = e.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                layoutParams.bottomMargin = a1.d(0x7f070337);
                e.setLayoutParams(layoutParams);
             }
          }
       }
       return;
    }
}
