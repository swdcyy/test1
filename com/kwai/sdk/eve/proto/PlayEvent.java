package com.kwai.sdk.eve.proto.PlayEvent;
import com.kwai.sdk.eve.proto.PlayEventOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.sdk.eve.proto.PlayEvent$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.sdk.eve.proto.PlayEvent$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.sdk.eve.proto.ContentType;
import com.kwai.sdk.eve.proto.HetuTag;
import com.kwai.sdk.eve.proto.ImageType;
import com.kwai.sdk.eve.proto.PlayEvent$LiveWatchStatus;
import java.util.Objects;
import com.kwai.sdk.eve.proto.HetuTag$Builder;
import com.google.protobuf.AbstractMessageLite;

public final class PlayEvent extends GeneratedMessageLite implements PlayEventOrBuilder	// class@001600
{
    public long afkPlayedDurationMs_;
    public String authorId_;
    public long bufferDuration_;
    public int clickPauseCount_;
    public boolean commentStatus_;
    public long commentStayDurationMs_;
    public String contentId_;
    public int contentType_;
    public boolean downloadStatus_;
    public int enterProfileCount_;
    public boolean enterSideSlideStatus_;
    public String expTag_;
    public boolean favStatus_;
    public boolean followStatus_;
    public boolean forwardStatus_;
    public boolean hateStatus_;
    public HetuTag hetuTag_;
    public boolean hudongStatus_;
    public int imageType_;
    public boolean landscapeStatus_;
    public double latitude_;
    public boolean likeStatus_;
    public int liveWatchStatus_;
    public String llsid_;
    public double longitude_;
    public String page_;
    public String photoRecoSource_;
    public int playSoundVolume_;
    public long playedDurationMs_;
    public long prepareDurationMs_;
    public String referPage_;
    public String sessionId_;
    public int stalledCount_;
    public long timestamp_;
    public String topPage_;
    public long totalDurationMs_;
    public static final PlayEvent DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       PlayEvent playEvent = new PlayEvent();
       PlayEvent.DEFAULT_INSTANCE = playEvent;
       GeneratedMessageLite.registerDefaultInstance(PlayEvent.class, playEvent);
    }
    public void PlayEvent(){
       super();
       this.contentId_ = "";
       this.authorId_ = "";
       this.expTag_ = "";
       this.page_ = "";
       this.referPage_ = "";
       this.topPage_ = "";
       this.photoRecoSource_ = "";
       this.llsid_ = "";
       this.sessionId_ = "";
    }
    public static PlayEvent getDefaultInstance(){
       return PlayEvent.DEFAULT_INSTANCE;
    }
    public static PlayEvent$Builder newBuilder(){
       return PlayEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static PlayEvent$Builder newBuilder(PlayEvent p0){
       return PlayEvent.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PlayEvent parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(PlayEvent.DEFAULT_INSTANCE, p0);
    }
    public static PlayEvent parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(PlayEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static PlayEvent parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(PlayEvent.DEFAULT_INSTANCE, p0);
    }
    public static PlayEvent parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PlayEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static PlayEvent parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(PlayEvent.DEFAULT_INSTANCE, p0);
    }
    public static PlayEvent parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PlayEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static PlayEvent parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(PlayEvent.DEFAULT_INSTANCE, p0);
    }
    public static PlayEvent parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PlayEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static PlayEvent parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(PlayEvent.DEFAULT_INSTANCE, p0);
    }
    public static PlayEvent parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PlayEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static PlayEvent parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(PlayEvent.DEFAULT_INSTANCE, p0);
    }
    public static PlayEvent parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(PlayEvent.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return PlayEvent.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAfkPlayedDurationMs(){
       this.afkPlayedDurationMs_ = 0;
    }
    public void clearAuthorId(){
       this.authorId_ = PlayEvent.getDefaultInstance().getAuthorId();
    }
    public void clearBufferDuration(){
       this.bufferDuration_ = 0;
    }
    public void clearClickPauseCount(){
       this.clickPauseCount_ = 0;
    }
    public void clearCommentStatus(){
       this.commentStatus_ = false;
    }
    public void clearCommentStayDurationMs(){
       this.commentStayDurationMs_ = 0;
    }
    public void clearContentId(){
       this.contentId_ = PlayEvent.getDefaultInstance().getContentId();
    }
    public void clearContentType(){
       this.contentType_ = 0;
    }
    public void clearDownloadStatus(){
       this.downloadStatus_ = false;
    }
    public void clearEnterProfileCount(){
       this.enterProfileCount_ = 0;
    }
    public void clearEnterSideSlideStatus(){
       this.enterSideSlideStatus_ = false;
    }
    public void clearExpTag(){
       this.expTag_ = PlayEvent.getDefaultInstance().getExpTag();
    }
    public void clearFavStatus(){
       this.favStatus_ = false;
    }
    public void clearFollowStatus(){
       this.followStatus_ = false;
    }
    public void clearForwardStatus(){
       this.forwardStatus_ = false;
    }
    public void clearHateStatus(){
       this.hateStatus_ = false;
    }
    public void clearHetuTag(){
       this.hetuTag_ = null;
    }
    public void clearHudongStatus(){
       this.hudongStatus_ = false;
    }
    public void clearImageType(){
       this.imageType_ = 0;
    }
    public void clearLandscapeStatus(){
       this.landscapeStatus_ = false;
    }
    public void clearLatitude(){
       this.latitude_ = 0;
    }
    public void clearLikeStatus(){
       this.likeStatus_ = false;
    }
    public void clearLiveWatchStatus(){
       this.liveWatchStatus_ = 0;
    }
    public void clearLlsid(){
       this.llsid_ = PlayEvent.getDefaultInstance().getLlsid();
    }
    public void clearLongitude(){
       this.longitude_ = 0;
    }
    public void clearPage(){
       this.page_ = PlayEvent.getDefaultInstance().getPage();
    }
    public void clearPhotoRecoSource(){
       this.photoRecoSource_ = PlayEvent.getDefaultInstance().getPhotoRecoSource();
    }
    public void clearPlaySoundVolume(){
       this.playSoundVolume_ = 0;
    }
    public void clearPlayedDurationMs(){
       this.playedDurationMs_ = 0;
    }
    public void clearPrepareDurationMs(){
       this.prepareDurationMs_ = 0;
    }
    public void clearReferPage(){
       this.referPage_ = PlayEvent.getDefaultInstance().getReferPage();
    }
    public void clearSessionId(){
       this.sessionId_ = PlayEvent.getDefaultInstance().getSessionId();
    }
    public void clearStalledCount(){
       this.stalledCount_ = 0;
    }
    public void clearTimestamp(){
       this.timestamp_ = 0;
    }
    public void clearTopPage(){
       this.topPage_ = PlayEvent.getDefaultInstance().getTopPage();
    }
    public void clearTotalDurationMs(){
       this.totalDurationMs_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (PlayEvent$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new PlayEvent();
           case 2:
             return new PlayEvent$Builder(p2);
           case 3:
             Object[] objArray = new Object[36];
             objArray[0] = "contentId_";
             objArray[i] = "contentType_";
             objArray[2] = "timestamp_";
             objArray[3] = "authorId_";
             objArray[4] = "expTag_";
             objArray[5] = "page_";
             objArray[6] = "referPage_";
             objArray[7] = "totalDurationMs_";
             objArray[8] = "playedDurationMs_";
             objArray[9] = "prepareDurationMs_";
             objArray[10] = "commentStayDurationMs_";
             objArray[11] = "enterProfileCount_";
             objArray[12] = "clickPauseCount_";
             objArray[13] = "likeStatus_";
             objArray[14] = "followStatus_";
             objArray[15] = "hudongStatus_";
             objArray[16] = "hateStatus_";
             objArray[17] = "landscapeStatus_";
             objArray[18] = "forwardStatus_";
             objArray[19] = "favStatus_";
             objArray[20] = "downloadStatus_";
             objArray[21] = "liveWatchStatus_";
             objArray[22] = "topPage_";
             objArray[23] = "photoRecoSource_";
             objArray[24] = "enterSideSlideStatus_";
             objArray[25] = "commentStatus_";
             objArray[26] = "llsid_";
             objArray[27] = "sessionId_";
             objArray[28] = "bufferDuration_";
             objArray[29] = "stalledCount_";
             objArray[30] = "playSoundVolume_";
             objArray[31] = "imageType_";
             objArray[32] = "hetuTag_";
             objArray[33] = "latitude_";
             objArray[34] = "longitude_";
             objArray[35] = "afkPlayedDurationMs_";
             return GeneratedMessageLite.newMessageInfo(PlayEvent.DEFAULT_INSTANCE, "\xff\x02\xff\x02$\xff\x02\xff\x02\xff\x02\xff\x02\x01Q$\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\f\x03\x03\x04\x02\x02\x05\x02\x02\x06\x02\x02\x07\x02\x02\b\x03\t\x03\n\x03\x0b\x03\f\x0b\r\x0b\x0e\x07\x0f\x07\x10\x07\x11\x07\x12\x07\x13\x07\x14\x07\x15\x07\x16\f\x17\x02\x02\x18\x02\x02\x19\x07\x1a\x07\x1b\x02\x02\x1c\x02\x02\x1d\x03\x1e\x0b\x1f\x0b3\f=\tG\xff\x02\xff\x02H\xff\x02\xff\x02Q\x03\x00", objArray);
           case 4:
             return PlayEvent.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = PlayEvent.PARSER;
             if (pARSER == null) {
                _monitor_enter(PlayEvent.class);
                pARSER = PlayEvent.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(PlayEvent.DEFAULT_INSTANCE);
                   PlayEvent.PARSER = pARSER;
                }
                _monitor_exit(PlayEvent.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return p2;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public long getAfkPlayedDurationMs(){
       return this.afkPlayedDurationMs_;
    }
    public String getAuthorId(){
       return this.authorId_;
    }
    public ByteString getAuthorIdBytes(){
       return ByteString.copyFromUtf8(this.authorId_);
    }
    public long getBufferDuration(){
       return this.bufferDuration_;
    }
    public int getClickPauseCount(){
       return this.clickPauseCount_;
    }
    public boolean getCommentStatus(){
       return this.commentStatus_;
    }
    public long getCommentStayDurationMs(){
       return this.commentStayDurationMs_;
    }
    public String getContentId(){
       return this.contentId_;
    }
    public ByteString getContentIdBytes(){
       return ByteString.copyFromUtf8(this.contentId_);
    }
    public ContentType getContentType(){
       ContentType uContentType = ContentType.forNumber(this.contentType_);
       if (uContentType == null) {
          uContentType = ContentType.UNRECOGNIZED;
       }
       return uContentType;
    }
    public int getContentTypeValue(){
       return this.contentType_;
    }
    public boolean getDownloadStatus(){
       return this.downloadStatus_;
    }
    public int getEnterProfileCount(){
       return this.enterProfileCount_;
    }
    public boolean getEnterSideSlideStatus(){
       return this.enterSideSlideStatus_;
    }
    public String getExpTag(){
       return this.expTag_;
    }
    public ByteString getExpTagBytes(){
       return ByteString.copyFromUtf8(this.expTag_);
    }
    public boolean getFavStatus(){
       return this.favStatus_;
    }
    public boolean getFollowStatus(){
       return this.followStatus_;
    }
    public boolean getForwardStatus(){
       return this.forwardStatus_;
    }
    public boolean getHateStatus(){
       return this.hateStatus_;
    }
    public HetuTag getHetuTag(){
       PlayEvent thetuTag_ = this.hetuTag_;
       if (thetuTag_ == null) {
          thetuTag_ = HetuTag.getDefaultInstance();
       }
       return thetuTag_;
    }
    public boolean getHudongStatus(){
       return this.hudongStatus_;
    }
    public ImageType getImageType(){
       ImageType imageType = ImageType.forNumber(this.imageType_);
       if (imageType == null) {
          imageType = ImageType.UNRECOGNIZED;
       }
       return imageType;
    }
    public int getImageTypeValue(){
       return this.imageType_;
    }
    public boolean getLandscapeStatus(){
       return this.landscapeStatus_;
    }
    public double getLatitude(){
       return this.latitude_;
    }
    public boolean getLikeStatus(){
       return this.likeStatus_;
    }
    public PlayEvent$LiveWatchStatus getLiveWatchStatus(){
       PlayEvent$LiveWatchStatus liveWatchSta = PlayEvent$LiveWatchStatus.forNumber(this.liveWatchStatus_);
       if (liveWatchSta == null) {
          liveWatchSta = PlayEvent$LiveWatchStatus.UNRECOGNIZED;
       }
       return liveWatchSta;
    }
    public int getLiveWatchStatusValue(){
       return this.liveWatchStatus_;
    }
    public String getLlsid(){
       return this.llsid_;
    }
    public ByteString getLlsidBytes(){
       return ByteString.copyFromUtf8(this.llsid_);
    }
    public double getLongitude(){
       return this.longitude_;
    }
    public String getPage(){
       return this.page_;
    }
    public ByteString getPageBytes(){
       return ByteString.copyFromUtf8(this.page_);
    }
    public String getPhotoRecoSource(){
       return this.photoRecoSource_;
    }
    public ByteString getPhotoRecoSourceBytes(){
       return ByteString.copyFromUtf8(this.photoRecoSource_);
    }
    public int getPlaySoundVolume(){
       return this.playSoundVolume_;
    }
    public long getPlayedDurationMs(){
       return this.playedDurationMs_;
    }
    public long getPrepareDurationMs(){
       return this.prepareDurationMs_;
    }
    public String getReferPage(){
       return this.referPage_;
    }
    public ByteString getReferPageBytes(){
       return ByteString.copyFromUtf8(this.referPage_);
    }
    public String getSessionId(){
       return this.sessionId_;
    }
    public ByteString getSessionIdBytes(){
       return ByteString.copyFromUtf8(this.sessionId_);
    }
    public int getStalledCount(){
       return this.stalledCount_;
    }
    public long getTimestamp(){
       return this.timestamp_;
    }
    public String getTopPage(){
       return this.topPage_;
    }
    public ByteString getTopPageBytes(){
       return ByteString.copyFromUtf8(this.topPage_);
    }
    public long getTotalDurationMs(){
       return this.totalDurationMs_;
    }
    public boolean hasHetuTag(){
       boolean b = (this.hetuTag_ != null)? true: false;
       return b;
    }
    public void mergeHetuTag(HetuTag p0){
       Objects.requireNonNull(p0);
       PlayEvent thetuTag_ = this.hetuTag_;
       this.hetuTag_ = (thetuTag_ != null && thetuTag_ != HetuTag.getDefaultInstance())? HetuTag.newBuilder(this.hetuTag_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void setAfkPlayedDurationMs(long p0){
       this.afkPlayedDurationMs_ = p0;
    }
    public void setAuthorId(String p0){
       Objects.requireNonNull(p0);
       this.authorId_ = p0;
    }
    public void setAuthorIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.authorId_ = p0.toStringUtf8();
    }
    public void setBufferDuration(long p0){
       this.bufferDuration_ = p0;
    }
    public void setClickPauseCount(int p0){
       this.clickPauseCount_ = p0;
    }
    public void setCommentStatus(boolean p0){
       this.commentStatus_ = p0;
    }
    public void setCommentStayDurationMs(long p0){
       this.commentStayDurationMs_ = p0;
    }
    public void setContentId(String p0){
       Objects.requireNonNull(p0);
       this.contentId_ = p0;
    }
    public void setContentIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.contentId_ = p0.toStringUtf8();
    }
    public void setContentType(ContentType p0){
       Objects.requireNonNull(p0);
       this.contentType_ = p0.getNumber();
    }
    public void setContentTypeValue(int p0){
       this.contentType_ = p0;
    }
    public void setDownloadStatus(boolean p0){
       this.downloadStatus_ = p0;
    }
    public void setEnterProfileCount(int p0){
       this.enterProfileCount_ = p0;
    }
    public void setEnterSideSlideStatus(boolean p0){
       this.enterSideSlideStatus_ = p0;
    }
    public void setExpTag(String p0){
       Objects.requireNonNull(p0);
       this.expTag_ = p0;
    }
    public void setExpTagBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.expTag_ = p0.toStringUtf8();
    }
    public void setFavStatus(boolean p0){
       this.favStatus_ = p0;
    }
    public void setFollowStatus(boolean p0){
       this.followStatus_ = p0;
    }
    public void setForwardStatus(boolean p0){
       this.forwardStatus_ = p0;
    }
    public void setHateStatus(boolean p0){
       this.hateStatus_ = p0;
    }
    public void setHetuTag(HetuTag$Builder p0){
       this.hetuTag_ = p0.build();
    }
    public void setHetuTag(HetuTag p0){
       Objects.requireNonNull(p0);
       this.hetuTag_ = p0;
    }
    public void setHudongStatus(boolean p0){
       this.hudongStatus_ = p0;
    }
    public void setImageType(ImageType p0){
       Objects.requireNonNull(p0);
       this.imageType_ = p0.getNumber();
    }
    public void setImageTypeValue(int p0){
       this.imageType_ = p0;
    }
    public void setLandscapeStatus(boolean p0){
       this.landscapeStatus_ = p0;
    }
    public void setLatitude(double p0){
       this.latitude_ = p0;
    }
    public void setLikeStatus(boolean p0){
       this.likeStatus_ = p0;
    }
    public void setLiveWatchStatus(PlayEvent$LiveWatchStatus p0){
       Objects.requireNonNull(p0);
       this.liveWatchStatus_ = p0.getNumber();
    }
    public void setLiveWatchStatusValue(int p0){
       this.liveWatchStatus_ = p0;
    }
    public void setLlsid(String p0){
       Objects.requireNonNull(p0);
       this.llsid_ = p0;
    }
    public void setLlsidBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.llsid_ = p0.toStringUtf8();
    }
    public void setLongitude(double p0){
       this.longitude_ = p0;
    }
    public void setPage(String p0){
       Objects.requireNonNull(p0);
       this.page_ = p0;
    }
    public void setPageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.page_ = p0.toStringUtf8();
    }
    public void setPhotoRecoSource(String p0){
       Objects.requireNonNull(p0);
       this.photoRecoSource_ = p0;
    }
    public void setPhotoRecoSourceBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.photoRecoSource_ = p0.toStringUtf8();
    }
    public void setPlaySoundVolume(int p0){
       this.playSoundVolume_ = p0;
    }
    public void setPlayedDurationMs(long p0){
       this.playedDurationMs_ = p0;
    }
    public void setPrepareDurationMs(long p0){
       this.prepareDurationMs_ = p0;
    }
    public void setReferPage(String p0){
       Objects.requireNonNull(p0);
       this.referPage_ = p0;
    }
    public void setReferPageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.referPage_ = p0.toStringUtf8();
    }
    public void setSessionId(String p0){
       Objects.requireNonNull(p0);
       this.sessionId_ = p0;
    }
    public void setSessionIdBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.sessionId_ = p0.toStringUtf8();
    }
    public void setStalledCount(int p0){
       this.stalledCount_ = p0;
    }
    public void setTimestamp(long p0){
       this.timestamp_ = p0;
    }
    public void setTopPage(String p0){
       Objects.requireNonNull(p0);
       this.topPage_ = p0;
    }
    public void setTopPageBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.topPage_ = p0.toStringUtf8();
    }
    public void setTotalDurationMs(long p0){
       this.totalDurationMs_ = p0;
    }
}
