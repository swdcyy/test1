package com.kwai.feature.post.api.componet.prettify.beauty.PostBeautifyResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;

public class PostBeautifyResponse implements Serializable	// class@0012e4
{
    public List mBeautifyGroupInfoList;
    public List mBeautifyItemInfoList;
    public List mEditSuiteInfoList;
    public MedicalBeautyConfig mMedicalBeautyConfig;
    public List mRecordNewSuiteInfoList;
    public List mRecordSuiteInfoList;
    public List mReducedFrameRateIds;
    public int mVersion;
    public List mWhatsUpSuiteInfoList;
    public static final long serialVersionUID = 0x14b26b0999bc73e0;

    public void PostBeautifyResponse(){
       super();
       this.mRecordSuiteInfoList = new ArrayList();
       this.mRecordNewSuiteInfoList = new ArrayList();
       this.mEditSuiteInfoList = new ArrayList();
       this.mWhatsUpSuiteInfoList = new ArrayList();
       this.mBeautifyItemInfoList = new ArrayList();
       this.mBeautifyGroupInfoList = new ArrayList();
       this.mVersion = 0;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, PostBeautifyResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!q.f(this.mBeautifyItemInfoList) && (!q.f(this.mEditSuiteInfoList) && (q.f(this.mRecordSuiteInfoList) || q.f(this.mRecordNewSuiteInfoList)))) {
          return false;
       }
       return true;
    }
}
