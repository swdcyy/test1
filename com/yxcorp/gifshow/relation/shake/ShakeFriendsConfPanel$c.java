package com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel$c;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel$c$a;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$updatePrivacySetting$$inlined$let$lambda$1;
import erd.g;
import android.content.Context;
import msd.a;
import xbc.e;
import k2b.e0;

public final class ShakeFriendsConfPanel$c implements SlipSwitchButton$b	// class@0019d1
{
    public final GifshowActivity a;

    public void ShakeFriendsConfPanel$c(GifshowActivity p0){
       this.a = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       ShakeFriendsConfPanel$c a;
       Object obj = this;
       Object obj1 = p0;
       boolean b = p1;
       ShakeFriendsConfPanel$c uoc = ShakeFriendsConfPanel$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(obj1, Boolean.valueOf(p1), obj, uoc, "1")) {
          return;
       }
       a.p(obj1, "view");
       a = obj.a;
       String str = "enable_shake";
       ShakeFriendsConfPanel$c$a uoc$a = new ShakeFriendsConfPanel$c$a(b);
       int i = 4;
       if (PatchProxy.isSupport2(SettingPluginHelper.class, "7")) {
          Object[] objArray = new Object[]{a,obj1,str,Boolean.valueOf(p1),uoc$a};
          if (PatchProxy.applyVoid(objArray, null, SettingPluginHelper.class, "7")) {
          label_0070 :
             uoc = obj.a;
             e uoe = e.class;
             if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(uoc, Boolean.valueOf(p1), null, uoe, "4")) {
                a.p(uoc, "page");
                if (b) {
                   i = 3;
                }
                e.a(uoc, i);
             }
             return;
          }
       }
       a.p(obj1, "slipSwitchButton");
       a.p(str, "optionKey");
       if (a != null) {
          SettingPluginHelper$updatePrivacySetting$$inlined$let$lambda$1 oupdatePriva = new SettingPluginHelper$updatePrivacySetting$$inlined$let$lambda$1(a, p0, str, p1, uoc$a);
          SettingPluginHelper.a.a(a, v15);
       }
       PatchProxy.onMethodExit(SettingPluginHelper.class, "7");
       goto label_0070 ;
    }
}
