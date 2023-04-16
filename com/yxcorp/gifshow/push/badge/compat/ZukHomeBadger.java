package com.yxcorp.gifshow.push.badge.compat.ZukHomeBadger;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import java.util.List;
import java.lang.Object;
import trd.t;
import android.content.Context;
import android.content.ComponentName;
import android.app.Notification;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.push.badge.compat.ZukHomeBadger$executeBadge$1;
import msd.a;

public final class ZukHomeBadger extends BaseBadger	// class@001624
{

    public void ZukHomeBadger(){
       super();
    }
    public List a(){
       return t.k("com.zui.launcher");
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       this.c(p0, new ZukHomeBadger$executeBadge$1(p2, p0));
    }
}
