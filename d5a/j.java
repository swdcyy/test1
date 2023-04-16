package d5a.j;
import erd.g;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ok.x;
import bm5.h;
import com.kwai.feature.api.corona.player.model.LandscapeParam;
import wx6.c;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import bf5.t;
import brd.y;
import tkd.b;
import tkd.d;
import cm5.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lq9.a;
import com.yxcorp.gifshow.widget.SwipeLayout;
import joc.a0;
import ge5.d;
import joc.z;
import com.kwai.feature.api.corona.player.model.PausePageState;
import kotlin.jvm.internal.a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import id5.o;
import hn5.c;
import im8.f;
import com.yxcorp.gifshow.util.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import f5a.b;
import com.kwai.feature.api.corona.player.model.ShareLogPageInfo;
import k2b.e0;
import com.kwai.feature.api.corona.player.model.CoronaVipState;
import com.yxcorp.gifshow.detail.presenter.landscape.helper.LandscapePhotoShareStateHelper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import com.kwai.feature.api.corona.player.model.LandscapeTubeSerialEvent;
import java.util.List;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Integer;
import w85.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import qvb.i;
import zl5.f;
import zl5.d;
import io.reactivex.subjects.PublishSubject;
import gz9.a;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import d5a.o;
import java.lang.Runnable;
import android.os.Handler;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.j;
import com.kwai.feature.api.corona.player.model.LandscapePlcClickEvent;
import crd.a;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import d5a.l;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import d5a.m;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class j implements g	// class@001e83
{
    public final LandscapeEntranceVMPresenter b;

    public void j(LandscapeEntranceVMPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       LandscapeEntranceVMPresenter k;
       LandscapeEntranceVMPresenter e;
       VerticalViewPager verticalView;
       ViewTreeObserver viewTreeObse;
       ShareLogPageInfo shareLogPage;
       QPhoto mPhoto;
       List list;
       Integer integer;
       LandscapeEntranceVMPresenter t1;
       Integer integer1;
       LandscapeTubeSerialEvent obj1;
       MilanoContainerEventBus c;
       QPhoto mPhoto3;
       int i1;
       LandscapeEntranceVMPresenter t2;
       Object[] objArray1;
       a f;
       Object[] objArray2;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, j.class, "1")) {
       }else {
          j b = obj.b;
          Objects.requireNonNull(b);
          LandscapeEntranceVMPresenter landscapeEnt = LandscapeEntranceVMPresenter.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, b, landscapeEnt, "17")) {
             LandscapeEntranceVMPresenter v = b.V;
             if (v != null) {
                x ox = v.e();
                if (ox != null) {
                   LandscapeParam landscapePar = ox.get();
                   if (landscapePar != null) {
                      String str = "LandscapeEntrancePresenter";
                      if (b.X8()) {
                         c mSharedSessi = landscapePar.getMSharedSession();
                         if (mSharedSessi != null && !PatchProxy.applyVoidOneRefs(mSharedSessi, b, landscapeEnt, "16")) {
                            k = b.A;
                            if (k != null) {
                               MilanoContainerEventBus g = k.g;
                               if (g != null) {
                                  g.onNext(new t(str, mSharedSessi));
                               }
                            }
                         }
                      }
                      Activity activity = b.getActivity();
                      Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                      boolean b1 = false;
                      d.a(-2032246691).D20(activity, landscapePar, b1);
                      Boolean fALSE = Boolean.FALSE;
                      a.b(landscapePar.getMFullTimeSessionId(), "isAdShow", fALSE);
                      k = b.K;
                      int i = 15;
                      boolean b2 = true;
                      if (k != null) {
                         k.n(b2, i);
                      }
                      k = b.J;
                      if (k != null) {
                         a0 uoa0 = k.b();
                         if (uoa0 != null) {
                            uoa0.g(i);
                         }
                      }
                      b.Z8(b1);
                      String str1 = "mPlayModule";
                      if (landscapePar.getMPausePageState().b()) {
                         k = b.u;
                         if (k == null) {
                            a.S(str1);
                         }
                         e player = k.getPlayer();
                         if (player != null) {
                            player.seekTo(0);
                         }
                         landscapePar.setMSyncPlayState(b2);
                      }
                      a.f(landscapePar.getMFullTimeSessionId(), "playerShareCost");
                      a.f(landscapePar.getMFullTimeSessionId(), "clientRenderTime");
                      String str2 = "mFragment";
                      String str3 = "isChangedPhoto";
                      if (landscapePar.getMHasChangedPhoto()) {
                         Boolean tRUE = Boolean.TRUE;
                         a.b(landscapePar.getMFullTimeSessionId(), str3, tRUE);
                         if (!PatchProxy.applyVoidOneRefs(landscapePar, b, landscapeEnt, "19")) {
                            b.R = b2;
                            if (!PatchProxy.applyVoid(objArray, b, landscapeEnt, "29") && (!o.a() && !b.getActivity() instanceof c)) {
                               k = b.q;
                               str3 = "mActivityOpacityHasChangedRef";
                               if (k == null) {
                                  a.S(str3);
                               }
                               if (a.g(k.get(), fALSE)) {
                                  k = b.q;
                                  if (k == null) {
                                     a.S(str3);
                                  }
                                  k.set(tRUE);
                                  Activity activity2 = b.getActivity();
                                  a.m(activity2);
                                  new c(activity2).a();
                               }
                            }
                         label_0133 :
                            if (a.g(landscapePar.getMPhoto(), landscapePar.getMStartPhoto())) {
                               k = b.v;
                               if (k == null) {
                                  a.S("mPhotoDetailParam");
                               }
                               k.getDetailPlayConfig().setEnableSharePlayerMode();
                            }
                            boolean mSyncPlaySta = landscapePar.getMSyncPlayState();
                            ShareLogPageInfo mShareLogPag = landscapePar.getMShareLogPageInfo();
                            if (mShareLogPag != null) {
                               shareLogPage = mShareLogPag;
                            }else {
                               LandscapeEntranceVMPresenter c1 = b.C;
                               if (c1 == null) {
                                  a.S(str2);
                               }
                               shareLogPage = ShareLogPageInfo.create(c1);
                            }
                            a.o(shareLogPage, "landscapeParam.mShareLog¡­ageInfo.create\(mFragment\)");
                            b uob = new b(mSyncPlaySta, 1, shareLogPage, landscapePar.getMPlayerSpeed(), false, landscapePar.getMJoySoundIsOpen(), landscapePar.getMCoronaVipState().a(), landscapePar.getMCoronaVipState().b(), landscapePar.getMImageDetailOpen());
                            LandscapePhotoShareStateHelper b3 = LandscapePhotoShareStateHelper.b;
                            mPhoto = landscapePar.getMPhoto();
                            a.m(mPhoto);
                            Objects.requireNonNull(b3);
                            if (!PatchProxy.applyVoidTwoRefs(mPhoto, k, b3, LandscapePhotoShareStateHelper.class, "2")) {
                               a.p(mPhoto, "photo");
                               String photoId = mPhoto.getPhotoId();
                               a.o(photoId, "photo.photoId");
                               b3.a().put(photoId, k);
                            }
                            if (!PatchProxy.applyVoidOneRefs(landscapePar, b, landscapeEnt, "20")) {
                               a.f(landscapePar.getMFullTimeSessionId(), "replacePhotoCost");
                               e = b.I;
                               if (e != null) {
                                  e.set(landscapePar.getMPhoto());
                               }
                               if (landscapePar.getMOutputTubeSerialEvent() == null) {
                                  a.b(landscapePar.getMFullTimeSessionId(), "isSerialDetail", fALSE);
                                  e = b.T;
                                  if (e != null) {
                                     list = e.I0();
                                     if (list != null) {
                                        integer = Integer.valueOf(list.indexOf(landscapePar.getMStartPhoto().mEntity));
                                     label_0208 :
                                        t1 = b.T;
                                        if (t1 != null) {
                                           List list1 = t1.I0();
                                           if (list1 != null) {
                                              QPhoto mPhoto1 = landscapePar.getMPhoto();
                                              mPhoto1 = (mPhoto1 != null)? mPhoto1.mEntity: objArray;
                                              integer1 = Integer.valueOf(list1.indexOf(mPhoto1));
                                           label_0226 :
                                              if (integer1 != null && (integer1.intValue() < 0 || a.g(integer, integer1))) {
                                                 e = b.T;
                                                 if (e != null) {
                                                    QPhoto mPhoto2 = landscapePar.getMPhoto();
                                                    a.m(mPhoto2);
                                                    LandscapeEntranceVMPresenter x = b.x;
                                                    if (x != null) {
                                                       obj1 = PatchProxy.apply(objArray, x, a.class, "25");
                                                       if (obj1 != PatchProxyResult.class) {
                                                          b1 = obj1.booleanValue();
                                                       }else if(x.R != null){
                                                          f = x.F;
                                                       }else {
                                                          f = x.U.getNasaSlideParam().mModifyOriginDataAlso;
                                                       }
                                                    }else {
                                                       f = true;
                                                    }
                                                    e.o(mPhoto2, b1, str);
                                                 }
                                              }else {
                                                 e = b.T;
                                                 if (e != null) {
                                                    e.k(integer1.intValue(), b1);
                                                 }
                                              }
                                           }
                                        }
                                        integer1 = objArray;
                                        goto label_0226 ;
                                     }
                                  }
                                  integer = objArray;
                                  goto label_0208 ;
                               }
                            label_0277 :
                               LandscapeTubeSerialEvent mOutputTubeS = landscapePar.getMOutputTubeSerialEvent();
                               if (mOutputTubeS != null) {
                                  a.b(landscapePar.getMFullTimeSessionId(), "isSerialDetail", tRUE);
                                  if (!q.f(mOutputTubeS.mSerialPhotoList)) {
                                     ArrayList uArrayList = new ArrayList(mOutputTubeS.mSerialPhotoList);
                                     t1 = b.T;
                                     i oi = (t1 != null)? t1.X0(): objArray;
                                     if (!oi instanceof f) {
                                        oi = objArray;
                                     }
                                     if (oi != null) {
                                        obj1 = mOutputTubeS.mPcursor;
                                        a.o(obj1, "event.mPcursor");
                                        oi.x(obj1);
                                        mOutputTubeS = mOutputTubeS.mBcursor;
                                        a.o(mOutputTubeS, "event.mBcursor");
                                        oi.n(mOutputTubeS);
                                     }
                                     e = b.T;
                                     if (e != null) {
                                        e.x(uArrayList, landscapePar.getMPhoto(), true, "SERIAL LANDSCAPE");
                                     }
                                     e = b.A;
                                     if (e != null) {
                                        c = e.C;
                                        if (c != null) {
                                           mPhoto3 = landscapePar.getMPhoto();
                                           a.m(mPhoto3);
                                           c.onNext(mPhoto3);
                                        }
                                     }
                                  }else {
                                     e = b.T;
                                     if (e != null) {
                                        list = e.I0();
                                        if (list != null) {
                                           mPhoto3 = landscapePar.getMPhoto();
                                           mPhoto3 = (mPhoto3 != null)? mPhoto3.mEntity: objArray;
                                           i1 = list.indexOf(mPhoto3);
                                        label_02f5 :
                                           t2 = b.T;
                                           if (t2 != null) {
                                              t2.k(i1, false);
                                           }
                                        }
                                     }
                                     i1 = 0;
                                     goto label_02f5 ;
                                  }
                               }
                               a.e(landscapePar.getMFullTimeSessionId(), "replacePhotoCost");
                            }
                         }
                      }else {
                         a.b(landscapePar.getMFullTimeSessionId(), str3, fALSE);
                         if (!PatchProxy.applyVoidOneRefs(landscapePar, b, landscapeEnt, "21")) {
                            e = b.u;
                            if (e == null) {
                               a.S(str1);
                            }
                            e.getPlayer();
                            if (!b.X8()) {
                               e = b.u;
                               if (e == null) {
                                  a.S(str1);
                               }
                               e.x();
                            }
                            e = b.s;
                            if (e == null) {
                               a.S("mPayCourseEventCombination");
                            }
                            e.d(landscapePar.getMPayCourseTrailFinishShow());
                            if (!landscapePar.getMPayCourseTrailFinishShow() && !landscapePar.getMCoronaVipState().a()) {
                               a uoa = a.d();
                               k = b.t;
                               if (k == null) {
                                  a.S("mPhoto");
                               }
                               PlayEvent$Status rESUME = (landscapePar.getMSyncPlayState())? PlayEvent$Status.RESUME: PlayEvent$Status.PAUSE;
                               uoa.k(new PlayEvent(k, rESUME, 1, "LandscapeExit"));
                            }
                            LandscapePhotoShareStateHelper b4 = LandscapePhotoShareStateHelper.b;
                            t2 = b.t;
                            if (t2 == null) {
                               a.S("mPhoto");
                            }
                            b4.b(t2);
                            boolean mSyncPlaySta1 = landscapePar.getMSyncPlayState();
                            t2 = b.C;
                            if (t2 == null) {
                               a.S(str2);
                            }
                            ShareLogPageInfo shareLogPage1 = ShareLogPageInfo.create(t2);
                            a.o(shareLogPage1, "ShareLogPageInfo.create\(mFragment\)");
                            b uob1 = new b(mSyncPlaySta1, 1, shareLogPage1, landscapePar.getMPlayerSpeed(), landscapePar.getMPayCourseTrailFinishShow(), landscapePar.getMJoySoundIsOpen(), landscapePar.getMCoronaVipState().a(), landscapePar.getMCoronaVipState().b(), landscapePar.getMImageDetailOpen());
                            o oo = new o(b4, b);
                            b.M = oo;
                            a.m(oo);
                            b.L.post(oo);
                            RxBus f1 = RxBus.f;
                            k = b.t;
                            if (k == null) {
                               a.S("mPhoto");
                            }
                            f1.b(new j(k, false, landscapePar.getMSyncPlayState()));
                            b.d9(landscapePar.getMPhoto());
                            LandscapePlcClickEvent mOutputPlcCl = landscapePar.getMOutputPlcClickEvent();
                            if (mOutputPlcCl != null) {
                               t2 = b.y;
                               if (t2 != null) {
                                  t2.onNext(mOutputPlcCl);
                               }
                            }
                         }
                      }
                   label_03f6 :
                      a.e(landscapePar.getMFullTimeSessionId(), "playerShareCost");
                      b.P = false;
                      b.U.dispose();
                      b.V = objArray;
                      b.U = new a();
                      e = b.E;
                      if (e != null) {
                         e.onNext(Boolean.TRUE);
                      }
                      String mFullTimeSes = landscapePar.getMFullTimeSessionId();
                      if (!PatchProxy.applyVoidOneRefs(mFullTimeSes, b, landscapeEnt, "18")) {
                         landscapeEnt = b.T;
                         if (landscapeEnt != null) {
                            verticalView = landscapeEnt.s2();
                            if (verticalView != null) {
                               viewTreeObse = verticalView.getViewTreeObserver();
                               if (viewTreeObse != null) {
                                  viewTreeObse.addOnGlobalLayoutListener(new l(b, mFullTimeSes));
                               }
                            }
                         }
                         landscapeEnt = b.T;
                         if (landscapeEnt != null) {
                            verticalView = landscapeEnt.s2();
                            if (verticalView != null) {
                               viewTreeObse = verticalView.getViewTreeObserver();
                               if (viewTreeObse != null) {
                                  viewTreeObse.addOnPreDrawListener(new m(b, mFullTimeSes));
                               }
                            }
                         }
                      }
                   label_0454 :
                      Activity activity1 = b.getActivity();
                      if (activity1 instanceof GifshowActivity) {
                         objArray = activity1;
                      }
                      if (objArray != null) {
                         e uoe = d.a(-2032246691);
                         LandscapeEntranceVMPresenter t = b.t;
                         if (t == null) {
                            a.S("mPhoto");
                         }
                         uoe.Q9(objArray, t);
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
