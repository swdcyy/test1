package com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$updatePrivacySetting$$inlined$let$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.String;
import erd.g;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import qyb.b;

public final class SettingPluginHelper$updatePrivacySetting$$inlined$let$lambda$1 extends Lambda implements a	// class@000fe7
{
    public final GifshowActivity $activity$inlined;
    public final String $optionKey$inlined;
    public final boolean $optionValue$inlined;
    public final SlipSwitchButton $slipSwitchButton$inlined;
    public final g $successConsumer$inlined;

    public void SettingPluginHelper$updatePrivacySetting$$inlined$let$lambda$1(GifshowActivity p0,SlipSwitchButton p1,String p2,boolean p3,g p4){
       this.$activity$inlined = p0;
       this.$slipSwitchButton$inlined = p1;
       this.$optionKey$inlined = p2;
       this.$optionValue$inlined = p3;
       this.$successConsumer$inlined = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, SettingPluginHelper$updatePrivacySetting$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       d.a(0x676c072d).Ht(this.$activity$inlined, this.$slipSwitchButton$inlined, this.$optionKey$inlined, this.$optionValue$inlined, this.$successConsumer$inlined);
       PatchProxy.onMethodExit(SettingPluginHelper$updatePrivacySetting$$inlined$let$lambda$1.class, "1");
       return;
    }
}
