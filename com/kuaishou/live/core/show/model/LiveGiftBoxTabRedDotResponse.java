package com.kuaishou.live.core.show.model.LiveGiftBoxTabRedDotResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveGiftBoxTabRedDotResponse implements Serializable	// class@000d14
{
    public long mFansGroupGiftLatestUpdateTime;
    public long mPacketGiftLatestUpdateTime;
    public long mPrivilegeGiftLatestUpdateTime;
    public long mPropsLatestUpdateTime;

    public void LiveGiftBoxTabRedDotResponse(){
       super();
    }
    public long getFansGroupGiftLatestUpdateTime(){
       return this.mFansGroupGiftLatestUpdateTime;
    }
    public long getPacketGiftLatestUpdateTime(){
       return this.mPacketGiftLatestUpdateTime;
    }
    public long getPrivilegeGiftLatestUpdateTime(){
       return this.mPrivilegeGiftLatestUpdateTime;
    }
    public long getPropsLatestUpdateTime(){
       return this.mPropsLatestUpdateTime;
    }
}
