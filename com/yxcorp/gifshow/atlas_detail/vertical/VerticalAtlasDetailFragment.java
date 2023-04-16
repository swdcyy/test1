package com.yxcorp.gifshow.atlas_detail.vertical.VerticalAtlasDetailFragment;
import com.yxcorp.gifshow.atlas_detail.vertical.VerticalPhotosFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.nonslide.PhotoDetailBaseFragment;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import r89.a;
import n99.q;
import n99.w;
import n99.z;
import n99.p;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import n99.y;
import n99.v;
import n99.u;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter;
import wh5.c;
import n99.x;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import java.lang.Number;

public final class VerticalAtlasDetailFragment extends VerticalPhotosFragment	// class@001bca
{

    public void VerticalAtlasDetailFragment(){
       super();
    }
    public void ih(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, VerticalAtlasDetailFragment.class, "3")) {
          return;
       }
       a.p(p0, "presenter");
       super.ih(p0);
       PhotoDetailBaseFragment tl = this.l;
       if (tl != null) {
          DetailPlayConfig detailPlayCo = tl.getDetailPlayConfig();
          if (detailPlayCo != null && detailPlayCo.usePlayerKitPlayer() == true) {
             p0.U7(new a());
          }
       }
       p0.U7(new q());
       p0.U7(new w());
       p0.U7(new z());
       p0.U7(new p());
       if (this.k.mFromSlidePlayPhotoClick != null) {
          p0.U7(new y());
       }
       if (this.k.mFromCaptionOrCommentClick != null) {
          p0.U7(new v());
       }
       p0.U7(new u());
       tl = this.l;
       if (tl == null || tl.getSource() != 288) {
          tl = this.l;
          if (tl != null && tl.getSource() == 8) {
          label_0088 :
             if (NasaExperimentUtils.A()) {
                p0.U7(new VerticalAtlasExpandPresenter());
             }
          }
       }else {
          goto label_0088 ;
       }
       if (NasaExperimentUtils.z() && !c.b()) {
          p0.U7(new x());
       }
       PatchProxy.onMethodExit(VerticalAtlasDetailFragment.class, "3");
       return;
    }
    public View jh(LayoutInflater p0,ViewGroup p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ViewGroup obj = PatchProxy.applyTwoRefs(p0, p1, this, VerticalAtlasDetailFragment.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d049d, p1, false);
       a.c(p0, R.layout.arg_RES_7f0d08d4, view.findViewById(R.id.atlas_content_container), true);
       obj = view.findViewById(R.id.photo_detail_bottom_comment_panel_container);
       Object obj1 = PatchProxy.apply(null, this, VerticalAtlasDetailFragment.class, "2");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): 0x7f0d1117;
       a.c(p0, i, obj, true);
       a.c(p0, R.layout.arg_RES_7f0d02c9, view.findViewById(R.id.detail_toolbar_container), true);
       a.o(view, "view");
       return view;
    }
    public int kh(){
       return 0x7f0d02c6;
    }
}
