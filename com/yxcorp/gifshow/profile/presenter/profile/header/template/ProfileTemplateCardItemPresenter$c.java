package com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter$c;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.bubble.a$c;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.common.c$b;
import x4c.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import x4c.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;

public final class ProfileTemplateCardItemPresenter$c implements View$OnLongClickListener	// class@001544
{
    public final ProfileTemplateCardItemPresenter b;

    public void ProfileTemplateCardItemPresenter$c(ProfileTemplateCardItemPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onLongClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ProfileTemplateCardItemPresenter$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       ProfileTemplateCardItemPresenter$c tb = this.b;
       int i = 0;
       if (tb.D == null) {
          return i;
       }
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, ProfileTemplateCardItemPresenter.class, "12")) {
          Activity activity = tb.getActivity();
          if (activity != null) {
             a.o(activity, "activity ?: return");
             tb.V8();
             ProfileTemplateCardItemPresenter t = tb.t;
             if (t == null) {
                a.S("mCardView");
             }
             BubbleInterface$Position tOP = BubbleInterface$Position.TOP;
             int[] ointArray = a$c.f0(t, tOP);
             a uoa = new a(activity);
             uoa.K0(KwaiBubbleOption.e);
             uoa.z(true);
             uoa.A(true);
             uoa.P(true);
             uoa.n0(ointArray[i], ointArray[1]);
             uoa.D0(tOP);
             uoa.M(new d(tb));
             uoa.L(new e(tb, activity));
             c uoc = uoa.k();
             uoc.Z();
             tb.F = uoc;
          }
       }
       return true;
    }
}
