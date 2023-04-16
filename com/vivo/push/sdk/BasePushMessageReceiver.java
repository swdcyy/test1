package com.vivo.push.sdk.BasePushMessageReceiver;
import com.vivo.push.sdk.PushMessageCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import java.lang.String;
import com.vivo.push.util.p;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;
import com.vivo.push.util.t;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.e;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.vivo.push.model.UnvarnishedMessage;

public abstract class BasePushMessageReceiver extends BroadcastReceiver implements PushMessageCallback	// class@001093
{

    public void BasePushMessageReceiver(){
       super();
    }
    public boolean isAllowNet(Context p0){
       boolean b = false;
       if (p0 == null) {
          p.a("PushMessageReceiver", "isAllowNet sContext is null");
          return b;
       }else {
          String packageName = p0.getPackageName();
          if (TextUtils.isEmpty(packageName)) {
             p.a("PushMessageReceiver", "isAllowNet pkgName is null");
             return b;
          }else {
             Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
             intent.setPackage(packageName);
             List list = p0.getPackageManager().queryIntentServices(intent, 576);
             if (list != null && list.size() > 0) {
                return t.a(p0, packageName);
             }
             p.a("PushMessageReceiver", "this is client sdk");
             return true;
          }
       }
    }
    public void onBind(Context p0,int p1,String p2){
    }
    public void onDelAlias(Context p0,int p1,List p2,List p3,String p4){
    }
    public void onDelTags(Context p0,int p1,List p2,List p3,String p4){
    }
    public void onListTags(Context p0,int p1,List p2,String p3){
    }
    public void onLog(Context p0,String p1,int p2,boolean p3){
    }
    public void onPublish(Context p0,int p1,String p2){
    }
    public final void onReceive(Context p0,Intent p1){
       p0 = ContextDelegate.getContext(p0).getApplicationContext();
       e.a().a(p0);
       String str = "PushMessageReceiver "+p0.getPackageName()+" ; requestId = "+p1.getStringExtra("req_id");
       try{
          p.d("PushMessageReceiver", str);
          e.a().a(p1, this);
          return;
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          return;
       }
    }
    public void onSetAlias(Context p0,int p1,List p2,List p3,String p4){
    }
    public void onSetTags(Context p0,int p1,List p2,List p3,String p4){
    }
    public void onTransmissionMessage(Context p0,UnvarnishedMessage p1){
    }
    public void onUnBind(Context p0,int p1,String p2){
    }
}
