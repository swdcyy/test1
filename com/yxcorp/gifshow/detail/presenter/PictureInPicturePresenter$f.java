package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$f;
import erd.g;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import java.lang.Object;
import eda.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import i3a.b;
import java.util.Objects;
import java.lang.Boolean;
import uw9.o;
import q87.c;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.content.res.Configuration;
import wh5.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.robust.PatchProxyResult;
import m3a.x;
import e17.i;
import hga.b;
import hga.c;
import brd.y;
import m3a.u;
import java.util.Map;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Integer;
import android.app.PictureInPictureParams$Builder;
import android.util.Rational;
import m3a.c;
import java.util.List;
import android.app.PictureInPictureParams;
import android.content.Intent;

public final class PictureInPicturePresenter$f implements g	// class@0016b7
{
    public final PictureInPicturePresenter b;

    public void PictureInPicturePresenter$f(PictureInPicturePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       e b;
       Object[] objArray2;
       boolean b2;
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureInPicturePresenter$f.class, "1")) {
       }else if(p0.a() != null){
          int i = 1;
          if (!(a.g(p0.a(), this.b.getActivity()) ^ i) && (!PlayerPanelConfigHelper.a().isSmallWindowEnable() || (b.j() || p0.b()))) {
             PictureInPicturePresenter$f tb = this.b;
             b = p0.b;
             boolean b1 = p0.b();
             Objects.requireNonNull(tb);
             PictureInPicturePresenter pictureInPic = PictureInPicturePresenter.class;
             if (!PatchProxy.isSupport(pictureInPic) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Boolean.valueOf(b1), tb, pictureInPic, "8")) {
                Object[] objArray = new Object[0];
                String str = "PictureInPicturePresent";
                o.C().w(str, "onUserLeaveHint", objArray);
                if (!tb.S8()) {
                   Activity activity = tb.getActivity();
                   if (activity != null) {
                      a.o(activity, "activity ?: return");
                      Resources resources = activity.getResources();
                      String str1 = "activity.resources";
                      a.o(resources, str1);
                      Object[] objArray1 = new Object[0];
                      o.C().w(str, "activity orientation "+resources.getConfiguration().orientation, objArray1);
                      Resources resources1 = activity.getResources();
                      a.o(resources1, str1);
                      if (resources1.getConfiguration().orientation == 2) {
                         objArray2 = new Object[0];
                         o.C().w(str, "onUserLeaveHint: ORIENTATION_LANDSCAPE not support", objArray2);
                      }else if(c.b()){
                         objArray2 = new Object[0];
                         o.C().w(str, "child lock enable", objArray2);
                      }else {
                         PictureInPicturePresenter x = tb.x;
                         if (x != null) {
                            QPhoto currentPhoto = x.getCurrentPhoto();
                            if (currentPhoto != null) {
                               a.o(currentPhoto, "mSlidePlayViewModel?.currentPhoto ?: return");
                               i obj = PatchProxy.applyOneRefs(currentPhoto, tb, pictureInPic, "10");
                               if (obj != PatchProxyResult.class) {
                                  b2 = obj.booleanValue();
                               }else {
                                  objArray1 = new Object[0];
                                  o.C().w(str, "isMeetVideoType: video "+currentPhoto.isVideoType()+", ad "+currentPhoto.isAd()+", live "+currentPhoto.isLiveStream(), objArray1);
                                  b2 = (currentPhoto.isVideoType() && (!currentPhoto.isAd() && !currentPhoto.isLiveStream()))? true: false;
                               }
                               if (b2 && x.b.b()) {
                                  tb.R8(activity);
                                  obj = i.l();
                                  if (obj != null) {
                                     obj.h();
                                  }
                                  c.c("FEATURED_PIP");
                                  pictureInPic = tb.r;
                                  if (pictureInPic == null) {
                                     a.S("mPreparePipModeObserver");
                                  }
                                  pictureInPic.onNext(Boolean.TRUE);
                                  pictureInPic = tb.w;
                                  b2 = (pictureInPic != null)? pictureInPic.b(): true;
                                  tb.C = b2;
                                  objArray1 = new Object[0];
                                  o.C().w(str, "mInitPlayStatus "+tb.C, objArray1);
                                  currentPhoto.setIsBackgroundPlayPhoto(i);
                                  tb.A.clear();
                                  View view = activity.findViewById(0x1020002);
                                  a.o(view, "activity.findViewById\(android.R.id.content\)");
                                  int childCount = view.getChildCount();
                                  for (int i1 = 0; i1 < childCount; i1 = i1 + 1) {
                                     View childAt = view.getChildAt(i1);
                                     a.o(childAt, "content.getChildAt\(i\)");
                                     View childAt1 = view.getChildAt(i1);
                                     a.o(childAt1, "content.getChildAt\(i\)");
                                     tb.A.put(childAt, Integer.valueOf(childAt1.getVisibility()));
                                     View childAt2 = view.getChildAt(i1);
                                     a.o(childAt2, "content.getChildAt\(i\)");
                                     childAt2.setVisibility(8);
                                  }
                                  PictureInPictureParams pictureInPic1 = new PictureInPictureParams$Builder().setAspectRatio(new Rational(1080, 1920)).setActions(c.a.b(activity, tb.C)).build();
                                  tb.G = i;
                                  tb.F = b;
                                  if (b1) {
                                     b1 = new Intent("android.intent.action.MAIN");
                                     b1.setFlags(0x10000000);
                                     b1.addCategory("android.intent.category.HOME");
                                     activity.startActivity(b1);
                                     activity.overridePendingTransition(0, 0);
                                  }
                                  activity.enterPictureInPictureMode(pictureInPic1);
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
