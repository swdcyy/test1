package com.yxcorp.gifshow.push.badge.impl.a;
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

public final class a extends BaseBadger	// class@001635
{

    public void a(){
       super();
    }
    public List a(){
       String[] stringArray = new String[]{"fr.neamar.kiss","com.quaap.launchtime","com.quaap.launchtime_official"};
       return CollectionsKt__CollectionsKt.L(stringArray);
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       Intent intent = new Intent(this.d());
       intent.putExtra("badge_count", p2);
       intent.putExtra("badge_count_package_name", p1.getPackageName());
       intent.putExtra("badge_count_class_name", p1.getClassName());
       p0.sendBroadcast(intent);
    }
}
