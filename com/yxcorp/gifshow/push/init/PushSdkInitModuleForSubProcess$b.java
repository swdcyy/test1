package com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess$b;
import com.kwai.android.common.bean.NotificationSmallIcon;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.android.dispatcher.KwaiPush;
import o6c.a;

public final class PushSdkInitModuleForSubProcess$b implements NotificationSmallIcon	// class@0012e8
{
    public static final PushSdkInitModuleForSubProcess$b a;

    static {
       PushSdkInitModuleForSubProcess$b.a = new PushSdkInitModuleForSubProcess$b();
    }
    public void PushSdkInitModuleForSubProcess$b(){
       super();
    }
    public final int getNotificationSmallIcon(){
       Object obj = PatchProxy.apply(null, this, PushSdkInitModuleForSubProcess$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (a.a(KwaiPush.INSTANCE))? 0x7f081a36: 0x7f081a35;
       return i;
    }
}
