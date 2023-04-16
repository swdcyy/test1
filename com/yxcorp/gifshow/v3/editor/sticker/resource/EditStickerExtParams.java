package com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerExtParams;
import java.io.Serializable;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerExtParams$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public final class EditStickerExtParams implements Serializable	// class@001285
{
    public String featuresJson;
    public int originMaterialId;
    public String relatedClientId;
    public String stickerTag;
    public int stickerType;
    public int stickerVersion;
    public List stickerWebpUrls;
    public static final EditStickerExtParams$a Companion;
    public static final long serialVersionUID;

    static {
       EditStickerExtParams.Companion = new EditStickerExtParams$a(null);
    }
    public void EditStickerExtParams(){
       super();
    }
    public final String getFeaturesJson(){
       return this.featuresJson;
    }
    public final int getOriginMaterialId(){
       return this.originMaterialId;
    }
    public final String getRelatedClientId(){
       return this.relatedClientId;
    }
    public final String getStickerTag(){
       return this.stickerTag;
    }
    public final int getStickerType(){
       return this.stickerType;
    }
    public final int getStickerVersion(){
       return this.stickerVersion;
    }
    public final List getStickerWebpUrls(){
       return this.stickerWebpUrls;
    }
    public final void setFeaturesJson(String p0){
       this.featuresJson = p0;
    }
    public final void setOriginMaterialId(int p0){
       this.originMaterialId = p0;
    }
    public final void setRelatedClientId(String p0){
       this.relatedClientId = p0;
    }
    public final void setStickerTag(String p0){
       this.stickerTag = p0;
    }
    public final void setStickerType(int p0){
       this.stickerType = p0;
    }
    public final void setStickerVersion(int p0){
       this.stickerVersion = p0;
    }
    public final void setStickerWebpUrls(List p0){
       this.stickerWebpUrls = p0;
    }
}
