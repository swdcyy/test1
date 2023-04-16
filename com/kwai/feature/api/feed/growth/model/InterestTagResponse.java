package com.kwai.feature.api.feed.growth.model.InterestTagResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;

public class InterestTagResponse implements Serializable	// class@000ecc
{
    public List mExposureTagsList;
    public InterestTagResponse$InterestTagDialogConfig mInterestTagDialogConfig;
    public List mRecoList;
    public List mSelectedTags;
    public List mTotalList;
    public List mUserTagList;
    public static final long serialVersionUID = 0xf582fe34d2d1d25b;

    public void InterestTagResponse(){
       super();
    }
    public void addExposureTagsList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InterestTagResponse.class, "2")) {
          return;
       }
       if (this.mExposureTagsList == null) {
          this.mExposureTagsList = new ArrayList();
       }
       this.mExposureTagsList.addAll(p0);
       return;
    }
    public List getExposedTagsList(){
       Object obj = PatchProxy.apply(null, this, InterestTagResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExposureTagsList == null) {
          this.mExposureTagsList = new ArrayList();
       }
       return this.mExposureTagsList;
    }
    public List getSelectedTags(){
       Object obj = PatchProxy.apply(null, this, InterestTagResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mSelectedTags == null) {
          this.mSelectedTags = new ArrayList();
       }
       return this.mSelectedTags;
    }
}
