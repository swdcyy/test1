package com.kwai.framework.network.keyconfig.a$i;
import erd.g;
import rb6.b;
import com.kwai.framework.network.keyconfig.a;
import java.lang.String;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.framework.network.keyconfig.OldVersionKeyConfigException;
import com.kwai.robust.PatchProxyResult;
import ob6.h;
import com.kwai.framework.network.keyconfig.BaseConfig;
import com.kwai.framework.network.keyconfig.KeyConfigErrorToastPolicy;
import java.io.IOException;
import yb6.d;
import com.kwai.framework.network.keyconfig.TimeRange;
import java.lang.System;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import java.util.Iterator;
import java.lang.Iterable;
import ob6.p$b;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class a$i implements g	// class@0017e8
{
    public final b b;
    public final a c;
    public final String d;
    public final RequestTiming e;

    public void a$i(b p0,a p1,String p2,RequestTiming p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$i.class, "1")) {
       }else {
          a$i tc = this.c;
          a$i tb = this.b;
          a.o(p0, "error");
          Objects.requireNonNull(tc);
          a uoa = a.class;
          if (!PatchProxy.applyVoidTwoRefs(tb, p0, tc, uoa, "14")) {
             if (!p0 instanceof OldVersionKeyConfigException) {
                tb.d(p0, tc.getVersion());
             }else {
                tb.c(p0.getVersion());
             }
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (!PatchProxy.applyVoidOneRefs(p0, tc, uoa, "17")) {
                h mBaseConfig = tc.m().mBaseConfig;
                a.o(mBaseConfig, "getNetworkOrLocalKeyConfig\(\).mBaseConfig");
                Objects.requireNonNull(mBaseConfig);
                Object[] objArray = null;
                BaseConfig uBaseConfig = PatchProxy.apply(objArray, mBaseConfig, BaseConfig.class, "7");
                if (uBaseConfig != patchProxyRe) {
                }else if(mBaseConfig.mKeyConfigErrorToastPolicy == null){
                   mBaseConfig.mKeyConfigErrorToastPolicy = new KeyConfigErrorToastPolicy();
                }
                uBaseConfig = mBaseConfig.mKeyConfigErrorToastPolicy;
                if (p0 instanceof IOException && (tc.n == null && uBaseConfig.disableToast == null)) {
                   a.o(uBaseConfig, "keyConfigErrorToastPolicy");
                   if (uBaseConfig.mToastValidTime == null) {
                      uBaseConfig.mToastValidTime = KeyConfigErrorToastPolicy.b;
                   }
                   if (uBaseConfig.mToastValidTime.a(d.a()) && (System.currentTimeMillis() - tc.m) - uBaseConfig.toastMinIntervalMs > 0) {
                      KeyConfigErrorToastPolicy keyConfigErr = PatchProxy.apply(objArray, uBaseConfig, KeyConfigErrorToastPolicy.class, "1");
                      if (keyConfigErr != patchProxyRe) {
                      }else if(TextUtils.x(uBaseConfig.mToastMessage)){
                         uBaseConfig.mToastMessage = KeyConfigErrorToastPolicy.a;
                      }
                      keyConfigErr = uBaseConfig.mToastMessage;
                      i.d(R.style.arg_RES_7f110668, keyConfigErr);
                      tc.m = System.currentTimeMillis();
                   }
                }
             }
          label_00c8 :
             Iterator iterator = tc.d.iterator();
             while (iterator.hasNext()) {
                p$b uob = iterator.next();
                try{
                   uob.onError(p0);
                }catch(java.lang.Exception e3){
                   ExceptionHandler.handleCaughtException(e3);
                   goto label_00ce ;
                }
             }
          }
          PatchProxy.onMethodExit(a$i.class, "1");
       }
       return;
    }
}
