package com.kwai.sdk.eve.proto.PlayEvent$Builder;
import com.kwai.sdk.eve.proto.PlayEventOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.sdk.eve.proto.PlayEvent;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.sdk.eve.proto.PlayEvent$1;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.sdk.eve.proto.ContentType;
import com.kwai.sdk.eve.proto.HetuTag;
import com.kwai.sdk.eve.proto.ImageType;
import com.kwai.sdk.eve.proto.PlayEvent$LiveWatchStatus;
import com.kwai.sdk.eve.proto.HetuTag$Builder;

public final class PlayEvent$Builder extends GeneratedMessageLite$Builder implements PlayEventOrBuilder	// class@0015fc
{

    public void PlayEvent$Builder(){
       super(PlayEvent.DEFAULT_INSTANCE);
    }
    public void PlayEvent$Builder(PlayEvent$1 p0){
       super();
    }
    public PlayEvent$Builder clearAfkPlayedDurationMs(){
       this.copyOnWrite();
       this.instance.clearAfkPlayedDurationMs();
       return this;
    }
    public PlayEvent$Builder clearAuthorId(){
       this.copyOnWrite();
       this.instance.clearAuthorId();
       return this;
    }
    public PlayEvent$Builder clearBufferDuration(){
       this.copyOnWrite();
       this.instance.clearBufferDuration();
       return this;
    }
    public PlayEvent$Builder clearClickPauseCount(){
       this.copyOnWrite();
       this.instance.clearClickPauseCount();
       return this;
    }
    public PlayEvent$Builder clearCommentStatus(){
       this.copyOnWrite();
       this.instance.clearCommentStatus();
       return this;
    }
    public PlayEvent$Builder clearCommentStayDurationMs(){
       this.copyOnWrite();
       this.instance.clearCommentStayDurationMs();
       return this;
    }
    public PlayEvent$Builder clearContentId(){
       this.copyOnWrite();
       this.instance.clearContentId();
       return this;
    }
    public PlayEvent$Builder clearContentType(){
       this.copyOnWrite();
       this.instance.clearContentType();
       return this;
    }
    public PlayEvent$Builder clearDownloadStatus(){
       this.copyOnWrite();
       this.instance.clearDownloadStatus();
       return this;
    }
    public PlayEvent$Builder clearEnterProfileCount(){
       this.copyOnWrite();
       this.instance.clearEnterProfileCount();
       return this;
    }
    public PlayEvent$Builder clearEnterSideSlideStatus(){
       this.copyOnWrite();
       this.instance.clearEnterSideSlideStatus();
       return this;
    }
    public PlayEvent$Builder clearExpTag(){
       this.copyOnWrite();
       this.instance.clearExpTag();
       return this;
    }
    public PlayEvent$Builder clearFavStatus(){
       this.copyOnWrite();
       this.instance.clearFavStatus();
       return this;
    }
    public PlayEvent$Builder clearFollowStatus(){
       this.copyOnWrite();
       this.instance.clearFollowStatus();
       return this;
    }
    public PlayEvent$Builder clearForwardStatus(){
       this.copyOnWrite();
       this.instance.clearForwardStatus();
       return this;
    }
    public PlayEvent$Builder clearHateStatus(){
       this.copyOnWrite();
       this.instance.clearHateStatus();
       return this;
    }
    public PlayEvent$Builder clearHetuTag(){
       this.copyOnWrite();
       this.instance.clearHetuTag();
       return this;
    }
    public PlayEvent$Builder clearHudongStatus(){
       this.copyOnWrite();
       this.instance.clearHudongStatus();
       return this;
    }
    public PlayEvent$Builder clearImageType(){
       this.copyOnWrite();
       this.instance.clearImageType();
       return this;
    }
    public PlayEvent$Builder clearLandscapeStatus(){
       this.copyOnWrite();
       this.instance.clearLandscapeStatus();
       return this;
    }
    public PlayEvent$Builder clearLatitude(){
       this.copyOnWrite();
       this.instance.clearLatitude();
       return this;
    }
    public PlayEvent$Builder clearLikeStatus(){
       this.copyOnWrite();
       this.instance.clearLikeStatus();
       return this;
    }
    public PlayEvent$Builder clearLiveWatchStatus(){
       this.copyOnWrite();
       this.instance.clearLiveWatchStatus();
       return this;
    }
    public PlayEvent$Builder clearLlsid(){
       this.copyOnWrite();
       this.instance.clearLlsid();
       return this;
    }
    public PlayEvent$Builder clearLongitude(){
       this.copyOnWrite();
       this.instance.clearLongitude();
       return this;
    }
    public PlayEvent$Builder clearPage(){
       this.copyOnWrite();
       this.instance.clearPage();
       return this;
    }
    public PlayEvent$Builder clearPhotoRecoSource(){
       this.copyOnWrite();
       this.instance.clearPhotoRecoSource();
       return this;
    }
    public PlayEvent$Builder clearPlaySoundVolume(){
       this.copyOnWrite();
       this.instance.clearPlaySoundVolume();
       return this;
    }
    public PlayEvent$Builder clearPlayedDurationMs(){
       this.copyOnWrite();
       this.instance.clearPlayedDurationMs();
       return this;
    }
    public PlayEvent$Builder clearPrepareDurationMs(){
       this.copyOnWrite();
       this.instance.clearPrepareDurationMs();
       return this;
    }
    public PlayEvent$Builder clearReferPage(){
       this.copyOnWrite();
       this.instance.clearReferPage();
       return this;
    }
    public PlayEvent$Builder clearSessionId(){
       this.copyOnWrite();
       this.instance.clearSessionId();
       return this;
    }
    public PlayEvent$Builder clearStalledCount(){
       this.copyOnWrite();
       this.instance.clearStalledCount();
       return this;
    }
    public PlayEvent$Builder clearTimestamp(){
       this.copyOnWrite();
       this.instance.clearTimestamp();
       return this;
    }
    public PlayEvent$Builder clearTopPage(){
       this.copyOnWrite();
       this.instance.clearTopPage();
       return this;
    }
    public PlayEvent$Builder clearTotalDurationMs(){
       this.copyOnWrite();
       this.instance.clearTotalDurationMs();
       return this;
    }
    public long getAfkPlayedDurationMs(){
       return this.instance.getAfkPlayedDurationMs();
    }
    public String getAuthorId(){
       return this.instance.getAuthorId();
    }
    public ByteString getAuthorIdBytes(){
       return this.instance.getAuthorIdBytes();
    }
    public long getBufferDuration(){
       return this.instance.getBufferDuration();
    }
    public int getClickPauseCount(){
       return this.instance.getClickPauseCount();
    }
    public boolean getCommentStatus(){
       return this.instance.getCommentStatus();
    }
    public long getCommentStayDurationMs(){
       return this.instance.getCommentStayDurationMs();
    }
    public String getContentId(){
       return this.instance.getContentId();
    }
    public ByteString getContentIdBytes(){
       return this.instance.getContentIdBytes();
    }
    public ContentType getContentType(){
       return this.instance.getContentType();
    }
    public int getContentTypeValue(){
       return this.instance.getContentTypeValue();
    }
    public boolean getDownloadStatus(){
       return this.instance.getDownloadStatus();
    }
    public int getEnterProfileCount(){
       return this.instance.getEnterProfileCount();
    }
    public boolean getEnterSideSlideStatus(){
       return this.instance.getEnterSideSlideStatus();
    }
    public String getExpTag(){
       return this.instance.getExpTag();
    }
    public ByteString getExpTagBytes(){
       return this.instance.getExpTagBytes();
    }
    public boolean getFavStatus(){
       return this.instance.getFavStatus();
    }
    public boolean getFollowStatus(){
       return this.instance.getFollowStatus();
    }
    public boolean getForwardStatus(){
       return this.instance.getForwardStatus();
    }
    public boolean getHateStatus(){
       return this.instance.getHateStatus();
    }
    public HetuTag getHetuTag(){
       return this.instance.getHetuTag();
    }
    public boolean getHudongStatus(){
       return this.instance.getHudongStatus();
    }
    public ImageType getImageType(){
       return this.instance.getImageType();
    }
    public int getImageTypeValue(){
       return this.instance.getImageTypeValue();
    }
    public boolean getLandscapeStatus(){
       return this.instance.getLandscapeStatus();
    }
    public double getLatitude(){
       return this.instance.getLatitude();
    }
    public boolean getLikeStatus(){
       return this.instance.getLikeStatus();
    }
    public PlayEvent$LiveWatchStatus getLiveWatchStatus(){
       return this.instance.getLiveWatchStatus();
    }
    public int getLiveWatchStatusValue(){
       return this.instance.getLiveWatchStatusValue();
    }
    public String getLlsid(){
       return this.instance.getLlsid();
    }
    public ByteString getLlsidBytes(){
       return this.instance.getLlsidBytes();
    }
    public double getLongitude(){
       return this.instance.getLongitude();
    }
    public String getPage(){
       return this.instance.getPage();
    }
    public ByteString getPageBytes(){
       return this.instance.getPageBytes();
    }
    public String getPhotoRecoSource(){
       return this.instance.getPhotoRecoSource();
    }
    public ByteString getPhotoRecoSourceBytes(){
       return this.instance.getPhotoRecoSourceBytes();
    }
    public int getPlaySoundVolume(){
       return this.instance.getPlaySoundVolume();
    }
    public long getPlayedDurationMs(){
       return this.instance.getPlayedDurationMs();
    }
    public long getPrepareDurationMs(){
       return this.instance.getPrepareDurationMs();
    }
    public String getReferPage(){
       return this.instance.getReferPage();
    }
    public ByteString getReferPageBytes(){
       return this.instance.getReferPageBytes();
    }
    public String getSessionId(){
       return this.instance.getSessionId();
    }
    public ByteString getSessionIdBytes(){
       return this.instance.getSessionIdBytes();
    }
    public int getStalledCount(){
       return this.instance.getStalledCount();
    }
    public long getTimestamp(){
       return this.instance.getTimestamp();
    }
    public String getTopPage(){
       return this.instance.getTopPage();
    }
    public ByteString getTopPageBytes(){
       return this.instance.getTopPageBytes();
    }
    public long getTotalDurationMs(){
       return this.instance.getTotalDurationMs();
    }
    public boolean hasHetuTag(){
       return this.instance.hasHetuTag();
    }
    public PlayEvent$Builder mergeHetuTag(HetuTag p0){
       this.copyOnWrite();
       this.instance.mergeHetuTag(p0);
       return this;
    }
    public PlayEvent$Builder setAfkPlayedDurationMs(long p0){
       this.copyOnWrite();
       this.instance.setAfkPlayedDurationMs(p0);
       return this;
    }
    public PlayEvent$Builder setAuthorId(String p0){
       this.copyOnWrite();
       this.instance.setAuthorId(p0);
       return this;
    }
    public PlayEvent$Builder setAuthorIdBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setAuthorIdBytes(p0);
       return this;
    }
    public PlayEvent$Builder setBufferDuration(long p0){
       this.copyOnWrite();
       this.instance.setBufferDuration(p0);
       return this;
    }
    public PlayEvent$Builder setClickPauseCount(int p0){
       this.copyOnWrite();
       this.instance.setClickPauseCount(p0);
       return this;
    }
    public PlayEvent$Builder setCommentStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setCommentStatus(p0);
       return this;
    }
    public PlayEvent$Builder setCommentStayDurationMs(long p0){
       this.copyOnWrite();
       this.instance.setCommentStayDurationMs(p0);
       return this;
    }
    public PlayEvent$Builder setContentId(String p0){
       this.copyOnWrite();
       this.instance.setContentId(p0);
       return this;
    }
    public PlayEvent$Builder setContentIdBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setContentIdBytes(p0);
       return this;
    }
    public PlayEvent$Builder setContentType(ContentType p0){
       this.copyOnWrite();
       this.instance.setContentType(p0);
       return this;
    }
    public PlayEvent$Builder setContentTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setContentTypeValue(p0);
       return this;
    }
    public PlayEvent$Builder setDownloadStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setDownloadStatus(p0);
       return this;
    }
    public PlayEvent$Builder setEnterProfileCount(int p0){
       this.copyOnWrite();
       this.instance.setEnterProfileCount(p0);
       return this;
    }
    public PlayEvent$Builder setEnterSideSlideStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setEnterSideSlideStatus(p0);
       return this;
    }
    public PlayEvent$Builder setExpTag(String p0){
       this.copyOnWrite();
       this.instance.setExpTag(p0);
       return this;
    }
    public PlayEvent$Builder setExpTagBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setExpTagBytes(p0);
       return this;
    }
    public PlayEvent$Builder setFavStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setFavStatus(p0);
       return this;
    }
    public PlayEvent$Builder setFollowStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setFollowStatus(p0);
       return this;
    }
    public PlayEvent$Builder setForwardStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setForwardStatus(p0);
       return this;
    }
    public PlayEvent$Builder setHateStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setHateStatus(p0);
       return this;
    }
    public PlayEvent$Builder setHetuTag(HetuTag$Builder p0){
       this.copyOnWrite();
       this.instance.setHetuTag(p0);
       return this;
    }
    public PlayEvent$Builder setHetuTag(HetuTag p0){
       this.copyOnWrite();
       this.instance.setHetuTag(p0);
       return this;
    }
    public PlayEvent$Builder setHudongStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setHudongStatus(p0);
       return this;
    }
    public PlayEvent$Builder setImageType(ImageType p0){
       this.copyOnWrite();
       this.instance.setImageType(p0);
       return this;
    }
    public PlayEvent$Builder setImageTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setImageTypeValue(p0);
       return this;
    }
    public PlayEvent$Builder setLandscapeStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setLandscapeStatus(p0);
       return this;
    }
    public PlayEvent$Builder setLatitude(double p0){
       this.copyOnWrite();
       this.instance.setLatitude(p0);
       return this;
    }
    public PlayEvent$Builder setLikeStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setLikeStatus(p0);
       return this;
    }
    public PlayEvent$Builder setLiveWatchStatus(PlayEvent$LiveWatchStatus p0){
       this.copyOnWrite();
       this.instance.setLiveWatchStatus(p0);
       return this;
    }
    public PlayEvent$Builder setLiveWatchStatusValue(int p0){
       this.copyOnWrite();
       this.instance.setLiveWatchStatusValue(p0);
       return this;
    }
    public PlayEvent$Builder setLlsid(String p0){
       this.copyOnWrite();
       this.instance.setLlsid(p0);
       return this;
    }
    public PlayEvent$Builder setLlsidBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setLlsidBytes(p0);
       return this;
    }
    public PlayEvent$Builder setLongitude(double p0){
       this.copyOnWrite();
       this.instance.setLongitude(p0);
       return this;
    }
    public PlayEvent$Builder setPage(String p0){
       this.copyOnWrite();
       this.instance.setPage(p0);
       return this;
    }
    public PlayEvent$Builder setPageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setPageBytes(p0);
       return this;
    }
    public PlayEvent$Builder setPhotoRecoSource(String p0){
       this.copyOnWrite();
       this.instance.setPhotoRecoSource(p0);
       return this;
    }
    public PlayEvent$Builder setPhotoRecoSourceBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setPhotoRecoSourceBytes(p0);
       return this;
    }
    public PlayEvent$Builder setPlaySoundVolume(int p0){
       this.copyOnWrite();
       this.instance.setPlaySoundVolume(p0);
       return this;
    }
    public PlayEvent$Builder setPlayedDurationMs(long p0){
       this.copyOnWrite();
       this.instance.setPlayedDurationMs(p0);
       return this;
    }
    public PlayEvent$Builder setPrepareDurationMs(long p0){
       this.copyOnWrite();
       this.instance.setPrepareDurationMs(p0);
       return this;
    }
    public PlayEvent$Builder setReferPage(String p0){
       this.copyOnWrite();
       this.instance.setReferPage(p0);
       return this;
    }
    public PlayEvent$Builder setReferPageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setReferPageBytes(p0);
       return this;
    }
    public PlayEvent$Builder setSessionId(String p0){
       this.copyOnWrite();
       this.instance.setSessionId(p0);
       return this;
    }
    public PlayEvent$Builder setSessionIdBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setSessionIdBytes(p0);
       return this;
    }
    public PlayEvent$Builder setStalledCount(int p0){
       this.copyOnWrite();
       this.instance.setStalledCount(p0);
       return this;
    }
    public PlayEvent$Builder setTimestamp(long p0){
       this.copyOnWrite();
       this.instance.setTimestamp(p0);
       return this;
    }
    public PlayEvent$Builder setTopPage(String p0){
       this.copyOnWrite();
       this.instance.setTopPage(p0);
       return this;
    }
    public PlayEvent$Builder setTopPageBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setTopPageBytes(p0);
       return this;
    }
    public PlayEvent$Builder setTotalDurationMs(long p0){
       this.copyOnWrite();
       this.instance.setTotalDurationMs(p0);
       return this;
    }
}
