package com.kwai.feature.post.api.componet.prettify.beauty.LiveBeautifyResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LiveBeautifyResponse implements Serializable	// class@0012e0
{
    public List mBeautifyGroupInfoList;
    public List mBeautifyItemInfoList;
    public int mDefaultId;
    public MedicalBeautyConfig mMedicalBeautyConfig;
    public int mSuitType;
    public List mSuiteInfoList;
    public String mVersionId;
    public static final long serialVersionUID = 0x4f8eb1ff61007bd4;

    public void LiveBeautifyResponse(){
       super();
       this.mSuiteInfoList = new ArrayList();
       this.mBeautifyItemInfoList = new ArrayList();
       this.mBeautifyGroupInfoList = new ArrayList();
       this.mDefaultId = -2;
    }
}
