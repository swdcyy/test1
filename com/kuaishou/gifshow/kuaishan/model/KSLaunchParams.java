package com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import java.io.Serializable;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams$b;
import java.lang.Object;
import java.lang.String;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams$a;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.post.PostArguments;
import z36.d;
import com.kuaishou.gifshow.kuaishan.KSSource;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import com.kwai.gifshow.post.api.feature.nearby.NearbyCommunityParams;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.StringBuilder;

public class KSLaunchParams implements Serializable	// class@001a96
{
    public String mAlbumTaskImplKey;
    public boolean mAllowJumpToolbox;
    public String mConversationTaskList;
    public boolean mDisableSliding;
    public boolean mDisallowTemplateLocating;
    public boolean mEnableStrengthenEntrance;
    public boolean mGoHomeOnComplete;
    public String mGroupId;
    public String mGroupName;
    public KSSource mKSSource;
    public MediaSceneConfig mMediaSceneConfig;
    public MediaSceneLaunchParams mMediaSceneLaunchParams;
    public NearbyCommunityParams mNearbyCommunityParams;
    public boolean mNeedDiscardPrevSession;
    public boolean mNeedOpenExitAnimation;
    public int mPageSource;
    public int mPositionInGroup;
    public PostArguments mPostArguments;
    public String mTaskId;
    public String mTemplateId;
    public String mTemplateSrc;
    public VideoContext mVideoContext;
    public static final long serialVersionUID = 0x182b413a4b5606ef;

