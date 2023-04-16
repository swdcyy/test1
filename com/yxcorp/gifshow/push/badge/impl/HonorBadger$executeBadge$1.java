package com.yxcorp.gifshow.push.badge.impl.HonorBadger$executeBadge$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import android.content.ComponentName;
import java.lang.Object;
import qrd.l1;
import android.os.Bundle;
import java.lang.String;
import android.content.ContentResolver;
import android.net.Uri;

public final class HonorBadger$executeBadge$1 extends Lambda implements a	// class@00162a
{
    public final int $badgeCount;
    public final ComponentName $componentName;
    public final Context $context;

    public void HonorBadger$executeBadge$1(Context p0,ComponentName p1,int p2){
       this.$context = p0;
       this.$componentName = p1;
       this.$badgeCount = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Bundle uBundle = new Bundle();
       uBundle.putString("package", this.$context.getPackageName());
       uBundle.putString("class", this.$componentName.getClassName());
       uBundle.putInt("badgenumber", this.$badgeCount);
       this.$context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, uBundle);
    }
}
