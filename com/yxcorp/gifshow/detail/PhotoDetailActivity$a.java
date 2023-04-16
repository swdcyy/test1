package com.yxcorp.gifshow.detail.PhotoDetailActivity$a;
import r3a.q;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Boolean;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import tkd.b;
import tkd.d;
import wm5.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class PhotoDetailActivity$a extends q	// class@00133f
{
    public final PhotoDetailActivity a;

    public void PhotoDetailActivity$a(PhotoDetailActivity p0){
       this.a = p0;
       super();
    }
    public QPhoto c(){
       PhotoDetailActivity obj = PatchProxy.apply(null, this, PhotoDetailActivity$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.D.getBizType() == 1) {
          return this.a.D.mPhoto;
       }
       obj = this.a.E;
       if (obj != null) {
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(obj);
          if (slidePlayVie != null) {
             return slidePlayVie.getCurrentPhoto();
          }
       }
       return null;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, PhotoDetailActivity$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a.D.getBizType() == 17) {
          return true;
       }
       if (this.a.getIntent() != null && (this.a.getIntent().getData() != null && d.a(0x66aa3a58).Uc(this.a.getIntent()))) {
          return TextUtils.n(this.a.getIntent().getData().getQueryParameter("sourcePhotoPage"), "MUSIC_RADIO");
       }
       return false;
    }
}
