package b79.i;
import ia9.d;
import android.view.View;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ga9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import p79.c;
import android.animation.AnimatorSet;

public class i extends d	// class@000386
{
    public boolean d;

    public void i(View p0,AbsAlbumItemViewBinder p1){
       a.q(p0, "mItemView");
       a.q(p1, "viewBinder");
       super(p0, p1);
       this.d = true;
    }
    public final void d(boolean p0){
       View view1;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, i.class, "1")) {
          return;
       }
       View view = this.b().k();
       if (!PatchProxy.applyVoidOneRefs(view, null, c.class, "18") && view != null) {
          AnimatorSet tag = view.getTag(R.id.ksa_mask);
          if (tag != null) {
             tag.cancel();
          }
       }
       boolean b = false;
       if (p0) {
          view1 = this.b().k();
          if (view1 != null && !view1.getVisibility()) {
             c.e(this.b().k(), b);
          }else {
             view1 = this.b().k();
             if (view1 != null) {
                view1.setVisibility(8);
             }
          }
       }else {
          view1 = this.b().k();
          if (view1 == null || view1.getVisibility()) {
             c.e(this.b().k(), true);
          }else {
             view1 = this.b().k();
             if (view1 != null) {
                view1.setVisibility(b);
             }
          }
       }
       return;
    }
}
