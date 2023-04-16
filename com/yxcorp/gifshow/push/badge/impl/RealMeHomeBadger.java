package com.yxcorp.gifshow.push.badge.impl.RealMeHomeBadger;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import java.util.List;
import java.lang.Object;
import trd.t;
import android.content.Context;
import android.content.ComponentName;
import android.app.Notification;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import android.content.Intent;
import com.yxcorp.gifshow.push.badge.impl.RealMeHomeBadger$executeBadgeByContentProvider$1;
import msd.a;

public final class RealMeHomeBadger extends BaseBadger	// class@001633
{

    public void RealMeHomeBadger(){
       super();
    }
    public List a(){
       return t.k("com.oppo.launcher");
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       if (Build$VERSION.SDK_INT >= 23) {
          this.f(p0, p2);
       }else {
          this.e(p0, p1, p2);
       }
       return;
    }
    public final void e(Context p0,ComponentName p1,int p2){
       if (!p2) {
          p2 = -1;
       }
       Intent intent = new Intent("com.oppo.unsettledevent");
       intent.putExtra("pakeageName", p1.getPackageName());
       intent.putExtra("number", p2);
       intent.putExtra("upgradeNumber", p2);
       p0.sendBroadcast(intent);
       return;
    }
    public final void f(Context p0,int p1){
       this.c(p0, new RealMeHomeBadger$executeBadgeByContentProvider$1(p1, p0));
    }
}
