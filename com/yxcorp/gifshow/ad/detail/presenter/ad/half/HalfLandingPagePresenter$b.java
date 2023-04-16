package com.yxcorp.gifshow.ad.detail.presenter.ad.half.HalfLandingPagePresenter$b;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.half.HalfLandingPagePresenter;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import bz8.o;
import com.yxcorp.gifshow.ad.detail.half.HalfLandingPageContentFragment;
import com.yxcorp.gifshow.ad.detail.half.HalfLandingPageContentFragment$a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$a;
import nsd.u;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.DialogFragment;

public final class HalfLandingPagePresenter$b implements g	// class@0015a8
{
    public final HalfLandingPagePresenter b;

    public void HalfLandingPagePresenter$b(HalfLandingPagePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object obj = this;
       o obj1 = p0;
       if (PatchProxy.applyVoidOneRefsWithListener(obj1, obj, HalfLandingPagePresenter$b.class, "1")) {
       }else {
          HalfLandingPagePresenter$b b = obj.b;
          a.o(obj1, "it");
          Objects.requireNonNull(b);
          HalfLandingPagePresenter halfLandingP = HalfLandingPagePresenter.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, halfLandingP, "14")) {
             HalfLandingPagePresenter p = b.p;
             String str = "mPhoto";
             if (p == null) {
                a.S(str);
             }
             if (!(a.g(p.getPhotoId(), obj1.getPhotoId()) ^ 0x01)) {
                obj1 = o.class;
                Object[] objArray = null;
                if (!PatchProxy.applyVoid(objArray, b, halfLandingP, "15")) {
                   o oo = b.R8();
                   HalfLandingPagePresenter p1 = b.p;
                   if (p1 == null) {
                      a.S(str);
                   }
                   Objects.requireNonNull(oo);
                   String str1 = "<set-?>";
                   if (!PatchProxy.applyVoidOneRefs(p1, oo, obj1, "2")) {
                      a.p(p1, str1);
                      oo.b = p1;
                   }
                   oo = b.R8();
                   HalfLandingPagePresenter r = b.r;
                   if (r == null) {
                      a.S("mPhotoAdActionBarClickProcessor");
                   }
                   Objects.requireNonNull(oo);
                   if (!PatchProxy.applyVoidOneRefs(r, oo, obj1, "4")) {
                      a.p(r, str1);
                      oo.c = r;
                   }
                }
                HalfLandingPageContentFragment$a q = HalfLandingPageContentFragment.q;
                Objects.requireNonNull(q);
                HalfLandingPageContentFragment halfLandingP1 = PatchProxy.apply(objArray, q, HalfLandingPageContentFragment$a.class, "1");
                if (halfLandingP1 != PatchProxyResult.class) {
                }else {
                   halfLandingP1 = new HalfLandingPageContentFragment();
                }
                BottomSheetContainerFragment uBottomSheet = new BottomSheetContainerFragment();
                BottomSheetContainerFragment$a uoa = v15;
                BottomSheetContainerFragment$a uoa1 = v15;
                uoa = new BottomSheetContainerFragment$a(0, 0, 0, 0, false, false, false, 127, 0);
                uBottomSheet.Xg(halfLandingP1);
                uBottomSheet.Wg(uoa1);
                Activity activity = b.getActivity();
                FragmentActivity uFragmentAct = (!activity instanceof GifshowActivity)? null: activity;
                if (uFragmentAct != null) {
                   uBottomSheet.show(uFragmentAct.getSupportFragmentManager(), "");
                }
             }
          }
       label_00db :
          PatchProxy.onMethodExit(HalfLandingPagePresenter$b.class, "1");
       }
       return;
    }
}
