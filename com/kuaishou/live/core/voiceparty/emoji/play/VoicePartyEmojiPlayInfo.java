package com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo$PlayStatus;
import com.kuaishou.live.core.voiceparty.emoji.play.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Enum;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import ok.h;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.StringBuilder;

public class VoicePartyEmojiPlayInfo implements Serializable	// class@0014df
{
    public View fromMicSeatView;
    public long mEmojiId;
    public List mEmojiRes;
    public int mEmojiScene;
    public int mEmojiType;
    public int mFromMicSeatID;
    public int mPlayId;
    public VoicePartyEmojiPlayInfo$PlayStatus mPlayStatus;
    public String mSenderUID;
    public h mStatusChangedCallback;
    public String mTargetUID;
    public int mToMicSeatID;
    public String mUid;
    public boolean needPlayNow;
    public static final VoicePartyEmojiPlayInfo EMPTY;
    public static final AtomicInteger b;
    public static final long serialVersionUID;

    static {
       VoicePartyEmojiPlayInfo.b = new AtomicInteger(0);
       VoicePartyEmojiPlayInfo.EMPTY = new VoicePartyEmojiPlayInfo();
    }
    public void VoicePartyEmojiPlayInfo(){
       super();
       this.mPlayId = VoicePartyEmojiPlayInfo.b.incrementAndGet();
       this.mPlayStatus = VoicePartyEmojiPlayInfo$PlayStatus.Received;
       this.mStatusChangedCallback = e.b;
    }
    public void VoicePartyEmojiPlayInfo(VoicePartyEmojiPlayInfo p0){
       super();
       this.mPlayId = VoicePartyEmojiPlayInfo.b.incrementAndGet();
       this.mPlayStatus = VoicePartyEmojiPlayInfo$PlayStatus.Received;
       this.mStatusChangedCallback = e.b;
       this.mUid = p0.mUid;
       this.mEmojiId = p0.mEmojiId;
       this.mEmojiRes = p0.mEmojiRes;
       this.mEmojiType = p0.mEmojiType;
       this.mPlayId = p0.mPlayId;
       this.mPlayStatus = p0.mPlayStatus;
       this.mStatusChangedCallback = p0.mStatusChangedCallback;
       this.mEmojiScene = p0.mEmojiScene;
       this.mFromMicSeatID = p0.mFromMicSeatID;
       this.mToMicSeatID = p0.mToMicSeatID;
       this.mSenderUID = p0.mUid;
       this.mTargetUID = p0.mTargetUID;
    }
    public boolean advancePlayStatus(VoicePartyEmojiPlayInfo$PlayStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyEmojiPlayInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.ordinal() <= this.mPlayStatus.ordinal()) {
          return false;
       }
       b.a0(LiveVoicePartyLogTag.EMOJI, "advancePlayStatus", c.j("dstPlayStatus", p0));
       this.mPlayStatus = p0;
       this.mStatusChangedCallback.apply(this);
       return true;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyEmojiPlayInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mPlayId != p0.mPlayId) {
          b = false;
       }
       return b;
    }
    public long getEmojiId(){
       return this.mEmojiId;
    }
    public String getEmojiRes(){
       Object obj = PatchProxy.apply(null, this, VoicePartyEmojiPlayInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.mEmojiRes)) {
          return "";
       }
       return this.mEmojiRes.get(0).mUrl;
    }
    public VoicePartyEmojiPlayInfo$PlayStatus getPlayStatus(){
       return this.mPlayStatus;
    }
    public int hashCode(){
       return this.mPlayId;
    }
    public boolean isDispatchedOrPlaying(){
       VoicePartyEmojiPlayInfo tmPlayStatus = this.mPlayStatus;
       boolean b = (tmPlayStatus == VoicePartyEmojiPlayInfo$PlayStatus.Dispatched || tmPlayStatus == VoicePartyEmojiPlayInfo$PlayStatus.Playing)? true: false;
       return b;
    }
    public boolean isGuestEmoji(){
       boolean b = (this.mEmojiScene == 2)? true: false;
       return b;
    }
    public void setEmojiId(long p0){
       this.mEmojiId = p0;
    }
    public void setEmojiRes(List p0){
       this.mEmojiRes = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, VoicePartyEmojiPlayInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VoicePartyEmojiPlayInfo{mPlayId=\'"+this.mPlayId+'''+", mUid=\'"+this.mUid+'''+", mEmojiRes="+this.mEmojiRes+", mPlayStatus"+this.mPlayStatus+'}';
    }
}
