package f69.u;
import android.view.View$OnClickListener;
import f69.x;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.User;
import e69.a;
import androidx.fragment.app.Fragment;
import qa9.q;
import qa9.s;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import lnc.o5;
import com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import tkd.b;
import tkd.d;
import vu5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ol5.a;

public final class u implements View$OnClickListener	// class@0022c5
{
    public final x b;

    public void u(x p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, x.class, "9")) {
       }else if(tb.getActivity() == null){
          a.c(tb.u);
          if (s.a(tb.v) != null) {
             ProfileStartParam profileStart = ProfileStartParam.l(tb.u);
             int i = o5.b(tb.w, 0);
             ProfileExtraKey fOLLOW_REFER = ProfileExtraKey.FOLLOW_REFER;
             Objects.requireNonNull(profileStart);
             ProfileStartParam profileStart1 = ProfileStartParam.class;
             if (PatchProxy.isSupport(profileStart1) && PatchProxy.applyTwoRefs(fOLLOW_REFER, Integer.valueOf(i), profileStart, profileStart1, "12") != PatchProxyResult.class) {
             }else {
                profileStart.a.putInt(fOLLOW_REFER.getValue(), i);
             }
             d.a(-1718536792).Y7(tb.getActivity(), profileStart);
             x t = tb.t;
             if (t != null) {
                t.b(tb.u.mId);
             }
          }
       }
       return;
    }
}
