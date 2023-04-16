package com.kuaishou.merchant.home2.skin.model.SkinConfig;
import java.io.Serializable;
import com.kuaishou.merchant.home2.skin.model.SkinConfig$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;

public final class SkinConfig implements Serializable	// class@001840
{
    public final int hotWordType;
    public final long materialId;
    public final String superBannerJumpUrl;
    public final int version;
    public static final SkinConfig$a Companion;
    public static final long serialVersionUID;

    static {
       SkinConfig.Companion = new SkinConfig$a(null);
    }
    public void SkinConfig(int p0,String p1,int p2,long p3){
       super();
       this.version = p0;
       this.superBannerJumpUrl = p1;
       this.hotWordType = p2;
       this.materialId = p3;
    }
    public final int getHotWordType(){
       return this.hotWordType;
    }
    public final long getMaterialId(){
       return this.materialId;
    }
    public final String getSuperBannerJumpUrl(){
       return this.superBannerJumpUrl;
    }
    public final int getVersion(){
       return this.version;
    }
}
