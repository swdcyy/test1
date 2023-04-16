package com.kwai.feature.api.social.profile.model.ProfileDraftsFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import java.lang.Number;
import java.lang.Integer;
import ok.k;

public class ProfileDraftsFeed extends BaseFeed	// class@0011ab
{
    public String mDraftsCoverPath;
    public int mDraftsNum;

    public void ProfileDraftsFeed(){
       super();
       this.mDraftsNum = 0;
       this.mDraftsCoverPath = "";
    }
    public void clear(){
       this.mDraftsNum = 0;
       this.mDraftsCoverPath = "";
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileDraftsFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof ProfileDraftsFeed) {
          return b;
       }
       if (this.getClass() != p0.getClass()) {
          return b;
       }
       if (TextUtils.n(this.mDraftsCoverPath, p0.mDraftsCoverPath) && this.mDraftsNum == p0.mDraftsNum) {
          b = true;
       }
       return b;
    }
    public String getDraftsCoverPath(){
       return this.mDraftsCoverPath;
    }
    public int getDraftsNum(){
       return this.mDraftsNum;
    }
    public String getId(){
       return "";
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileDraftsFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ProfileDraftsFeed.class, null);
       return objectsByTag;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, ProfileDraftsFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mDraftsNum),this.mDraftsCoverPath};
       return k.b(obj);
    }
    public boolean isEmpty(){
       boolean b = (this.mDraftsNum == null)? true: false;
       return b;
    }
    public void setDraftsCoverPath(String p0){
       this.mDraftsCoverPath = p0;
    }
    public void setDraftsNum(int p0){
       this.mDraftsNum = p0;
    }
    public void update(ProfileDraftsFeed p0){
       if (p0 == null) {
          return;
       }
       this.mDraftsNum = p0.mDraftsNum;
       this.mDraftsCoverPath = p0.mDraftsCoverPath;
       return;
    }
}
