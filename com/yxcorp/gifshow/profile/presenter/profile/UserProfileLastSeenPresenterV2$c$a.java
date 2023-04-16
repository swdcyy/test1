package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$c$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import a2.i0;
import android.animation.AnimatorSet;

public final class UserProfileLastSeenPresenterV2$c$a implements Runnable	// class@001475
{
    public final UserProfileLastSeenPresenterV2$c b;

    public void UserProfileLastSeenPresenterV2$c$a(UserProfileLastSeenPresenterV2$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserProfileLastSeenPresenterV2$c$a.class, "1")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = this.b.b.x9().getLayoutManager();
       View view = (layoutManage != null)? layoutManage.findViewByPosition((this.b.b.B9() + this.b.b.d9())): objArray;
       if (view != null) {
          i0.A0(view, (i0.w(view) + (float)4));
       }
       if (view != null) {
          objArray = this.b.b.a9(view);
       }
       if (objArray != null) {
          objArray.start();
       }
       return;
    }
}
