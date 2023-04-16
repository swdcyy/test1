package com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$i;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ScrollView;

public final class ProfileCropVideoSizePresenter$i implements Runnable	// class@00125a
{
    public final ProfileCropVideoSizePresenter b;
    public final int c;

    public void ProfileCropVideoSizePresenter$i(ProfileCropVideoSizePresenter p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ProfileCropVideoSizePresenter$i.class, "1")) {
          return;
       }
       ProfileCropVideoSizePresenter r = this.b.r;
       if (r == null) {
          a.S("mScrollView");
       }
       r.setScrollY((this.c / 2));
       return;
    }
}
