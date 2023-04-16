package com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$d;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter;
import java.lang.Object;
import android.widget.CompoundButton;
import xm8.g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.util.Objects;
import k2b.e0;
import kotlin.jvm.internal.a;
import k2b.h;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class ProfileCropImageStatusPresenter$d implements CompoundButton$OnCheckedChangeListener	// class@000c64
{
    public final ProfileCropImageStatusPresenter b;

    public void ProfileCropImageStatusPresenter$d(ProfileCropImageStatusPresenter p0){
       this.b = p0;
       super();
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       SharedPreferences$Editor uEditor;
       g a = g.a;
       Activity activity = this.b.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       Objects.requireNonNull(a);
       a.p(activity, "page");
       h oh = h.m("", "SYNC_POST_BUTTON");
       oh.n(a.b((p1 ^ 0x01)));
       oh.i(activity);
       int i = 2;
       if (this.b.D == null) {
          if (!p1) {
             i = 1;
          }
          uEditor = a.a.edit();
          uEditor.putInt("profile_post_avator_checkbox_memory", i);
          g.a(uEditor);
          a.w1(true);
       }else if(p1){
          i = 1;
       }
       uEditor = a.a.edit();
       uEditor.putInt("profile_post_bg_checkbox_memory", i);
       g.a(uEditor);
       a.x1(true);
       return;
    }
}
