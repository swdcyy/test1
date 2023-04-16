package com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.ja;
import java.util.Objects;
import xl8.b;
import java.lang.Number;
import com.kwai.framework.model.user.RecoUser;
import bac.p;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import android.animation.AnimatorSet;
import com.kwai.framework.model.user.User;
import iac.i0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import a7c.h;
import f7c.c;
import y6c.e;

public final class GalleryPageBigCardPresenter$d extends m	// class@00182a
{
    public final GalleryPageBigCardPresenter c;

    public void GalleryPageBigCardPresenter$d(GalleryPageBigCardPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       GalleryPageBigCardPresenter a;
       FragmentActivity activity;
       FragmentActivity uFragmentAct;
       GalleryPageBigCardPresenter q;
       i0 oi0;
       if (PatchProxy.applyVoidOneRefs(p0, this, GalleryPageBigCardPresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "v");
       ja.a();
       GalleryPageBigCardPresenter$d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, GalleryPageBigCardPresenter.class, "4")) {
          a = tc.A;
          if (a != null) {
             GalleryPageBigCardPresenter obj = tc.Q.a();
             a.o(obj, "mSelectionPosition.value");
             RecoUser recoUser = a.M0(obj.intValue());
             if (recoUser != null) {
                if (tc.c9(recoUser)) {
                   tc.R.onNext(Integer.valueOf(7));
                }else if(tc.d9(recoUser)){
                   tc.R.onNext(Integer.valueOf(6));
                }else {
                   a = tc.M;
                   if (a == null || (a.isRunning() == true || tc.I != null)) {
                      RecoUser mUser = recoUser.mUser;
                      a.o(mUser, "recoUser.mUser");
                      if (mUser.isFollowingOrFollowRequesting()) {
                      }
                   }else {
                   }
                }
             }
          }
       }
       return;
    }
}
