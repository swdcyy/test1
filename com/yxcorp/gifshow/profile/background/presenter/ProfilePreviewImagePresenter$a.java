package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$a;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter;
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
import mz6.b;
import android.content.Context;
import c2c.c;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public final class ProfilePreviewImagePresenter$a implements View$OnLongClickListener	// class@00125f
{
    public final ProfilePreviewImagePresenter b;

    public void ProfilePreviewImagePresenter$a(ProfilePreviewImagePresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onLongClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ProfilePreviewImagePresenter$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       ProfilePreviewImagePresenter$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, ProfilePreviewImagePresenter.class, "6")) {
          Activity activity = tb.getActivity();
          if (activity != null) {
             a.o(activity, "activity ?: return");
             b uob = new b(activity);
             uob.e(true);
             int[] ointArray = new int[true];
             ointArray[0] = 0x7f1043c7;
             uob.j(ointArray);
             uob.h(true);
             uob.l(new c(tb, activity));
             uob.q();
          }
       }
       return true;
    }
}
