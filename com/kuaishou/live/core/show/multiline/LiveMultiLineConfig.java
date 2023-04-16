package com.kuaishou.live.core.show.multiline.LiveMultiLineConfig;
import java.io.Serializable;
import com.kuaishou.live.core.show.multiline.LiveMultiLineConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.Integer;

public final class LiveMultiLineConfig implements Serializable	// class@000d26
{
    public double diffDirectionMaxClipRatio;
    public boolean enableNewLineMatchEntrance;
    public boolean enableShowSearchPanelEntrance;
    public boolean isMultiLineEnable;
    public long mSearchInviteeDelayMillis;
    public double sameDirectionMaxClipRatio;
    public Integer supportMultiArenaLineChatCount;
    public int supportMultiLineChatCount;
    public long warmupLineMatchFailTimeoutMs;
    public static final LiveMultiLineConfig$a Companion;
    public static final long serialVersionUID;

    static {
       LiveMultiLineConfig.Companion = new LiveMultiLineConfig$a(null);
    }
    public void LiveMultiLineConfig(){
       super();
       this.supportMultiLineChatCount = -1;
       this.sameDirectionMaxClipRatio = 0x3fe0a3d70a3d70a4;
       this.diffDirectionMaxClipRatio = 0x3fd70a3d70a3d70a;
       this.warmupLineMatchFailTimeoutMs = 0x4e20;
       this.mSearchInviteeDelayMillis = 150;
    }
    public final Integer getSupportMultiArenaLineChatCount(){
       return this.supportMultiArenaLineChatCount;
    }
    public final int getSupportMultiLineChatCount(){
       return this.supportMultiLineChatCount;
    }
    public final boolean isMultiLineEnable(){
       return this.isMultiLineEnable;
    }
    public final void setMultiLineEnable(boolean p0){
       this.isMultiLineEnable = p0;
    }
    public final void setSupportMultiArenaLineChatCount(Integer p0){
       this.supportMultiArenaLineChatCount = p0;
    }
    public final void setSupportMultiLineChatCount(int p0){
       this.supportMultiLineChatCount = p0;
    }
}
