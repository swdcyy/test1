package com.kuaishou.tuna_core.button.TunaButton$Companion;
import java.lang.Object;
import nsd.u;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.tuna.button.ActionParams;
import com.kwai.framework.model.tuna.button.JumpUrlModel;
import com.kuaishou.android.model.feed.k;
import com.kwai.framework.model.tuna.button.PhoneInfoModel;
import android.app.Activity;
import ma6.a;
import java.lang.Integer;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.button.TunaButton$Companion$jumpUrl$1;
import msd.a;
import c15.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.tuna_core.button.TunaButton$Companion$jumpUrl$3$1;
import java.util.concurrent.atomic.AtomicInteger;
import com.kuaishou.tuna_core.button.TunaButton$Companion$a;
import java.util.Map;
import agc.c;
import agc.a;
import h05.d;
import com.kuaishou.tuna_core.button.TunaButton;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.tuna_core.krn.TunaKrnUtils;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion;
import android.net.Uri;
import ekd.x0;
import com.kwai.kds.krn.api.page.KrnFloatingConfig;
import at6.a;
import java.lang.Throwable;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$openKrnDialog$1;
import com.kwai.kds.krn.api.page.KwaiKrnBottomSheetFragment;
import com.kwai.kds.krn.api.page.KwaiKrnBottomSheetFragment$a;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kuaishou.tuna_core.krn.d;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$KrnActionManager;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.kuaishou.tuna_core.krn.e;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment$LayoutStyle;
import com.kuaishou.tuna_core.half_screen_webview.h;
import java.lang.Float;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import android.view.Window;
import com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment$a;
import java.lang.Number;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment;
import wz4.l;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.tuna_core.button.TunaButton$Companion$performAction$1;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kuaishou.tuna_core.button.TunaButton$Companion$b;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;
import com.kuaishou.tuna_core.button.TunaButtonMonitor;
import com.kuaishou.tuna_core.button.TunaButton$Companion$performActionInterval$1;
import com.kwai.framework.model.tuna.button.FollowUserInfoModel;
import jga.f$a;
import jga.f;
import com.kuaishou.tuna_core.button.a;
import com.kuaishou.tuna_core.button.b;
import erd.g;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.kuaishou.tuna_core.button.TunaPhoneAction;
import java.lang.ref.WeakReference;
import uz4.a;
import java.io.Serializable;
import ju5.g;

public final class TunaButton$Companion	// class@001092
{

