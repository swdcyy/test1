package com.kuaishou.live.core.show.redpacket.activity.effect.LiveRedPacketActivityEffectParams;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.activity.effect.LiveRedPacketActivityEffectParams$b;
import com.kuaishou.live.core.show.redpacket.activity.effect.LiveRedPacketActivityEffectParams$a;
import java.lang.String;

public class LiveRedPacketActivityEffectParams implements Serializable	// class@000e59
{
    public boolean mCanBeBreak;
    public long mExpiredTime;
    public boolean mIsDisplayImmediately;
    public long mMagicFaceId;
    public int mRank;
    public String mRedPacketId;
    public static final long serialVersionUID = 0x239d285e01c99d25;

    public void LiveRedPacketActivityEffectParams(){
       super();
       this.mCanBeBreak = true;
    }
    public void LiveRedPacketActivityEffectParams(LiveRedPacketActivityEffectParams$b p0){
       super();
       this.mCanBeBreak = true;
       this.mRedPacketId = p0.a;
       this.mMagicFaceId = p0.b;
       this.mRank = p0.c;
       this.mIsDisplayImmediately = p0.d;
       this.mCanBeBreak = p0.e;
       this.mExpiredTime = p0.f;
    }
    public void LiveRedPacketActivityEffectParams(LiveRedPacketActivityEffectParams$b p0,LiveRedPacketActivityEffectParams$a p1){
       super(p0);
    }
    public long getExpiredTime(){
       return this.mExpiredTime;
    }
    public long getMagicFaceId(){
       return this.mMagicFaceId;
    }
    public int getRank(){
       return this.mRank;
    }
    public String getRedPacketId(){
       return this.mRedPacketId;
    }
    public boolean isCanBeBreak(){
       return this.mCanBeBreak;
    }
    public boolean isDisplayImmediately(){
       return this.mIsDisplayImmediately;
    }
}
