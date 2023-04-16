package com.yxcorp.gifshow.push.badge.compat.EverythingMeHomeBadger;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import java.util.List;
import java.lang.Object;
import trd.t;
import android.content.Context;
import android.content.ComponentName;
import android.app.Notification;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.push.badge.compat.EverythingMeHomeBadger$executeBadge$1;
import msd.a;

public final class EverythingMeHomeBadger extends BaseBadger	// class@00161e
{

    public void EverythingMeHomeBadger(){
       super();
    }
    public List a(){
       return t.k("me.everything.launcher");
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       this.c(p0, new EverythingMeHomeBadger$executeBadge$1(p1, p2, p0));
    }
}
