package com.kwai.video.wayne.player.builder.StartPlayBlockInfo;
import java.lang.Object;

public class StartPlayBlockInfo	// class@000cbd
{
    public int bufferMs;
    public boolean disable;
    public int maxBufferCostMs;

    public void StartPlayBlockInfo(boolean p0,int p1,int p2){
       super();
       this.disable = p0;
       this.bufferMs = p1;
       this.maxBufferCostMs = p2;
    }
}
