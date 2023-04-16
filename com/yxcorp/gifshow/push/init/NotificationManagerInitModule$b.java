package com.yxcorp.gifshow.push.init.NotificationManagerInitModule$b;
import t7.c;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;

public final class NotificationManagerInitModule$b implements c	// class@0012e4
{
    public static final NotificationManagerInitModule$b a;

    static {
       NotificationManagerInitModule$b.a = new NotificationManagerInitModule$b();
    }
    public void NotificationManagerInitModule$b(){
       super();
    }
    public final boolean a(Method p0,Object[] p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, NotificationManagerInitModule$b.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       a.p(p0, "<anonymous parameter 0>");
       int i = 0;
       if (Build$VERSION.SDK_INT >= 33 && !b.c(a.b(), "notification_permission_dialog", i).getBoolean("ever_be_shown", i)) {
          i = true;
       }
       return i;
    }
}
