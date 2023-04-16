package com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType;
import java.lang.Enum;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$UNKNOWN;
import java.lang.String;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$VIDEO;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$IMAGE;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$LIVE;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$LIVE_PLAYBACK;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$ARTICLE;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$REWARD;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$DRAFTS;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$a;
import nsd.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.profile.model.ProfileDraftsFeed;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import w3c.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s1c.r0;

public abstract class ProfilePhotoItemType extends Enum	// class@001202
{
    public final int viewType;
    public static final ProfilePhotoItemType[] $VALUES;
    public static final ProfilePhotoItemType ARTICLE;
    public static final ProfilePhotoItemType$a Companion;
    public static final ProfilePhotoItemType DRAFTS;
    public static final ProfilePhotoItemType IMAGE;
    public static final ProfilePhotoItemType LIVE;
    public static final ProfilePhotoItemType LIVE_PLAYBACK;
    public static final ProfilePhotoItemType REWARD;
    public static final ProfilePhotoItemType UNKNOWN;
    public static final ProfilePhotoItemType VIDEO;

    static {
       ProfilePhotoItemType$UNKNOWN uNKNOWN;
       ProfilePhotoItemType$VIDEO vIDEO;
       ProfilePhotoItemType$IMAGE iMAGE;
       ProfilePhotoItemType$LIVE lIVE;
       ProfilePhotoItemType$LIVE_PLAYBACK lIVE_PLAYBAC;
       ProfilePhotoItemType$ARTICLE uARTICLE;
       ProfilePhotoItemType$REWARD rEWARD;
       ProfilePhotoItemType$DRAFTS uDRAFTS;
       ProfilePhotoItemType[] profilePhoto = new ProfilePhotoItemType[]{uNKNOWN,vIDEO,iMAGE,lIVE,lIVE_PLAYBAC,uARTICLE,rEWARD,uDRAFTS};
       uNKNOWN = new ProfilePhotoItemType$UNKNOWN("UNKNOWN", 0);
       ProfilePhotoItemType.UNKNOWN = uNKNOWN;
       vIDEO = new ProfilePhotoItemType$VIDEO("VIDEO", 1);
       ProfilePhotoItemType.VIDEO = vIDEO;
       iMAGE = new ProfilePhotoItemType$IMAGE("IMAGE", 2);
       ProfilePhotoItemType.IMAGE = iMAGE;
       lIVE = new ProfilePhotoItemType$LIVE("LIVE", 3);
       ProfilePhotoItemType.LIVE = lIVE;
       lIVE_PLAYBAC = new ProfilePhotoItemType$LIVE_PLAYBACK("LIVE_PLAYBACK", 4);
       ProfilePhotoItemType.LIVE_PLAYBACK = lIVE_PLAYBAC;
       uARTICLE = new ProfilePhotoItemType$ARTICLE("ARTICLE", 5);
       ProfilePhotoItemType.ARTICLE = uARTICLE;
       rEWARD = new ProfilePhotoItemType$REWARD("REWARD", 6);
       ProfilePhotoItemType.REWARD = rEWARD;
       uDRAFTS = new ProfilePhotoItemType$DRAFTS("DRAFTS", 7);
       ProfilePhotoItemType.DRAFTS = uDRAFTS;
       ProfilePhotoItemType.$VALUES = profilePhoto;
       ProfilePhotoItemType.Companion = new ProfilePhotoItemType$a(null);
    }
    public void ProfilePhotoItemType(String p0,int p1,int p2){
       super(p0, p1);
       this.viewType = p2;
    }
    public void ProfilePhotoItemType(String p0,int p1,int p2,u p3){
       super(p0, p1, p2);
    }
    public static final ProfilePhotoItemType getPhotoItemType(int p0){
       ProfilePhotoItemType$a obj;
       object oobject;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ProfilePhotoItemType profilePhoto = ProfilePhotoItemType.class;
       if (PatchProxy.isSupport(profilePhoto)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, profilePhoto, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = ProfilePhotoItemType.Companion;
       Objects.requireNonNull(obj);
       ProfilePhotoItemType$a uoa = ProfilePhotoItemType$a.class;
       if (PatchProxy.isSupport(uoa)) {
          oobject = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uoa, "2");
          if (oobject != patchProxyRe) {
          }else {
          label_0036 :
             ProfilePhotoItemType[] profilePhoto1 = ProfilePhotoItemType.values();
             int len = profilePhoto1.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   object oobject1 = profilePhoto1[i];
                   if (oobject1.getViewType() == p0) {
                      oobject = oobject1;
                      break ;
                   }else {
                      i = i + 1;
                   }
                }else {
                   oobject = ProfilePhotoItemType.UNKNOWN;
                   break ;
                }
             }
          }
       }else {
          goto label_0036 ;
       }
       return oobject;
    }
    public static final ProfilePhotoItemType getPhotoItemType(QPhoto p0){
       ProfilePhotoItemType dRAFTS;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ProfilePhotoItemType$a obj = PatchProxy.applyOneRefs(p0, null, ProfilePhotoItemType.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = ProfilePhotoItemType.Companion;
       Objects.requireNonNull(obj);
       ProfilePhotoItemType profilePhoto = PatchProxy.applyOneRefs(p0, obj, ProfilePhotoItemType$a.class, "1");
       if (profilePhoto != patchProxyRe) {
       }else {
          a.p(p0, "photo");
          if (p0.mEntity instanceof ProfileDraftsFeed) {
             dRAFTS = ProfilePhotoItemType.DRAFTS;
          }else {
             String photoId = p0.getPhotoId();
             boolean b = (photoId == null || !photoId.length())? true: false;
             if (b) {
                dRAFTS = ProfilePhotoItemType.UNKNOWN;
             }else if(p0.isVideoType()){
                if (r1.R2(p0.mEntity)) {
                   dRAFTS = ProfilePhotoItemType.LIVE_PLAYBACK;
                }else {
                   dRAFTS = ProfilePhotoItemType.VIDEO;
                }
             }else if(p0.isImageType()){
                dRAFTS = ProfilePhotoItemType.IMAGE;
             }else if(p0.isLiveStream()){
                dRAFTS = ProfilePhotoItemType.LIVE;
             }else if(h.a(p0)){
                dRAFTS = ProfilePhotoItemType.REWARD;
             }else if(p0.isArticle()){
                dRAFTS = ProfilePhotoItemType.ARTICLE;
             }else {
                dRAFTS = ProfilePhotoItemType.UNKNOWN;
             }
          }
          profilePhoto = dRAFTS;
       }
       return profilePhoto;
    }
    public static ProfilePhotoItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ProfilePhotoItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ProfilePhotoItemType.class, p0);
    }
    public static ProfilePhotoItemType[] values(){
       Object obj = PatchProxy.apply(null, null, ProfilePhotoItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ProfilePhotoItemType.$VALUES.clone();
    }
    public abstract void addPresenter(PresenterV2 p0,r0 p1,int p2);
    public final int getViewType(){
       return this.viewType;
    }
}
