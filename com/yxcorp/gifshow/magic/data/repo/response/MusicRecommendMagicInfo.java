package com.yxcorp.gifshow.magic.data.repo.response.MusicRecommendMagicInfo;
import java.io.Serializable;
import java.lang.Integer;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class MusicRecommendMagicInfo implements Serializable	// class@001b9b
{
    public final CDNUrl[] iconUrls;
    public final Integer magicFaceId;
    public final String name;

    public void MusicRecommendMagicInfo(Integer p0,CDNUrl[] p1,String p2){
       super();
       this.magicFaceId = p0;
       this.iconUrls = p1;
       this.name = p2;
    }
    public static MusicRecommendMagicInfo copy$default(MusicRecommendMagicInfo p0,Integer p1,CDNUrl[] p2,String p3,int p4,Object p5){
       MusicRecommendMagicInfo magicFaceId;
       MusicRecommendMagicInfo iconUrls;
       MusicRecommendMagicInfo name;
       if (p4 & 0x01) {
          magicFaceId = p0.magicFaceId;
       }
       if (p4 & 0x02) {
          iconUrls = p0.iconUrls;
       }
       if (p4 & 0x04) {
          name = p0.name;
       }
       return p0.copy(magicFaceId, iconUrls, name);
    }
    public final Integer component1(){
       return this.magicFaceId;
    }
    public final CDNUrl[] component2(){
       return this.iconUrls;
    }
    public final String component3(){
       return this.name;
    }
    public final MusicRecommendMagicInfo copy(Integer p0,CDNUrl[] p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicRecommendMagicInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MusicRecommendMagicInfo(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicRecommendMagicInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MusicRecommendMagicInfo && (a.g(this.magicFaceId, p0.magicFaceId) && (a.g(this.iconUrls, p0.iconUrls) && a.g(this.name, p0.name))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       MusicRecommendMagicInfo obj = PatchProxy.apply(null, this, MusicRecommendMagicInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.magicFaceId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MusicRecommendMagicInfo ticonUrls = this.iconUrls;
       int i2 = (ticonUrls != null)? Arrays.hashCode(ticonUrls): 0;
       i1 = (i1 + i2) * 31;
       ticonUrls = this.name;
       if (ticonUrls != null) {
          i = ticonUrls.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MusicRecommendMagicInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MusicRecommendMagicInfo\(magicFaceId="+this.magicFaceId+", iconUrls="+Arrays.toString(this.iconUrls)+", name="+this.name+"\)";
    }
}
