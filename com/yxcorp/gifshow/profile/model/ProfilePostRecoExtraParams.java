package com.yxcorp.gifshow.profile.model.ProfilePostRecoExtraParams;
import java.io.Serializable;
import com.yxcorp.gifshow.profile.model.ProfilePostRecoAlbumInfo;
import com.yxcorp.gifshow.profile.model.ProfilePostRecoPostParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProfilePostRecoExtraParams implements Serializable	// class@0013ad
{
    public final ProfilePostRecoAlbumInfo albumInfo;
    public final ProfilePostRecoPostParams postParams;

    public void ProfilePostRecoExtraParams(ProfilePostRecoAlbumInfo p0,ProfilePostRecoPostParams p1){
       super();
       this.albumInfo = p0;
       this.postParams = p1;
    }
    public static ProfilePostRecoExtraParams copy$default(ProfilePostRecoExtraParams p0,ProfilePostRecoAlbumInfo p1,ProfilePostRecoPostParams p2,int p3,Object p4){
       ProfilePostRecoExtraParams albumInfo;
       ProfilePostRecoExtraParams postParams;
       if (p3 & 0x01) {
          albumInfo = p0.albumInfo;
       }
       if (p3 & 0x02) {
          postParams = p0.postParams;
       }
       return p0.copy(albumInfo, postParams);
    }
    public final ProfilePostRecoAlbumInfo component1(){
       return this.albumInfo;
    }
    public final ProfilePostRecoPostParams component2(){
       return this.postParams;
    }
    public final ProfilePostRecoExtraParams copy(ProfilePostRecoAlbumInfo p0,ProfilePostRecoPostParams p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ProfilePostRecoExtraParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ProfilePostRecoExtraParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfilePostRecoExtraParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProfilePostRecoExtraParams && (a.g(this.albumInfo, p0.albumInfo) && a.g(this.postParams, p0.postParams)))) {
          return true;
       }
       return false;
    }
    public final ProfilePostRecoAlbumInfo getAlbumInfo(){
       return this.albumInfo;
    }
    public final ProfilePostRecoPostParams getPostParams(){
       return this.postParams;
    }
    public int hashCode(){
       ProfilePostRecoExtraParams obj = PatchProxy.apply(null, this, ProfilePostRecoExtraParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.albumInfo;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ProfilePostRecoExtraParams tpostParams = this.postParams;
       if (tpostParams != null) {
          i = tpostParams.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfilePostRecoExtraParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProfilePostRecoExtraParams\(albumInfo="+this.albumInfo+", postParams="+this.postParams+"\)";
    }
}
