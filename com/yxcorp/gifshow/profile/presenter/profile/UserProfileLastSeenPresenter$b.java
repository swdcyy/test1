package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import a2.i0;
import android.animation.AnimatorSet;

public final class UserProfileLastSeenPresenter$b implements Runnable	// class@001459
{
    public final UserProfileLastSeenPresenter b;

    public void UserProfileLastSeenPresenter$b(UserProfileLastSeenPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UserProfileLastSeenPresenter$b.class, "1")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = this.b.x9().getLayoutManager();
       View view = (layoutManage != null)? layoutManage.findViewByPosition((this.b.B9() + this.b.d9())): objArray;
       if (view != null) {
          i0.A0(view, (i0.w(view) + (float)4));
       }
       if (view != null) {
          objArray = this.b.a9(view);
       }
       if (objArray != null) {
          objArray.start();
       }
       return;
    }
}
