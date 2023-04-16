package com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$c;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class UserProfileFollowGuidePresenter$c extends GestureDetector$SimpleOnGestureListener	// class@00154c
{
    public final UserProfileFollowGuidePresenter b;

    public void UserProfileFollowGuidePresenter$c(UserProfileFollowGuidePresenter p0){
       this.b = p0;
       super();
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       if (PatchProxy.isSupport(UserProfileFollowGuidePresenter$c.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, UserProfileFollowGuidePresenter$c.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != null && p1 != null) {
          if ((p1.getY() - p0.getY()) - (float)20 > 0) {
             this.b.S8();
          }
          return true;
       }else {
          return super.onFling(p0, p1, p2, p3);
       }
    }
}
