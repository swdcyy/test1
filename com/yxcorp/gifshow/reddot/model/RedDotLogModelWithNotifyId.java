package com.yxcorp.gifshow.reddot.model.RedDotLogModelWithNotifyId;
import com.yxcorp.gifshow.reddot.model.RedDotLogModel;
import java.lang.String;

public class RedDotLogModelWithNotifyId extends RedDotLogModel	// class@0017d2
{
    public String mNotifyId;
    public static final long serialVersionUID = 0xf4a37b5221170b38;

    public void RedDotLogModelWithNotifyId(RedDotLogModel p0,String p1){
       super();
       this.mLocation = p0.mLocation;
       this.mLevel = p0.mLevel;
       this.mShowNum = p0.mShowNum;
       this.mStyle = p0.mStyle;
       this.mIsCombine = p0.mIsCombine;
       this.mCombineType = p0.mCombineType;
       this.mExtraParams = p0.mExtraParams;
       this.mNotifyId = p1;
    }
    public void RedDotLogModelWithNotifyId(String p0,int p1,int p2,boolean p3,boolean p4,String p5,String p6){
       super(p0, p1, p2, p3, p4, p5);
       this.mNotifyId = p6;
    }
}
