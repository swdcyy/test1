package n2a.g$a;
import androidx.viewpager.widget.ViewPager$l;
import n2a.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oe6.e;
import android.content.SharedPreferences;
import java.lang.System;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.framework.location.k;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kzc.d;
import u07.t$a;
import w07.a;
import w07.l;
import n2a.e;
import u07.u;
import n2a.d;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.growth.privacy.dialog.helper.g;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kuaishou.growth.privacy.dialog.helper.j;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.config.PopupOrientation;
import n2a.i;
import n2a.f;
import q96.d;
import tk7.b;
import o96.u;

public class g$a extends ViewPager$l	// class@0030ce
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       boolean b;
       g og = g.class;
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       g$a tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, tb, og, "4");
       int i = 1;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          long l = 0;
          long longx = e.a.getLong("click_location_permission_dialog_negative_button", l);
          b = (longx - l <= 0 || (System.currentTimeMillis() - longx) - g.y > 0)? true: false;
       }
       if (b && (this.b.q.a0() == (g.z - i) && (!k.d("app_selection") && !this.b.q.r()))) {
          tb = this.b;
          if (tb.p == null) {
             Objects.requireNonNull(tb);
             if (PatchProxy.applyVoid(objArray, tb, og, "6") || (tb.getActivity() != null && !tb.getActivity().isFinishing())) {
                d uod = new d(tb.getActivity());
                uod.Z0(104);
                uod.B0(R.drawable.arg_RES_7f0805bb);
                uod.a0(new a());
                uod.y0(R.string.arg_RES_7f100edd);
                uod.W0(R.string.arg_RES_7f103046);
                uod.S0(R.string.arg_RES_7f103a83);
                uod.Q0(R.string.arg_RES_7f101518);
                uod.t0(new e(tb));
                uod.u0(new d(tb));
                uod.v(i);
                uod.z(i);
                uod.G(g.a);
                uod.O(j.a);
                uod.L(new PopupInterface$g(R.layout.arg_RES_7f0d1053));
                uod.U(PopupOrientation.ORIENTATION_PORTRAIT);
                tb.v = uod;
                u.p("app_selection", "", "selection_slide_location", "app_selection", new i(tb), new f(tb));
             }
          }
       }
    label_010c :
       return;
    }
}
