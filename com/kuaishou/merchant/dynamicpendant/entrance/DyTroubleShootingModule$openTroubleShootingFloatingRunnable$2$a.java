package com.kuaishou.merchant.dynamicpendant.entrance.DyTroubleShootingModule$openTroubleShootingFloatingRunnable$2$a;
import java.lang.Runnable;
import com.kuaishou.merchant.dynamicpendant.entrance.DyTroubleShootingModule$openTroubleShootingFloatingRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import java.util.Objects;
import o56.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import c08.a;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.yxcorp.utility.Log;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting;
import fq5.b;
import b08.a;
import android.app.Activity;

public final class DyTroubleShootingModule$openTroubleShootingFloatingRunnable$2$a implements Runnable	// class@001694
{
    public final DyTroubleShootingModule$openTroubleShootingFloatingRunnable$2 b;

    public void DyTroubleShootingModule$openTroubleShootingFloatingRunnable$2$a(DyTroubleShootingModule$openTroubleShootingFloatingRunnable$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       String str;
       TroubleShooting a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DyTroubleShootingModule$openTroubleShootingFloatingRunnable$2$a.class, "1")) {
          return;
       }
       DyTroubleShootingModule$openTroubleShootingFloatingRunnable$2 $context = this.b.$context;
       Objects.requireNonNull(DyTroubleShooting.c);
       if (a.d()) {
          GifshowActivity gifshowActiv = ($context != null)? $context.a(): objArray;
          int i = 0;
          SharedPreferences sharedPrefer = b.c(gifshowActiv, "live_troubleshooting_debug.xml", i);
          if ($context != null) {
             str = 1;
             if ($context.g() == str) {
                i = a.t().d("LiveDebugTroubleShootingDefaultValue", str);
             }
          }
          StringBuilder str1 = "isShopLive:";
          Boolean uBoolean = ($context != null)? Boolean.valueOf($context.g()): objArray;
          Log.g("openTroubleShootingFloating", str1+uBoolean+' '+"defaultValue:"+i);
          if (sharedPrefer.getBoolean("live_trouble_shooting_switch", i)) {
             a = TroubleShooting.a;
             GifshowActivity gifshowActiv1 = ($context != null)? $context.a(): objArray;
             if ($context != null) {
                b uob = $context.b();
                if (uob != null) {
                   str = uob.s5();
                label_0092 :
                   String str2 = ($context != null)? a.e($context): objArray;
                   if ($context != null) {
                      objArray = a.d($context);
                   }
                   TroubleShooting.D(a, gifshowActiv1, str, str2, objArray, null, 16, null);
                }
             }
             Object[] objArray1 = objArray;
             goto label_0092 ;
          }
       }
       return;
    }
}
