package f3a.r;
import m0d.a;
import f3a.l;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.drawable.LayerDrawable;
import android.content.res.Resources;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import kotlin.jvm.internal.a;
import androidx.core.content.ContextCompat;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class r extends a	// class@002296
{
    public final l b;

    public void r(l p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       Context context;
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       if (l.R8(this.b).isAdded() && (!l.R8(this.b).isRemoving() && p0 != null)) {
          Drawable[] uDrawableArr = new Drawable[]{new BitmapDrawable(this.b.l8(), p0.getBitmap()),ContextCompat.getDrawable(context, 0x7f0601a3)};
          context = this.b.getContext();
          a.m(context);
          LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
          l u = this.b.u;
          if (u == null) {
             a.S("mBlurBackGroundImg");
          }
          u.setImageDrawable(layerDrawabl);
       }
    label_0062 :
       return;
    }
}
