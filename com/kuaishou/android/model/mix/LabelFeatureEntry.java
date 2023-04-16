package com.kuaishou.android.model.mix.LabelFeatureEntry;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.mix.LabelLiveInfo;
import com.kuaishou.android.model.mix.StyleInfo;

public final class LabelFeatureEntry implements Serializable	// class@000cf8
{
    public int mBizType;
    public LabelLiveInfo mLabelLiveInfo;
    public StyleInfo mStyleInfo;

    public void LabelFeatureEntry(){
       super();
    }
    public static void getMBizType$annotations(){
    }
    public final int getMBizType(){
       return this.mBizType;
    }
    public final LabelLiveInfo getMLabelLiveInfo(){
       return this.mLabelLiveInfo;
    }
    public final StyleInfo getMStyleInfo(){
       return this.mStyleInfo;
    }
    public final void setMBizType(int p0){
       this.mBizType = p0;
    }
    public final void setMLabelLiveInfo(LabelLiveInfo p0){
       this.mLabelLiveInfo = p0;
    }
    public final void setMStyleInfo(StyleInfo p0){
       this.mStyleInfo = p0;
    }
}
