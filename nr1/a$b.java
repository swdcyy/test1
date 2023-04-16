package nr1.a$b;
import androidx.lifecycle.Observer;
import nr1.a;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import lnc.a1;
import android.text.TextPaint;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class a$b implements Observer	// class@0033ad
{
    public final a b;
    public final TextView c;

    public void a$b(a p0,TextView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       float f;
       int i2;
       int i3;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          a$b tb = this.b;
          a$b tc = this.c;
          a.o(p0, "shrinkLevel");
          int i = p0.intValue();
          Objects.requireNonNull(tb);
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(tc, Integer.valueOf(i), tb, uoa, "2")) {
             boolean b = true;
             int i1 = 0x7f070334;
             if (i != b) {
                f = (float)a1.d(0x7f070356);
                i1 = a1.d(i1);
                i2 = a1.d(R.dimen.arg_RES_7f070295);
                i3 = a1.d(R.dimen.arg_RES_7f07031b);
             }else {
                f = (float)a1.d(0x7f070267);
                i2 = a1.d(R.dimen.arg_RES_7f0702b8);
                i3 = a1.d(i1);
                i1 = a1.d(i1);
                b = false;
             }
             tc.setTextSize(0, f);
             f = tc.getPaint();
             a.o(f, "anchorTagTextView.paint");
             f.setFakeBoldText(b);
             tc.setPadding(i3, 0, i3, 0);
             if (tc.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                f = tc.getLayoutParams();
                Objects.requireNonNull(f, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                f.height = i2;
                f.setMargins(0, 0, i1, i1);
             }
          }
       }
       return;
    }
}
