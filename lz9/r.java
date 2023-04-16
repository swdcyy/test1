package lz9.r;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$g;
import lz9.b0;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import tkd.b;
import tkd.d;
import ap5.a;
import wh5.a;
import m9a.l;
import com.yxcorp.gifshow.widget.popup.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.bubble.a$c;
import android.view.View;
import qp7.b;
import com.kwai.library.widget.popup.common.c$b;
import lz9.z;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import lz9.y;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class r implements ActionTrigger$g	// class@002ee8
{
    public final b0 a;

    public void r(b0 p0){
       this.a = p0;
    }
    public final void a(List p0){
       r ta = this.a;
       Objects.requireNonNull(ta);
       if (NasaSlidePlayExperimentUtil.d() && (d.a(-2061018968).AT() || (!a.f() && ta.Y.e()))) {
          a uoa = new a(ta.A.getActivity());
          uoa.I0(0x2a40);
          uoa.F0(a1.p(R.string.arg_RES_7f10076f));
          uoa.o0(ta.z());
          uoa.T(5000);
          uoa.J(new z(ta));
          uoa.M(new y(ta));
          uoa.z(true);
          uoa.P(true);
          uoa.A(true);
          ta.T = p.i(uoa);
       }
    label_006f :
       return;
    }
}
