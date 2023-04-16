package com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.a;
import java.lang.Object;
import java.util.ArrayList;
import com.heytap.mcssdk.d.b;
import com.heytap.mcssdk.d.d;
import com.heytap.mcssdk.d.a;
import com.heytap.mcssdk.e.b;
import com.heytap.mcssdk.e.c;
import com.heytap.mcssdk.e.a;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.RuntimeException;
import java.lang.String;
import com.heytap.mcssdk.PushService$1;
import com.heytap.mcssdk.PushService$a;
import android.content.Context;
import com.heytap.msp.push.mode.MessageStat;
import com.heytap.mcssdk.utils.StatUtil;
import com.heytap.mcssdk.c.a;
import java.lang.Integer;
import java.lang.System;
import com.heytap.mcssdk.utils.d;
import java.util.List;
import com.heytap.msp.push.callback.ICallBackResultService;
import org.json.JSONObject;
import android.content.Intent;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.StringBuilder;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import java.util.Map;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.mcssdk.utils.Utils;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.heytap.mcssdk.a.a;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.ApplicationInfo;
import com.heytap.mcssdk.b.a;
import java.lang.IllegalArgumentException;
import org.json.JSONException;
import com.heytap.mcssdk.c.b;
import android.content.ComponentName;
import java.lang.Exception;

public class PushService implements a	// class@00051f
{
    public ConcurrentHashMap mAppLimitMap;
    public String mAuthCode;
    public Context mContext;
    public ICallBackResultService mICallBackResultService;
    public IGetAppNotificationCallBackService mIGetAppNotificationCallBackService;
    public ISetAppNotificationCallBackService mISetAppNotificationCallBackService;
    public List mParsers;
    public List mProcessors;
    public String mRegisterID;
    public String mVerifyCode;
    public static String NEW_MCS_RECEIVE_SDK_ACTION;
    public static final int[] OLD_MCS_PACKAGE;
    public static final int[] OLD_MCS_RECEIVE_SDK_ACTION;
    public static final String TYPE;
    public static int sCount;
    public static boolean sIsNewMcsPkg;
    public static String sMcsPkgName;

