package com.yxcorp.gifshow.push.badge.impl.OnePlusHomeBadger$executeBadgeByContentProvider$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import java.lang.Object;
import qrd.l1;
import android.os.Bundle;
import java.lang.String;
import android.content.ContentResolver;
import android.net.Uri;

public final class OnePlusHomeBadger$executeBadgeByContentProvider$1 extends Lambda implements a	// class@001630
{
    public final int $badgeCount;
    public final Context $context;

    public void OnePlusHomeBadger$executeBadgeByContentProvider$1(int p0,Context p1){
       this.$badgeCount = p0;
       this.$context = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Bundle uBundle = new Bundle();
       uBundle.putInt("app_badge_count", this.$badgeCount);
       this.$context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", null, uBundle);
    }
}
