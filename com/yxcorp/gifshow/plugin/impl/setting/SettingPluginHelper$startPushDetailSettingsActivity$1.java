package com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$startPushDetailSettingsActivity$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.google.gson.internal.LinkedTreeMap;
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

public final class SettingPluginHelper$startPushDetailSettingsActivity$1 extends Lambda implements a	// class@000fe4
{
    public final GifshowActivity $activity;
    public final a $callback;
    public final LinkedTreeMap $optionMap;
    public final SwitchItem $selectedItem;

    public void SettingPluginHelper$startPushDetailSettingsActivity$1(GifshowActivity p0,LinkedTreeMap p1,SwitchItem p2,a p3){
       this.$activity = p0;
       this.$optionMap = p1;
       this.$selectedItem = p2;
       this.$callback = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, SettingPluginHelper$startPushDetailSettingsActivity$1.class, "1")) {
          return;
       }
       d.a(0x676c072d).PE(this.$activity, this.$optionMap, this.$selectedItem, this.$callback);
       return;
    }
}
