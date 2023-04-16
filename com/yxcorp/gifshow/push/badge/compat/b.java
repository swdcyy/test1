package com.yxcorp.gifshow.push.badge.compat.b;
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

public final class b extends BaseBadger	// class@001626
{

    public void b(){
       super();
    }
    public List a(){
       return t.k("com.anddoes.launcher");
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
       intent.putExtra("package", p1.getPackageName());
       intent.putExtra("count", p2);
       intent.putExtra("class", p1.getClassName());
       p0.sendBroadcast(intent);
    }
}
