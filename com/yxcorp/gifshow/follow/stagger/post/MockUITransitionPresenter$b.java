package com.yxcorp.gifshow.follow.stagger.post.MockUITransitionPresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.post.MockUITransitionPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import dja.a;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.Log;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment$a;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import qrd.l1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class MockUITransitionPresenter$b implements Runnable	// class@0011c9
{
    public final MockUITransitionPresenter b;

    public void MockUITransitionPresenter$b(MockUITransitionPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, MockUITransitionPresenter$b.class, str)) {
          return;
       }
       String str1 = "show error layout :";
       QPhoto value = MockUITransitionPresenter.P8(this.b).o0().getValue();
       String photoId = (value != null)? value.getPhotoId(): objArray;
       Log.g("MockFeedViewModel", str1+photoId);
       QPhoto value1 = MockUITransitionPresenter.P8(this.b).o0().getValue();
       if (value1 != null) {
          Activity activity = this.b.getActivity();
          if (activity != null) {
             TopSnackBarFragment$a m = TopSnackBarFragment.m;
             String str2 = "photo";
             a.o(value1, str2);
             Objects.requireNonNull(m);
             TopSnackBarFragment topSnackBarF = PatchProxy.applyOneRefs(value1, m, TopSnackBarFragment$a.class, str);
             if (topSnackBarF != PatchProxyResult.class) {
             }else {
                a.p(value1, "qPhoto");
                topSnackBarF = new TopSnackBarFragment();
                Bundle uBundle = new Bundle();
                uBundle.putParcelable(str2, b.c(value1));
                topSnackBarF.setArguments(uBundle);
             }
             str1 = "activity";
             a.o(activity, str1);
             Objects.requireNonNull(topSnackBarF);
             if (!PatchProxy.applyVoidOneRefs(activity, topSnackBarF, TopSnackBarFragment.class, "7")) {
                a.p(activity, str1);
                if (activity instanceof FragmentActivity) {
                   e uoe = activity.getSupportFragmentManager().beginTransaction();
                   a.o(uoe, "activity.supportFragmentManager.beginTransaction\(\)");
                   Fragment uFragment = activity.getSupportFragmentManager().findFragmentByTag("LocalAlbumSnackBarFragment");
                   if (uFragment != null) {
                      uoe.u(uFragment);
                   }
                   uoe.y(R.anim.bg, 0x7f010052);
                   uoe.g(0x1020002, topSnackBarF, "Top_SNACK_BAR_FRAGMENT_TAG");
                   uoe.m();
                   if (!PatchProxy.applyVoid(objArray, topSnackBarF, TopSnackBarFragment.class, "8")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "PHOTO_UPLOAD_FAIL";
                      u1.D0(null, null, 7, uElementPack, null, null);
                   }
                }
             }
          }
       }
    label_00ee :
       return;
    }
}
