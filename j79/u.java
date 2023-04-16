package j79.u;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$a;
import j79.q;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.String;
import j79.l0;
import android.view.View;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;

public final class u implements PreviewViewPager$a	// class@002795
{
    public final q a;

    public void u(q p0){
       this.a = p0;
       super();
    }
    public void a(float p0,boolean p1){
       View view;
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, ou, "1")) {
          return;
       }
       if (this.a.l.J0()) {
          view = this.a.n.o();
          if (view != null) {
             view.setAlpha(0x3f333333);
          }
       }else {
          View view1 = this.a.n.o();
          if (view1 != null) {
             view1.setAlpha((p0 * p0));
          }
          view = this.a.n.o();
          if (view != null) {
             int i = (p1)? 4: 0;
             view.setVisibility(i);
          }
       }
       return;
    }
}
