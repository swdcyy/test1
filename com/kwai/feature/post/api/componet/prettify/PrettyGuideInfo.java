package com.kwai.feature.post.api.componet.prettify.PrettyGuideInfo;
import java.lang.Object;
import java.lang.String;

public class PrettyGuideInfo	// class@0012c6
{
    public long mExposureCnt;
    public int mId;
    public long mMaterialId;
    public String mMessage;
    public boolean mSelected;
    public int mStyle;
    public int mTabId;

    public void PrettyGuideInfo(){
       super();
    }
    public int a(){
       return this.mId;
    }
    public long b(){
       return this.mMaterialId;
    }
    public String c(){
       return this.mMessage;
    }
    public int d(){
       return this.mTabId;
    }
    public boolean e(){
       boolean b = (this.mStyle == 2)? true: false;
       return b;
    }
}
