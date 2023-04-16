package com.huawei.emui.hiexperience.iaware.sdk.appsdk.IAwareAppSdk;
import java.lang.Object;
import com.huawei.emui.hiexperience.iaware.sdk.appsdk.IAwareAppSdk$1;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Long;
import com.huawei.emui.hiexperience.iaware.sdk.appsdk.IAwareAppSdkAdapter;
import java.lang.Integer;
import com.huawei.emui.hiexperience.iaware.sdk.appsdk.IAwareAppSdk$AppCallBack;

public class IAwareAppSdk	// class@0006ae
{
    public IAwareAppSdk$AppCallBack AppCbk;
    public IAwareAppSdkAdapter mIAwareAppSdkAdapter;
    public String mPhoneInfo;
    public boolean registerStatus;

    public void IAwareAppSdk(){
       super();
       this.registerStatus = false;
       this.mPhoneInfo = "";
       this.mIAwareAppSdkAdapter = null;
       this.AppCbk = new IAwareAppSdk$1(this);
    }
    public void addVipThreads(long[] p0){
       if (p0 != null && p0.length) {
          StringBuilder str = "\"IFID\":1001,\"vipThreads\":[";
          int len = p0.length;
          int i = 0;
          while (true) {
             if (i < len) {
                String str1 = Long.toString(p0[i]);
                int i1 = len - 1;
                str = (i == i1)? str+str1: str+str1+",";
                if (str.length() > 256) {
                   return;
                }else {
                   i = i + 1;
                }
             }else {
                str = str+"]";
                if (str.length() > 256) {
                   return;
                }else {
                   IAwareAppSdk tmIAwareAppS = this.mIAwareAppSdkAdapter;
                   if (tmIAwareAppS != null) {
                      tmIAwareAppS.reportVip(str);
                      break ;
                   }
                }
             }
          }
       }
       return;
    }
    public void cancelVipThreads(long[] p0){
       if (p0 != null && p0.length) {
          StringBuilder str = "\"IFID\":1002,\"vipThreads\":[";
          int len = p0.length;
          int i = 0;
          while (true) {
             if (i < len) {
                String str1 = Long.toString(p0[i]);
                int i1 = len - 1;
                str = (i == i1)? str+str1: str+str1+",";
                if (str.length() > 256) {
                   return;
                }else {
                   i = i + 1;
                }
             }else {
                str = str+"]";
                if (str.length() > 256) {
                   return;
                }else {
                   IAwareAppSdk tmIAwareAppS = this.mIAwareAppSdkAdapter;
                   if (tmIAwareAppS != null) {
                      tmIAwareAppS.reportVip(str);
                      break ;
                   }
                }
             }
          }
       }
       return;
    }
    public void notifyAppScene(int p0,int p1){
       StringBuilder str = "\"IFID\":1000"+",\"scene\":"+Integer.toString(p0)+",\"status\":"+Integer.toString(p1);
       StringBuilder str1 = "notifyAppScene, json: "+str;
       if (str.length() > 256) {
          return;
       }
       IAwareAppSdk tmIAwareAppS = this.mIAwareAppSdkAdapter;
       if (tmIAwareAppS != null) {
          tmIAwareAppS.reportScene(str);
       }
       return;
    }
    public boolean registerApp(String p0){
       return this.registerApp(p0, this.AppCbk);
    }
    public final boolean registerApp(String p0,IAwareAppSdk$AppCallBack p1){
       boolean b = false;
       if (p0 != null && (p0.length() <= 0 || p0.length() > 256)) {
          return b;
       }
       if (p1 == null) {
          return b;
       }
       if (this.mIAwareAppSdkAdapter == null) {
          IAwareAppSdkAdapter iAwareAppSdk = new IAwareAppSdkAdapter();
          this.mIAwareAppSdkAdapter = iAwareAppSdk;
          this.registerStatus = iAwareAppSdk.registerAppCallback(p0, p1);
       }
       return this.registerStatus;
    }
}
