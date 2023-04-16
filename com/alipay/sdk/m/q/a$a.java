package com.alipay.sdk.m.q.a$a;
import com.alipay.android.app.IRemoteServiceCallback$Stub;
import com.alipay.sdk.m.q.a;
import java.lang.String;
import java.util.Map;
import s6.a;
import k6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.alipay.sdk.m.q.a$c;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import java.lang.Throwable;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import java.lang.StringBuilder;
import android.app.Activity;
import android.os.SystemClock;
import android.content.Context;

public class a$a extends IRemoteServiceCallback$Stub	// class@000e99
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public int getVersion(){
       return 4;
    }
    public boolean isHideLoadingScreen(){
       return false;
    }
    public void payEnd(boolean p0,String p1){
    }
    public void r03(String p0,String p1,Map p2){
       a.c(a.e(this.a), "wlt", p0, p1);
       if (TextUtils.equals(p1, "ActivityStartSuccess")) {
          if (a.i(this.a) != null) {
             a.i(this.a).a();
          }
          if (a.e(this.a) != null) {
             p0.h = true;
          }
       }
       return;
    }
    public void startActivity(String p0,String p1,int p2,Bundle p3){
       String str = "|";
       Intent intent = new Intent("android.intent.action.MAIN", null);
       if (p3 == null) {
          p3 = new Bundle();
       }
       try{
          p3.putInt("CallingPid", p2);
          intent.putExtras(p3);
       }catch(java.lang.Exception e9){
          a.d(a.e(this.a), "biz", "ErrIntentEx", e9);
       }
       intent.setClassName(p0, p1);
       ActivityManager$RunningAppProcessInfo runningAppPr = new ActivityManager$RunningAppProcessInfo();
       ActivityManager.getMyMemoryState(runningAppPr);
       a.c(a.e(this.a), "biz", "isFg", runningAppPr.processName+str+runningAppPr.importance+str);
       p1 = "";
       if (a.j(this.a) != null) {
          a.j(this.a).startActivity(intent);
          a.c(a.e(this.a), "biz", "stAct2", p1+(SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime()));
       }else {
          a.h(a.e(this.a), "biz", "ErrActNull", p1);
          Context uContext = a.e(this.a).a();
          if (uContext != null) {
             uContext.startActivity(intent);
          }
       }
       return;
    }
}
