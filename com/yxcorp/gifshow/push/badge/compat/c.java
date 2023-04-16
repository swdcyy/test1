package com.yxcorp.gifshow.push.badge.compat.c;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import java.util.List;
import java.lang.Object;
import trd.t;
import android.content.Context;
import android.content.ComponentName;
import android.app.Notification;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Intent;

public final class c extends BaseBadger	// class@001627
{

    public void c(){
       super();
    }
    public List a(){
       return t.k("com.htc.launcher");
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
       intent.putExtra("com.htc.launcher.extra.COMPONENT", p1.flattenToShortString());
       intent.putExtra("com.htc.launcher.extra.COUNT", p2);
       Intent intent1 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
       intent1.putExtra("packagename", p1.getPackageName());
       intent1.putExtra("count", p2);
       p0.sendBroadcast(intent);
       p0.sendBroadcast(intent1);
    }
}
