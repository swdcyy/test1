package com.yxcorp.gifshow.push.badge.compat.EverythingMeHomeBadger$executeBadge$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.ComponentName;
import android.content.Context;
import java.lang.Object;
import qrd.l1;
import android.content.ContentValues;
import java.lang.String;
import java.lang.Integer;
import android.content.ContentResolver;
import android.net.Uri;

public final class EverythingMeHomeBadger$executeBadge$1 extends Lambda implements a	// class@00161d
{
    public final int $badgeCount;
    public final ComponentName $componentName;
    public final Context $context;

    public void EverythingMeHomeBadger$executeBadge$1(ComponentName p0,int p1,Context p2){
       this.$componentName = p0;
       this.$badgeCount = p1;
       this.$context = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("package_name", this.$componentName.getPackageName());
       uContentValu.put("activity_name", this.$componentName.getClassName());
       uContentValu.put("count", Integer.valueOf(this.$badgeCount));
       this.$context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), uContentValu);
    }
}
