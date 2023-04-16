package com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.net.Uri;
import android.content.pm.PackageManager;
import android.content.ContextWrapper;
import android.content.ComponentName;
import java.lang.Boolean;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.Throwable;
import android.app.Activity;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.intent.IntentModule$a;
import java.lang.Enum;
import java.lang.Double;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class IntentModule extends ReactContextBaseJavaModule	// class@0012c1
{

    public void IntentModule(ReactApplicationContext p0){
       super(p0);
    }
    public void canOpenURL(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntentModule.class, "3")) {
          return;
       }
       if (p0 == null || p0.isEmpty()) {
          p1.reject(new JSApplicationIllegalArgumentException("Invalid URL: "+p0));
          return;
       }else {
          try{
             Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(p0));
             intent.addFlags(0x10000000);
             boolean b = (intent.resolveActivity(this.getReactApplicationContext().getPackageManager()) != null)? true: false;
             p1.resolve(Boolean.valueOf(b));
          }catch(java.lang.Exception e0){
             p1.reject(new JSApplicationIllegalArgumentException("Could not check if URL \'"+p0+"\' can be opened: "+e0.getMessage()));
          }
          return;
       }
    }
    public void getInitialURL(Promise p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntentModule.class, "1")) {
          return;
       }
       try{
          Activity currentActiv = this.getCurrentActivity();
          String str = null;
          if (currentActiv != null) {
             Intent intent = currentActiv.getIntent();
             String action = intent.getAction();
             Uri data = intent.getData();
             if (data != null && (("android.intent.action.VIEW").equals(action) || ("android.nfc.action.NDEF_DISCOVERED").equals(action))) {
                str = data.toString();
             }
          }
          p0.resolve(str);
       }catch(java.lang.Exception e0){
          p0.reject(new JSApplicationIllegalArgumentException("Could not get the initial URL : "+e0.getMessage()));
       }
       return;
    }
    public String getName(){
       return "IntentAndroid";
    }
    public void openSettings(Promise p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntentModule.class, "4")) {
          return;
       }
       try{
          Intent intent = new Intent();
          intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
          intent.addCategory("android.intent.category.DEFAULT");
          intent.setData(Uri.parse("package:"+this.getReactApplicationContext().getPackageName()));
          intent.addFlags(0x10000000);
          intent.addFlags(0x40000000);
          intent.addFlags(Float.MIN_NORMAL);
          this.getCurrentActivity().startActivity(intent);
          p0.resolve(Boolean.TRUE);
       }catch(java.lang.Exception e0){
          p0.reject(new JSApplicationIllegalArgumentException("Could not open the Settings: "+e0.getMessage()));
       }
       return;
    }
    public void openURL(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntentModule.class, "2")) {
          return;
       }
       if (p0 == null || p0.isEmpty()) {
          p1.reject(new JSApplicationIllegalArgumentException("Invalid URL: "+p0));
          return;
       }else {
          try{
             Activity currentActiv = this.getCurrentActivity();
             Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(p0).normalizeScheme());
             String packageName = this.getReactApplicationContext().getPackageName();
             ComponentName uComponentNa = intent.resolveActivity(this.getReactApplicationContext().getPackageManager());
             String packageName1 = (uComponentNa != null)? uComponentNa.getPackageName(): "";
             if (currentActiv == null || !packageName.equals(packageName1)) {
                intent.addFlags(0x10000000);
             }
             if (currentActiv != null) {
                currentActiv.startActivity(intent);
             }else {
                this.getReactApplicationContext().startActivity(intent);
             }
             p1.resolve(Boolean.TRUE);
          }catch(java.lang.Exception e0){
             p1.reject(new JSApplicationIllegalArgumentException("Could not open URL \'"+p0+"\': "+e0.getMessage()));
          }
          return;
       }
    }
    public void sendIntent(String p0,ReadableArray p1,Promise p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IntentModule.class, "5")) {
          return;
       }
       String str = ".";
       if (p0 == null || p0.isEmpty()) {
          p2.reject(new JSApplicationIllegalArgumentException("Invalid Action: "+p0+str));
          return;
       }else {
          Intent intent = new Intent(p0);
          if (intent.resolveActivity(this.getReactApplicationContext().getPackageManager()) == null) {
             p2.reject(new JSApplicationIllegalArgumentException("Could not launch Intent with action "+p0+str));
             return;
          }else if(p1 != null){
             int i = 0;
             while (i < p1.size()) {
                ReadableMap map = p1.getMap(i);
                String str1 = map.keySetIterator().nextKey();
                int i1 = IntentModule$a.a[map.getType(str1).ordinal()];
                if (i1 != 1) {
                   if (i1 != 2) {
                      if (i1 != 3) {
                         p2.reject(new JSApplicationIllegalArgumentException("Extra type for "+str1+" not supported."));
                         return;
                      }else {
                         intent.putExtra(str1, map.getBoolean(str1));
                      }
                   }else {
                      SerializableHook.putExtra(intent, str1, Double.valueOf(map.getDouble(str1)));
                   }
                }else {
                   intent.putExtra(str1, map.getString(str1));
                }
                i++;
             }
          }
          this.getReactApplicationContext().startActivity(intent);
          return;
       }
    }
}
