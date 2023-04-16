package k99.e0$b;
import uw9.y;
import k99.e0;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.View;
import lnc.a1;
import java.lang.Float;
import java.lang.Number;
import android.widget.ImageView;
import e99.a;

public final class e0$b implements y	// class@002b73
{
    public final e0 a;

    public void e0$b(e0 p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void e(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(e0$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, e0$b.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       e0$b ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, e0.class, "5")) {
          e0 f = ta.F;
          Float uFloat = (f != null)? Float.valueOf((f.getY() - (float)a1.e(40.00f))): objArray;
          if (uFloat != null) {
             objArray = Float.valueOf((uFloat.floatValue() + (float)a1.e(10.00f)));
          }
          if (objArray != null) {
             float f1 = objArray.floatValue();
             ImageView imageView = ta.W8();
             if (imageView != null) {
                imageView.setTranslationY(f1);
             }
          }
       }
    label_006a :
       return;
    }
}
