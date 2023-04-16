package com.kuaishou.live.common.core.component.multipk.api.LiveMultiPkInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkVoteEnd;
import java.lang.String;

public final class LiveMultiPkInfo implements Serializable	// class@0015cd
{
    public SCLiveMultiPkVoteEnd b;
    public boolean isVoteEnd;
    public int playType;
    public String voteEndInfoPbStr;

    public void LiveMultiPkInfo(){
       super();
    }
    public final int getPlayType(){
       return this.playType;
    }
    public final SCLiveMultiPkVoteEnd getVoteEndInfo(){
       return this.b;
    }
    public final String getVoteEndInfoPbStr(){
       return this.voteEndInfoPbStr;
    }
    public final boolean isVoteEnd(){
       return this.isVoteEnd;
    }
    public final void setPlayType(int p0){
       this.playType = p0;
    }
    public final void setVoteEnd(boolean p0){
       this.isVoteEnd = p0;
    }
    public final void setVoteEndInfo(SCLiveMultiPkVoteEnd p0){
       this.b = p0;
    }
    public final void setVoteEndInfoPbStr(String p0){
       this.voteEndInfoPbStr = p0;
    }
}
