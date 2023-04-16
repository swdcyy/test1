package com.yxcorp.gifshow.push.badge.impl.e;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import com.yxcorp.gifshow.push.badge.impl.e$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import trd.t;
import android.content.Context;
import android.content.ComponentName;
import android.app.Notification;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Intent;

public final class e extends BaseBadger	// class@00163e
{
    public static final e$a e;

    static {
       e.e = new e$a(null);
    }
    public void e(){
       super();
    }
    public List a(){
       return t.k("com.vivo.launcher");
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
       intent.putExtra("packageName", p0.getPackageName());
       intent.putExtra("className", p1.getClassName());
       intent.putExtra("notificationNum", p2);
       intent.addFlags(0x1000000);
       p0.sendBroadcast(intent);
    }
}
