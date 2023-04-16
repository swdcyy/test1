package com.yxcorp.gifshow.push.badge.compat.a;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.content.Context;
import android.content.ComponentName;
import android.app.Notification;
import kotlin.jvm.internal.a;
import android.content.Intent;

public final class a extends BaseBadger	// class@001625
{

    public void a(){
       super();
    }
    public List a(){
       String[] stringArray = new String[]{"org.adw.launcher","org.adwfreak.launcher"};
       return CollectionsKt__CollectionsKt.L(stringArray);
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       Intent intent = new Intent("org.adw.launcher.counter.SEND");
       intent.putExtra("PNAME", p1.getPackageName());
       intent.putExtra("CNAME", p1.getClassName());
       intent.putExtra("COUNT", p2);
       p0.sendBroadcast(intent);
    }
}
