package com.facebook.react.modules.share.ShareModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import java.lang.CharSequence;
import android.app.Activity;
import android.content.ContextWrapper;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class ShareModule extends ReactContextBaseJavaModule	// class@0012de
{

    public void ShareModule(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "ShareModule";
    }
    public void share(ReadableMap p0,String p1,Promise p2){
       String str = "message";
       String str1 = "title";
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ShareModule.class, "1")) {
          return;
       }
       if (p0 == null) {
          p2.reject("E_INVALID_CONTENT", "Content cannot be null");
          return;
       }else {
          try{
             Intent intent = new Intent("android.intent.action.SEND");
             intent.setTypeAndNormalize("text/plain");
             if (p0.hasKey(str1)) {
                intent.putExtra("android.intent.extra.SUBJECT", p0.getString(str1));
             }
             if (p0.hasKey(str)) {
                intent.putExtra("android.intent.extra.TEXT", p0.getString(str));
             }
             Intent intent1 = Intent.createChooser(intent, p1);
             intent1.addCategory("android.intent.category.DEFAULT");
             Activity currentActiv = this.getCurrentActivity();
             if (currentActiv != null) {
                currentActiv.startActivity(intent1);
             }else {
                this.getReactApplicationContext().startActivity(intent1);
             }
             WritableMap writableMap = Arguments.createMap();
             writableMap.putString("action", "sharedAction");
             p2.resolve(writableMap);
          }catch(java.lang.Exception e0){
             p2.reject("E_UNABLE_TO_OPEN_DIALOG", "Failed to open share dialog");
          }
          return;
       }
    }
}
