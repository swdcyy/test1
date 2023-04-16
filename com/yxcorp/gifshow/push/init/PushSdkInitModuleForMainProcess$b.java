package com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$b;
import com.kwai.android.common.bean.NotificationSmallIcon;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.android.dispatcher.KwaiPush;
import o6c.a;

public final class PushSdkInitModuleForMainProcess$b implements NotificationSmallIcon	// class@001648
{
    public static final PushSdkInitModuleForMainProcess$b a;

    static {
       PushSdkInitModuleForMainProcess$b.a = new PushSdkInitModuleForMainProcess$b();
    }
    public void PushSdkInitModuleForMainProcess$b(){
       super();
    }
    public final int getNotificationSmallIcon(){
       Object obj = PatchProxy.apply(null, this, PushSdkInitModuleForMainProcess$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (a.a(KwaiPush.INSTANCE))? 0x7f081a36: 0x7f081a35;
       return i;
    }
}
