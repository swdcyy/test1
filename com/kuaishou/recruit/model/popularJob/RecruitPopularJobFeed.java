package com.kuaishou.recruit.model.popularJob.RecruitPopularJobFeed;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.PhotoType;
import com.kuaishou.recruit.model.popularJob.a;
import com.kuaishou.android.model.feed.PhotoType$a;
import com.kuaishou.recruit.model.popularJob.RecruitPopularJobInfo;
import com.kwai.robust.PatchProxyResult;
import au4.e;
import java.util.Map;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class RecruitPopularJobFeed extends BaseFeed	// class@000ee2
{
    public CommonMeta mCommonMeta;
    public ExtMeta mExtMeta;
    public RecruitPopularJobInfo mSelectJobInfo;
    public static final long serialVersionUID = 0xf1845907fac72ca1;

    public void RecruitPopularJobFeed(){
       super();
    }
    public static void registerBaseFeedProvider(){
       if (PatchProxy.applyVoid(null, null, RecruitPopularJobFeed.class, "1")) {
          return;
       }
       PhotoType.registerBaseFeedProvider(PhotoType.RECRUIT_SELECT_JOB_FEED, a.a);
       return;
    }
    public String getId(){
       return this.mSelectJobInfo.mFeedId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecruitPopularJobFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, RecruitPopularJobFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(RecruitPopularJobFeed.class, new e());
       }else {
          obj.put(RecruitPopularJobFeed.class, null);
       }
       return obj;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecruitPopularJobFeed.class, "2")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
