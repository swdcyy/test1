package com.kwai.component.bifrost.BifrostActivityEntry;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.component.bifrost.BifrostUnknownActivityEntry;

public class BifrostActivityEntry implements Serializable	// class@000a7d
{
    public String mActivityId;
    public String mActivityType;
    public long mEndTime;
    public BifrostFeatureActivityEntry mFeatureActivityEntry;
    public int mPreviewStatus;
    public int mPriority;
    public long mStartTime;
    public static final int PREVIEW_STATUS_CODE = 1;
    public static final long serialVersionUID = 0x6550aba41425d1ed;

    public void BifrostActivityEntry(){
       super();
    }
    public boolean isUnknown(){
       return (this.mFeatureActivityEntry instanceof BifrostUnknownActivityEntry ^ 0x01);
    }
}
