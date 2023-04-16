package com.kwai.video.wayne.player.config.module.StartPlayConfigModule$2;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule$StartPlayConfigModuleGetter;
import java.lang.Object;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.InjectConfig;
import com.kwai.video.wayne.player.config.ks_sub.StartPlayConfig;
import com.kwai.video.wayne.player.config.ks_sub.AbTestConfig;

public final class StartPlayConfigModule$2 implements StartPlayConfigModule$StartPlayConfigModuleGetter	// class@000d0b
{

    public void StartPlayConfigModule$2(){
       super();
    }
    public StartPlayConfigModule getStartPlayConfig(int p0,boolean p1){
       StartPlayConfigModule obj;
       StartPlayConfigModule$2 u2 = StartPlayConfigModule$2.class;
       if (PatchProxy.isSupport(u2)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, u2, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new StartPlayConfigModule();
       if (p0 == 2) {
          obj.preloadMs = InjectConfig.getConfig().getStartPlayConfigForHls().preLoadMs;
          obj.startPlayBlockMs = InjectConfig.getConfig().getStartPlayConfigForHls().startPlayTh;
          obj.startPlayBlockCostMs = InjectConfig.getConfig().getStartPlayConfigForHls().startPlayMaxMs;
          obj.startPlayMaxBufferMS = AbTestConfig.getConfig().getMaxBufBspMs();
          obj.startPlayMaxBufferBytes = -1;
          obj.startPlayBlockStrategy = InjectConfig.getConfig().getStartPlayBlockStrategyForHls();
          obj.startPlayMaxBufferStrategy = InjectConfig.getConfig().getPlayerMaxBufferStrategyForHls();
       }else if(p0 == 1){
          obj.preloadMs = StartPlayConfig.getConfig().preLoadMs;
          obj.startPlayBlockStrategy = InjectConfig.getConfig().getStartPlayBlockStrategyForMp4();
          if (p1) {
             obj.startPlayBlockMs = AbTestConfig.getConfig().getPdStartPlayThSlide();
             obj.startPlayBlockCostMs = AbTestConfig.getConfig().getPdStartPlayMaxMsSlide();
             obj.startPlayMaxBufferMS = InjectConfig.getConfig().getMaxBufBspMsForSlide();
             obj.startPlayMaxBufferBytes = InjectConfig.getConfig().getMaxBufBspBytesForSlide();
             obj.startPlayMaxBufferStrategy = AbTestConfig.getConfig().getMaxBufStrategyForSlide();
          }else {
             obj.startPlayBlockMs = AbTestConfig.getConfig().getPdStartPlayTh();
             obj.startPlayBlockCostMs = AbTestConfig.getConfig().getPdStartPlayMaxMs();
             obj.startPlayMaxBufferMS = AbTestConfig.getConfig().getMaxBufBspMs();
             obj.startPlayMaxBufferBytes = -1;
             obj.startPlayMaxBufferStrategy = AbTestConfig.getConfig().getMaxBufStrategy();
          }
       }
       return obj;
    }
}