    static {
       PushService.OLD_MCS_PACKAGE = new int[15]{'c','o','m','.','c','o','l','o','r','o','s','.','m','c','s'};
       PushService.OLD_MCS_RECEIVE_SDK_ACTION = new int[45]{'c','o','m','.','c','o','l','o','r','o','s','.','m','c','s','s','d','k','.','a','c','t','i','o','n','.','R','E','C','E','I','V','E','_','S','D','K','_','M','E','S','S','A','G','E'};
       PushService.NEW_MCS_RECEIVE_SDK_ACTION = "";
       PushService.sCount = 0;
    }
    public void PushService(){
       super();
       this.mProcessors = new ArrayList();
       this.mParsers = new ArrayList();
       this.mRegisterID = null;
       PushService pushService = PushService.class;
       _monitor_enter(pushService);
       int sCount = PushService.sCount;
       if (sCount > 0) {
          throw new RuntimeException("PushService can\'t create again!");
       }
       PushService.sCount = sCount + 1;
       _monitor_exit(pushService);
       this.addParser(new b());
       this.addParser(new a());
       this.addProcessor(new b());
       this.addProcessor(new a());
       this.mAppLimitMap = new ConcurrentHashMap();
       return;
    }
    public void PushService(PushService$1 p0){
       super();
    }
    public static PushService getInstance(){
       return PushService$a.a();
    }
    public static int getSDKVersionCode(){
       return 3000;
    }
    public static String getSDKVersionName(){
       return "3.0.0";
    }
    public static void onAppStart(Context p0){
       StatUtil.statisticMessage(p0, new MessageStat(p0.getPackageName(), "app_start", null));
    }
    public final a addCommandToMap(int p0){
       a uoa;
       String str;
       int i = 1;
       if (this.mAppLimitMap.containsKey(Integer.valueOf(p0))) {
          uoa = this.mAppLimitMap.get(Integer.valueOf(p0));
          if (this.checkTimeNeedUpdate(uoa)) {
             uoa.a(i);
             uoa.a(System.currentTimeMillis());
             str = "addCommandToMap : appLimitBean.setCount\(1\)";
          }else {
             uoa.a((uoa.b() + i));
             str = "addCommandToMap :appLimitBean.getCount\(\) + 1";
          }
          d.b(str);
       }else {
          a uoa1 = new a(System.currentTimeMillis(), i);
          this.mAppLimitMap.put(Integer.valueOf(p0), uoa1);
          d.b("addCommandToMap :appBean is null");
          uoa = uoa1;
       }
       return uoa;
    }
    public synchronized final void addParser(d p0){
       if (p0 != null) {
          this.mParsers.add(p0);
       }
       return;
    }
    public synchronized final void addProcessor(c p0){
       if (p0 != null) {
          this.mProcessors.add(p0);
       }
       return;
    }
    public void bindMcsService(int p0){
       if (this.checkCommandLimit(p0)) {
          PushService tmICallBackR = this.mICallBackResultService;
          if (tmICallBackR != null) {
             tmICallBackR.onError(this.getErrorCode(p0), "api_call_too_frequently");
          }
          return;
       }else {
          Intent intent = this.getIntent(p0, "", null);
          a.a(this.mContext, intent, new PushService$1(this, intent), 1);
          return;
       }
    }
    public final boolean checkAll(){
       boolean b = (this.checkContext() && this.checkRegisterID())? true: false;
       return b;
    }
    public boolean checkCommandLimit(int p0){
       a uoa = this.addCommandToMap(p0);
       boolean b = false;
       if (p0 != 0x3003 && (p0 != 0x3018 && uoa.b() > 2)) {
          b = true;
       }
    label_0015 :
       return b;
    }
    public final boolean checkContext(){
       boolean b = (this.mContext != null)? true: false;
       return b;
    }
    public final boolean checkRegisterID(){
       boolean b = (this.mRegisterID != null)? true: false;
       return b;
    }
    public final boolean checkTimeNeedUpdate(a p0){
       long l = p0.a();
       long l1 = System.currentTimeMillis();
       d.b("checkTimeNeedUpdate : lastedTime "+l+" currentTime:"+l1);
       l1 = l1 - l;
       boolean b = (l1 - 1000 > 0)? true: false;
       return b;
    }
    public void clearNotificationType(){
       this.clearNotificationType(null);
    }
    public void clearNotificationType(JSONObject p0){
       if (this.checkAll()) {
          this.startMcsService(0x3014, p0);
       }else {
          d.e("mcssdk---", "please call the register first!");
       }
       return;
    }
    public void clearNotifications(){
       this.clearNotifications(null);
    }
    public void clearNotifications(JSONObject p0){
       if (this.checkContext()) {
          this.startMcsService(0x3017, p0);
       }else {
          d.e("mcssdk---", "please call the register first!");
       }
       return;
    }
    public void disableAppNotificationSwitch(ISetAppNotificationCallBackService p0){
       if (this.checkContext()) {
          this.mISetAppNotificationCallBackService = p0;
          this.startMcsService(0x301d, null);
       }else if(this.getPushCallback() != null){
          this.mISetAppNotificationCallBackService.onSetAppNotificationSwitch(-2);
       }
       return;
    }
    public void enableAppNotificationSwitch(ISetAppNotificationCallBackService p0){
       if (this.checkContext()) {
          this.mISetAppNotificationCallBackService = p0;
          this.startMcsService(0x301c, null);
       }else {
          PushService tmISetAppNot = this.mISetAppNotificationCallBackService;
          if (tmISetAppNot != null) {
             tmISetAppNot.onSetAppNotificationSwitch(-2);
          }
       }
       return;
    }
    public Map getAppLimitMap(){
       return this.mAppLimitMap;
    }
    public void getAppNotificationSwitch(IGetAppNotificationCallBackService p0){
       if (this.checkContext()) {
          this.mIGetAppNotificationCallBackService = p0;
          this.startMcsService(0x301e, null);
       }else {
          PushService tmIGetAppNot = this.mIGetAppNotificationCallBackService;
          if (tmIGetAppNot != null) {
             tmIGetAppNot.onGetAppNotificationSwitch(-2, 0);
          }
       }
       return;
    }
    public Context getContext(){
       return this.mContext;
    }
    public int getErrorCode(int p0){
       switch (p0){
           case 0x3001:
             return -1;
           case 0x3002:
             return -2;
           case 0x3003:
             return -14;
           default:
             switch (p0){
                 case 0x300a:
                   return -11;
                 case 0x300b:
                   return -3;
                 case 0x300c:
                   return -4;
                 default:
                   switch (p0){
                       case 0x3012:
                         return -10;
                       case 0x3013:
                         return -6;
                       case 0x3014:
                         return -7;
                       case 0x3015:
                         return -5;
                       case 0x3016:
                         return -8;
                       case 0x3017:
                         return -9;
                       case 0x3018:
                         return -13;
                       case 0x3019:
                         return -12;
                       default:
                         switch (p0){
                             case 0x301c:
                               return -15;
                             case 0x301d:
                               return -16;
                             case 0x301e:
                               return -17;
                             default:
                               return 0;
                         }
                   }
             }
       }
    }
    public final Intent getIntent(int p0,String p1,JSONObject p2){
       Intent intent = new Intent();
       intent.setAction(this.getReceiveSdkAction(this.mContext));
       intent.setPackage(this.getMcsPackageName(this.mContext));
       intent.putExtra("type", p0);
       try{
          JSONObject jSONObject = new JSONObject();
          PushService tmContext = this.mContext;
          jSONObject.putOpt("versionName", Utils.getVersionName(tmContext, tmContext.getPackageName()));
          tmContext = this.mContext;
          jSONObject.putOpt("versionCode", Integer.valueOf(Utils.getVersionCode(tmContext, tmContext.getPackageName())));
          if (p2 != null) {
             Iterator iterator = p2.keys();
             while (iterator.hasNext()) {
                String str = iterator.next();
                jSONObject.putOpt(str, p2.get(str));
             }
          }
          intent.putExtra(e0, jSONObject.toString());
          intent.putExtra("params", p1);
          intent.putExtra("appPackage", this.mContext.getPackageName());
          intent.putExtra("appKey", this.mAuthCode);
          intent.putExtra("appSecret", this.mVerifyCode);
          intent.putExtra("registerID", this.mRegisterID);
          intent.putExtra("sdkVersion", PushService.getSDKVersionName());
          return intent;
       }catch(java.lang.Exception e0){
       }
    }
    public String getMcsPackageName(Context p0){
       boolean b;
       if (PushService.sMcsPkgName == null) {
          String newMcsPackag = this.getNewMcsPackageName(p0);
          if (newMcsPackag == null) {
             PushService.sMcsPkgName = Utils.getString(PushService.OLD_MCS_PACKAGE);
             b = false;
          }else {
             PushService.sMcsPkgName = newMcsPackag;
             b = true;
          }
          PushService.sIsNewMcsPkg = b;
       }
       return PushService.sMcsPkgName;
    }
    public final String getNewMcsPackageName(Context p0){
       if (TextUtils.isEmpty(PushService.NEW_MCS_RECEIVE_SDK_ACTION)) {
          PushService.NEW_MCS_RECEIVE_SDK_ACTION = new String(a.b("Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ=="));
       }
       List list = p0.getPackageManager().queryIntentServices(new Intent(PushService.NEW_MCS_RECEIVE_SDK_ACTION), 8192);
       if (Build$VERSION.SDK_INT >= 24) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             ResolveInfo serviceInfo = iterator.next().serviceInfo;
             try{
                ServiceInfo packageName = serviceInfo.packageName;
                int i = 0;
                int i1 = p0.getPackageManager().getApplicationInfo(packageName, i).flags & 1;
                PackageManager packageManag = (i1 == 1)? 1: null;
                if (p0.getPackageManager().getPackageUid(packageName, i) == p0.getPackageManager().getPackageUid("android", i)) {
                   i = 1;
                }
                if (packageManag || i) {
                   return packageName;
                }
             }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                goto label_0030 ;
             }
          }
       }
       return null;
    }
    public void getNotificationStatus(){
       this.getNotificationStatus(null);
    }
    public void getNotificationStatus(JSONObject p0){
       if (this.checkAll()) {
          this.startMcsService(0x3015, p0);
       }else if(this.getPushCallback() != null){
          this.getPushCallback().onGetNotificationStatus(-2, 0);
       }
       return;
    }
    public List getParsers(){
       return this.mParsers;
    }
    public List getProcessors(){
       return this.mProcessors;
    }
    public ICallBackResultService getPushCallback(){
       return this.mICallBackResultService;
    }
    public IGetAppNotificationCallBackService getPushGetAppNotificationCallBack(){
       return this.mIGetAppNotificationCallBackService;
    }
    public ISetAppNotificationCallBackService getPushSetAppNotificationCallBack(){
       return this.mISetAppNotificationCallBackService;
    }
    public void getPushStatus(){
       if (this.checkAll()) {
          this.startMcsService(0x3012, null);
       }else if(this.getPushCallback() != null){
          this.getPushCallback().onGetPushStatus(-2, 0);
       }
       return;
    }
    public int getPushVersionCode(){
       if (!this.checkContext()) {
          return 0;
       }
       PushService tmContext = this.mContext;
       return Utils.getVersionCode(tmContext, this.getMcsPackageName(tmContext));
    }
    public String getPushVersionName(){
       if (!this.checkContext()) {
          return "";
       }
       PushService tmContext = this.mContext;
       return Utils.getVersionName(tmContext, this.getMcsPackageName(tmContext));
    }
    public String getReceiveSdkAction(Context p0){
       if (PushService.sMcsPkgName == null) {
          this.getNewMcsPackageName(p0);
       }
       if (PushService.sIsNewMcsPkg) {
          if (TextUtils.isEmpty(PushService.NEW_MCS_RECEIVE_SDK_ACTION)) {
             PushService.NEW_MCS_RECEIVE_SDK_ACTION = new String(a.b("Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ=="));
          }
          return PushService.NEW_MCS_RECEIVE_SDK_ACTION;
       }else {
          return Utils.getString(PushService.OLD_MCS_RECEIVE_SDK_ACTION);
       }
    }
    public void getRegister(){
       this.getRegister(null);
    }
    public void getRegister(JSONObject p0){
       if (this.checkContext()) {
          this.startMcsService(0x3001, p0);
       }else if(this.getPushCallback() != null){
          this.getPushCallback().onRegister(-2, null);
       }
       return;
    }
    public String getRegisterID(){
       return this.mRegisterID;
    }
    public PushService init(Context p0,boolean p1){
       if (p0 == null) {
          throw new IllegalArgumentException("context can\'t be null");
       }
       this.innerInit(p0);
       new a().a(this.mContext);
       d.f(p1);
       return this;
    }
    public void innerInit(Context p0){
       boolean b;
       p0 = p0.getApplicationContext();
       this.mContext = p0;
       if (PushService.sMcsPkgName == null) {
          String newMcsPackag = this.getNewMcsPackageName(p0);
          if (newMcsPackag == null) {
             PushService.sMcsPkgName = Utils.getString(PushService.OLD_MCS_PACKAGE);
             b = false;
          }else {
             PushService.sMcsPkgName = newMcsPackag;
             b = true;
          }
          PushService.sIsNewMcsPkg = b;
       }
       return;
    }
    public boolean isSupportPushByClient(Context p0){
       return this.isSupportPushInner(p0);
    }
    public final boolean isSupportPushInner(Context p0){
       if (this.mContext == null) {
          this.mContext = p0.getApplicationContext();
       }
       String mcsPackageNa = this.getMcsPackageName(this.mContext);
       boolean b = (Utils.isExistPackage(this.mContext, mcsPackageNa) && (Utils.getVersionCode(this.mContext, mcsPackageNa) >= 1019 && Utils.isSupportPush(this.mContext, mcsPackageNa, "supportOpenPush")))? true: false;
       return b;
    }
    public void openNotificationSettings(){
       this.openNotificationSettings(null);
    }
    public void openNotificationSettings(JSONObject p0){
       if (this.checkAll()) {
          this.startMcsService(0x3016, p0);
       }else {
          d.e("mcssdk---", "please call the register first!");
       }
       return;
    }
    public void pausePush(){
       this.pausePush(null);
    }
    public void pausePush(JSONObject p0){
       if (this.checkAll()) {
          this.startMcsService(0x300b, p0);
       }else {
          d.e("mcssdk---", "please call the register first!");
       }
       return;
    }
    public void register(Context p0,String p1,String p2,ICallBackResultService p3){
       this.register(p0, p1, p2, null, p3);
    }
    public void register(Context p0,String p1,String p2,JSONObject p3,ICallBackResultService p4){
       if (p0 == null) {
          if (p4 != null) {
             p4.onRegister(-2, null);
          }
          return;
       }else if(this.mContext == null){
          this.mContext = p0.getApplicationContext();
       }
       if (!Utils.isSupportPushByClient(this.mContext)) {
          if (p4 != null) {
             p4.onRegister(-2, null);
          }
          return;
       }else {
          this.mAuthCode = p1;
          this.mVerifyCode = p2;
          this.mICallBackResultService = p4;
          if (p3 == null) {
             p3 = new JSONObject();
          }
          try{
             p3.putOpt("appVersionCode", Integer.valueOf(Utils.getVersionCode(p0)));
             p3.putOpt("appVersionName", Utils.getVersionName(p0));
          }catch(org.json.JSONException e4){
             d.e("register-Exception:"+e4.getMessage());
          }
          this.startMcsService(0x3001, p3);
          return;
       }
    }
    public void requestNotificationPermission(){
       if (this.checkContext()) {
          this.bindMcsService(0x3019);
       }else {
          d.e("mcssdk---", "please call the register first!");
       }
       return;
    }
    public void resumePush(){
       this.resumePush(null);
    }
    public void resumePush(JSONObject p0){
       if (this.checkAll()) {
          this.startMcsService(0x300c, p0);
       }else {
          d.e("mcssdk---", "please call the register first!");
       }
       return;
    }
    public void setAppKeySecret(String p0,String p1){
       this.mAuthCode = p0;
       this.mVerifyCode = p1;
    }
    public void setNotificationType(int p0){
       this.setNotificationType(p0, null);
    }
    public void setNotificationType(int p0,JSONObject p1){
       if (this.checkAll()) {
          this.startMcsService(0x3013, p0+"", p1);
       }else {
          d.e("mcssdk---", "please call the register first!");
       }
       return;
    }
    public void setPushCallback(ICallBackResultService p0){
       this.mICallBackResultService = p0;
    }
    public void setPushTime(List p0,int p1,int p2,int p3,int p4){
       this.setPushTime(p0, p1, p2, p3, p4, null);
    }
    public void setPushTime(List p0,int p1,int p2,int p3,int p4,JSONObject p5){
       if (this.checkAll()) {
          if (p0 != null && (p0.size() > 0 && (p1 >= 0 && (p2 >= 0 && (p3 >= p1 && (p3 <= 23 && (p4 >= p2 && p4 <= 59))))))) {
             try{
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("weekDays", b.a(p0));
                jSONObject.put("startHour", p1);
                jSONObject.put("startMin", p2);
                jSONObject.put("endHour", p3);
                jSONObject.put("endMin", p4);
                this.startMcsService(0x300a, jSONObject.toString(), p5);
             }catch(org.json.JSONException e3){
                d.e("mcssdk---", e3.getLocalizedMessage());
             }
          }else {
             throw new IllegalArgumentException("params are not all right,please check params");
          }
       }else if(this.getPushCallback() != null){
          this.getPushCallback().onSetPushTime(-2, "please call the register first!");
       }
    }
    public void setRegisterID(String p0){
       this.mRegisterID = p0;
    }
    public final void startMcsService(int p0,String p1,JSONObject p2){
       if (this.checkCommandLimit(p0)) {
          PushService tmICallBackR = this.mICallBackResultService;
          if (tmICallBackR != null) {
             tmICallBackR.onError(this.getErrorCode(p0), "api_call_too_frequently");
          }
          return;
       }else {
          try{
             a.e(this.mContext, this.getIntent(p0, p1, p2));
          }catch(java.lang.Exception e2){
             d.e("startMcsService--Exception"+e2.getMessage());
          }
          return;
       }
    }
    public final void startMcsService(int p0,JSONObject p1){
       this.startMcsService(p0, "", p1);
    }
    public void unRegister(){
       this.unRegister(null);
    }
    public void unRegister(Context p0,String p1,String p2,JSONObject p3,ICallBackResultService p4){
       this.mAuthCode = p1;
       this.mVerifyCode = p2;
       this.mContext = p0.getApplicationContext();
       this.mICallBackResultService = p4;
       this.unRegister(p3);
    }
    public void unRegister(JSONObject p0){
       if (this.checkContext()) {
          this.startMcsService(0x3002, p0);
       }else if(this.getPushCallback() != null){
          this.getPushCallback().onUnRegister(-2);
       }
       return;
    }
}
