package cb5.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorFilter;
import android.view.View;
import androidx.fragment.app.Fragment;

public final class b0 extends PresenterV2	// class@000441
{
    public Fragment p;

    public void b0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "2")) {
          return;
       }
       Paint paint = new Paint();
       ColorMatrix uColorMatrix = new ColorMatrix();
       uColorMatrix.setSaturation(0);
       paint.setColorFilter(new ColorMatrixColorFilter(uColorMatrix));
       b0 tp = this.p;
       if (tp != null) {
          View view = tp.getView();
          if (view != null) {
             view.setLayerType(2, paint);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
