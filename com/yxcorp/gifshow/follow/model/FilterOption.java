package com.yxcorp.gifshow.follow.model.FilterOption;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ra6.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public class FilterOption implements Serializable	// class@0010fc
{
    public DarkLightModel mBgImgUrl;
    public boolean mConfirmed;
    public String mDisplayText;
    public String mDisplayTextEng;
    public String mDisplayTextTc;
    public boolean mIsDefault;
    public String mName;
    public FilterRemindTag mRemindTag;
    public boolean mSelected;
    public FilterBoxSlideIconUrls mSlideIconUrl;
    public int mStyle;
    public List mSubOptions;
    public static final long serialVersionUID = 0xd7b4354011ab775a;

    public void FilterOption(){
       super();
    }
    public String getShowDisplayText(){
       Object obj = PatchProxy.apply(null, this, FilterOption.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.e() && !TextUtils.x(this.mDisplayTextEng)) {
          return this.mDisplayTextEng;
       }
       if (!a.f() && !TextUtils.x(this.mDisplayTextTc)) {
          return this.mDisplayTextTc;
       }
       return this.mDisplayText;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FilterOption.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FilterOption{mName=\'"+this.mName+'''+", mDisplayText=\'"+this.mDisplayText+'''+", mDisplayTextEng=\'"+this.mDisplayTextEng+'''+", mDisplayTexTc=\'"+this.mDisplayTextTc+'''+", mIsDefault="+this.mIsDefault+", mStyle="+this.mStyle+", mRemindTag="+this.mRemindTag+", mSubOptions="+this.mSubOptions+", mSelected="+this.mSelected+", mConfirmed="+this.mConfirmed+'}';
    }
}
