package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$mScreenWidth$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z5c.o2;
import java.lang.Integer;

public final class ProfilePreviewImagePresenter$mScreenWidth$2 extends Lambda implements a	// class@001267
{
    public final ProfilePreviewImagePresenter this$0;

    public void ProfilePreviewImagePresenter$mScreenWidth$2(ProfilePreviewImagePresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, ProfilePreviewImagePresenter$mScreenWidth$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return o2.a(this.this$0.getActivity());
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
