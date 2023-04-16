package com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.util.List;
import com.kwai.framework.model.feed.BaseFeed;
import java.io.File;
import com.kwai.framework.model.user.User;
import java.lang.Number;
import java.lang.Integer;
import z1.d;

public final class ProfileBgVideoInfo implements Serializable	// class@001251
{
    public long clipDuration;
    public long clipStart;
    public List coverUrls;
    public long duration;
    public boolean enableAbLoop;
    public List extraPaths;
    public BaseFeed feed;
    public File localCoverFile;
    public boolean localVideo;
    public long modifyTimeStamp;
    public String path;
    public float showAreaCenterYRadio;
    public int status;
    public boolean useFeedPlay;
    public User user;
    public int videoHeight;
    public int videoWidth;
    public String ztPhotoId;
    public static final ProfileBgVideoInfo$a Companion;
    public static final long serialVersionUID;

    static {
       ProfileBgVideoInfo.Companion = new ProfileBgVideoInfo$a(null);
    }
    public void ProfileBgVideoInfo(){
       super();
       this.ztPhotoId = "";
       this.path = "";
       this.extraPaths = new ArrayList();
       this.showAreaCenterYRadio = 0x3f000000;
    }
    public final void checkCropParamForPlayer(){
       ProfileBgVideoInfo tduration = this.duration;
       if (1 - tduration > 0) {
       }else if(500 - tduration > 0){
          this.clipStart = 0;
          this.clipDuration = tduration;
       }
       return;
    }
    public final ProfileBgVideoInfo deepClone(){
       ProfileBgVideoInfo obj = PatchProxy.apply(null, this, ProfileBgVideoInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ProfileBgVideoInfo();
       obj.ztPhotoId = this.ztPhotoId;
       obj.path = this.path;
       obj.clipStart = this.clipStart;
       obj.clipDuration = this.clipDuration;
       obj.coverUrls = this.coverUrls;
       obj.videoWidth = this.videoWidth;
       obj.videoHeight = this.videoHeight;
       obj.duration = this.duration;
       obj.showAreaCenterYRadio = this.showAreaCenterYRadio;
       obj.localVideo = this.localVideo;
       obj.localCoverFile = this.localCoverFile;
       obj.enableAbLoop = this.enableAbLoop;
       obj.status = this.status;
       obj.feed = this.feed;
       obj.user = this.user;
       obj.modifyTimeStamp = this.modifyTimeStamp;
       obj.useFeedPlay = this.useFeedPlay;
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileBgVideoInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof ProfileBgVideoInfo) {
          return b;
       }
       if (a.g(ProfileBgVideoInfo.class, p0.getClass()) ^ 1) {
          return b;
       }
       if (a.g(this.ztPhotoId, p0.ztPhotoId) && (a.g(this.path, p0.path) && (!Float.compare(this.showAreaCenterYRadio, p0.showAreaCenterYRadio) && (this.localVideo == p0.localVideo && (this.enableAbLoop == p0.enableAbLoop && this.status == p0.status))))) {
          b = true;
       }
    label_005b :
       return b;
    }
    public final long getClipDuration(){
       return this.clipDuration;
    }
    public final long getClipStart(){
       return this.clipStart;
    }
    public final List getCoverUrls(){
       return this.coverUrls;
    }
    public final long getDuration(){
       return this.duration;
    }
    public final boolean getEnableAbLoop(){
       return this.enableAbLoop;
    }
    public final List getExtraPaths(){
       return this.extraPaths;
    }
    public final BaseFeed getFeed(){
       return this.feed;
    }
    public final File getLocalCoverFile(){
       return this.localCoverFile;
    }
    public final boolean getLocalVideo(){
       return this.localVideo;
    }
    public final long getModifyTimeStamp(){
       return this.modifyTimeStamp;
    }
    public final String getPath(){
       return this.path;
    }
    public final float getShowAreaCenterYRadio(){
       return this.showAreaCenterYRadio;
    }
    public final int getStatus(){
       return this.status;
    }
    public final boolean getUseFeedPlay(){
       return this.useFeedPlay;
    }
    public final User getUser(){
       return this.user;
    }
    public final int getVideoHeight(){
       return this.videoHeight;
    }
    public final int getVideoWidth(){
       return this.videoWidth;
    }
    public final String getZtPhotoId(){
       return this.ztPhotoId;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, ProfileBgVideoInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.ztPhotoId,this.path,Float.valueOf(this.showAreaCenterYRadio),Boolean.valueOf(this.localVideo),Boolean.valueOf(this.enableAbLoop),Integer.valueOf(this.status)};
       return d.b(obj);
    }
    public final void setClipDuration(long p0){
       this.clipDuration = p0;
    }
    public final void setClipStart(long p0){
       this.clipStart = p0;
    }
    public final void setCoverUrls(List p0){
       this.coverUrls = p0;
    }
    public final void setDuration(long p0){
       this.duration = p0;
    }
    public final void setEnableAbLoop(boolean p0){
       this.enableAbLoop = p0;
    }
    public final void setExtraPaths(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBgVideoInfo.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.extraPaths = p0;
       return;
    }
    public final void setFeed(BaseFeed p0){
       this.feed = p0;
    }
    public final void setLocalCoverFile(File p0){
       this.localCoverFile = p0;
    }
    public final void setLocalVideo(boolean p0){
       this.localVideo = p0;
    }
    public final void setModifyTimeStamp(long p0){
       this.modifyTimeStamp = p0;
    }
    public final void setPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBgVideoInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.path = p0;
       return;
    }
    public final void setShowAreaCenterYRadio(float p0){
       this.showAreaCenterYRadio = p0;
    }
    public final void setStatus(int p0){
       this.status = p0;
    }
    public final void setUseFeedPlay(boolean p0){
       this.useFeedPlay = p0;
    }
    public final void setUser(User p0){
       this.user = p0;
    }
    public final void setVideoHeight(int p0){
       this.videoHeight = p0;
    }
    public final void setVideoWidth(int p0){
       this.videoWidth = p0;
    }
    public final void setZtPhotoId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBgVideoInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.ztPhotoId = p0;
       return;
    }
}
