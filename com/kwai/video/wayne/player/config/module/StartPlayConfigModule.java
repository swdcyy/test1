package com.kwai.video.wayne.player.config.module.StartPlayConfigModule;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule$1;
import com.kwai.video.wayne.player.config.module.StartPlayConfigModule$2;
import java.lang.Object;

public class StartPlayConfigModule	// class@000d0d
{
    public int preloadMs;
    public int startPlayBlockCostMs;
    public int startPlayBlockMs;
    public int startPlayBlockStrategy;
    public int startPlayMaxBufferBytes;
    public int startPlayMaxBufferMS;
    public int startPlayMaxBufferStrategy;
    public static StartPlayConfigModule$StartPlayConfigModuleGetter DefaultStartPlayConfigModuleGetter;
    public static StartPlayConfigModule$StartPlayConfigModuleGetter KsStartPlayConfigModuleGetter;

    static {
       StartPlayConfigModule.DefaultStartPlayConfigModuleGetter = new StartPlayConfigModule$1();
       StartPlayConfigModule.KsStartPlayConfigModuleGetter = new StartPlayConfigModule$2();
    }
    public void StartPlayConfigModule(){
       super();
       this.preloadMs = -1;
       this.startPlayBlockMs = -1;
       this.startPlayBlockCostMs = -1;
       this.startPlayBlockStrategy = -1;
       this.startPlayMaxBufferMS = -1;
       this.startPlayMaxBufferBytes = -1;
       this.startPlayMaxBufferStrategy = -1;
    }
}
