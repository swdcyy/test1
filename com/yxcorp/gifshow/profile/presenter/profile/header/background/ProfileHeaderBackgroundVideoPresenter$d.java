package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$d;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter;
import java.lang.Object;
import m4c.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Boolean;
import px6.b;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import nx6.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import android.view.View;
import z5c.f3;
import m4c.p;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewStub;
import mx6.c;
import tx6.a;
import qrd.p;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$mPlayListener$2$a;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import m4c.d;
import com.google.android.material.appbar.AppBarLayout;
import com.kwai.framework.model.feed.BaseFeed;
import v5a.a$b;
import com.yxcorp.gifshow.entity.QPhoto;
import v5a.a;
import com.kwai.components.playerkit.QPhotoPlayerKitDataSource;
import m4c.q;
import rx6.b;
import msd.l;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.List;
import java.util.Collection;
import hc6.b;
import rx6.d;
import nsd.u;
import m4c.r;

public final class ProfileHeaderBackgroundVideoPresenter$d implements g	// class@0014c7
{
    public final ProfileHeaderBackgroundVideoPresenter b;

    public void ProfileHeaderBackgroundVideoPresenter$d(ProfileHeaderBackgroundVideoPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       ProfileHeaderBackgroundVideoPresenter i;
       boolean b1;
       IWaynePlayer iWaynePlayer;
       d a;
       Object obj = this;
       ProfileBgVideoInfo obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, ProfileHeaderBackgroundVideoPresenter$d.class, "1")) {
       }else {
          Object[] objArray = null;
          if (obj1.d() == 3) {
             ProfileHeaderBackgroundVideoPresenter$d b = obj.b;
             a.o(obj1, "it");
             Objects.requireNonNull(b);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             ProfileHeaderBackgroundVideoPresenter profileHeade = ProfileHeaderBackgroundVideoPresenter.class;
             if (!PatchProxy.applyVoidOneRefs(obj1, b, profileHeade, "8")) {
                b.J = b.I;
                obj1 = obj1.e();
                if (obj1 == null) {
                   i = b.J;
                }
                if (obj1 != null) {
                   b.I = obj1;
                   b.S8();
                   i = b.I;
                   ProfileHeaderBackgroundVideoPresenter j = b.J;
                   Object obj2 = PatchProxy.applyTwoRefs(i, j, b, profileHeade, "10");
                   if (obj2 != patchProxyRe) {
                      b1 = obj2.booleanValue();
                   }else if(a.g(i, j) || i == null){
                      float showAreaCent = i.getShowAreaCenterYRadio();
                      if (j != null && (showAreaCent - j.getShowAreaCenterYRadio() || (!i.getLocalVideo() || (!j.getLocalVideo() || (!a.g(i.getPath(), j.getPath()) && (i.getLocalVideo() || (j.getLocalVideo() || !a.g(i.getZtPhotoId(), j.getZtPhotoId())))))))) {
                         b1 = false;
                      }
                   }
                   b1 = true;
                   if (!b1) {
                      a uoa = PatchProxy.apply(objArray, b, profileHeade, "15");
                      if (uoa == patchProxyRe) {
                         i = b.s;
                         if (i != null) {
                            b playerKitCon = i.getPlayerKitContext();
                            if (playerKitCon != null) {
                               uoa = playerKitCon.e(a.class);
                            }
                         }
                         uoa = objArray;
                      label_00cd :
                         if (uoa != null) {
                            uoa.l();
                         }
                         iWaynePlayer = b.X8();
                         if (iWaynePlayer != null) {
                            iWaynePlayer.reset();
                         }
                         if (b.r == null) {
                            i = b.q;
                            if (i == null) {
                               a.S("mVideoViewStub");
                            }
                            View view = f3.a(i);
                            b.r = view;
                            if (view != null) {
                               view.setOnClickListener(new p(b));
                            }
                            i = b.r;
                            if (i != null) {
                               b.s = m1.f(i, 0x7f0a3e7d);
                               b.t = m1.f(i, 0x7f0a09d2);
                               b.u = m1.f(i, 0x7f0a441a);
                            }
                            if (!PatchProxy.applyVoid(objArray, b, profileHeade, "13")) {
                               i = b.s;
                               if (i != null) {
                                  i.c();
                                  uoa = i.getPlayerKitContext().d(c.class);
                                  if (uoa != null) {
                                     ProfileHeaderBackgroundVideoPresenter$mPlayListener$2$a omPlayListen = PatchProxy.apply(objArray, b, profileHeade, "3");
                                     if (omPlayListen == patchProxyRe) {
                                        omPlayListen = b.N.getValue();
                                     }
                                     uoa.d(omPlayListen);
                                  }
                               }
                            }
                         }
                      label_014d :
                         i = b.r;
                         if (i != null) {
                            i.getLayoutParams().width = n.z(i.getContext());
                            i.getLayoutParams().height = ((i.getLayoutParams().width * 150) / 414) + a1.e(24.00f);
                            b.L = i.getLayoutParams().height;
                            i.setVisibility(0);
                            a = d.a;
                            j = b.p;
                            if (j == null) {
                               a.S("mAppBarLayout");
                            }
                            a.f(j, i, (i.getLayoutParams().height + a1.d(R.dimen.arg_RES_7f0702e8)));
                         }
                         b.K = false;
                         b.R8(b.I);
                         if (!PatchProxy.applyVoid(objArray, b, profileHeade, "16")) {
                            i = b.I;
                            if (i != null) {
                               if (i.getUseFeedPlay() && i.getFeed() != null) {
                                  ProfileHeaderBackgroundVideoPresenter s = b.s;
                                  if (s != null) {
                                     BaseFeed feed = i.getFeed();
                                     a.m(feed);
                                     QPhotoPlayerKitDataSource qPhotoPlayer = QPhotoPlayerKitDataSource.g(new a$b(new QPhoto(feed)).a());
                                     a.o(qPhotoPlayer, "QPhotoPlayerKitDataSourc¡­deoInfo.feed!!\)\).build\(\)\)");
                                     s.g(qPhotoPlayer, new q());
                                  }
                               }else {
                                  CDNUrl[] uCDNUrlArray = new CDNUrl[true];
                                  uCDNUrlArray[0] = new CDNUrl("", i.getPath());
                                  ArrayList uArrayList = CollectionsKt__CollectionsKt.r(uCDNUrlArray);
                                  uArrayList.addAll(i.getExtraPaths());
                                  ProfileHeaderBackgroundVideoPresenter s1 = b.s;
                                  if (s1 != null) {
                                     CDNUrl[] uCDNUrlArray1 = new CDNUrl[0];
                                     Object[] objArray1 = uArrayList.toArray(uCDNUrlArray1);
                                     Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
                                     b uob = new b(objArray1, false, 0, null, 14, null);
                                     s1.g(profileHeade, new r());
                                  }
                               }
                               IWaynePlayer iWaynePlayer1 = b.X8();
                               if (iWaynePlayer1 != null) {
                                  iWaynePlayer1.setScreenOnWhilePlaying(0);
                                  iWaynePlayer1.setVolume(0, 0);
                                  iWaynePlayer1.setPlayerMute(true);
                                  if (i.getLocalVideo()) {
                                     long l = 0;
                                     if (i.getDuration() - l && (i.getClipStart() - l || i.getClipDuration() - i.getDuration())) {
                                     label_026a :
                                        iWaynePlayer1.setAbLoop(i.getClipStart(), (i.getClipStart() + i.getClipDuration()), -1);
                                     }
                                  }
                                  if (!i.getLocalVideo() && i.getUseFeedPlay()) {
                                     goto label_026a ;
                                  }else {
                                     iWaynePlayer1.setLooping(true);
                                  }
                               }
                            }
                         }
                      }
                      goto label_00cd ;
                   }
                }
             }
          }else {
             ProfileHeaderBackgroundVideoPresenter$d b2 = obj.b;
             b2.J = objArray;
             b2.I = objArray;
             i = b2.r;
             if (i != null) {
                i.setVisibility(8);
             }
             iWaynePlayer = obj.b.X8();
             if (iWaynePlayer != null) {
                iWaynePlayer.stop();
             }
          }
       }
    label_029b :
       return;
    }
}
