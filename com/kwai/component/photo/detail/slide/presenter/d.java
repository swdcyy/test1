package com.kwai.component.photo.detail.slide.presenter.d;
import ew6.c;
import com.kwai.component.photo.detail.slide.presenter.c;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import fx6.b;
import cx6.h;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import of5.i;
import of5.j;
import erd.g;
import com.yxcorp.utility.Log;
import android.view.View;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;

public class d extends c	// class@000a96
{
    public final b a;
    public final QPhoto b;
    public final c c;

    public void d(c p0,b p1,QPhoto p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       d tc = this.c;
       d ta = this.a;
       d tb = this.b;
       Objects.requireNonNull(tc);
       c uoc = c.class;
       if (!PatchProxy.applyVoidTwoRefs(ta, tb, tc, uoc, "11")) {
          Object obj = PatchProxy.applyTwoRefs(ta, tb, tc, uoc, "13");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): tc.t.Q0("kwai_data_source_service").e().d(tc.getActivity(), tc.u.mPhoto, new i(tc, tb), new j(tc, tb));
          if (b) {
             Log.d("SlidePlayDetailFlowPres", "querySlideKCardPhotos needUpdate");
             tb.setNeedRetryFreeTraffic(true);
             tc.q.setVisibility(0);
             QPhotoMediaPlayerCacheManager.e(tc.u.mPhoto);
             tc.t.W1(0);
          }
       }
       return;
    }
}
