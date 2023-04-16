package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$j;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$b;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;
import k2b.e0;
import z5c.y1;
import java.lang.Integer;

public final class ProfileHeaderStatusPresenter$j implements ImageSelectSupplier$b	// class@0014dc
{
    public final ProfileHeaderStatusPresenter b;

    public void ProfileHeaderStatusPresenter$j(ProfileHeaderStatusPresenter p0){
       this.b = p0;
       super();
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileHeaderStatusPresenter$j.class, "2")) {
          return;
       }
       a.p(p0, "dialog");
       y1.E(ProfileHeaderStatusPresenter.P8(this.b), 3);
       PatchProxy.onMethodExit(ProfileHeaderStatusPresenter$j.class, "2");
       return;
    }
    public void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport2(ProfileHeaderStatusPresenter$j.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, ProfileHeaderStatusPresenter$j.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       if (p1 == 0x7f1010fe) {
          y1.E(ProfileHeaderStatusPresenter.P8(this.b), 1);
       }else if(p1 == 0x7f1010ff){
          y1.E(ProfileHeaderStatusPresenter.P8(this.b), 4);
       }
       PatchProxy.onMethodExit(ProfileHeaderStatusPresenter$j.class, "1");
       return;
    }
    public void show(){
       if (PatchProxy.applyVoidWithListener(null, this, ProfileHeaderStatusPresenter$j.class, "3")) {
          return;
       }
       y1.F(ProfileHeaderStatusPresenter.P8(this.b));
       PatchProxy.onMethodExit(ProfileHeaderStatusPresenter$j.class, "3");
       return;
    }
}
