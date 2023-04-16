package com.yxcorp.gifshow.ad.detail.presenter.ad.pendant.AdNeoLiveVideoPendantPresenter$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pendant.AdNeoLiveVideoPendantPresenter;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.framework.model.live.LiveTipInfo;
import java.util.Objects;
import yx.j0;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import tkd.b;
import tkd.d;
import nl9.r;
import android.app.Activity;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.commercial.pendant.NeoLiveCountDown$SCENE;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.commercial.pendant.NeoLiveCountDown;

public final class AdNeoLiveVideoPendantPresenter$b implements Observer	// class@0015dd
{
    public final AdNeoLiveVideoPendantPresenter b;

    public void AdNeoLiveVideoPendantPresenter$b(AdNeoLiveVideoPendantPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String liveStreamId;
       AdNeoLiveVideoPendantPresenter r;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNeoLiveVideoPendantPresenter$b.class, "1")) {
       }else if(p0 != null){
          AvatarInfoResponse mPhoto = p0.mPhoto;
          if (mPhoto != null) {
             liveStreamId = mPhoto.getLiveStreamId();
             if (liveStreamId != null) {
             label_002f :
                String str = liveStreamId;
                p0 = 1;
                int i = 0;
                AdNeoLiveVideoPendantPresenter uAdNeoLiveVi = (str == null || !str.length())? 1: null;
                if (!uAdNeoLiveVi) {
                   AdNeoLiveVideoPendantPresenter$b tb = this.b;
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.applyVoidOneRefs(str, tb, AdNeoLiveVideoPendantPresenter.class, "3")) {
                      if (tb.r != null) {
                         p0 = new Object[i];
                         j0.c("AdNeoPendentPresenter", "mNeoLivePendant has been used", p0);
                      }else {
                         tb.q = a.d(tb.getContext(), 0x7f0d1098, tb.m8(), i);
                         View view = tb.m8();
                         Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                         view.addView(tb.q);
                         r or = d.a(0x691527a8);
                         Activity activity = tb.getActivity();
                         a.m(activity);
                         AdNeoLiveVideoPendantPresenter q = tb.q;
                         a.m(q);
                         AdNeoLiveVideoPendantPresenter p = tb.p;
                         if (p == null) {
                            a.S("mPhoto");
                         }
                         tb.r = or.Ef(activity, q, p.mEntity, str, NeoLiveCountDown$SCENE.DETAIL_VIDEO);
                         Object[] objArray = new Object[i];
                         j0.f("AdNeoPendentPresenter", "mNeoLivePendant will be start", objArray);
                         r = tb.r;
                         if (r != null) {
                            r.start();
                         }
                         tb.t = p0;
                      }
                   }
                }
             }
          }
       }
       if (p0 != null) {
          p0 = p0.mPhoto;
          if (p0 != null) {
             p0 = p0.getPhotoMeta();
             if (p0 != null) {
                p0 = p0.mLiveTipInfo;
                if (p0 != null) {
                   liveStreamId = p0.mLiveStreamId;
                   goto label_002f ;
                }
             }
          }
       }
       r = 0;
       goto label_002f ;
       return;
    }
}
