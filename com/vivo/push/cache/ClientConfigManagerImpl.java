package com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.cache.d;
import android.content.Context;
import java.lang.Object;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.cache.a;
import com.vivo.push.cache.e;
import com.vivo.push.cache.c;
import java.util.Set;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.HashSet;
import java.lang.Long;
import com.vivo.push.util.p;
import java.lang.Integer;
import java.lang.NumberFormatException;
import com.vivo.push.model.a;

public class ClientConfigManagerImpl implements d	// class@001051
{
    public a mAppConfigSettings;
    public Context mContext;
    public e mPushConfigSettings;
    public static ClientConfigManagerImpl sClientConfigManagerImpl;

    public void ClientConfigManagerImpl(Context p0){
       super();
       this.mContext = ContextDelegate.getContext(p0);
       this.mAppConfigSettings = new a(this.mContext);
       this.mPushConfigSettings = new e(this.mContext);
    }
    public static synchronized ClientConfigManagerImpl getInstance(Context p0){
       _monitor_enter(ClientConfigManagerImpl.class);
       if (ClientConfigManagerImpl.sClientConfigManagerImpl == null) {
          ClientConfigManagerImpl.sClientConfigManagerImpl = new ClientConfigManagerImpl(p0);
       }
       _monitor_exit(ClientConfigManagerImpl.class);
       return ClientConfigManagerImpl.sClientConfigManagerImpl;
    }
    public void clearPush(){
       this.mAppConfigSettings.d();
    }
    public Set getBlackEventList(){
       return null;
    }
    public String getSuitTag(){
       return this.preparePushConfigSettings().c("CSPT");
    }
    public String getValueByKey(String p0){
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       this.mPushConfigSettings.c();
       return this.mPushConfigSettings.c(p0);
    }
    public Set getWhiteLogList(){
       HashSet hashSet = new HashSet();
       String valueByKey = this.getValueByKey("WLL");
       if (!TextUtils.isEmpty(valueByKey)) {
          String[] stringArray = valueByKey.split(",");
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             object oobject = stringArray[i];
             try{
                hashSet.add(Long.valueOf(Long.parseLong(oobject)));
                i = i + 1;
             }catch(java.lang.Exception e0){
             }
          }
       }
       p.d("ClientConfigManager", (" initWhiteLogList ").concat(String.valueOf(hashSet)));
       return hashSet;
    }
    public boolean isCancleBroadcastReceiver(){
       int i;
       String str = this.preparePushConfigSettings().c("PSM");
       if (!TextUtils.isEmpty(str)) {
          try{
             i = Integer.parseInt(str);
          label_001b :
             if (i & 0x04) {
                return true;
             }
             return false;
          }catch(java.lang.NumberFormatException e0){
             e0.printStackTrace();
          }
          i = 0;
          goto label_001b ;
       }else {
          goto label_001a ;
       }
    }
    public boolean isDebug(){
       this.mAppConfigSettings.c();
       return a.a(this.mAppConfigSettings.b());
    }
    public boolean isDebug(int p0){
       return a.a(p0);
    }
    public boolean isEnablePush(){
       this.prepareAppConfig();
       a uoa = this.mAppConfigSettings.c(this.mContext.getPackageName());
       if (uoa != null) {
          return ("1").equals(uoa.b());
       }
       return true;
    }
    public boolean isInBlackList(long p0){
       String str = this.preparePushConfigSettings().c("BL");
       if (!TextUtils.isEmpty(str)) {
          String[] stringArray = str.split(",");
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             object oobject = stringArray[i];
             try{
                if (!TextUtils.isEmpty(oobject) && !Long.parseLong(oobject) - p0) {
                   return true;
                }
             }catch(java.lang.NumberFormatException e4){
                e4.printStackTrace();
             }
             i = i + 1;
          }
       }
       return false;
    }
    public final void prepareAppConfig(){
       ClientConfigManagerImpl tmAppConfigS = this.mAppConfigSettings;
       if (tmAppConfigS == null) {
          this.mAppConfigSettings = new a(this.mContext);
          return;
       }else {
          tmAppConfigS.c();
          return;
       }
    }
    public final e preparePushConfigSettings(){
       ClientConfigManagerImpl tmPushConfig = this.mPushConfigSettings;
       if (tmPushConfig == null) {
          this.mPushConfigSettings = new e(this.mContext);
       }else {
          tmPushConfig.c();
       }
       return this.mPushConfigSettings;
    }
}