    public void KSLaunchParams(KSLaunchParams$b p0){
       super();
       this.mGroupId = "";
       this.mGroupName = "";
       this.mGoHomeOnComplete = true;
       this.mTaskId = u1.f();
       this.mTemplateId = p0.c;
       this.mGroupId = p0.a;
       this.mGroupName = p0.b;
       this.mGoHomeOnComplete = p0.d;
       this.mNearbyCommunityParams = p0.e;
       this.mConversationTaskList = p0.f;
       this.mDisallowTemplateLocating = p0.h;
       if (!TextUtils.x(p0.g)) {
          this.mTaskId = p0.g;
       }
       this.mTemplateSrc = p0.i;
       this.mVideoContext = p0.k;
       this.mKSSource = p0.l;
       this.mPageSource = p0.j;
       this.mNeedOpenExitAnimation = p0.m;
       this.mNeedDiscardPrevSession = p0.n;
       this.mMediaSceneLaunchParams = p0.o;
       this.mMediaSceneConfig = p0.p;
       this.mAlbumTaskImplKey = p0.q;
       this.mDisableSliding = p0.r;
       this.mAllowJumpToolbox = p0.s;
       return;
    }
    public void KSLaunchParams(KSLaunchParams$b p0,KSLaunchParams$a p1){
       super(p0);
    }
    public static KSLaunchParams createdByKSPageParam(KuaishanPageParam p0){
       KSLaunchParams$b obj = PatchProxy.applyOneRefs(p0, null, KSLaunchParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KSLaunchParams$b();
       obj.h(p0.mInitTemplateId);
       KuaishanPageParam mGroupId = p0.mGroupId;
       if (mGroupId == null) {
          mGroupId = "";
       }
       obj.c(mGroupId);
       obj.g(p0.mTaskId);
       obj.e = p0.mNearbyCommunityParams;
       obj.b(p0.mGoHomeOnComplete);
       obj.h = p0.mDisallowTemplateLocating;
       obj.i(p0.mTemplateSrc);
       obj.j = p0.mPageSource;
       obj.m = p0.mNeedOpenExitAnimation;
       obj.f(p0.mNeedDiscardPrevSession);
       obj.o = p0.mMediaSceneLaunchParams;
       obj.p = p0.mMediaSceneConfig;
       obj.e(p0.mDisableSliding);
       obj.d(p0.mAllowJumpToolbox);
       KSLaunchParams kSLaunchPara = obj.a();
       kSLaunchPara.mPostArguments = p0.getArgs();
       return kSLaunchPara;
    }
    public KSLaunchParams copy(){
       KSLaunchParams$b obj = PatchProxy.apply(null, this, KSLaunchParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KSLaunchParams$b();
       obj.c = this.mTemplateId;
       obj.a = this.mGroupId;
       obj.b = this.mGroupName;
       obj.d = this.mGoHomeOnComplete;
       obj.e = this.mNearbyCommunityParams;
       obj.f = this.mConversationTaskList;
       obj.g = this.mTaskId;
       obj.h = this.mDisallowTemplateLocating;
       obj.i = this.mTemplateSrc;
       obj.j = this.mPageSource;
       obj.k = this.mVideoContext;
       obj.l = this.mKSSource;
       obj.m = this.mNeedOpenExitAnimation;
       obj.n = this.mNeedDiscardPrevSession;
       obj.o = this.mMediaSceneLaunchParams;
       obj.p = this.mMediaSceneConfig;
       obj.q = this.mAlbumTaskImplKey;
       obj.r = this.mDisableSliding;
       obj.s = this.mAllowJumpToolbox;
       return obj.a();
    }
    public String getAlbumTaskImplKey(){
       return this.mAlbumTaskImplKey;
    }
    public boolean getAllowJumpToolbox(){
       return this.mAllowJumpToolbox;
    }
    public String getConversationTaskList(){
       return this.mConversationTaskList;
    }
    public boolean getDisableSliding(){
       return this.mDisableSliding;
    }
    public boolean getDisallowTemplateLocating(){
       return this.mDisallowTemplateLocating;
    }
    public String getGroupId(){
       return this.mGroupId;
    }
    public String getGroupName(){
       return this.mGroupName;
    }
    public KSSource getKSSource(){
       return this.mKSSource;
    }
    public MediaSceneConfig getMediaSceneConfig(){
       return this.mMediaSceneConfig;
    }
    public MediaSceneLaunchParams getMediaSceneLaunchParams(){
       return this.mMediaSceneLaunchParams;
    }
    public NearbyCommunityParams getNearbyCommunityParams(){
       return this.mNearbyCommunityParams;
    }
    public int getPageSource(){
       return this.mPageSource;
    }
    public int getPositionInGroup(){
       return this.mPositionInGroup;
    }
    public String getTaskId(){
       return this.mTaskId;
    }
    public String getTemplateId(){
       return this.mTemplateId;
    }
    public String getTemplateSrc(){
       return this.mTemplateSrc;
    }
    public VideoContext getVideoContext(){
       return this.mVideoContext;
    }
    public boolean isEnableStrengthenEntrance(){
       return this.mEnableStrengthenEntrance;
    }
    public boolean isGoHomeOnComplete(){
       return this.mGoHomeOnComplete;
    }
    public void resetTemplateSrc(){
       this.mTemplateSrc = null;
    }
    public void setAlbumTaskImplKey(String p0){
       this.mAlbumTaskImplKey = p0;
    }
    public void setAllowJumpToolbox(boolean p0){
       this.mAllowJumpToolbox = p0;
    }
    public void setDisableSliding(boolean p0){
       this.mDisableSliding = p0;
    }
    public void setDisallowTemplateLocating(boolean p0){
       this.mDisallowTemplateLocating = p0;
    }
    public void setEnableStrengthenEntrance(boolean p0){
       this.mEnableStrengthenEntrance = p0;
    }
    public void setGoHomeOnComplete(boolean p0){
       this.mGoHomeOnComplete = p0;
    }
    public void setGroupId(String p0){
       this.mGroupId = p0;
    }
    public void setGroupName(String p0){
       this.mGroupName = p0;
    }
    public void setKSSource(KSSource p0){
       this.mKSSource = p0;
    }
    public void setPageSource(int p0){
       this.mPageSource = p0;
    }
    public void setPositionInGroup(int p0){
       this.mPositionInGroup = p0;
    }
    public void setTemplateId(String p0){
       this.mTemplateId = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KSLaunchParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KSLaunchParams{mGroupId=\'"+this.mGroupId+'''+"mGroupName=\'"+this.mGroupName+'''+", mTemplateId=\'"+this.mTemplateId+'''+", mGoHomeOnComplete="+this.mGoHomeOnComplete+", mConversationTaskList=\'"+this.mConversationTaskList+'''+", mTaskId=\'"+this.mTaskId+'''+'}';
    }
}
