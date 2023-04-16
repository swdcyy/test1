package com.yxcorp.gifshow.profile.presenter.MyProfileNewEmptyGuideTipPresenter$b;
import java.lang.Runnable;
import android.view.View;
import m3c.a;
import com.kwai.feature.api.social.profile.model.ProfilePostEmptyGuide;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MyProfileNewEmptyGuideTipPresenter$b implements Runnable	// class@001417
{
    public final View b;
    public final a c;
    public final ProfilePostEmptyGuide d;

    public void MyProfileNewEmptyGuideTipPresenter$b(View p0,a p1,ProfilePostEmptyGuide p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MyProfileNewEmptyGuideTipPresenter$b.class, "1")) {
          return;
       }
       this.b.setVisibility(0);
       this.c.a(this.d);
       return;
    }
}
