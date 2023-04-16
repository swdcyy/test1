package com.kuaishou.krn.bridges.install.KrnInstallBridge;
import je.e;
import com.facebook.react.bridge.ActivityEventListener;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import je.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.IllegalStateException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import android.os.Build$VERSION;
import android.content.pm.PackageManager;
import android.content.ContextWrapper;
import java.lang.Throwable;
import ek0.d;
import lk0.b;
import java.lang.StringBuilder;
import android.content.Intent;
import java.lang.Integer;
import com.facebook.react.bridge.BaseJavaModule;
import android.net.Uri;

public class KrnInstallBridge extends KrnBridge implements e, ActivityEventListener	// class@00080f
{
    public String mApkPath;
    public Promise mPromise;

    public void KrnInstallBridge(ReactApplicationContext p0){
       super(p0);
       p0.addActivityEventListener(this);
    }
    public String getName(){
       return "KrnInstall";
    }
    public final d getPermissionAwareActivity(){
       Activity obj = PatchProxy.apply(null, this, KrnInstallBridge.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getCurrentActivity();
       if (obj == null) {
          throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
       }
       if (obj instanceof d) {
          return obj;
       }
       throw new IllegalStateException("Tried to use permissions API but the host Activity doesn\'t implement PermissionAwareActivity.");
    }
    public void installApk(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnInstallBridge.class, "1")) {
          return;
       }
       if (p0 == null) {
          p1.reject("0", "params is null");
          return;
       }else {
          String str = p0.getString("apkPath");
          if (TextUtils.x(str)) {
             p1.reject("0", "apkPath is null");
             return;
          }else {
             this.mPromise = p1;
             this.mApkPath = str;
             this.installApk(true);
             return;
          }
       }
    }
    public final void installApk(boolean p0){
       KrnInstallBridge krnInstallBr = KrnInstallBridge.class;
       if (PatchProxy.isSupport(krnInstallBr) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, krnInstallBr, "2")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 26) {
          if (this.getReactApplicationContext().getPackageManager().canRequestPackageInstalls()) {
             this.installApkWithCallback();
          }else if(p0){
             String[] stringArray = new String[]{"android.permission.REQUEST_INSTALL_PACKAGES"};
             this.getPermissionAwareActivity().N7(stringArray, 999, this);
          }
       }else {
          this.installApkWithCallback();
       }
       return;
    }
    public final void installApkWithCallback(){
       KrnInstallBridge tmPromise;
       if (PatchProxy.applyVoid(null, this, KrnInstallBridge.class, "3")) {
          return;
       }
       if (b.b(this.mApkPath)) {
          d.e("安装apk文件成功，安装路径为："+this.mApkPath);
          tmPromise = this.mPromise;
          if (tmPromise != null) {
             tmPromise.resolve("install success");
          }
       }else {
          tmPromise = this.mPromise;
          if (tmPromise != null) {
             tmPromise.reject("0", "install failure");
          }
       }
       this.mPromise = null;
       return;
    }
    public void onActivityResult(Activity p0,int p1,int p2,Intent p3){
       if (PatchProxy.isSupport(KrnInstallBridge.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, KrnInstallBridge.class, "5")) {
          return;
       }
       if (p1 == 1000) {
          this.installApk(false);
       }
       return;
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, KrnInstallBridge.class, "7")) {
          return;
       }
       super.onCatalystInstanceDestroy();
       this.getReactApplicationContext().removeActivityEventListener(this);
       return;
    }
    public void onNewIntent(Intent p0){
    }
    public boolean onRequestPermissionsResult(int p0,String[] p1,int[] p2){
       if (PatchProxy.isSupport(KrnInstallBridge.class)) {
          p1 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, KrnInstallBridge.class, "4");
          if (p1 != PatchProxyResult.class) {
             return p1.booleanValue();
          }
       }
       if (p0 == 999) {
          if (p2.length > 0 && !p2[0]) {
             b.b(this.mApkPath);
          }else {
             Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:"+this.getReactApplicationContext().getPackageName()));
             if (this.getCurrentActivity() != null) {
                this.getCurrentActivity().startActivityForResult(intent, 1000);
             }
          }
       }
       return false;
    }
}
