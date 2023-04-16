package com.yxcorp.gifshow.push.badge.impl.OnePlusHomeBadger;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import com.yxcorp.gifshow.push.badge.impl.a;
import android.content.Context;
import android.content.ComponentName;
import android.app.Notification;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.push.badge.impl.OnePlusHomeBadger$executeBadgeByContentProvider$1;
import msd.a;

public final class OnePlusHomeBadger extends BaseBadger	// class@001631
{
    public a e;

    public void OnePlusHomeBadger(){
       super();
       this.e = new a();
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       if (Build$VERSION.SDK_INT >= 30) {
          this.e(p0, p2);
       }else {
          this.e.b(p0, p1, p2, p3);
       }
       return;
    }
    public final void e(Context p0,int p1){
       this.c(p0, new OnePlusHomeBadger$executeBadgeByContentProvider$1(p1, p0));
    }
}
