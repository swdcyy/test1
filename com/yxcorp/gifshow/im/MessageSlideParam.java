package com.yxcorp.gifshow.im.MessageSlideParam;
import java.io.Serializable;
import com.yxcorp.gifshow.im.MessageSlideParam$b;
import java.lang.Object;
import com.yxcorp.gifshow.im.MessageSlideParam$a;

public final class MessageSlideParam implements Serializable	// class@00191e
{
    public boolean mEnableMessageLocate;
    public final boolean mFinishWhenAggrOpen;
    public final String mSubbiz;
    public final String mTargetId;
    public final int mTargetType;

    public void MessageSlideParam(MessageSlideParam$b p0){
       super();
       this.mSubbiz = p0.a;
       this.mTargetType = p0.b;
       this.mTargetId = p0.c;
       this.mFinishWhenAggrOpen = p0.d;
       this.mEnableMessageLocate = p0.e;
    }
    public void MessageSlideParam(MessageSlideParam$b p0,MessageSlideParam$a p1){
       super(p0);
    }
}
