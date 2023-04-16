package com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import java.io.Serializable;
import z36.d;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam$a;
import z36.d$a;

public class KuaishanPageParam extends d implements Serializable	// class@0013a6
{
    public boolean mAllowJumpToolbox;
    public boolean mDisableSliding;
    public boolean mDisallowTemplateLocating;
    public boolean mGoHomeOnComplete;
    public String mGroupId;
    public String mInitTemplateId;
    public String mInitTitle;
    public MediaSceneConfig mMediaSceneConfig;
    public MediaSceneLaunchParams mMediaSceneLaunchParams;
    public NearbyCommunityParams mNearbyCommunityParams;
    public boolean mNeedDiscardPrevSession;
    public boolean mNeedOpenExitAnimation;
    public int mPageSource;
    public String mTaskId;
    public String mTemplateSrc;
    public boolean mToAlbum;
    public static final long serialVersionUID = 0x595e77d59bd0cd6d;

    public void KuaishanPageParam(){
       super();
    }
    public void KuaishanPageParam(KuaishanPageParam$a p0){
       super(p0);
       this.mTaskId = p0.k;
       this.mInitTemplateId = p0.l;
       this.mGroupId = p0.m;
       this.mNearbyCommunityParams = p0.p;
       this.mInitTitle = p0.n;
       this.mGoHomeOnComplete = p0.q;
       this.mDisallowTemplateLocating = p0.r;
       this.mTemplateSrc = p0.o;
       this.mPageSource = p0.s;
       this.mToAlbum = p0.t;
       this.mNeedOpenExitAnimation = p0.u;
       this.mNeedDiscardPrevSession = p0.v;
       this.mMediaSceneLaunchParams = p0.i;
       this.mMediaSceneConfig = p0.h;
       this.mDisableSliding = p0.w;
       this.mAllowJumpToolbox = p0.x;
    }
}
