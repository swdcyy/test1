package com.yxcorp.gifshow.push.badge.compat.ZTEHomeBadger;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import android.content.Context;
import android.content.ComponentName;
import android.app.Notification;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.push.badge.compat.ZTEHomeBadger$executeBadge$1;
import msd.a;

public final class ZTEHomeBadger extends BaseBadger	// class@001622
{

    public void ZTEHomeBadger(){
       super();
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       this.c(p0, new ZTEHomeBadger$executeBadge$1(p2, p1, p0));
    }
}
