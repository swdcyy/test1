package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter$d;
import m0d.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import m4c.e;
import java.lang.Runnable;
import t45.c;

public final class ProfileHeaderBackgroundImagePresenter$d extends a	// class@0014a1
{
    public final ProfileHeaderBackgroundImagePresenter b;
    public final ImageView c;
    public final Drawable d;

    public void ProfileHeaderBackgroundImagePresenter$d(ProfileHeaderBackgroundImagePresenter p0,ImageView p1,Drawable p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenter$d.class, "1")) {
          return;
       }
       Activity activity = this.b.getActivity();
       if (activity != null && !activity.isFinishing()) {
          if (p0 != null) {
             ProfileHeaderBackgroundImagePresenter$d tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(null, tb, ProfileHeaderBackgroundImagePresenter.class, "9")) {
                c.a(new e(tb));
             }
             this.c.setImageDrawable(p0);
          }else {
             this.c.setImageDrawable(this.d);
          }
       }
       return;
    }
}
