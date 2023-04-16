package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$defaultFilter$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter;
import an6.k;
import java.lang.Object;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import rzb.r;
import java.util.Objects;
import java.lang.Number;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.System;
import java.lang.Long;
import java.util.Map;
import com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils;
import rzb.h;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil;
import rzb.p;
import rzb.t;
import a0c.c;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.postentrance.util.b;
import a0c.g;
import q87.c;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.NewPublishGuideInfoGroup;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.NewPublishGuideInfo;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.HomeOperateIconInfo;
import rzb.s;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ixc.c;
import lnc.pa;
import lnc.qa;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.HomeExtraBubbleInfo;
import java.lang.Integer;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils;

public final class HomePostOperationBubblePresenter$defaultFilter$1 extends Lambda implements l	// class@00102c
{
    public final k $pageStateDelegate;
    public final HomePostOperationBubblePresenter this$0;

    public void HomePostOperationBubblePresenter$defaultFilter$1(HomePostOperationBubblePresenter p0,k p1){
       this.this$0 = p0;
       this.$pageStateDelegate = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(PublishGuideInfo p0){
       boolean b;
       t a;
       boolean b1;
       int i1;
       CameraEntranceUtils h;
       Object[] objArray;
       boolean b2;
       int b3;
       Object[] objArray1;
       NewPublishGuideInfo mBackGroundC;
       NewPublishGuideInfo newPublishGu;
       Object obj = this;
       PublishGuideInfo obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       r obj2 = PatchProxy.applyOneRefs(obj1, obj, HomePostOperationBubblePresenter$defaultFilter$1.class, str);
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       a.p(obj1, "bubbleInfo");
       obj2 = r.c;
       PublishGuideInfo mId = obj1.mId;
       a.o(mId, "bubbleInfo.mId");
       Objects.requireNonNull(obj2);
       String str1 = "2";
       h obj3 = PatchProxy.applyOneRefs(mId, obj2, r.class, str1);
       int i = 0;
       PublishGuideInfo publishGuide = 1;
       if (obj3 != patchProxyRe) {
          b = obj3.booleanValue();
       }else {
          a.p(mId, "bubbleId");
          Long b4 = r.b;
          if (b4 != null) {
             DateUtils.H(b4.longValue());
          }else {
             r.b = Long.valueOf(System.currentTimeMillis());
             r.a.clear();
          }
          Map a1 = r.a;
          if (a1.containsKey(mId) && a.g(a1.get(mId), Boolean.FALSE)) {
             b = true;
          }else {
             b = false;
          }
       }
       if (!b && HomePostBubbleFrequencyControlUtils.g.c(obj1)) {
          obj3 = h.b;
          if (!obj3.a(obj1) && (obj1.mType != 16 || (!HomePostEntranceExpUtil.a() && obj.this$0.u - System.currentTimeMillis() < 0))) {
             if (!p.b.b(obj1)) {
                a = t.a;
                Objects.requireNonNull(a);
                PublishGuideInfo obj4 = PatchProxy.applyOneRefs(obj1, a, t.class, str);
                if (obj4 != patchProxyRe) {
                   b1 = obj4.booleanValue();
                label_00b9 :
                   i1 = 1;
                }else {
                   a.p(obj1, "guideInfo");
                   obj4 = obj1.mId;
                   int i2 = (obj1.mBubbleUiType >= null)? 1: 0;
                   int i3 = 5;
                   if (!i2) {
                      c.b.m("bubbleId:"+obj4+", bubbleUIType:"+obj1.mBubbleUiType+" invalid");
                      b.g(obj4, i3, "v2 uiType invalid");
                      objArray = new Object[i];
                      g.C().w("home_entrance_bubble", "failed_show_bubble: checkData, uiType invalid", objArray);
                   }else {
                      PublishGuideInfo obj5 = PatchProxy.applyOneRefs(obj1, a, t.class, str1);
                      s os = 3;
                      if (obj5 != patchProxyRe) {
                         b2 = obj5.booleanValue();
                      }else if(obj1.mType == 9){
                         obj5 = obj1.mTitle;
                         obj5 = (obj5 == null || !obj5.length())? 1: null;
                         if (obj5) {
                            obj5 = obj1.mTitleImage;
                            newPublishGu = (obj5 == null || !obj5.length())? 1: 0;
                            if (newPublishGu) {
                            label_0174 :
                               b2 = false;
                            }
                         }
                      }else if(obj1.mBubbleUiType != os){
                         obj5 = obj1.mTitle;
                         newPublishGu = (obj5 == null || !obj5.length())? 1: 0;
                         if (newPublishGu) {
                         }
                      }else {
                         obj5 = obj1.mTitle;
                         obj5 = (obj5 == null || !obj5.length())? 1: null;
                         if (obj5) {
                            obj5 = obj1.mTitleImage;
                            newPublishGu = (obj5 == null || !obj5.length())? 1: 0;
                            if (newPublishGu) {
                            }
                         }
                      }
                   label_0176 :
                      b2 = true;
                      String str2 = ", bubbleType:";
                      if (!b2) {
                         c.b.m("bubbleId:"+obj4+str2+obj1.mType+" title invalid");
                         b.g(obj4, i3, "v2 title invalid");
                         objArray = new Object[i];
                         g.C().w("home_entrance_bubble", "failed_show_bubble: checkData, title invalid", objArray);
                      }else if(obj1.mClientEffectVersion == publishGuide){
                         b2 = 1;
                      }else {
                         newPublishGu = 0;
                      }
                      if (!b2) {
                         c.b.m("bubbleId:"+obj4+str2+obj1.mType+" version number invalid");
                         b.g(obj4, i3, "v2 version number invalid");
                         objArray = new Object[i];
                         g.C().w("home_entrance_bubble", "failed_show_bubble: checkData, version number invalid", objArray);
                      }else if(obj1.mExpireTime - System.currentTimeMillis() < 0){
                         c.b.m("bubbleId:"+obj4+str2+obj1.mType+" show time is expired");
                         objArray = new Object[i];
                         g.C().w("home_entrance_bubble", "failed_show_bubble: checkAvailable, show time is expired", objArray);
                         b.g(obj4, i3, "v2 show time is expired");
                      }else {
                         NewPublishGuideInfoGroup mBubbleInfo = obj1.mPublishGuideInfoGroup.mBubbleInfo;
                         NewPublishGuideInfo obj6 = PatchProxy.applyOneRefs(obj1, a, t.class, "3");
                         obj5 = 2;
                         if (obj6 != patchProxyRe) {
                            b3 = obj6.booleanValue();
                         }else if(obj1.mBubbleUiType != os){
                            String obj8 = PatchProxy.applyOneRefs(obj1, a, t.class, "5");
                            if (obj8 != patchProxyRe) {
                               b3 = obj8.booleanValue();
                            }else if(obj1.mType != 16){
                               obj8 = PatchProxy.applyOneRefs(obj1, a, t.class, "6");
                               if (obj8 != patchProxyRe) {
                                  b3 = obj8.booleanValue();
                               }else {
                                  obj6 = p0.getNewBubbleInfo();
                                  a.m(obj6);
                                  a.o(obj6, "bubbleInfo.newBubbleInfo!!");
                                  if (obj1.mCameraButtonLocation == 1) {
                                     NewPublishGuideInfo mRightTopIma = obj6.mRightTopImage;
                                     PublishGuideInfo publishGuide1 = (mRightTopIma == null || !mRightTopIma.length())? 1: null;
                                     if (!publishGuide1) {
                                     label_029b :
                                        i1 = true;
                                     label_02cd :
                                        if (!i1) {
                                           c.b.m("bubbleId:"+obj4+str2+obj1.mType+" icon config is invalid");
                                           b.g(obj4, i3, "v2 icon invalid");
                                           objArray1 = new Object[0];
                                           g.C().w("home_entrance_bubble", "checkData, icon is invalid", objArray1);
                                        }else {
                                           a.o(mBubbleInfo, "newGuideInfo");
                                           obj6 = PatchProxy.applyOneRefs(mBubbleInfo, a, t.class, "7");
                                           if (obj6 != patchProxyRe) {
                                              i = obj6.booleanValue();
                                              i1 = 1;
                                           }else {
                                              obj6 = mBubbleInfo.gradientColors;
                                              if (obj6 != null) {
                                                 y.q(obj6, s.b);
                                              }
                                              obj6 = mBubbleInfo.gradientColors;
                                              i1 = (obj6 == null || obj6.isEmpty())? 1: 0;
                                              if (i1) {
                                                 i2 = 0;
                                                 Object[] objArray2 = new Object[i2];
                                                 g.C().w("home_entrance_bubble", "failed_show_bubble: gradient color invalid use default", objArray2);
                                                 b3 = 35;
                                                 if (mBubbleInfo.mBackgroundType == null) {
                                                    mBackGroundC = mBubbleInfo.mBackGroundColor;
                                                    if (mBackGroundC != null && (mBackGroundC.length() == 7 && mBackGroundC.charAt(i2) == b3)) {
                                                       newPublishGu = mBackGroundC;
                                                    }else {
                                                       mBackGroundC = null;
                                                    label_035d :
                                                       newPublishGu = null;
                                                    }
                                                 }else {
                                                    mBackGroundC = mBubbleInfo.mGradientColorFrom;
                                                    if (mBackGroundC == null || (mBackGroundC.length() != 7 || mBackGroundC.charAt(i2) != b3)) {
                                                       mBackGroundC = null;
                                                    }
                                                    newPublishGu = mBubbleInfo.mGradientColorTo;
                                                    if (newPublishGu == null || (newPublishGu.length() != 7 || newPublishGu.charAt(i2) != '#')) {
                                                    }
                                                 }
                                                 b3 = (mBackGroundC == null || !mBackGroundC.length())? 1: 0;
                                                 if (!b3) {
                                                    b3 = (newPublishGu == null || !newPublishGu.length())? 1: 0;
                                                    if (!b3) {
                                                       String[] stringArray = new String[]{mBackGroundC,newPublishGu};
                                                       mBubbleInfo.gradientColors = CollectionsKt__CollectionsKt.L(stringArray);
                                                    }
                                                 }
                                                 String[] stringArray1 = new String[]{"#FFFFFF","#FFFFFF"};
                                                 mBubbleInfo.gradientColors = CollectionsKt__CollectionsKt.L(stringArray1);
                                              }else if(mBubbleInfo.gradientColors.size() < 2){
                                                 mBackGroundC = mBubbleInfo.gradientColors;
                                                 mBackGroundC.add(mBackGroundC.get(0));
                                              }
                                              i = true;
                                           }
                                           if (!i) {
                                              c.b.m("bubbleId:"+obj4+str2+obj1.mType+" background config is invalid");
                                              b.g(obj4, 5, "v2 bg config invalid");
                                              objArray1 = new Object[0];
                                              g.C().w("home_entrance_bubble", "checkData, bg config is invalid", objArray1);
                                           }else {
                                              c uoc = qa.r(c.class);
                                              if (uoc != null && obj1.mExtParams.mMagicVersion.intValue() > 0) {
                                                 HomeExtraBubbleInfo mMagicVersio = obj1.mExtParams.mMagicVersion;
                                                 a.o(mMagicVersio, "guideInfo.mExtParams.mMagicVersion");
                                                 if (uoc.xv(mMagicVersio.intValue())) {
                                                    c.b.m("bubbleId:"+obj4+": magic version miss match");
                                                    b.g(obj4, 5, "v2 magic version miss match");
                                                    objArray1 = new Object[0];
                                                    g.C().w("home_entrance_bubble", "failed_show_bubble: checkAvailable, magic version miss match", objArray1);
                                                 }
                                              }
                                              Object[] obj7 = PatchProxy.applyOneRefs(obj1, a, t.class, "8");
                                              if (obj7 != patchProxyRe) {
                                                 b1 = obj7.booleanValue();
                                              }else {
                                                 PublishGuideInfo mType = obj1.mType;
                                                 if (mType != 22) {
                                                    if (mType != 26) {
                                                       if (mType == 29) {
                                                       label_048a :
                                                          if (obj3.a(obj1)) {
                                                          label_0492 :
                                                             b1 = false;
                                                          }
                                                       }
                                                    }else if(obj1.mCommonShootDialog != null && !obj3.a(obj1)){
                                                    }
                                                 }else {
                                                    goto label_048a ;
                                                 }
                                                 b1 = true;
                                              }
                                              if (!b1) {
                                                 c.b.m("bubbleId:"+obj4+str2+obj1.mType+" relativeInfo invalid");
                                                 obj7 = new Object[0];
                                                 g.C().w("home_entrance_bubble", "failed_show_bubble: checkRelativeInfo, error "+obj1.mType, obj7);
                                                 b1 = false;
                                              }else {
                                                 b1 = true;
                                              }
                                           }
                                           b1 = false;
                                           objArray1 = 0;
                                        }
                                     }
                                  }
                                  if (obj1.mCameraButtonLocation == obj5) {
                                     obj6 = obj6.mImage;
                                     obj8 = (obj6 == null || !obj6.length())? 1: null;
                                     if (!obj8) {
                                        goto label_029b ;
                                     }
                                  }
                               }
                            }else {
                               goto label_029b ;
                            }
                         }else {
                            obj6 = p0.getNewBubbleInfo();
                            obj6 = (obj6 != null)? obj6.topIconInfo: null;
                            Object obj9 = PatchProxy.applyOneRefs(obj6, a, t.class, "4");
                            if (obj9 != patchProxyRe) {
                               b3 = obj9.booleanValue();
                            }else if(obj6 != null){
                               HomeOperateIconInfo mIconUrl = obj6.mIconUrl;
                               i = (mIconUrl == null || !mIconUrl.length())? 1: 0;
                               i1 = i ^ 0x01;
                               goto label_02cd ;
                            }
                         }
                      label_02cb :
                         i1 = 0;
                         goto label_02cd ;
                         i1 = b3;
                         goto label_02cd ;
                      }
                   }
                   b1 = false;
                   goto label_00b9 ;
                }
                if (!b1) {
                label_0501 :
                   i = false;
                label_0502 :
                   return i;
                }
             }else {
                i1 = 1;
             }
             HomeExtraBubbleInfo mAllowedNasa = obj1.mExtParams.mAllowedNasaTab;
             a.o(mAllowedNasa, "bubbleInfo.mExtParams.mAllowedNasaTab");
             if (obj.$pageStateDelegate.h(mAllowedNasa)) {
                h = CameraEntranceUtils.h;
                obj1 = obj1.mExtParams;
                HomeExtraBubbleInfo mRelativeAct = (obj1 != null)? obj1.mRelativeActivityId: null;
                if (h.a(mRelativeAct)) {
                   i = true;
                   goto label_0502 ;
                }else {
                   goto label_0501 ;
                }
             }else {
                goto label_0501 ;
             }
          }else {
          label_0500 :
             objArray1 = 0;
             goto label_0501 ;
          }
       }else {
          goto label_0500 ;
       }
    }
}
