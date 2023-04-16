package ou1.h;
import androidx.lifecycle.Observer;
import ou1.o;
import java.lang.Object;
import hu1.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.Objects;
import d61.k;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.GradientDrawable$Orientation;
import lnc.a1;

public final class h implements Observer	// class@00359d
{
    public final o b;

    public void h(o p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int[] ointArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          int i = 2;
          if (o.e3(this.b).getBackground() instanceof GradientDrawable) {
             Drawable background = o.e3(this.b).getBackground();
             Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
             ointArray = new int[i];
             ointArray[0] = k.b(p0.b());
             ointArray[1] = k.b(p0.a());
             background.setColors(ointArray);
          }else {
             View view = o.e3(this.b);
             h tb = this.b;
             a.o(p0, "it");
             Objects.requireNonNull(tb);
             GradientDrawable gradientDraw = PatchProxy.applyOneRefs(p0, tb, o.class, "9");
             if (gradientDraw != PatchProxyResult.class) {
             }else {
                gradientDraw = new GradientDrawable();
                ointArray = new int[i];
                ointArray[0] = k.b(p0.b());
                ointArray[1] = k.b(p0.a());
                gradientDraw.setColors(ointArray);
                gradientDraw.setShape(0);
                gradientDraw.setGradientType(0);
                gradientDraw.setOrientation(GradientDrawable$Orientation.LEFT_RIGHT);
                gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07042c));
             }
             view.setBackground(gradientDraw);
          }
       }
       return;
    }
}
