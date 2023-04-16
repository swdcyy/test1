package com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$e;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a5c.k;
import java.lang.Enum;
import android.view.View;

public final class UserProfileFollowGuidePresenter$e implements g	// class@00154e
{
    public final UserProfileFollowGuidePresenter b;

    public void UserProfileFollowGuidePresenter$e(UserProfileFollowGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFollowGuidePresenter$e.class, "1")) {
       }else if(p0 == null){
          int i = k.a[p0.ordinal()];
          boolean b = true;
          if (i != b) {
             if (i == 2) {
                i = this.b;
                i.D = false;
                i = i.y;
                if (i != null) {
                   i.setVisibility(8);
                }
             }
          }else {
             i = this.b;
             i.D = b;
             i.P8();
          }
       }
       return;
    }
}
