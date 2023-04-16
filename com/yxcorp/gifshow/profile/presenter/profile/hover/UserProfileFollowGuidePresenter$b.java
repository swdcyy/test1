package com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$b;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.GestureDetector;

public final class UserProfileFollowGuidePresenter$b implements View$OnTouchListener	// class@00154b
{
    public final UserProfileFollowGuidePresenter b;

    public void UserProfileFollowGuidePresenter$b(UserProfileFollowGuidePresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefsWithListener(p0, p1, this, UserProfileFollowGuidePresenter$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b.H.onTouchEvent(p1);
       PatchProxy.onMethodExit(UserProfileFollowGuidePresenter$b.class, "1");
       return true;
    }
}
