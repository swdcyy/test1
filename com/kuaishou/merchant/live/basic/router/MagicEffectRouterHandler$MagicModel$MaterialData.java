package com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$MagicModel$MaterialData;
import java.io.Serializable;
import com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$MagicModel$MaterialData$a;
import nsd.u;
import java.lang.Object;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.String;

public final class MagicEffectRouterHandler$MagicModel$MaterialData implements Serializable	// class@0018b8
{
    public Boolean displayImmediately;
    public Boolean followFace;
    public String images;
    public String logParams;
    public Long magicFaceId;
    public boolean needCartPos;
    public boolean needUserInfo;
    public String requestJson;
    public static final MagicEffectRouterHandler$MagicModel$MaterialData$a Companion;
    public static final long serialVersionUID;

    static {
       MagicEffectRouterHandler$MagicModel$MaterialData.Companion = new MagicEffectRouterHandler$MagicModel$MaterialData$a(null);
    }
    public void MagicEffectRouterHandler$MagicModel$MaterialData(){
       super();
       this.magicFaceId = Long.valueOf(0);
       Boolean fALSE = Boolean.FALSE;
       this.displayImmediately = fALSE;
       this.followFace = fALSE;
    }
    public final Boolean getDisplayImmediately(){
       return this.displayImmediately;
    }
    public final Boolean getFollowFace(){
       return this.followFace;
    }
    public final String getImages(){
       return this.images;
    }
    public final String getLogParams(){
       return this.logParams;
    }
    public final Long getMagicFaceId(){
       return this.magicFaceId;
    }
    public final boolean getNeedCartPos(){
       return this.needCartPos;
    }
    public final boolean getNeedUserInfo(){
       return this.needUserInfo;
    }
    public final String getRequestJson(){
       return this.requestJson;
    }
    public final void setDisplayImmediately(Boolean p0){
       this.displayImmediately = p0;
    }
    public final void setFollowFace(Boolean p0){
       this.followFace = p0;
    }
    public final void setImages(String p0){
       this.images = p0;
    }
    public final void setLogParams(String p0){
       this.logParams = p0;
    }
    public final void setMagicFaceId(Long p0){
       this.magicFaceId = p0;
    }
    public final void setNeedCartPos(boolean p0){
       this.needCartPos = p0;
    }
    public final void setNeedUserInfo(boolean p0){
       this.needUserInfo = p0;
    }
    public final void setRequestJson(String p0){
       this.requestJson = p0;
    }
}
