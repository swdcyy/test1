package com.kwai.android.register.core.register.ChannelRestrictInterceptor;
import com.kwai.android.register.core.register.BaseChannelInterceptor;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.register.core.register.RegisterChain;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Boolean;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.register.core.register.ChannelRestrictInterceptor$WhenMappings;
import java.lang.Enum;
import android.content.Context;
import com.kwai.android.common.ext.ContextExtKt;
import com.kwai.android.common.config.PushConfigManager;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import com.yxcorp.utility.RomUtils;
import kotlin.Result;
import com.kwai.android.common.utils.ContextProvider;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import java.lang.Throwable;
import qrd.j0;

public final class ChannelRestrictInterceptor extends BaseChannelInterceptor	// class@0009fb
{

    public void ChannelRestrictInterceptor(){
       super();
    }
    public void intercept(Chain p0){
       this.intercept(p0);
    }
    public void intercept(RegisterChain p0){
       a.p(p0, "chain");
       if (a.g(p0.getInternalParam$lib_register_release().get("retry_ignore_restrict"), Boolean.TRUE)) {
          p0.proceed();
          return;
       }else {
          switch (ChannelRestrictInterceptor$WhenMappings.$EnumSwitchMapping$0[p0.getChannel().ordinal()]){
              case 1:
                if (RomUtils.m() || (RomUtils.p() && ContextExtKt.isMainProcess(p0.getContext()))) {
                   p0.proceed();
                }
                break;
              case 2:
                if (RomUtils.p() && ContextExtKt.isMainProcess(p0.getContext())) {
                   p0.proceed();
                }
                break;
              case 3:
                if (RomUtils.o() && ContextExtKt.isMainProcess(p0.getContext())) {
                   p0.proceed();
                }
                break;
              case 4:
                if (!RomUtils.s() && (!RomUtils.r() && (RomUtils.t() || (RomUtils.l() && ContextExtKt.isMainProcess(p0.getContext()))))) {
                   p0.proceed();
                }
                break;
              case 5:
                if (RomUtils.w() && StringsKt__StringsKt.O2(p0.getProcessName(), ":push_v3", false, 2, null)) {
                   p0.proceed();
                }
                break;
              case 6:
                if (RomUtils.q() && ContextExtKt.isMainProcess(p0.getContext())) {
                   p0.proceed();
                }
                break;
              case 7:
                if (StringsKt__StringsKt.O2(p0.getProcessName(), ":messagesdk", false, 2, null)) {
                   p0.proceed();
                }
                break;
              case 8:
                if (PushConfigManager.INSTANCE.isSupportFirebase() && (this.isGoogleServiceAvailable() && ContextExtKt.isMainProcess(p0.getContext()))) {
                   p0.proceed();
                }
                break;
              default:
                if (ContextExtKt.isMainProcess(p0.getContext())) {
                   p0.proceed();
                }
          }
       label_00fc :
          return;
       }
    }
    public final boolean isGoogleServiceAvailable(){
       String str = "com.google.android.gms";
       String str1 = "com.android.vending";
       Context context = ContextProvider.getContext();
       a.o(context, "ContextProvider.getContext\(\)");
       PackageManager packageManag = context.getPackageManager();
       a.o(packageManag, "ContextProvider.getContext\(\).packageManager");
       PackageInfo packageInfo = packageManag.getPackageInfo(str1, 8256);
       PackageInfo applicationI = packageManag.getPackageInfo(str, 64).applicationInfo;
       if (applicationI != null) {
       }else {
          applicationI = packageManag.getApplicationInfo(str, 0);
          a.o(applicationI, "packageManager.getApplic¡­m.google.android.gms\", 0\)");
       }
       PackageInfo applicationI1 = packageInfo.applicationInfo;
       if (applicationI1 == null) {
          applicationI1 = packageManag.getApplicationInfo(str1, 0);
          a.o(applicationI1, "packageManager.getApplic¡­\"com.android.vending\", 0\)");
       }
       return true;
    }
}
