package com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalAtlasDetailFragment;
import com.yxcorp.gifshow.atlas_detail.horizontal.HorizontalPhotosFragment;
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
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.d;
import k99.r;
import k99.i0;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.f;
import k99.d0;
import rkd.b;
import k99.j0;
import k99.q;
import k99.p;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4;
import wh5.c;
import k99.e0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import java.lang.Number;

public final class HorizontalAtlasDetailFragment extends HorizontalPhotosFragment	// class@001baf
{

    public void HorizontalAtlasDetailFragment(){
       super();
    }
    public void ih(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, HorizontalAtlasDetailFragment.class, "3")) {
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
       p0.U7(new d());
       p0.U7(new r());
       p0.U7(new i0());
       p0.U7(new f());
       p0.U7(new d0());
       if (b.g()) {
          p0.U7(new j0());
       }
       p0.U7(new q());
       p0.U7(new p());
       tl = this.l;
       if (tl == null || tl.getSource() != 288) {
          tl = this.l;
          if (tl != null && tl.getSource() == 8) {
          label_008a :
             if (NasaExperimentUtils.A()) {
                p0.U7(new HorizontalAtlasExpandPresenterV4());
             }
          }
       }else {
          goto label_008a ;
       }
       if (NasaExperimentUtils.z() && !c.b()) {
          p0.U7(new e0());
       }
       PatchProxy.onMethodExit(HorizontalAtlasDetailFragment.class, "3");
       return;
    }
    public View jh(LayoutInflater p0,ViewGroup p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ViewGroup obj = PatchProxy.applyTwoRefs(p0, p1, this, HorizontalAtlasDetailFragment.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d049d, p1, false);
       a.c(p0, R.layout.arg_RES_7f0d07df, view.findViewById(R.id.atlas_content_container), true);
       obj = view.findViewById(R.id.photo_detail_bottom_comment_panel_container);
       Object obj1 = PatchProxy.apply(null, this, HorizontalAtlasDetailFragment.class, "2");
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