    public void TunaButton$Companion(){
       super();
    }
    public void TunaButton$Companion(u p0){
       super();
    }
    public final void a(TunaButtonModel p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaButton$Companion.class, "1")) {
          return;
       }
       if (p1 != null) {
          if (p0 != null) {
             TunaButtonModel mActionParam = p0.mActionParams;
             if (mActionParam != null) {
                ActionParams mJumpUrlMode = mActionParam.mJumpUrlModel;
                if (mJumpUrlMode != null) {
                   mJumpUrlMode.mUrl = k.u(mJumpUrlMode.mUrl, p1);
                   mJumpUrlMode.mTkUrl = k.u(mJumpUrlMode.mTkUrl, p1);
                   mJumpUrlMode.mKrnUrl = k.u(mJumpUrlMode.mKrnUrl, p1);
                }
             }
          }
          if (p0 != null) {
             p0 = p0.mActionParams;
             if (p0 != null) {
                ActionParams mPhoneInfoMo = p0.mPhoneInfoModel;
                if (mPhoneInfoMo != null) {
                   mPhoneInfoMo.mAdCallBack = p1;
                }
             }
          }
       }
    label_003b :
       return;
    }
    public final void b(Activity p0,JumpUrlModel p1,a p2,Integer p3){
       String str1;
       JumpUrlModel mUrl;
       TunaButton$Companion a;
       boolean b;
       String str6;
       boolean b2;
       TunaButton$Companion uCompanion1;
       String str8;
       Map map2;
       KrnFloatingConfig krnFloatingC;
       Object obj3;
       int i2;
       Activity uActivity = p0;
       JumpUrlModel jumpUrlModel = p1;
       a uoa = p2;
       Integer integer = p3;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, TunaButton$Companion.class, "7")) {
          return;
       }
       KsLogTunaCoreTag tUNA_BUTTON = KsLogTunaCoreTag.TUNA_BUTTON;
       String str = "jumpUrl";
       tUNA_BUTTON.appendTag(str);
       b.f(tUNA_BUTTON, new TunaButton$Companion$jumpUrl$1(jumpUrlModel));
       if (uActivity) {
          Map map = null;
          if (!uActivity instanceof GifshowActivity) {
             uActivity = map;
          }
          if (uActivity != null) {
             Map map1 = uActivity;
             if (jumpUrlModel != null) {
                uoa.mOpenType = jumpUrlModel.mOpenType;
                if (integer) {
                   str1 = String.valueOf(p3.intValue());
                   if (str1 != null) {
                   label_0050 :
                      String str2 = str1;
                      JumpUrlModel mOpenType = jumpUrlModel.mOpenType;
                      String str3 = "JumpFailed";
                      int i = 3;
                      int i1 = 2;
                      if (mOpenType != 1) {
                         if (mOpenType != i1) {
                            if (mOpenType != i) {
                               uoa.mFailureReason = "JumpOpenTypeInvalid";
                               tUNA_BUTTON.appendTag(str);
                               b.g(tUNA_BUTTON, TunaButton$Companion$jumpUrl$3$1.INSTANCE);
                            }else {
                               mUrl = jumpUrlModel.mUrl;
                               uoa.mJumpUrl = mUrl;
                               a.b(map1, mUrl, map, new TunaButton$Companion$a(uoa.a.incrementAndGet(), jumpUrlModel, uoa, integer));
                            }
                         }else if(!d.b(uActivity, jumpUrlModel)){
                            uoa.mFailureReason = str3;
                         }
                         uoa.mJumpUrl = jumpUrlModel.mUrl;
                      }else {
                         a = TunaButton.a;
                         Objects.requireNonNull(a);
                         PatchProxyResult patchProxyRe = PatchProxyResult.class;
                         String str4 = str3;
                         TunaButton$Companion uCompanion = TunaButton$Companion.class;
                         String str5 = 1;
                         TunaKrnUtils$Companion obj = PatchProxy.applyFourRefsWithListener(map1, p1, str2, p2, a, TunaButton$Companion.class, "11");
                         if (obj != patchProxyRe) {
                            b = obj.booleanValue();
                            str6 = str4;
                         }else {
                            boolean b1 = false;
                            b = jumpUrlModel.getIsHiddenHalfScreenMask(b1);
                            Ref$ObjectRef obj1 = PatchProxy.applyOneRefs(jumpUrlModel, a, uCompanion, "8");
                            if (obj1 != patchProxyRe) {
                               b2 = obj1.booleanValue();
                            }else {
                               mUrl = jumpUrlModel.mKrnUrl;
                               if (mUrl != null) {
                                  b2 = (mUrl.length() > 0)? 1: 0;
                                  if (b2 == str5) {
                                     b2 = true;
                                  }
                               }
                               b2 = false;
                            }
                            if (b2) {
                               mUrl = jumpUrlModel.mKrnUrl;
                               uoa.mJumpUrl = mUrl;
                               obj = TunaKrnUtils.b;
                               a.o(mUrl, "model.mKrnUrl");
                               Objects.requireNonNull(obj);
                               String str7 = str4;
                               uCompanion1 = uCompanion;
                               str8 = str2;
                               map2 = map1;
                               Uri obj2 = PatchProxy.applyThreeRefs(map1, mUrl, str2, obj, TunaKrnUtils$Companion.class, "1");
                               if (obj2 != patchProxyRe) {
                                  b1 = obj2.booleanValue();
                               }else {
                                  a.p(map2, "activity");
                                  a.p(mUrl, "uriString");
                                  a.p(str8, "eventId");
                                  obj2 = x0.f(mUrl);
                                  str1 = "openKrnDialog";
                                  if (obj2 != null) {
                                     try{
                                        krnFloatingC = a.c(map2, obj2);
                                     label_0139 :
                                        if (krnFloatingC == null) {
                                           b.g(KsLogTunaCoreTag.TUNA_KRN.appendTag(str1), new TunaKrnUtils$Companion$openKrnDialog$1(mUrl));
                                        }else {
                                           KwaiKrnBottomSheetFragment kwaiKrnBotto = KwaiKrnBottomSheetFragment.z.a(krnFloatingC);
                                           obj1 = new Ref$ObjectRef();
                                           obj3 = null;
                                           obj1.element = obj3;
                                           kwaiKrnBotto.ph(new d(obj1, str8, kwaiKrnBotto));
                                           kwaiKrnBotto.Cb(map2.getSupportFragmentManager(), obj3);
                                           TunaKrnUtils$Companion$KrnActionManager uCompanion$K = new TunaKrnUtils$Companion$KrnActionManager(map2);
                                           if (!PatchProxy.applyVoid(obj3, uCompanion$K, TunaKrnUtils$Companion$KrnActionManager.class, "1")) {
                                              a uoa1 = a.b();
                                              if (uoa1 != null) {
                                                 uoa1.a("KSBusinessClueDialogPerformTunaAction", uCompanion$K.a());
                                              }
                                           }
                                           kwaiKrnBotto.k0(new e(uCompanion$K, obj1));
                                           b1 = 1;
                                        }
                                     }catch(java.lang.Exception e0){
                                        b.c(KsLogTunaCoreTag.TUNA_KRN.appendTag(str1), e0);
                                     }
                                     krnFloatingC = null;
                                     goto label_0139 ;
                                  }else {
                                     goto label_0138 ;
                                  }
                               }
                               str6 = str7;
                            }else {
                               str6 = str4;
                               uCompanion1 = uCompanion;
                               str8 = str2;
                               map2 = map1;
                               mOpenType = jumpUrlModel.mUrl;
                               uoa.mJumpUrl = mOpenType;
                               CommercialDialogWebFragment$LayoutStyle sTYLE_ROUND_ = CommercialDialogWebFragment$LayoutStyle.STYLE_ROUND_CORNER;
                               JumpUrlModel mNeedLoading = jumpUrlModel.mNeedLoadingView;
                               JumpUrlModel mExtMap = jumpUrlModel.mExtMap;
                               jumpUrlModel = jumpUrlModel.mHeightRatio;
                               float f = 0.30f;
                               if (PatchProxy.isSupport(h.class)) {
                                  Object[] objArray = new Object[9];
                                  objArray[b1] = map2;
                                  objArray[1] = mOpenType;
                                  objArray[2] = sTYLE_ROUND_;
                                  objArray[3] = Boolean.valueOf(mNeedLoading);
                                  objArray[4] = Boolean.valueOf(b);
                                  objArray[5] = Float.valueOf(f);
                                  objArray[6] = str8;
                                  objArray[7] = mExtMap;
                                  objArray[8] = Float.valueOf(jumpUrlModel);
                                  if (PatchProxy.apply(objArray, null, h.class, "2") != patchProxyRe) {
                                     obj3 = 1;
                                  }else {
                                  label_01ec :
                                     map2.getWindow().setSoftInputMode(2);
                                     CommercialDialogWebFragment$a uoa2 = new CommercialDialogWebFragment$a(mOpenType);
                                     uoa2.a(true);
                                     if (PatchProxy.isSupport(h.class)) {
                                        obj3 = PatchProxy.applyTwoRefs(map2, Float.valueOf(jumpUrlModel), null, h.class, "3");
                                        if (obj3 != patchProxyRe) {
                                           i2 = obj3.intValue();
                                        label_0233 :
                                           uoa2.b(i2);
                                           uoa2.d(map2.getSupportFragmentManager(), "ClueDetailDialog");
                                           uoa2.c(sTYLE_ROUND_);
                                           uoa2.n = mExtMap;
                                           uoa2.e(str8);
                                           uoa2.f(mNeedLoading);
                                           uoa2.m = 0.30f;
                                           uoa2.o = b ^ 1;
                                           CommercialDialogWebFragment uCommercialD = CommercialDialogWebFragment.Nh(uoa2);
                                           uCommercialD.k0(new l(map2));
                                           if (uoa2.d != null) {
                                              uCommercialD.Cb(uoa2.e, uoa2.f);
                                           }
                                        }
                                     }
                                     mOpenType = 0x3f000000;
                                     f = 0x3f800000;
                                     if (jumpUrlModel > 0 && jumpUrlModel - f <= 0) {
                                        mOpenType = jumpUrlModel;
                                     }
                                     if (jumpUrlModel - f <= 0) {
                                        JumpUrlModel jumpUrlModel1 = mOpenType;
                                     }
                                     i2 = (int)((float)n.w(map2) * f);
                                     goto label_0233 ;
                                  }
                               }else {
                                  goto label_01ec ;
                               }
                               b1 = 1;
                            }
                            PatchProxy.onMethodExit(uCompanion1, "11");
                            b = b1;
                         }
                         if (!b) {
                            uoa.mFailureReason = str6;
                         }
                      }
                   }
                }
                str1 = "";
                goto label_0050 ;
             }else {
                uoa.mFailureReason = "JumpDataInvalid";
             }
          }
       }
    label_027a :
       return;
    }
    public final int c(Activity p0,TunaButtonModel p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TunaButton$Companion uCompanion = TunaButton$Companion.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, uCompanion, "3");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (p0 != null) {
          TunaButtonModel mActionParam = (p1 != null)? p1.mActionParams: null;
          if (mActionParam != null) {
             p1.resetTrackModel();
             int i = p1.hashCode();
             Object obj1 = PatchProxy.applyOneRefs(p1, this, uCompanion, "5");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(p1.mNeedLogin != null){
                QCurrentUser mE = QCurrentUser.ME;
                a.o(mE, "QCurrentUser.ME");
                if (!mE.isLogined()) {
                   b = true;
                }
             }
             b = false;
             if (b) {
                b.f(KsLogTunaCoreTag.TUNA_BUTTON.appendTag("launchLogin"), new TunaButton$Companion$performAction$1(p1));
                d.a(-1712118428).x00(p0, 0, null, new TunaButton$Companion$b(p0, p1, i, p1.getTrackModel().a.incrementAndGet()));
             }else {
                this.d(p0, p1, i);
             }
             if (!p1.getTrackModel().a.get()) {
                TunaButtonMonitor.b.a(p1.getTrackModel());
             }
             return i;
          }
       }
       return 0;
    }
    public final void d(Activity p0,TunaButtonModel p1,int p2){
       TunaButton$Companion uCompanion = TunaButton$Companion.class;
       if (PatchProxy.isSupport(uCompanion) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, TunaButton$Companion.class, "6")) {
          return;
       }
       TunaButtonModel mActionParam = p1.mActionParams;
       if (mActionParam != null) {
          a trackModel = p1.getTrackModel();
          a.o(trackModel, "model.trackModel");
          TunaButtonModel mActionType = p1.mActionType;
          if (mActionType != true) {
             if (mActionType != 2) {
                if (mActionType != 3) {
                   trackModel.mFailureReason = "ActionTypeNotSupport";
                   b.g(KsLogTunaCoreTag.TUNA_BUTTON.appendTag("performActionInterval"), new TunaButton$Companion$performActionInterval$1(p1));
                }else if(PatchProxy.isSupport(uCompanion) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), trackModel, this, TunaButton$Companion.class, "10")){
                   TunaButtonModel mActionParam1 = p1.mActionParams;
                   if (mActionParam1 != null) {
                      ActionParams mFollowUserI = mActionParam1.mFollowUserInfoModel;
                      if (mFollowUserI != null) {
                         if (mFollowUserI.mFollowStatus == true) {
                            this.b(p0, mFollowUserI.mJumpUrlModel, trackModel, Integer.valueOf(p2));
                         }else {
                            FollowUserInfoModel mFollowRefer = mFollowUserI.mFollowRefer;
                            String str = (mFollowRefer == null)? String.valueOf(0): String.valueOf(mFollowRefer);
                            f$a uoa = new f$a(mFollowUserI.mUserId, str);
                            uoa.p(true);
                            f uof = uoa.b();
                            FollowHelper.e(uof, new a(mFollowUserI, p1, p2), new b(trackModel), null);
                         }
                      }
                   }
                }
             }else {
                ActionParams mPhoneInfoMo = mActionParam.mPhoneInfoModel;
                if (!PatchProxy.applyVoidThreeRefs(p0, mPhoneInfoMo, trackModel, this, TunaButton$Companion.class, "9")) {
                   TunaPhoneAction tunaPhoneAct = new TunaPhoneAction(new WeakReference(p0));
                   a uoa1 = a.class;
                   if (!PatchProxy.applyVoidTwoRefs(mPhoneInfoMo, trackModel, tunaPhoneAct, uoa1, "2")) {
                      tunaPhoneAct.b(mPhoneInfoMo, trackModel);
                      if (!PatchProxy.applyVoidTwoRefs("TunaPhoneAction", mPhoneInfoMo, tunaPhoneAct, uoa1, "1")) {
                         a.p("TunaPhoneAction", "actionName");
                      }
                   }
                }
             }
          }else {
             this.b(p0, mActionParam.mJumpUrlModel, trackModel, Integer.valueOf(p2));
          }
       }
       return;
    }
    public final void e(TunaButtonModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaButton$Companion.class, "4")) {
          return;
       }
       if (p0 != null) {
          String jumpUrl = p0.getJumpUrl();
          if (jumpUrl != null) {
             a.o(jumpUrl, "tunaButtonModel?.jumpUrl ?: return");
             g og = d.a(0x6ea0c3d0);
             if (og.rM(jumpUrl)) {
                og.t9(jumpUrl, "TunaButton");
             }
          }
       }
       return;
    }
}
