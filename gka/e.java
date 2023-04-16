package gka.e;
import lnc.c3$a;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import java.lang.Object;
import android.view.Window;
import java.util.Objects;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.lang.String;
import androidx.fragment.app.Fragment;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.l1;
import android.view.WindowManager$LayoutParams;

public final class e implements c3$a	// class@002b0a
{
    public final DialogContainerFragment a;

    public void e(DialogContainerFragment p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       p0.setBackgroundDrawable(new ColorDrawable(0));
       int i = -1;
       if (ta.D < null && ta.getTag() != "sensitive_words") {
          int i1 = (l1.a(a.a().a()))? -2: -1;
          ta.D = i1;
       }
       p0.setLayout(i, ta.D);
       if (ta.E - 0xbf800000 > 0) {
          WindowManager$LayoutParams attributes = p0.getAttributes();
          attributes.dimAmount = ta.E;
          p0.setAttributes(attributes);
       }
       return;
    }
}
