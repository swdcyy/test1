package d5c.g0$c;
import z5c.a;
import d5c.g0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import s1c.r;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.profile.util.o;
import java.lang.Integer;
import java.util.List;
import com.kwai.library.widget.popup.bubble.a;
import java.util.Objects;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import d5c.i0;
import d5c.e0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import k07.g;
import z5c.u;

public class g0$c extends a	// class@0020f3
{
    public final g0 a;

    public void g0$c(g0 p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       g0$c obj = PatchProxy.apply(null, this, g0$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (o.l() - r.a.getLong("last_show_guide_bubble_version", 0) <= 0) {
          return false;
       }
       obj = this.a;
       if (obj.T != null || !obj.N.contains(Integer.valueOf(19))) {
          return false;
       }
       return true;
    }
    public a b(){
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g0$c obj = PatchProxy.apply(null, this, g0$c.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       int i = 19;
       Objects.requireNonNull(obj);
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          uoa = PatchProxy.applyOneRefs(Integer.valueOf(i), obj, og0, "56");
          if (uoa != patchProxyRe) {
          label_0058 :
             return uoa;
          }
       }
       uoa = u.h(obj.getActivity(), obj.s, obj.Y8(i).b(), a1.p(R.string.arg_RES_7f100245), BubbleInterface$Position.TOP, new i0(obj), 3000, 0, new e0(obj));
       obj.a1 = uoa;
       goto label_0058 ;
    }
    public String e(){
       return "user_mentioned_tab";
    }
}
