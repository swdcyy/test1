package dib.b;
import zi9.f$a;
import dib.e;
import java.lang.Object;
import com.kwai.video.westeros.WesterosPlugin;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import dc5.c;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.devicepersona.config.DevicePersonaConfig;
import com.kwai.video.devicepersona.config.DeviceConfigManager;
import com.kwai.video.devicepersona.strategy.DeviceStrategyConfigs;
import com.kwai.video.westeros.mmuplugin.MmuPlugin;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import qi9.d1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.westeros.v2.ycnn.YcnnSoLoader;
import com.kwai.video.westeros.v2.ykitplugin.YKitPlugin;
import com.kwai.video.westeros.v2.ykitplugin.YKitSoLoader;
import com.kwai.video.westeros.v2.yar.YarPlugin;
import com.kwai.video.westeros.aiedit.AIEditPlugin;
import com.kwai.video.westeros.Westeros;

public final class b implements f$a	// class@0024b1
{
    public final e a;

    public void b(e p0){
       this.a = p0;
    }
    public final void a(WesterosPlugin p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, ta, uoe, "2")) {
       }else {
          String str = "IMMagicSDK";
          c.g(str, "onPluginSoLoaded "+p0.getClass().getName());
          if (ta.q != null) {
             c.g(str, "onPluginSoLoaded but released, return");
          }else {
             Object[] objArray = null;
             if (PatchProxy.apply(objArray, ta, uoe, "3") != PatchProxyResult.class) {
             }else if(ta.m == null){
                DevicePersonaConfig config = DeviceConfigManager.getInstance().getConfig();
                if (config != null) {
                   DeviceStrategyConfigs deviceStrate = config.getDeviceStrategyConfigs();
                   if (deviceStrate != null && ta.n == null) {
                      ta.n = deviceStrate.getYKitStrategyConfigsToJson();
                      c.g(str, "DeviceYKitPortraitInfo = "+ta.n);
                   }
                }
                ta.m = config;
             }
             if (p0 instanceof MmuPlugin) {
                if (ta.n != null) {
                   p0.setDevicePortraitInfo(ta.n);
                }
             }else if(p0 instanceof YcnnPlugin){
                YcnnPlugin ycnnPlugin = p0;
                ycnnPlugin.setAttrLocalPath(MagicEmojiResourceHelper.l());
                if (ta.n != null) {
                   ycnnPlugin.setDevicePortraitInfo(ta.n);
                }
                str = d1.a();
                if (!TextUtils.x(str)) {
                   ycnnPlugin.setVisionPortraitInfo(str, objArray);
                }
                YcnnSoLoader.loadYcnnExtraSo();
             }else if(p0 instanceof YKitPlugin){
                YKitPlugin yKitPlugin = p0;
                yKitPlugin.setAttrLocalPath(MagicEmojiResourceHelper.l());
                if (ta.n != null) {
                   yKitPlugin.setDevicePortraitInfo(ta.n);
                }
                str = d1.a();
                if (!TextUtils.x(str)) {
                   yKitPlugin.setVisionPortraitInfo(str, objArray);
                }
                YKitSoLoader.loadYKitExtraSo();
             }else if(p0 instanceof YarPlugin){
                if (ta.n != null) {
                   p0.setDevicePortraitInfo(ta.n);
                }
             }else if(p0 instanceof AIEditPlugin && ta.n != null){
                p0.setDevicePortraitInfo(ta.n);
             }
             ta.a.applyPlugin(p0);
          }
       }
       return;
    }
}
