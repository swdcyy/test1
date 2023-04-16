package com.yxcorp.plugin.setting.stencil.SettingStencilPluginImpl$createLoggerHandler$$inlined$let$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import k2b.e0;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import nc5.i;

public final class SettingStencilPluginImpl$createLoggerHandler$$inlined$let$lambda$1 extends Lambda implements a	// class@0008f3
{
    public final SettingItemStencil $data$inlined;
    public final e0 $logPage$inlined;

    public void SettingStencilPluginImpl$createLoggerHandler$$inlined$let$lambda$1(e0 p0,SettingItemStencil p1){
       this.$logPage$inlined = p0;
       this.$data$inlined = p1;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Integer obj = PatchProxy.applyWithListener(null, this, SettingStencilPluginImpl$createLoggerHandler$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.$data$inlined.getRedDotType();
       boolean b = (obj != null)? i.c(obj.intValue()): false;
       PatchProxy.onMethodExit(SettingStencilPluginImpl$createLoggerHandler$$inlined$let$lambda$1.class, "1");
       return b;
    }
}
