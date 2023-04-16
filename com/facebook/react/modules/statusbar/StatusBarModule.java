package com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import android.content.res.Resources;
import android.content.Context;
import cw9.c;
import ze.p;
import android.view.Window;
import java.lang.Integer;
import java.lang.Float;
import vd.d;
import java.lang.Boolean;
import cb.a;
import com.facebook.react.modules.statusbar.StatusBarModule$a;
import com.facebook.react.bridge.ReactContext;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.statusbar.StatusBarModule$c;
import android.os.Build$VERSION;
import com.facebook.react.modules.statusbar.StatusBarModule$d;
import com.facebook.react.modules.statusbar.StatusBarModule$b;

public class StatusBarModule extends ReactContextBaseJavaModule	// class@0012e6
{

    public void StatusBarModule(ReactApplicationContext p0){
       super(p0);
    }
    public Map getConstants(){
       String str;
       ReactApplicationContext obj = PatchProxy.apply(null, this, StatusBarModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getReactApplicationContext();
       Activity currentActiv = this.getCurrentActivity();
       int identifier = obj.getResources().getIdentifier("status_bar_height", "dimen", "android");
       float f = (identifier > 0)? p.a((float)c.b(obj.getResources(), identifier)): 0;
       if (currentActiv != null) {
          Object[] objArray = new Object[]{Integer.valueOf((currentActiv.getWindow().getStatusBarColor() & 0xffffff))};
          str = String.format("#%06X", objArray);
       }else {
          str = "black";
       }
       return d.e("HEIGHT", Float.valueOf(f), "DEFAULT_BACKGROUND_COLOR", str);
    }
    public String getName(){
       return "StatusBarManager";
    }
    public void setColor(int p0,boolean p1){
       StatusBarModule statusBarMod = StatusBarModule.class;
       if (PatchProxy.isSupport(statusBarMod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, statusBarMod, "2")) {
          return;
       }
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv == null) {
          a.x("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
          return;
       }else {
          StatusBarModule$a uoa = new StatusBarModule$a(this, this.getReactApplicationContext(), currentActiv, p1, p0);
          UiThreadUtil.runOnUiThread(statusBarMod);
          return;
       }
    }
    public void setHidden(boolean p0){
       StatusBarModule statusBarMod = StatusBarModule.class;
       if (PatchProxy.isSupport(statusBarMod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, statusBarMod, "4")) {
          return;
       }
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv == null) {
          a.x("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
          return;
       }else {
          UiThreadUtil.runOnUiThread(new StatusBarModule$c(this, p0, currentActiv));
          return;
       }
    }
    public void setStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StatusBarModule.class, "5")) {
          return;
       }
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv == null) {
          a.x("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
          return;
       }else if(Build$VERSION.SDK_INT >= 23){
          UiThreadUtil.runOnUiThread(new StatusBarModule$d(this, currentActiv, p0));
       }
       return;
    }
    public void setTranslucent(boolean p0){
       StatusBarModule statusBarMod = StatusBarModule.class;
       if (PatchProxy.isSupport(statusBarMod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, statusBarMod, "3")) {
          return;
       }
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv == null) {
          a.x("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
          return;
       }else {
          UiThreadUtil.runOnUiThread(new StatusBarModule$b(this, this.getReactApplicationContext(), currentActiv, p0));
          return;
       }
    }
}
