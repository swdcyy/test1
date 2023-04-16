package com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$startPushSilenceSettingActivity$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.SwitchItem;
import n3d.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import qyb.b;

public final class SettingPluginHelper$startPushSilenceSettingActivity$1 extends Lambda implements a	// class@000fe5
{
    public final GifshowActivity $activity;
    public final a $callback;
    public final SwitchItem $selectedItem;

    public void SettingPluginHelper$startPushSilenceSettingActivity$1(GifshowActivity p0,SwitchItem p1,a p2){
       this.$activity = p0;
       this.$selectedItem = p1;
       this.$callback = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, SettingPluginHelper$startPushSilenceSettingActivity$1.class, "1")) {
          return;
       }
       d.a(0x676c072d).Ua(this.$activity, this.$selectedItem, this.$callback);
       return;
    }
}
