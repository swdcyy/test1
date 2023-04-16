package com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter$e;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$b;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.MyProfileBackgroundEditPresenter;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import z5c.y1;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import xl8.b;
import m4c.a;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivity;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPreviewActivity$a;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;

public final class MyProfileBackgroundEditPresenter$e implements ImageSelectSupplier$b	// class@00149a
{
    public final MyProfileBackgroundEditPresenter b;

    public void MyProfileBackgroundEditPresenter$e(MyProfileBackgroundEditPresenter p0){
       this.b = p0;
       super();
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileBackgroundEditPresenter$e.class, "1")) {
          return;
       }
       y1.N(MyProfileBackgroundEditPresenter.R8(this.b), "cancel");
       return;
    }
    public void onClick(DialogInterface p0,int p1){
       ProfileBgVideoInfo profileBgVid;
       if (PatchProxy.isSupport(MyProfileBackgroundEditPresenter$e.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, MyProfileBackgroundEditPresenter$e.class, "2")) {
          return;
       }
       if (p1 == 0x7f103fe9) {
          y1.N(MyProfileBackgroundEditPresenter.R8(this.b), "view");
          Activity activity = this.b.getActivity();
          if (activity != null) {
             a.o(activity, "activity ?: return");
             p1 = MyProfileBackgroundEditPresenter.P8(this.b).a().d();
             if (p1) {
                if (p1 == 3) {
                   profileBgVid = MyProfileBackgroundEditPresenter.P8(this.b).a().e();
                   if (profileBgVid != null) {
                      ProfileBackgroundPreviewActivity.z.b(activity, profileBgVid);
                   }
                }
             }else {
                File uFile = MyProfileBackgroundEditPresenter.P8(this.b).a().c();
                if (uFile != null) {
                   String absolutePath = uFile.getAbsolutePath();
                   a.o(absolutePath, "absolutePath");
                   ProfileBackgroundPreviewActivity.z.c(activity, absolutePath);
                   return;
                }else {
                   profileBgVid = MyProfileBackgroundEditPresenter.P8(this.b).a().e();
                   if (profileBgVid != null) {
                      List coverUrls = profileBgVid.getCoverUrls();
                      if (coverUrls != null) {
                         ProfileBackgroundPreviewActivity.z.d(activity, new ArrayList(coverUrls));
                         return;
                      }
                   }
                   ArrayList uArrayList = MyProfileBackgroundEditPresenter.P8(this.b).a().b();
                   if (uArrayList != null) {
                      ProfileBackgroundPreviewActivity.z.d(activity, uArrayList);
                   }
                }
             }
          }else {
             return;
          }
       }else if(p1 == ImageSelectSupplier.q){
          y1.N(MyProfileBackgroundEditPresenter.R8(this.b), "shoot");
       }else if(p1 == ImageSelectSupplier.p){
          y1.N(MyProfileBackgroundEditPresenter.R8(this.b), "album");
       }
       return;
    }
    public void show(){
    }
}
