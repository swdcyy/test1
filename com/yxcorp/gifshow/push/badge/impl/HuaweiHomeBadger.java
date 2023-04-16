package com.yxcorp.gifshow.push.badge.impl.HuaweiHomeBadger;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import java.util.List;
import java.lang.Object;
import trd.t;
import android.content.Context;
import android.content.ComponentName;
import android.app.Notification;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.push.badge.impl.HuaweiHomeBadger$executeBadge$1;
import msd.a;

public final class HuaweiHomeBadger extends BaseBadger	// class@00162d
{

    public void HuaweiHomeBadger(){
       super();
    }
    public List a(){
       return t.k("com.huawei.android.launcher");
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       this.c(p0, new HuaweiHomeBadger$executeBadge$1(p0, p1, p2));
    }
}
