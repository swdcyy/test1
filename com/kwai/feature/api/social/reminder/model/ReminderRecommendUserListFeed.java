package com.kwai.feature.api.social.reminder.model.ReminderRecommendUserListFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.social.reminder.model.ReminderRecommendUserListMeta;
import com.kwai.robust.PatchProxyResult;
import qx5.f;
import java.util.Map;

public class ReminderRecommendUserListFeed extends BaseFeed	// class@0011b9
{
    public Object mCachedPymkHelper;
    public CommonMeta mCommonMeta;
    public ReminderRecommendUserListMeta mRecommendUserListMeta;
    public static final long serialVersionUID = 0x389b37338e1e4e74;

    public void ReminderRecommendUserListFeed(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, ReminderRecommendUserListFeed.class, "2")) {
          return;
       }
       super.afterDeserialize();
       if (this.mCommonMeta == null) {
          this.mCommonMeta = new CommonMeta();
       }
       long l = 0x389b37338e1e4e74;
       if (TextUtils.x(this.mCommonMeta.mId)) {
          this.mCommonMeta.mId = String.valueOf(l);
       }
       if (TextUtils.x(this.mCommonMeta.mFeedId)) {
          this.mCommonMeta.mFeedId = String.valueOf(l);
       }
       if (this.mRecommendUserListMeta == null) {
          this.mRecommendUserListMeta = new ReminderRecommendUserListMeta();
       }
       return;
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, ReminderRecommendUserListFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.I(this.mCommonMeta.mFeedId);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReminderRecommendUserListFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ReminderRecommendUserListFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ReminderRecommendUserListFeed.class, new f());
       }else {
          obj.put(ReminderRecommendUserListFeed.class, null);
       }
       return obj;
    }
}
