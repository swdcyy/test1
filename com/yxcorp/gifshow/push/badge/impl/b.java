package com.yxcorp.gifshow.push.badge.impl.b;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.content.Context;
import android.content.ComponentName;
import android.app.Notification;
import kotlin.jvm.internal.a;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Integer;
import java.lang.reflect.Method;
import com.yxcorp.gifshow.push.badge.ShortcutBadgeException;
import java.lang.Exception;
import nsd.u;

public final class b extends BaseBadger	// class@001636
{

    public void b(){
       super();
    }
    public List a(){
       String[] stringArray = new String[]{"com.miui.miuilite","com.miui.home","com.miui.miuihome","com.miui.miuihome2","com.miui.mihome","com.miui.mihome2","com.i.miui.launcher"};
       return CollectionsKt__CollectionsKt.L(stringArray);
    }
    public void b(Context p0,ComponentName p1,int p2,Notification p3){
       a.p(p0, "context");
       a.p(p1, "componentName");
       if (p3 == null) {
          throw new ShortcutBadgeException("Badges can not be set without notification", null, 2, null);
       }
       try{
          p0 = p3.getClass().getDeclaredField("extraNotification").get(p3);
          Class[] uClassArray = new Class[]{Integer.TYPE};
          Object[] objArray = new Object[]{Integer.valueOf(p2)};
          p0.getClass().getDeclaredMethod("setMessageCount", uClassArray).invoke(p0, objArray);
          return;
       }catch(java.lang.Exception e5){
          throw new ShortcutBadgeException("not able to set badge", e5);
       }
    }
}
