package com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$d;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class ProfileCropVideoSizePresenter$d implements View$OnTouchListener	// class@001255
{
    public final ProfileCropVideoSizePresenter b;

    public void ProfileCropVideoSizePresenter$d(ProfileCropVideoSizePresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, ProfileCropVideoSizePresenter$d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       ProfileCropVideoSizePresenter.R8(this.b).setVisibility(8);
       this.b.Y8();
       return false;
    }
}
