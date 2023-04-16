package com.yxcorp.gifshow.model.response.PostStartUpResponse$PostStartUpData;
import java.lang.Boolean;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.model.response.PostStartUpResponse$ShopPromotionInfo;
import com.yxcorp.gifshow.model.config.ShowAlbum;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.feature.upload.model.UploadPostForbidNotify;
import com.yxcorp.gifshow.model.response.PostStartUpResponse$UserPhotoAlbumSelectModeInfo;
import java.lang.Number;
import com.yxcorp.gifshow.model.response.AssistantStartUpData;
import com.yxcorp.gifshow.model.response.EditTimedVisibleText;
import java.lang.StringBuilder;

public final class PostStartUpResponse$PostStartUpData	// class@001f55
{
    public AssistantStartUpData assistantStartUpData;
    public String content;
    public List defaultCoverTextList;
    public List defaultRecoTextList;
    public Boolean enableAlbumMultiImport;
    public Boolean enableAutoOpenHdExport;
    public Music lowActiveRecoMusic;
    public Music recordRecoCollectMusic;
    public ShareBusinessLinkInfo shareBusinessLinkInfo;
    public ShareLivePredictionConfig shareLivePredictionConfig;
    public PostStartUpResponse$ShopPromotionInfo shopPromotionInfo;
    public ShowAlbum showAlbum;
    public Boolean showJudgeAssist;
    public Boolean showKaraokeEntryGuide;
    public EditTimedVisibleText timedVisibleText;
    public UploadPostForbidNotify uploadPostForbidNotify;
    public PostStartUpResponse$UserPhotoAlbumSelectModeInfo userPhotoAlbumSelectModeInfo;

    public final Boolean a(){
       return this.enableAutoOpenHdExport;
    }
    public final Music b(){
       return this.lowActiveRecoMusic;
    }
    public final Music c(){
       return this.recordRecoCollectMusic;
    }
    public final PostStartUpResponse$ShopPromotionInfo d(){
       return this.shopPromotionInfo;
    }
    public final ShowAlbum e(){
       return this.showAlbum;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostStartUpResponse$PostStartUpData.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PostStartUpResponse$PostStartUpData && (a.g(this.content, p0.content) && (a.g(this.shareBusinessLinkInfo, p0.shareBusinessLinkInfo) && (a.g(this.defaultCoverTextList, p0.defaultCoverTextList) && (a.g(this.defaultRecoTextList, p0.defaultRecoTextList) && (a.g(this.shareLivePredictionConfig, p0.shareLivePredictionConfig) && (a.g(this.assistantStartUpData, p0.assistantStartUpData) && (a.g(this.timedVisibleText, p0.timedVisibleText) && (a.g(this.recordRecoCollectMusic, p0.recordRecoCollectMusic) && (a.g(this.showAlbum, p0.showAlbum) && (a.g(this.enableAlbumMultiImport, p0.enableAlbumMultiImport) && (a.g(this.showJudgeAssist, p0.showJudgeAssist) && (a.g(this.lowActiveRecoMusic, p0.lowActiveRecoMusic) && (a.g(this.enableAutoOpenHdExport, p0.enableAutoOpenHdExport) && (a.g(this.shopPromotionInfo, p0.shopPromotionInfo) && (a.g(this.showKaraokeEntryGuide, p0.showKaraokeEntryGuide) && (a.g(this.userPhotoAlbumSelectModeInfo, p0.userPhotoAlbumSelectModeInfo) && a.g(this.uploadPostForbidNotify, p0.uploadPostForbidNotify))))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final Boolean f(){
       return this.showJudgeAssist;
    }
    public final UploadPostForbidNotify g(){
       return this.uploadPostForbidNotify;
    }
    public final PostStartUpResponse$UserPhotoAlbumSelectModeInfo h(){
       return this.userPhotoAlbumSelectModeInfo;
    }
    public int hashCode(){
       PostStartUpResponse$PostStartUpData obj = PatchProxy.apply(null, this, PostStartUpResponse$PostStartUpData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.content;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PostStartUpResponse$PostStartUpData tshareBusine = this.shareBusinessLinkInfo;
       int i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.defaultCoverTextList;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.defaultRecoTextList;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.shareLivePredictionConfig;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.assistantStartUpData;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.timedVisibleText;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.recordRecoCollectMusic;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.showAlbum;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.enableAlbumMultiImport;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.showJudgeAssist;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.lowActiveRecoMusic;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.enableAutoOpenHdExport;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.shopPromotionInfo;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.showKaraokeEntryGuide;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.userPhotoAlbumSelectModeInfo;
       i2 = (tshareBusine != null)? tshareBusine.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tshareBusine = this.uploadPostForbidNotify;
       if (tshareBusine != null) {
          i = tshareBusine.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PostStartUpResponse$PostStartUpData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PostStartUpData\(content="+this.content+", shareBusinessLinkInfo="+this.shareBusinessLinkInfo+", defaultCoverTextList="+this.defaultCoverTextList+", defaultRecoTextList="+this.defaultRecoTextList+", shareLivePredictionConfig="+this.shareLivePredictionConfig+", assistantStartUpData="+this.assistantStartUpData+", timedVisibleText="+this.timedVisibleText+", recordRecoCollectMusic="+this.recordRecoCollectMusic+", showAlbum="+this.showAlbum+", enableAlbumMultiImport="+this.enableAlbumMultiImport+", showJudgeAssist="+this.showJudgeAssist+", lowActiveRecoMusic="+this.lowActiveRecoMusic+", enableAutoOpenHdExport="+this.enableAutoOpenHdExport+", shopPromotionInfo="+this.shopPromotionInfo+", showKaraokeEntryGuide="+this.showKaraokeEntryGuide+", userPhotoAlbumSelectModeInfo="+this.userPhotoAlbumSelectModeInfo+", uploadPostForbidNotify="+this.uploadPostForbidNotify+"\)";
    }
}
