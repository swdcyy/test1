package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$c;
import android.view.ViewOutlineProvider;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class UserProfileLastSeenPresenter$c extends ViewOutlineProvider	// class@00145a
{
    public final float a;

    public void UserProfileLastSeenPresenter$c(float p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserProfileLastSeenPresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "outline");
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), this.a);
       return;
    }
}
