package eva.a;
import erd.g;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jva.g;
import android.widget.LinearLayout;

public final class a implements g	// class@002837
{
    public final HotSpotFragment b;

    public void a(HotSpotFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          int i = - p0.intValue();
          if (i >= 0) {
             HotSpotFragment.Yh(this.b).n1().setTranslationY(0);
          }else {
             HotSpotFragment.Yh(this.b).n1().setTranslationY((float)i);
          }
       }
       return;
    }
}
