package com.yxcorp.gifshow.push.badge.impl.c;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import com.yxcorp.gifshow.push.badge.impl.c$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.push.badge.impl.a;
import java.util.List;
import java.lang.Object;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.content.Context;
import android.content.ComponentName;
import android.app.Notification;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.push.badge.impl.SamsungHomeBadger$updateByContentProvider$1;
import msd.a;
import android.content.ContentValues;
import java.lang.Integer;

public final class c extends BaseBadger	// class@001638
{
    public a e;
    public static final String[] f;
    public static final c$a g;

    static {
       c.g = new c$a(null);
       String[] stringArray = new String[]{"_id","class"};
       c.f = stringArray;
    }
    public void c(){
       super();
       this.e = new a();
    }
    public List a(){
       String[] stringArray = new String[]{"com.sec.android.app.launcher","com.sec.android.app.twlauncher"};
       return CollectionsKt__CollectionsKt.L(stringArray);
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       c te = this.e;
       if (te != null) {
          te.b(p0, p1, p2, p3);
       }else {
          this.c(p0, new SamsungHomeBadger$updateByContentProvider$1(this, p0, p1, p2));
       }
       return;
    }
    public final ContentValues e(ComponentName p0,int p1,boolean p2){
       ContentValues uContentValu = new ContentValues();
       if (p2) {
          uContentValu.put("package", p0.getPackageName());
          uContentValu.put("class", p0.getClassName());
       }
       uContentValu.put("badgecount", Integer.valueOf(p1));
       return uContentValu;
    }
}
