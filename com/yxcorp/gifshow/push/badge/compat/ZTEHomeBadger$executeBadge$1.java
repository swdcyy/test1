package com.yxcorp.gifshow.push.badge.compat.ZTEHomeBadger$executeBadge$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.ComponentName;
import android.content.Context;
import java.lang.Object;
import qrd.l1;
import android.os.Bundle;
import java.lang.String;
import android.content.ContentResolver;
import android.net.Uri;

public final class ZTEHomeBadger$executeBadge$1 extends Lambda implements a	// class@001621
{
    public final int $badgeCount;
    public final ComponentName $componentName;
    public final Context $context;

    public void ZTEHomeBadger$executeBadge$1(int p0,ComponentName p1,Context p2){
       this.$badgeCount = p0;
       this.$componentName = p1;
       this.$context = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Bundle uBundle = new Bundle();
       uBundle.putInt("app_badge_count", this.$badgeCount);
       uBundle.putString("app_badge_component_name", this.$componentName.flattenToString());
       this.$context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", null, uBundle);
    }
}
