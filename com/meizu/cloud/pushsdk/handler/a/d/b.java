package com.meizu.cloud.pushsdk.handler.a.d.b;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.c;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.b;
import java.lang.Object;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.StringBuilder;
import android.content.pm.PackageManager;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.net.Uri;
import com.meizu.cloud.pushsdk.handler.a.c.d$a;
import com.meizu.cloud.pushsdk.handler.a.c.d;
import com.meizu.cloud.pushsdk.handler.d;
import com.meizu.cloud.pushsdk.util.d;
import com.meizu.cloud.pushsdk.util.b;
import java.lang.Exception;
import android.os.Parcelable;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.meizu.cloud.pushsdk.notification.MPushMessage;

public class b extends a	// class@001548
{
    public Context a;

    public void b(Context p0,a p1){
       this.a = p0;
    }
    public int a(){
       return 64;
    }
    public void a(MessageV3 p0,c p1){
       if (p0 == null) {
          return;
       }
       this.e(p0);
       if (!TextUtils.isEmpty(p0.getTitle()) && (!TextUtils.isEmpty(p0.getContent()) && this.c() != null)) {
          this.c().a(this.d(), MzPushMessage.fromMessageV3(p0));
       }
    label_002f :
       this.b(p0);
       this.a(this.a, p0);
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start NotificationClickMessageHandler match");
       boolean b = (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("private").equals(this.k(p0)))? true: false;
       return b;
    }
    public boolean a(Object p0,String p1){
       return this.b(p0, p1);
    }
    public final Intent b(Context p0,MessageV3 p1){
       Intent launchIntent;
       String uriPackageNa = p1.getUriPackageName();
       if (TextUtils.isEmpty(uriPackageNa)) {
          uriPackageNa = p1.getUploadDataPackageName();
       }
       DebugLogger.i("AbstractMessageHandler", "openClassName is "+uriPackageNa);
       String str = " value ";
       if (!p1.getClickType()) {
          launchIntent = p0.getPackageManager().getLaunchIntentForPackage(uriPackageNa);
          if (launchIntent != null && p1.getParamsMap() != null) {
             Iterator iterator = p1.getParamsMap().entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                DebugLogger.i("AbstractMessageHandler", " launcher activity key "+uEntry.getKey()+str+uEntry.getValue());
                if (!TextUtils.isEmpty(uEntry.getKey()) && !TextUtils.isEmpty(uEntry.getValue())) {
                   launchIntent.putExtra(uEntry.getKey(), uEntry.getValue());
                }
             }
          }
       }else {
          int i = 1;
          if (i == p1.getClickType()) {
             launchIntent = new Intent();
             if (p1.getParamsMap() != null) {
                Iterator iterator1 = p1.getParamsMap().entrySet().iterator();
                while (iterator1.hasNext()) {
                   Map$Entry uEntry1 = iterator1.next();
                   DebugLogger.i("AbstractMessageHandler", " key "+uEntry1.getKey()+str+uEntry1.getValue());
                   if (!TextUtils.isEmpty(uEntry1.getKey()) && !TextUtils.isEmpty(uEntry1.getValue())) {
                      launchIntent.putExtra(uEntry1.getKey(), uEntry1.getValue());
                   }
                }
             }
             launchIntent.setClassName(uriPackageNa, p1.getActivity());
             DebugLogger.i("AbstractMessageHandler", launchIntent.toUri(i));
          }else if(2 == p1.getClickType()){
             Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(p1.getWebUrl()));
             String uriPackageNa1 = p1.getUriPackageName();
             if (!TextUtils.isEmpty(uriPackageNa1)) {
                intent.setPackage(uriPackageNa1);
                DebugLogger.i("AbstractMessageHandler", "set uri package "+uriPackageNa1);
             }
             launchIntent = intent;
          }else if(3 == p1.getClickType()){
             DebugLogger.i("AbstractMessageHandler", "CLICK_TYPE_SELF_DEFINE_ACTION");
          }
          launchIntent = null;
       }
       if (launchIntent != null) {
          launchIntent.putExtra("platform_extra", d.a().a(p1.getTaskId()).a().b());
       }
       return launchIntent;
    }
    public void b(Object p0){
       this.d(p0);
    }
    public boolean b(MessageV3 p0,String p1){
       return this.a(p0, p1);
    }
    public final MessageV3 c(String p0){
       return d.a(p0);
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public void d(MessageV3 p0){
       Context uContext = this.d();
       String uploadDataPa = p0.getUploadDataPackageName();
       String str = (TextUtils.isEmpty(p0.getDeviceId()))? this.d(null): p0.getDeviceId();
       d.d(uContext, uploadDataPa, str, p0.getTaskId(), p0.getSeqId(), p0.getPushTimestamp());
       return;
    }
    public final void e(MessageV3 p0){
       b.a(this.d(), p0.getPackageName(), 0);
       Intent intent = this.b(this.d(), p0);
       if (intent != null) {
          int i = 0x10000000;
          try{
             intent.addFlags(i);
             this.d().startActivity(intent);
          }catch(java.lang.Exception e4){
             DebugLogger.e("AbstractMessageHandler", "Click message StartActivity error "+e4.getMessage());
          }
       }
    }
    public MessageV3 l(Intent p0){
       DebugLogger.e("AbstractMessageHandler", "parse message V3");
       String stringExtra = p0.getStringExtra("messageValue");
       if (!TextUtils.isEmpty(stringExtra)) {
          return this.c(stringExtra);
       }
       return this.m(p0);
    }
    public final MessageV3 m(Intent p0){
       MessageV3 parcelableEx;
       String str = "parse MessageV2 to MessageV3";
       String str1 = "AbstractMessageHandler";
       String str2 = "pushMessage";
       try{
          parcelableEx = p0.getParcelableExtra(str2);
          if (parcelableEx != null) {
          label_0030 :
             return parcelableEx;
          }
       }catch(java.lang.Exception e0){
          DebugLogger.e(str1, "cannot get messageV3");
       }
       DebugLogger.e(str1, e0);
       MPushMessage serializable = SerializableHook.getSerializableExtra(p0, str2);
       parcelableEx = MessageV3.parse(this.g(p0), this.d(p0), serializable.getTaskId(), serializable);
       goto label_0030 ;
    }
}
