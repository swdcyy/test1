package com.kwai.video.waynelive.wayneplayer.WayneLivePlayerFactory;
import java.lang.Object;
import com.kwai.video.waynelive.datasource.ILiveDatasource;
import com.kwai.video.waynelive.LivePlayerParam;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import com.kwai.video.waynelive.datasource.LiveDataSource;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;

public class WayneLivePlayerFactory	// class@000e51
{

    public void WayneLivePlayerFactory(){
       super();
    }
    public static LivePlayerController createWayneLivePlayer(ILiveDatasource p0,LivePlayerParam p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, WayneLivePlayerFactory.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WayneLivePlayer(p0, p1);
    }
    public static LivePlayerController createWayneLivePlayer(LiveDataSource p0,LivePlayerParam p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, WayneLivePlayerFactory.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WayneLivePlayer(p0.tranforms2ILiveDatasource(p1.mEnableWebRTCManifest), p1);
    }
    public static LivePlayerController createWayneLivePlayer(LivePlayTextureView p0,ILiveDatasource p1,LivePlayerParam p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, WayneLivePlayerFactory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WayneLivePlayer(p0, p1, p2);
    }
    public static LivePlayerController createWayneLivePlayer(LivePlayTextureView p0,LiveDataSource p1,LivePlayerParam p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, WayneLivePlayerFactory.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WayneLivePlayer(p0, p1.tranforms2ILiveDatasource(p2.mEnableWebRTCManifest), p2);
    }
}
