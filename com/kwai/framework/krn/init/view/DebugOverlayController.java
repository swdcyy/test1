package com.kwai.framework.krn.init.view.DebugOverlayController;
import java.lang.Object;
import android.app.Application;
import o56.a;
import java.lang.String;
import android.content.Context;
import android.view.WindowManager;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.pm.PackageInfo;
import java.lang.Throwable;
import cb.a;
import android.os.Build$VERSION;
import android.provider.Settings;
import java.lang.StringBuilder;
import android.net.Uri;
import com.kwai.framework.krn.init.view.DebugOverlayController$c;
import java.lang.Runnable;
import android.widget.FrameLayout;
import com.kwai.framework.krn.init.view.DebugOverlayController$b;
import com.kwai.framework.krn.init.view.DebugOverlayController$d;
import android.text.SpannableStringBuilder;
import java.lang.Integer;
import android.text.SpannableString;
import java.lang.CharSequence;
import android.text.style.ForegroundColorSpan;
import lnc.a1;
import com.kwai.framework.krn.init.view.DebugOverlayController$a;
import com.facebook.react.bridge.UiThreadUtil;

public class DebugOverlayController	// class@001619
{
    public Context mContext;
    public KRNNetworkOptimizerDebugWindow mDebugViewContainer;
    public SpannableStringBuilder mSpannableStringBuilder;
    public final WindowManager mWindowManager;

    public void DebugOverlayController(){
       super();
       Application uApplication = a.b();
       this.mContext = uApplication;
       this.mWindowManager = uApplication.getSystemService("window");
    }
    public static boolean canHandleIntent(Context p0,Intent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, DebugOverlayController.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p1.resolveActivity(p0.getPackageManager()) != null)? true: false;
       return b;
    }
    public static boolean hasPermission(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, DebugOverlayController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          PackageInfo requestedPer = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 4096).requestedPermissions;
          if (requestedPer != null) {
             int len = requestedPer.length;
             int i = 0;
             while (i < len) {
                if ((requestedPer[i]).equals(p1)) {
                   return true;
                }
                i = i + 1;
             }
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e4){
          a.h("ReactNative", "Error while retrieving package info", e4);
       }
       return b;
    }
    public static boolean permissionCheck(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DebugOverlayController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT < 23) {
          return DebugOverlayController.hasPermission(p0, "android.permission.SYSTEM_ALERT_WINDOW");
       }
       if (!Settings.canDrawOverlays(p0)) {
          return false;
       }
       return true;
    }
    public static void requestPermission(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DebugOverlayController.class, "1")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(p0)) {
          Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:"+p0.getPackageName()));
          intent.setFlags(0x10000000);
          a.x("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
          if (DebugOverlayController.canHandleIntent(p0, intent)) {
             p0.startActivity(intent);
          }
       }
       return;
    }
    public void addLogError(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DebugOverlayController.class, "8")) {
          return;
       }
       this.setLogTextView(p0, R.color.arg_RES_7f061cfc);
       DebugOverlayController tmDebugViewC = this.mDebugViewContainer;
       if (tmDebugViewC != null) {
          tmDebugViewC.post(new DebugOverlayController$c(this));
       }
       return;
    }
    public void addLogInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DebugOverlayController.class, "7")) {
          return;
       }
       this.setLogTextView(p0, R.color.arg_RES_7f0606b3);
       DebugOverlayController tmDebugViewC = this.mDebugViewContainer;
       if (tmDebugViewC != null) {
          tmDebugViewC.post(new DebugOverlayController$b(this));
       }
       return;
    }
    public void addLogWarn(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DebugOverlayController.class, "9")) {
          return;
       }
       this.setLogTextView(p0, R.color.arg_RES_7f06216b);
       DebugOverlayController tmDebugViewC = this.mDebugViewContainer;
       if (tmDebugViewC != null) {
          tmDebugViewC.post(new DebugOverlayController$d(this));
       }
       return;
    }
    public void clearLogMessage(){
       if (PatchProxy.applyVoid(null, this, DebugOverlayController.class, "10")) {
          return;
       }
       DebugOverlayController tmSpannableS = this.mSpannableStringBuilder;
       if (tmSpannableS != null) {
          tmSpannableS.clear();
       }
       return;
    }
    public synchronized final void setLogTextView(String p0,int p1){
       DebugOverlayController uDebugOverla = DebugOverlayController.class;
       if (PatchProxy.isSupport(uDebugOverla) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uDebugOverla, "6")) {
          return;
       }
       if (this.mSpannableStringBuilder == null) {
          this.mSpannableStringBuilder = new SpannableStringBuilder();
       }
       SpannableString spannableStr = new SpannableString(p0);
       spannableStr.setSpan(new ForegroundColorSpan(a1.a(p1)), 0, p0.length(), 33);
       this.mSpannableStringBuilder.append(spannableStr);
       this.mSpannableStringBuilder.append("\n\n");
       return;
    }
    public void setNetworkOPtDebugViewVisible(boolean p0){
       DebugOverlayController uDebugOverla = DebugOverlayController.class;
       if (PatchProxy.isSupport(uDebugOverla) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDebugOverla, "5")) {
          return;
       }
       UiThreadUtil.runOnUiThread(new DebugOverlayController$a(this, p0));
       return;
    }
}
