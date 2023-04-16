package com.yxcorp.gifshow.profile.presenter.profile.header.operation.MyProfileAddFriendsPresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.MyProfileAddFriendsPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import t3c.a;

public class MyProfileAddFriendsPresenter$1 implements LifecycleObserver	// class@0014f8
{
    public final MyProfileAddFriendsPresenter b;

    public void MyProfileAddFriendsPresenter$1(MyProfileAddFriendsPresenter p0){
       this.b = p0;
       super();
    }
    public void onActivityResumed(){
       if (PatchProxy.applyVoid(null, this, MyProfileAddFriendsPresenter$1.class, "1")) {
          return;
       }
       if (this.b.getActivity() instanceof GifshowActivity) {
          a.c(this.b.getActivity(), this.b.B, -1, true);
       }
       return;
    }
}
