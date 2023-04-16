package com.yxcorp.gifshow.pendant.kmessage.Message;
import java.io.Serializable;
import jwb.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class Message implements Serializable, b	// class@00126c
{
    public String mActivityId;
    public Message$BubbleConfig mBubbleConfig;
    public long mDispersedCountDown;
    public long mDispersedTime;
    public int mEffectPolicy;
    public long mEndTime;
    public boolean mIsAbandon;
    public String mMsgId;
    public boolean mOnlyTk;
    public Message$PendantConfig mPendantConfig;
    public int mPriority;
    public long mTime;
    public String mTkBundleId;
    public String mTkExtraParams;
    public static final long serialVersionUID = 0xf798d2102786fc71;

    public void Message(){
       super();
    }
    public int compareTo(Message p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Message.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getPriority() == p0.getPriority()) {
          return (int)(this.mTime - p0.mTime);
       }
       return (this.getPriority() - p0.getPriority());
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public String getId(){
       return this.mMsgId;
    }
    public int getPriority(){
       return this.mPriority;
    }
}
