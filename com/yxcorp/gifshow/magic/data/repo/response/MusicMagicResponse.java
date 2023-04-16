package com.yxcorp.gifshow.magic.data.repo.response.MusicMagicResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.magic.data.repo.response.MusicRecommendMagicInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MusicMagicResponse implements Serializable	// class@001b9a
{
    public final MusicRecommendMagicInfo musicRecommendMagicInfo;

    public void MusicMagicResponse(MusicRecommendMagicInfo p0){
       super();
       this.musicRecommendMagicInfo = p0;
    }
    public static MusicMagicResponse copy$default(MusicMagicResponse p0,MusicRecommendMagicInfo p1,int p2,Object p3){
       MusicMagicResponse musicRecomme;
       if (p2 & 0x01) {
          musicRecomme = p0.musicRecommendMagicInfo;
       }
       return p0.copy(musicRecomme);
    }
    public final MusicRecommendMagicInfo component1(){
       return this.musicRecommendMagicInfo;
    }
    public final MusicMagicResponse copy(MusicRecommendMagicInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicMagicResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MusicMagicResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicMagicResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MusicMagicResponse && a.g(this.musicRecommendMagicInfo, p0.musicRecommendMagicInfo))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       MusicMagicResponse obj = PatchProxy.apply(null, this, MusicMagicResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.musicRecommendMagicInfo;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MusicMagicResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MusicMagicResponse\(musicRecommendMagicInfo="+this.musicRecommendMagicInfo+"\)";
    }
}
