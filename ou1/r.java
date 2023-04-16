package ou1.r;
import androidx.lifecycle.Observer;
import ou1.u;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkColorInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.Objects;
import d61.k;

public final class r implements Observer	// class@0035a7
{
    public final u b;

    public void r(u p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
       }else if(u.e3(this.b).getBackground() instanceof GradientDrawable){
          Drawable background = u.e3(this.b).getBackground();
          Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
          int[] ointArray = new int[]{k.b(p0.startColor),k.b(p0.endColor)};
          background.setColors(ointArray);
       }
       return;
    }
}
