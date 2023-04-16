package com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo$EditCoverInfo;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo$PoiExtraInfo;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo;
import com.kwai.feature.post.api.feature.live.ShareLivePredictionConfig;
import java.util.List;
import com.kwai.feature.post.api.feature.hotspot.RelatedHotspot;
import java.lang.Object;
import nsd.u;

public final class PhotoEditInfo implements Serializable	// class@001394
{
    public final PhotoEditInfo$EditCoverInfo clientEditCoverInfo;
    public List customUploadCoverUrls;
    public InteractStickerInfo interactStickerInfo;
    public final PhotoEditInfo$PoiExtraInfo poiExtraInfo;
    public RelatedHotspot relatedHotspot;
    public ShareBusinessLinkInfo shareBusinessLinkInfo;
    public ShareLivePredictionConfig shareLivePredictionConfig;

    public void PhotoEditInfo(PhotoEditInfo$EditCoverInfo p0,InteractStickerInfo p1,PhotoEditInfo$PoiExtraInfo p2,ShareBusinessLinkInfo p3,ShareLivePredictionConfig p4,List p5,RelatedHotspot p6){
       super();
       this.clientEditCoverInfo = p0;
       this.interactStickerInfo = p1;
       this.poiExtraInfo = p2;
       this.shareBusinessLinkInfo = p3;
       this.shareLivePredictionConfig = p4;
       this.customUploadCoverUrls = p5;
       this.relatedHotspot = p6;
    }
    public void PhotoEditInfo(PhotoEditInfo$EditCoverInfo p0,InteractStickerInfo p1,PhotoEditInfo$PoiExtraInfo p2,ShareBusinessLinkInfo p3,ShareLivePredictionConfig p4,List p5,RelatedHotspot p6,int p7,u p8){
       PhotoEditInfo$PoiExtraInfo poiExtraInfo = (p7 & 0x04)? null: p2;
       ShareBusinessLinkInfo shareBusines = (p7 & 0x08)? null: p3;
       ShareLivePredictionConfig shareLivePre = (p7 & 0x10)? null: p4;
       List list = (p7 & 0x20)? null: p5;
       RelatedHotspot relatedHotsp = (p7 & 0x40)? null: p6;
       super(p0, p1, poiExtraInfo, shareBusines, shareLivePre, list, relatedHotsp);
       return;
    }
    public final PhotoEditInfo$EditCoverInfo getClientEditCoverInfo(){
       return this.clientEditCoverInfo;
    }
    public final List getCustomUploadCoverUrls(){
       return this.customUploadCoverUrls;
    }
    public final InteractStickerInfo getInteractStickerInfo(){
       return this.interactStickerInfo;
    }
    public final PhotoEditInfo$PoiExtraInfo getPoiExtraInfo(){
       return this.poiExtraInfo;
    }
    public final RelatedHotspot getRelatedHotspot(){
       return this.relatedHotspot;
    }
    public final ShareBusinessLinkInfo getShareBusinessLinkInfo(){
       return this.shareBusinessLinkInfo;
    }
    public final ShareLivePredictionConfig getShareLivePredictionConfig(){
       return this.shareLivePredictionConfig;
    }
    public final void setCustomUploadCoverUrls(List p0){
       this.customUploadCoverUrls = p0;
    }
    public final void setInteractStickerInfo(InteractStickerInfo p0){
       this.interactStickerInfo = p0;
    }
    public final void setRelatedHotspot(RelatedHotspot p0){
       this.relatedHotspot = p0;
    }
    public final void setShareBusinessLinkInfo(ShareBusinessLinkInfo p0){
       this.shareBusinessLinkInfo = p0;
    }
    public final void setShareLivePredictionConfig(ShareLivePredictionConfig p0){
       this.shareLivePredictionConfig = p0;
    }
}
