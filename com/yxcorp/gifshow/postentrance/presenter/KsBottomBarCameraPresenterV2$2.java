package com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ezb.e;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import po5.c;
import pr6.b;
import pr6.d;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import a0c.g;
import q87.c;
import k2b.e0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.model.CommonParams;
import dkc.b;
import com.kwai.gifshow.post.api.feature.camera.model.CameraIconInfo;
import ezb.a;

public final class KsBottomBarCameraPresenterV2$2 extends Lambda implements l	// class@001050
{
    public final KsBottomBarCameraPresenterV2 this$0;

    public void KsBottomBarCameraPresenterV2$2(KsBottomBarCameraPresenterV2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       Object[] objArray;
       b c;
       b obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, KsBottomBarCameraPresenterV2$2.class, "1")) {
          return;
       }
       a.p(p0, "jumpUrl");
       KsBottomBarCameraPresenterV2$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, KsBottomBarCameraPresenterV2.class, "18")) {
          Map map = s0.k(r0.a("icon_type", tthis$0.W8()));
          b y = c.y;
          a.o(y, "HomeFragmentFuncIds.CURRENT_SLIDE_PLAY_VIEW_MODEL");
          SlidePlayViewModel slidePlayVie = tthis$0.B.d(y);
          String str = "HomeFragmentFuncIds.LOG_PAGE";
          int i = 0;
          String str1 = "NasaCameraPresenterV2";
          if (slidePlayVie != null) {
             objArray = new Object[i];
             g.C().w(str1, "slidePlayViewModel, is not null", objArray);
             objArray = 0;
             c = c.C;
             a.o(c, str);
             obj = tthis$0.B.d(c);
             QPhoto currentPhoto = slidePlayVie.getCurrentPhoto();
             BaseFeed entity = (currentPhoto != null)? currentPhoto.getEntity(): null;
             tthis$0.P8(objArray, obj, p0, entity, b.g(slidePlayVie.getCurrentPhoto(), (slidePlayVie.a0() + 1)), map, true);
          }else {
             objArray = new Object[i];
             g.C().w(str1, "slidePlayViewModel, is null", objArray);
             obj = c.C;
             a.o(obj, str);
             tthis$0.P8(0, tthis$0.B.d(obj), p0, null, null, map, true);
          }
       }
       return;
    }
}
