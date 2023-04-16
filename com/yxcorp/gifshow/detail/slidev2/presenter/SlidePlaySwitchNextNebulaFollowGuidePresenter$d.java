package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$d;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter;
import java.lang.Object;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Number;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import kotlin.jvm.internal.a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import java.lang.Boolean;
import zm5.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import fv5.a;
import xx9.a;
import uw9.o;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import q87.c;
import com.kwai.library.widget.popup.common.c$b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s4a.g;
import android.text.TextUtils$TruncateAt;
import b8a.v2;
import s4a.b;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import gv5.a;
import im8.f;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.lang.System;
import java.util.ArrayList;

public final class SlidePlaySwitchNextNebulaFollowGuidePresenter$d implements g	// class@0018e0
{
    public final SlidePlaySwitchNextNebulaFollowGuidePresenter b;

    public void SlidePlaySwitchNextNebulaFollowGuidePresenter$d(SlidePlaySwitchNextNebulaFollowGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       long l1;
       int b;
       String str1;
       SlidePlaySwitchNextNebulaFollowGuidePresenter t;
       boolean b1;
       List list;
       SlidePlaySwitchNextNebulaFollowGuidePresenter f;
       SlidePlaySwitchNextNebulaFollowGuidePresenter a;
       SlidePlaySwitchNextNebulaFollowGuidePresenter f1;
       int i1;
       Object obj = this;
       SlidePlaySwitchNextNebulaFollowGuidePresenter$d obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SlidePlaySwitchNextNebulaFollowGuidePresenter slidePlaySwi = SlidePlaySwitchNextNebulaFollowGuidePresenter.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, SlidePlaySwitchNextNebulaFollowGuidePresenter$d.class, "1")) {
       }else {
          long l = obj1.longValue();
          obj1 = obj.b;
          Objects.requireNonNull(obj1);
          Object[] objArray = null;
          FollowSlideRecoGuide obj2 = PatchProxy.apply(objArray, obj1, slidePlaySwi, "9");
          String str = null;
          if (obj2 != patchProxyRe) {
             l1 = obj2.longValue();
          }else {
             obj2 = obj1.Z8();
             l1 = (obj2 != null)? obj2.mShowInterval * (long)1000: str;
             f = obj1.u;
             if (f == null) {
                a.S("mDetailPlayModule");
             }
             e player = f.getPlayer();
             a.o(player, "mDetailPlayModule.player");
             long duration = player.getDuration();
             if (duration - l1 <= 0) {
                l1 = (long)((double)duration * 0x3fe3333333333333);
             }
          }
          if (l - l1 < 0) {
             obj1 = obj.b;
             Objects.requireNonNull(obj1);
             if (!PatchProxy.applyVoid(objArray, obj1, slidePlaySwi, "5")) {
                o obj3 = PatchProxy.apply(objArray, obj1, slidePlaySwi, "13");
                int i = 0;
                if (obj3 != patchProxyRe) {
                   b = obj3.booleanValue();
                }else {
                   a = obj1.A;
                   if (a == null) {
                      a.S("mSlidePlaySceneRecord");
                   }
                   if (a.a()) {
                      FollowSlideRecoGuide uFollowSlide1 = obj1.Z8();
                      if (uFollowSlide1 != null && uFollowSlide1.mRecoGuideHasShowed == null) {
                         a = obj1.s;
                         str1 = "mSlidePlayViewModel";
                         if (a == null) {
                            a.S(str1);
                         }
                         if (a.C() && (!TextUtils.x(obj1.W8()) && (obj1.C == null && obj1.D == null))) {
                            a = obj1.s;
                            if (a == null) {
                               a.S(str1);
                            }
                            List list1 = a.I0();
                            b = (list1 != null)? list1.size(): 0;
                            if (b > 1) {
                               a = obj1.s;
                               if (a == null) {
                                  a.S(str1);
                               }
                               b = a.a0();
                               t = obj1.s;
                               if (t == null) {
                                  a.S(str1);
                               }
                               if (b != (t.Q() - 1)) {
                                  a = obj1.s;
                                  if (a == null) {
                                     a.S(str1);
                                  }
                                  if (!a.b1() - null) {
                                     Object[] obj5 = PatchProxy.apply(objArray, obj1, slidePlaySwi, "14");
                                     if (obj5 != patchProxyRe) {
                                        b = obj5.booleanValue();
                                     }else {
                                        a = obj1.F;
                                        if (a != null) {
                                           b = a.h();
                                           if (b) {
                                              if (b == 1) {
                                                 a = obj1.F;
                                                 list1 = (a != null)? a.k(): objArray;
                                                 b = obj1.X8(list1);
                                                 f1 = obj1.F;
                                                 i1 = (f1 != null)? f1.m(): 1;
                                                 if (b >= i1) {
                                                 label_0155 :
                                                    b = false;
                                                 }
                                              }
                                           }else {
                                              a = obj1.F;
                                              if (a != null) {
                                                 list1 = a.k();
                                                 if (list1 != null) {
                                                    b = list1.size();
                                                 label_0147 :
                                                    f1 = obj1.F;
                                                    i1 = (f1 != null)? f1.m(): 1;
                                                    if (b >= i1) {
                                                    }
                                                 }
                                              }
                                              b = 0;
                                              goto label_0147 ;
                                           }
                                           b = true;
                                        }else {
                                           goto label_0155 ;
                                        }
                                     }
                                     if (b) {
                                        a = obj1.v;
                                        if (a == null) {
                                           a.S("mScreenCleanStatusCombination");
                                        }
                                        if (!a.c()) {
                                           b = true;
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                label_0169 :
                   b = false;
                }
                if (b) {
                   obj3 = o.C();
                   str1 = "showGuidePopup";
                   t = obj1.t;
                   if (t == null) {
                      a.S("mPhoto");
                   }
                   Object[] objArray1 = new Object[i];
                   obj3.w("FollowRecoGuidePresenter", str1+r1.t1(t.mEntity), objArray1);
                   Activity activity = obj1.getActivity();
                   a.m(activity);
                   c$b uob = new c$b(activity);
                   long l2 = obj1.Y8() * 1000;
                   Object obj4 = PatchProxy.apply(objArray, obj1, slidePlaySwi, "8");
                   if (obj4 != patchProxyRe) {
                      b1 = obj4.booleanValue();
                   }else if(!obj1.Y8() - str){
                      i = 1;
                   }
                   b1 = i;
                   g og = new g(uob, l2, b1);
                   obj1.B = og;
                   og.e0(1);
                   SlidePlaySwitchNextNebulaFollowGuidePresenter b2 = obj1.B;
                   if (b2 != null) {
                      b2.d0(TextUtils$TruncateAt.MIDDLE);
                   }
                   b2 = obj1.B;
                   if (b2 != null) {
                      b2.g0(obj1.W8(), R.raw.arg_RES_7f0f008a);
                   }
                   b2 = obj1.B;
                   if (b2 != null) {
                      b2.c0(new v2(obj1));
                   }
                   if (!PatchProxy.applyVoid(objArray, obj1, slidePlaySwi, "11")) {
                      ShowMetaData showMetaData = new ShowMetaData();
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "FOLLOW_TEXT_POPUP";
                      i3 oi3 = i3.f();
                      oi3.d("text", obj1.W8());
                      uElementPack.params = oi3.e();
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      SlidePlaySwitchNextNebulaFollowGuidePresenter t1 = obj1.t;
                      if (t1 == null) {
                         a.S("mPhoto");
                      }
                      uContentPack.photoPackage = w1.f(t1.mEntity);
                      showMetaData.setElementPackage(uElementPack);
                      showMetaData.setContentPackage(uContentPack);
                      u1.B0(showMetaData);
                   }
                   b2 = obj1.t;
                   if (b2 == null) {
                      a.S("mPhoto");
                   }
                   QPhoto mEntity = b2.mEntity;
                   if (mEntity != null) {
                      FollowSlideRecoGuide uFollowSlide = a.a.a(mEntity);
                      if (uFollowSlide != null) {
                         uFollowSlide.mRecoGuideHasShowed = true;
                      }
                   }
                   b2 = obj1.E;
                   if (b2 != null) {
                      b2.set(Boolean.TRUE);
                   }
                   b2 = obj1.G;
                   if (b2 != null) {
                      NasaSlideParam nasaSlidePar = b2.getNasaSlideParam();
                      if (nasaSlidePar != null) {
                         nasaSlidePar.mIsRecoGuideHasShowed = true;
                      }
                   }
                   l = System.currentTimeMillis();
                   if (!PatchProxy.isSupport(slidePlaySwi) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), obj1, slidePlaySwi, "6")) {
                      b2 = obj1.F;
                      if (b2 != null) {
                         list = b2.k();
                         if (list != null) {
                         label_028b :
                            if (!obj1.X8(list)) {
                               list = new ArrayList();
                            }
                            list.add(Long.valueOf(l));
                            f = obj1.F;
                            if (f != null) {
                               f.e(list);
                            }
                         }
                      }
                      list = new ArrayList();
                      goto label_028b ;
                   }
                }
             }
          }
       }
    label_02a4 :
       return;
    }
}
