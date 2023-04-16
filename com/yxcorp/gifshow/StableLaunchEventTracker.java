package com.yxcorp.gifshow.StableLaunchEventTracker;
import com.kwai.framework.activitycontext.ActivityContext$b;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$LaunchEvent;
import uv8.l1;
import com.kwai.robust.PatchProxyResult;
import android.content.ComponentName;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import t06.b;
import java.lang.Throwable;
import q87.c;
import android.content.Intent;
import com.yxcorp.gifshow.LaunchSource;
import h30.a;
import com.yxcorp.gifshow.StableLaunchEventTracker$ExtraInfo;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import fg6.a;
import com.google.gson.Gson;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import android.view.View;
import android.view.ViewGroup;
import k2b.u1;
import java.lang.StringBuilder;
import android.os.SystemClock;
import android.os.Bundle;

public class StableLaunchEventTracker implements ActivityContext$b	// class@00102d
{
    public boolean b;
    public long c;
    public static final long d;
    public static final int e;

    static {
       StableLaunchEventTracker.d = TimeUnit.SECONDS.toMillis(30);
    }
    public void StableLaunchEventTracker(){
       super();
       this.b = true;
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public final void b(Activity p0,boolean p1){
       LaunchSource launchSource;
       StableLaunchEventTracker$ExtraInfo uExtraInfo;
       StableLaunchEventTracker stableLaunch = StableLaunchEventTracker.class;
       if (PatchProxy.isSupport(stableLaunch) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, stableLaunch, "4")) {
          return;
       }
       ClientEvent$LaunchEvent launchEvent = new ClientEvent$LaunchEvent();
       launchEvent.cold = p1;
       String str = PatchProxy.applyOneRefs(p0, null, l1.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = p0.getComponentName().getClassName();
          if (p0 instanceof GifshowActivity) {
             try{
                String url = p0.getUrl();
                if (!TextUtils.x(url)) {
                   str = url;
                }
             }catch(java.lang.Exception e1){
                b.C().v("LaunchHelper", "getUrl error: ", e1);
             }
          }
       }
    }
    public void d(Activity p0){
       boolean b1;
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, StableLaunchEventTracker.class, "2")) {
          return;
       }
       ViewGroup obj = PatchProxy.applyOneRefs(p0, null, l1.class, "5");
       boolean b = true;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          obj = p0.findViewById(0x1020002);
          String str = p0.getComponentName().toString();
          String str1 = "Activity: ";
          if (obj == null) {
             u1.Q("no_content_activity", str);
             objArray = new Object[false];
             b.C().w("LaunchHelper", str1+str+" doesn\'t has content", objArray);
          }else if(!obj.getChildCount()){
             u1.Q("transparent_activity", str);
             objArray = new Object[false];
             b.C().w("LaunchHelper", str1+str+" has zero child.", objArray);
          }
          if (obj.getChildCount()) {
             b1 = false;
          }
          b1 = true;
       }
       if (b1) {
          return;
       }else if(this.b != null){
          this.b(p0, b);
          this.b = false;
          this.c = 0;
          return;
       }else if(this.c && (SystemClock.elapsedRealtime() - this.c) - StableLaunchEventTracker.d >= 0){
          this.b(p0, false);
       }
       this.c = 0;
       return;
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       a.a(this, p0, p1);
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, StableLaunchEventTracker.class, "3")) {
          return;
       }
       this.c = SystemClock.elapsedRealtime();
       return;
    }
    public void onForeground(){
       a.f(this);
    }
}
