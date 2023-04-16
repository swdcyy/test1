package com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveProp;
import java.io.Serializable;
import java.lang.Object;

public class LiveProp implements Serializable	// class@001317
{
    public CDNUrl[] mDisplayPics;
    public int mEffectScope;
    public String mExpiredDescription;
    public boolean mHasLoggedShowEvent;
    public boolean mIsWearable;
    public String mPropDescription;
    public String mPropId;
    public String mPropName;
    public int mPropPosition;
    public int mPropType;
    public int mUsingState;
    public static final long serialVersionUID = 0x5c004599c3a06ca4;

    public void LiveProp(){
       super();
    }
    public boolean isUsed(){
       boolean b = true;
       if (this.mUsingState == b) {
       }else {
          b = false;
       }
       return b;
    }
    public void setUnused(){
       this.mUsingState = 2;
    }
    public void setUsed(){
       this.mUsingState = 1;
    }
}
