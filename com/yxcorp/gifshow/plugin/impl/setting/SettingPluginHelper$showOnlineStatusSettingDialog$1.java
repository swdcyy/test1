package com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$showOnlineStatusSettingDialog$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import erd.g;
import a17.b$b;
import a17.b$a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import qyb.b;

public final class SettingPluginHelper$showOnlineStatusSettingDialog$1 extends Lambda implements a	// class@000fe2
{
    public final Activity $activity;
    public final b$a $cancelCallback;
    public final g $changeOptionConsumer;
    public final g $errorConsumer;
    public final b$b $listCallback;

    public void SettingPluginHelper$showOnlineStatusSettingDialog$1(Activity p0,g p1,g p2,b$b p3,b$a p4){
       this.$activity = p0;
       this.$errorConsumer = p1;
       this.$changeOptionConsumer = p2;
       this.$listCallback = p3;
       this.$cancelCallback = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, SettingPluginHelper$showOnlineStatusSettingDialog$1.class, "1")) {
          return;
       }
       d.a(0x676c072d).q7(this.$activity, this.$errorConsumer, this.$changeOptionConsumer, this.$listCallback, this.$cancelCallback);
       return;
    }
}
