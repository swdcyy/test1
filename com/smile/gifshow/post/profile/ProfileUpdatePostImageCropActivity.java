package com.smile.gifshow.post.profile.ProfileUpdatePostImageCropActivity;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import com.smile.gifshow.post.profile.ProfileUpdatePostImageCropActivity$b;
import nsd.u;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import android.app.Activity;
import ekd.i;
import java.lang.String;
import lnc.i3;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.RectF;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$d;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import android.widget.ImageView;
import kotlin.jvm.internal.Ref$FloatRef;
import kxa.c$a;
import x79.j;
import java.lang.Runnable;
import xm8.g;
import java.util.Objects;
import k2b.h;
import k2b.e0;
import android.os.Bundle;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import com.kwai.framework.model.user.UserStatus;
import ym8.a;
import ym8.b;
import xm8.d;
import q87.c;
import com.yxcorp.gifshow.model.RectInfo;
import ym8.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ym8.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zm8.e;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter;
import com.smile.gifshow.post.profile.ProfileUpdatePostImageCropActivity$a;
import android.view.KeyEvent;
import android.view.Window;

public final class ProfileUpdatePostImageCropActivity extends ImageCropGifshowActivity	// class@000c5c
{
    public int b1;
    public f c1;
    public PresenterV2 d1;
    public HashMap e1;
    public static final ProfileUpdatePostImageCropActivity$b f1;

