package kgd.d$a;
import com.yxcorp.gifshow.widget.m;
import kgd.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.plugin.setting.utils.SettingPageExperiment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import u07.b;
import kgd.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;

public final class d$a extends m	// class@001780
{
    public final d c;

    public void d$a(d p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       d$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, d.class, "4")) {
          boolean b = tc.R8();
          if (SettingPageExperiment.a()) {
             i = (b)? 0x7f1046c5: 0x7f1046c4;
          }else if(b){
             i = 0x7f1046c3;
          }else {
             i = 0x7f1046c2;
          }
          Activity activity = tc.getActivity();
          if (activity != null) {
             a.o(activity, "activity ?: return");
             d uod = new d(activity);
             uod.b1(KwaiDialogOption.d);
             uod.V0(true);
             uod.W0(R.string.arg_RES_7f1046bf);
             uod.y0(i);
             uod.B0(R.drawable.arg_RES_7f080be0);
             d uod1 = b.c(uod);
             uod1.L(new e(tc, activity, b, R.layout.arg_RES_7f0d11ad));
             uod1.X();
          }
       }
       return;
    }
}
