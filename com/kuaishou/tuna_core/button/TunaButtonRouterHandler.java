package com.kuaishou.tuna_core.button.TunaButtonRouterHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import xh7.a;
import yh7.a;
import android.app.Activity;
import lnc.a1;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.button.TunaButtonRouterHandler$handleInternal$1;
import msd.a;
import c15.b;
import android.net.Uri;
import ekd.x0;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import i05.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.tuna_core.button.TunaButton;
import java.util.Objects;
import zx5.d;
import com.kuaishou.tuna_core.button.TunaButton$Companion;
import com.kwai.framework.model.tuna.button.ActionParams;
import com.kwai.framework.model.tuna.button.JumpUrlModel;
import tkd.b;
import tkd.d;
import xx5.g;
import zx5.e;
import zx5.d$a;
import xx5.a;
import java.lang.Integer;
import java.util.Map;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import com.kuaishou.tuna_core.button.TunaButtonException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.tuna_core.button.TunaButtonRouterHandler$handleInternal$2$1;

public final class TunaButtonRouterHandler extends AnnotationUriHandler	// class@00109e
{

    public void TunaButtonRouterHandler(){
       super();
    }
    public void c(b p0,c p1){
       String str;
       TunaButton$Companion a;
       a b;
       JumpUrlModel jumpUrlModel;
       JumpUrlModel jumpUrlModel1;
       String str3;
       String str5;
       String str6;
       ActionParams mJumpUrlMode2;
       Uri obj = p0;
       Object obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, this, TunaButtonRouterHandler.class, "1")) {
          return;
       }
       a.p(obj, "request");
       a.p(obj1, "callback");
       Context uContext = p0.b();
       a.o(uContext, "request.context");
       a uoa = new a(200);
       if (uContext instanceof Activity) {
          if (!a1.i(uContext)) {
             b.d(KsLogTunaCoreTag.TUNA_BUTTON.appendTag("TunaButtonRouterHandler"), TunaButtonRouterHandler$handleInternal$1.INSTANCE);
          }else {
             str = 1;
          label_004a :
             if (!str) {
                uoa.a = 406;
                obj1.a(uoa);
                return;
             }else {
                obj = p0.g();
                a.o(obj, "request.uri");
                String str1 = "";
                TunaButtonModel tunaButtonMo = b.b(x0.b(obj, "params", str1), TunaButtonModel.class, KsLogTunaCoreTag.TUNA_BUTTON.appendTag("TunaButtonRouterHandler"));
                String queryParamet = obj.getQueryParameter("tuna_extra_info_for_live");
                if (tunaButtonMo != null) {
                   if (!TextUtils.x(queryParamet)) {
                      a = TunaButton.a;
                      Objects.requireNonNull(a);
                      d uod = d.class;
                      if (!PatchProxy.applyVoidThreeRefs(tunaButtonMo, "tuna_extra_info_for_live", queryParamet, a, TunaButton$Companion.class, "2")) {
                         TunaButtonModel mActionParam = tunaButtonMo.mActionParams;
                         if (mActionParam != null) {
                            ActionParams mJumpUrlMode = mActionParam.mJumpUrlModel;
                            if (mJumpUrlMode != null) {
                               JumpUrlModel mUrl = mJumpUrlMode.mUrl;
                               if (mUrl != null) {
                                  jumpUrlModel = mUrl;
                               label_00b0 :
                                  if (mActionParam != null) {
                                     mJumpUrlMode = mActionParam.mJumpUrlModel;
                                     if (mJumpUrlMode != null) {
                                        mUrl = mJumpUrlMode.mTkUrl;
                                        if (mUrl != null) {
                                           jumpUrlModel1 = mUrl;
                                        label_00bf :
                                           if (mActionParam != null) {
                                              ActionParams mJumpUrlMode1 = mActionParam.mJumpUrlModel;
                                              if (mJumpUrlMode1 != null) {
                                                 JumpUrlModel mKrnUrl = mJumpUrlMode1.mKrnUrl;
                                                 if (mKrnUrl != null) {
                                                    str1 = mKrnUrl;
                                                 }
                                              }
                                           }
                                           g og = (jumpUrlModel.length() > 0)? 1: null;
                                           if (og) {
                                              e uoe = d.a(-174493078).PB(uod);
                                              if (uoe != null) {
                                                 str3 = d$a.a(uoe, jumpUrlModel, "tuna_extra_info_for_live", queryParamet, false, false, 24, null);
                                                 if (str3 != null) {
                                                 label_00fd :
                                                    g og1 = (jumpUrlModel1.length() > 0)? 1: null;
                                                    if (og1) {
                                                       d uod1 = d.a(-174493078).PB(uod);
                                                       if (uod1 != null) {
                                                          String str4 = d$a.a(uod1, jumpUrlModel1, "tuna_extra_info_for_live", queryParamet, false, false, 24, null);
                                                          if (str4 != null) {
                                                             str5 = str4;
                                                          label_012d :
                                                             int i1 = (str1.length() > 0)? 1: 0;
                                                             if (i1) {
                                                                uoe = d.a(-174493078).PB(uod);
                                                                if (uoe != null) {
                                                                   str6 = str5;
                                                                   queryParamet = d$a.a(uoe, str1, "tuna_extra_info_for_live", queryParamet, false, false, 24, null);
                                                                   if (queryParamet != null) {
                                                                      str1 = queryParamet;
                                                                   }
                                                                }else {
                                                                label_015e :
                                                                   str6 = str5;
                                                                }
                                                             }else {
                                                                goto label_015e ;
                                                             }
                                                             TunaButtonModel mActionParam1 = tunaButtonMo.mActionParams;
                                                             if (mActionParam1 != null) {
                                                                mJumpUrlMode2 = mActionParam1.mJumpUrlModel;
                                                                if (mJumpUrlMode2 != null) {
                                                                   mJumpUrlMode2.mUrl = str3;
                                                                }
                                                             }
                                                             if (mActionParam1 != null) {
                                                                mJumpUrlMode2 = mActionParam1.mJumpUrlModel;
                                                                if (mJumpUrlMode2 != null) {
                                                                   mJumpUrlMode2.mTkUrl = str6;
                                                                }
                                                             }
                                                             if (mActionParam1 != null) {
                                                                ActionParams mJumpUrlMode3 = mActionParam1.mJumpUrlModel;
                                                                if (mJumpUrlMode3 != null) {
                                                                   mJumpUrlMode3.mKrnUrl = str1;
                                                                }
                                                             }
                                                          }
                                                       }
                                                    }
                                                    str5 = jumpUrlModel1;
                                                    goto label_012d ;
                                                 }
                                              }
                                           }
                                           str3 = jumpUrlModel;
                                           goto label_00fd ;
                                        }
                                     }
                                  }
                                  jumpUrlModel1 = str1;
                                  goto label_00bf ;
                               }
                            }
                         }
                         jumpUrlModel = str1;
                         goto label_00b0 ;
                      }
                   }
                   int i = 0x17b84847;
                   try{
                      a uoa1 = d.a(i);
                      if (uContext != null) {
                         b = uoa.b;
                         a.o(b, "uriResult.mMaps");
                         b.put("tuna_button_event_code", Integer.valueOf(uoa1.u7(uContext, tunaButtonMo)));
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                      }
                   }catch(java.lang.Exception e0){
                      String str2 = "handle TunaCorePlugin performAction\("+x0.b(obj, "params", str1)+"\) crash!";
                      ExceptionHandler.handleCaughtException(new TunaButtonException(str2, e0));
                      b.f(KsLogTunaCoreTag.TUNA_BUTTON.appendTag("TunaButtonRouterHandler"), new TunaButtonRouterHandler$handleInternal$2$1(str2));
                   }
                }else {
                   uoa.a = 499;
                }
             }
          }
       }
       str = null;
       goto label_004a ;
    }
}
