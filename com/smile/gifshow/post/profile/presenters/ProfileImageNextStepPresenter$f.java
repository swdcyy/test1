package com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$f;
import x79.g;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import xm8.d;
import w46.b;
import e17.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.net.Uri;
import ym8.f;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Bitmap;
import x79.g$a;

public final class ProfileImageNextStepPresenter$f implements g	// class@000c76
{
    public final ProfileImageNextStepPresenter a;

    public void ProfileImageNextStepPresenter$f(ProfileImageNextStepPresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(Throwable p0){
       a.p(p0, "e");
       if (PostWorkErrorTips.a(p0)) {
          d.D().e("ProfileImageNextStepPresenter", "onSaveFailed\(\) no space left", p0);
          i.a(R.style.arg_RES_7f110668, 0x7f104ab3);
       }
       d.D().e("ProfileImageNextStepPresenter", "onSaveFailed\(\) save failed.", p0);
       Activity activity = this.a.getActivity();
       if (activity != null) {
          activity.finish();
       }
       return;
    }
    public void c(int p0,int p1,Uri p2){
       a.p(p2, "saveUri");
       if (!ProfileImageNextStepPresenter.R8(this.a).e(p0, p1)) {
          Object[] objArray = new Object[0];
          d.D().t("ProfileImageNextStepPresenter", "picture size not allowed", objArray);
          Bundle uBundle = new Bundle();
          uBundle.putInt("outputX", p0);
          uBundle.putInt("outputY", p1);
          Activity activity = this.a.getActivity();
          if (activity != null) {
             activity.setResult(-1, new Intent(p2.toString()).putExtras(uBundle));
             activity.finish();
          }
          return;
       }else {
          ProfileImageNextStepPresenter.R8(this.a).k(p2);
          return;
       }
    }
    public boolean d(Bitmap p0){
       a.p(p0, "corpBitmap");
       return g$a.a(this, p0);
    }
}
