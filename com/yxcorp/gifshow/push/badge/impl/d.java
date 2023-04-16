package com.yxcorp.gifshow.push.badge.impl.d;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import com.yxcorp.gifshow.push.badge.impl.d$a;
import nsd.u;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.content.Context;
import android.content.ComponentName;
import android.app.Notification;
import kotlin.jvm.internal.a;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.ContentValues;
import java.lang.Integer;
import android.os.Looper;
import com.yxcorp.gifshow.push.badge.impl.d$a$a;
import android.net.Uri;
import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.content.Intent;

public final class d extends BaseBadger	// class@00163c
{
    public AsyncQueryHandler e;
    public static final d$a f;

    static {
       d.f = new d$a(null);
    }
    public void d(){
       super();
    }
    public List a(){
       String[] stringArray = new String[]{"com.sonyericsson.home","com.sonymobile.home","com.sonymobile.launcher"};
       return CollectionsKt__CollectionsKt.L(stringArray);
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       int i = 0;
       Integer integer = 1;
       ContentValues uContentValu = (p0.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", i) != null)? 1: null;
       if (uContentValu) {
          uContentValu = new ContentValues();
          uContentValu.put("badge_count", Integer.valueOf(p2));
          uContentValu.put("package_name", p1.getPackageName());
          uContentValu.put("activity_name", p1.getClassName());
          String str = "content://com.sonymobile.home.resourceprovider/badge";
          if (a.g(Looper.myLooper(), Looper.getMainLooper())) {
             if (this.e == null) {
                this.e = new d$a$a(p0, this);
             }
             d te = this.e;
             if (te != null) {
                te.startInsert(i, null, Uri.parse(str), uContentValu);
             }
          }else {
             p0 = p0.getApplicationContext();
             a.o(p0, "context.applicationContext");
             p0.getContentResolver().insert(Uri.parse(str), uContentValu);
          }
       }else {
          Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
          intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", p1.getPackageName());
          intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", p1.getClassName());
          intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(p2));
          intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", integer);
          p0.sendBroadcast(intent);
       }
       if (p3 != null) {
          p3.number = p2;
       }
       return;
    }
}