    static {
       ProfileUpdatePostImageCropActivity.f1 = new ProfileUpdatePostImageCropActivity$b(null);
    }
    public void ProfileUpdatePostImageCropActivity(){
       super();
    }
    public void A3(){
       if (this.b1 != ImageSelectSupplier$ImageSelectType.MIYOU.getValue()) {
          i.i(this, 0, 0, true);
       }
       return;
    }
    public int M(){
       return 1;
    }
    public String getPageParams(){
       String str;
       i3 oi3 = i3.f();
       ProfileUpdatePostImageCropActivity tb1 = this.b1;
       if (tb1 == ImageSelectSupplier$ImageSelectType.AVATAR.getValue()) {
          str = "HEAD";
       }else if(tb1 == ImageSelectSupplier$ImageSelectType.BACKGROUND.getValue()){
          str = "BACKGROUND";
       }else {
          str = "UNKNOWN";
       }
       oi3.d("edit_type", str);
       String str1 = oi3.e();
       a.o(str1, "JsonStringBuilder.newIns¡­Source\)\)\n        .build\(\)");
       return str1;
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "PHOTO_PREVIEW";
    }
    public void onClick(View p0){
       float f1;
       ImageCropGifshowActivity tP;
       ImageCropGifshowActivity tP1;
       a.p(p0, "v");
       int id = p0.getId();
       if (id == 0x7f0a1716) {
          super.onClick(p0);
       }else if(id == 0x7f0a1377){
          if (this.b1 == ImageSelectSupplier$ImageSelectType.MIYOU.getValue()) {
             if (!PatchProxy.applyVoid(null, this, ImageCropGifshowActivity.class, "23")) {
                RectF rectF = this.U0.a();
                RectF left = rectF.left;
                float f = (float)2;
                this.z3().setPivotX((left + ((rectF.right - left) / f)));
                left = rectF.top;
                this.z3().setPivotY((left + ((rectF.bottom - left) / f)));
                if (!this.P - null) {
                   this.P = this.z3().getScale();
                }
                float scale = this.z3().getScale();
                float rotation = this.z3().getRotation();
                f = rotation / (float)(- ImageCropGifshowActivity.Y0);
                Ref$FloatRef uFloatRef = new Ref$FloatRef();
                if ((this.z3().getDisplayRect().right - this.z3().getDisplayRect().left) - (this.z3().getDisplayRect().bottom - this.z3().getDisplayRect().top) >= 0) {
                   if (!((int)f % 2)) {
                      this.z3().setBoundsProvider(this.V0);
                      f1 = 0x3f400000;
                      tP = this.P;
                   label_00ea :
                      f1 = f1 * tP;
                   }else {
                      this.z3().setBoundsProvider(this.U0);
                      tP1 = this.P;
                   }
                }else if(((int)f % 2) == 1){
                   this.z3().setBoundsProvider(this.U0);
                   tP1 = this.P;
                }else {
                   this.z3().setBoundsProvider(this.V0);
                   f1 = 0x3faaaaab;
                   tP = this.P;
                   goto label_00ea ;
                }
                uFloatRef.element = f1;
                this.z3().post(new j(this, rotation, uFloatRef, scale));
             }
          }else {
             Objects.requireNonNull(g.a);
             a.p(this, "page");
             h.m("", "TURN_PHOTO_BUTTON").i(this);
             super.onClick(p0);
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       int intx;
       Intent intent = this.getIntent();
       if (intent != null) {
          Bundle extras = intent.getExtras();
          if (extras != null) {
             intx = extras.getInt("selectType");
          label_0015 :
             this.b1 = intx;
             super.onCreate(p0);
             ProfileUpdatePostImageCropActivity tb1 = this.b1;
             int i = 1;
             if (tb1 == ImageSelectSupplier$ImageSelectType.AVATAR.getValue()) {
                this.c1 = new a(j0.e(this.getIntent(), "userStatus"), j0.a(this.getIntent(), "disablePost", false));
             }else if(tb1 == ImageSelectSupplier$ImageSelectType.BACKGROUND.getValue()){
                this.S = i;
                this.c1 = new b(j0.a(this.getIntent(), "show_post_option", i));
                Object[] objArray1 = new Object[false];
                d.D().w("ProfileUpdatePostImageCropActivity", "mEntrySource is Profile_Background", objArray1);
             }else if(tb1 == ImageSelectSupplier$ImageSelectType.MIYOU.getValue()){
                RectInfo rectInfo = j0.e(this.getIntent(), "big_rectinfo");
                a.m(rectInfo);
                this.c1 = new e(j0.f(this.getIntent(), "taskid"), j0.f(this.getIntent(), "subbiz"), rectInfo, j0.e(this.getIntent(), "small_rectinfo"));
             }
             tb1 = this.c1;
             if (tb1 == null) {
                a.S("mDelegate");
             }
             tb1.j(this);
             View view = this.findViewById(R.id.image_crop_wrapper);
             PresenterV2 presenterV2 = new PresenterV2();
             this.d1 = presenterV2;
             presenterV2.U7(new e());
             ProfileUpdatePostImageCropActivity tc1 = this.c1;
             if (tc1 == null) {
                a.S("mDelegate");
             }
             tc1.d(presenterV2);
             presenterV2.U7(new ProfileCropImageStatusPresenter());
             presenterV2.U7(new ProfileImageNextStepPresenter());
             presenterV2.f(view);
             Object[] objArray = new Object[i];
             ProfileUpdatePostImageCropActivity$a uoa = new ProfileUpdatePostImageCropActivity$a();
             tc1 = this.c1;
             if (tc1 == null) {
                a.S("mDelegate");
             }
             uoa.b = tc1;
             objArray[0] = uoa;
             presenterV2.i(objArray);
             return;
          }
       }
       intx = 0;
       goto label_0015 ;
    }
    public void onDestroy(){
       super.onDestroy();
       ProfileUpdatePostImageCropActivity td1 = this.d1;
       if (td1 == null) {
          a.S("mPresenter");
       }
       td1.destroy();
       td1 = this.c1;
       if (td1 == null) {
          a.S("mDelegate");
       }
       td1.release();
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       if (p0 == 4) {
          ProfileUpdatePostImageCropActivity tc1 = this.c1;
          if (tc1 == null) {
             a.S("mDelegate");
          }
          if (tc1.i() != null) {
             ProfileUpdatePostImageCropActivity tc11 = this.c1;
             if (tc11 == null) {
                a.S("mDelegate");
             }
             Runnable runnable = tc11.i();
             a.m(runnable);
             runnable.run();
             return true;
          }
       }
       return super.onKeyDown(p0, p1);
    }
    public void onResume(){
       super.onResume();
       if (this.b1 == ImageSelectSupplier$ImageSelectType.MIYOU.getValue()) {
          Window window = this.getWindow();
          a.o(window, "window");
          window.setNavigationBarColor(0xff000000);
       }
       return;
    }
    public int x3(){
       int i = (this.b1 == ImageSelectSupplier$ImageSelectType.MIYOU.getValue())? 0x7f0d0fda: 0x7f0d1278;
       return i;
    }
}
