package com.yxcorp.gifshow.detail.model.meta.InterestManagementMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class InterestManagementMeta implements Serializable	// class@0015a0
{
    public String mChangeButtonText;
    public String mDecreaseOptionText;
    public String mDefaultOptionText;
    public String mIncreaseOptionText;
    public List mInterestEntityList;
    public String mJumpButtonText;
    public String mJumpButtonUrl;
    public String mSlideMoreText;
    public String mSubtitle;
    public String mTitle;
    public static final long serialVersionUID = 0x666ce39ef088da1b;

    public void InterestManagementMeta(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, InterestManagementMeta.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "InterestManagementMeta{mTitle=\'"+this.mTitle+'''+", mSubtitle=\'"+this.mSubtitle+'''+", mJumpButtonUrl=\'"+this.mJumpButtonUrl+'''+", mJumpButtonText=\'"+this.mJumpButtonText+'''+", mChangeButtonText=\'"+this.mChangeButtonText+'''+", mSlideMoreText=\'"+this.mSlideMoreText+'''+", mDecreaseOptionText=\'"+this.mDecreaseOptionText+'''+", mDefaultOptionText=\'"+this.mDefaultOptionText+'''+", mIncreaseOptionText=\'"+this.mIncreaseOptionText+'''+", mInterestEntityList="+this.mInterestEntityList+'}';
    }
}
