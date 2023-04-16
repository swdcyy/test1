package com.kuaishou.live.common.core.component.comments.model.LiveShareMessage;
import com.kuaishou.live.basic.model.QLiveMessage;

public class LiveShareMessage extends QLiveMessage	// class@0010c3
{
    public int mContinueShareCurrentDay;
    public int mFansGroupShareIntimacy;
    public int mShareCount;
    public int mThirdPartyPlatform;
    public static final long serialVersionUID = 0xd59eeb330696c5bc;

    public void LiveShareMessage(){
       super();
    }
    public int getThirdPartyPlatform(){
       return this.mThirdPartyPlatform;
    }
    public LiveShareMessage setContinueShareCurrentDay(int p0){
       this.mContinueShareCurrentDay = p0;
       return this;
    }
    public LiveShareMessage setFansGroupShareIntimacy(int p0){
       this.mFansGroupShareIntimacy = p0;
       return this;
    }
    public LiveShareMessage setShareCount(int p0){
       this.mShareCount = p0;
       return this;
    }
    public LiveShareMessage setThirdPartyPlatform(int p0){
       this.mThirdPartyPlatform = p0;
       return this;
    }
}
