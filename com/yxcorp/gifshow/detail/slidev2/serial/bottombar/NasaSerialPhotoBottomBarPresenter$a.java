package com.yxcorp.gifshow.detail.slidev2.serial.bottombar.NasaSerialPhotoBottomBarPresenter$a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.yxcorp.gifshow.detail.slidev2.serial.bottombar.NasaSerialPhotoBottomBarPresenter;
import b1a.o;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import xpb.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import u8a.q;
import o8a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import u8a.q$c;

public final class NasaSerialPhotoBottomBarPresenter$a implements ActivityContext$b	// class@0019db
{
    public final NasaSerialPhotoBottomBarPresenter b;
    public final o c;

    public void NasaSerialPhotoBottomBarPresenter$a(NasaSerialPhotoBottomBarPresenter p0,o p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       a.d(this, p0);
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       a.a(this, p0, p1);
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, NasaSerialPhotoBottomBarPresenter$a.class, "1")) {
          return;
       }
       o l = this.c.l;
       NasaSlideSerialParam mPhotoPage = (l != null)? l.mPhotoPage: null;
       b uob = d.a(0x513becbe);
       a.o(uob, "PluginManager.get\(MusicRadioPlugin::class.java\)");
       if (TextUtils.equals(mPhotoPage, uob.U00())) {
          q oq = this.b.W8();
          if (oq != null && oq.d() == true) {
             oq = this.b.W8();
             if (oq != null) {
                Activity activity = this.b.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                q$c.a(oq, activity, null, 2, null);
             }
          }
       }
       return;
    }
    public void onForeground(){
       a.f(this);
    }
}
