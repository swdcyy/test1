package a99.f;
import erd.g;
import a99.g;
import java.lang.Object;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l17.b;
import a99.h;
import java.util.Set;
import a99.i;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$c;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.ViewGroup$LayoutParams;

public final class f implements g	// class@00005f
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i1;
       f tb = this.b;
       tb.I = tb.W8();
       p0 = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, p0, "8")) {
       }else {
          tb.H = new b();
          tb.w.add(new h(tb));
          if (!PatchProxy.applyVoid(objArray, tb, p0, "12")) {
             tb.H.e = new i(tb);
          }
          g q = tb.q;
          int i = NasaExperimentUtils.c();
          if (i > 0) {
             q.setLongPressTimeOut((long)i);
          }
          q.setVerticalPhotosScaleHelper(tb.K);
          q.setSpecialView(tb.Y8());
          if (!PatchProxy.applyVoidOneRefs(q, tb, p0, "14")) {
             p0 = PatchProxy.apply(objArray, tb, p0, "13");
             i = 0;
             if (p0 != PatchProxyResult.class) {
                i = p0.intValue();
             }else {
                i1 = n.y(a.B);
                ImageMeta$AtlasCoverSize[] atlasSizes = tb.t.getAtlasSizes();
                if (atlasSizes != null) {
                   int len = atlasSizes.length;
                   int i2 = 0;
                   while (i < len) {
                      object oobject = atlasSizes[i];
                      ImageMeta$AtlasCoverSize mWidth = oobject.mWidth;
                      if (mWidth) {
                         float f = (float)i1 * oobject.mHeight;
                         f = f / mWidth;
                         float f1 = (float)i2 + f;
                         i2 = (int)f1;
                      }
                      i = i + 1;
                   }
                   i = i2;
                }
             }
             i1 = n.u(a.B);
             if (i) {
                if (i > i1) {
                   i = i1;
                }
                i1 = q.getLayoutParams();
                i1.width = n.y(a.B);
                i1.height = i;
                q.setLayoutParams(i1);
             }
          }
          tb.Z8();
       }
       return;
    }
}
