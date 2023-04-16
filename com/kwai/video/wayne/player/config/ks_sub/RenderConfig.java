package com.kwai.video.wayne.player.config.ks_sub.RenderConfig;
import com.kwai.video.wayne.player.config.inerface.RenderConfigInterface;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;
import android.os.Build$VERSION;

public class RenderConfig extends AbstractBaseConfig implements RenderConfigInterface	// class@000cfe
{
    public int overlayOutputPixelFormat;
    public int vodOverlayOutputPixelFormat;

    public void RenderConfig(){
       super();
       this.overlayOutputPixelFormat = 1;
       this.vodOverlayOutputPixelFormat = 0;
    }
    public static RenderConfig getConfig(){
       RenderConfig renderConfig = RenderConfig.class;
       Object obj = PatchProxy.apply(null, null, renderConfig, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KpMidConfigManager.instance().getConfig("RenderConfig", renderConfig);
    }
    public int getOverlayOutputPixelFormat(){
       int sDK_INT = Build$VERSION.SDK_INT;
       RenderConfig toverlayOutp = this.overlayOutputPixelFormat;
       if (toverlayOutp == 2) {
          return 0x32315659;
       }
       if (toverlayOutp == 3) {
          return 0x30323449;
       }
       if (toverlayOutp == 4) {
          return 0x3253455f;
       }
       if (toverlayOutp != 5) {
          return 0x32335652;
       }
       if (sDK_INT > 29) {
          return 0x32315659;
       }
       return 0x3132564e;
    }
    public String getPrefKey(){
       return "RenderConfig";
    }
    public int getVodOverlayOutputPixelFormat(){
       int sDK_INT = Build$VERSION.SDK_INT;
       RenderConfig tvodOverlayO = this.vodOverlayOutputPixelFormat;
       if (tvodOverlayO == 1) {
          return 0x32335652;
       }
       if (tvodOverlayO == 2) {
          return 0x32315659;
       }
       if (tvodOverlayO == 3) {
          return 0x30323449;
       }
       if (tvodOverlayO == 4) {
          return 0x3253455f;
       }
       if (tvodOverlayO != 5) {
          return 0;
       }
       if (sDK_INT > 29) {
          return 0x32315659;
       }
       return 0x3132564e;
    }
    public void setOverlayOutputPixelFormat(int p0){
       this.overlayOutputPixelFormat = p0;
    }
    public void setVodOverlayOutputPixelFormat(int p0){
       this.vodOverlayOutputPixelFormat = p0;
    }
}
