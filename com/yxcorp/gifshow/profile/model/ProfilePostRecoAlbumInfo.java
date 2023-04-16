package com.yxcorp.gifshow.profile.model.ProfilePostRecoAlbumInfo;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProfilePostRecoAlbumInfo implements Serializable	// class@0013ac
{
    public final List albumIds;

    public void ProfilePostRecoAlbumInfo(List p0){
       a.p(p0, "albumIds");
       super();
       this.albumIds = p0;
    }
    public static ProfilePostRecoAlbumInfo copy$default(ProfilePostRecoAlbumInfo p0,List p1,int p2,Object p3){
       ProfilePostRecoAlbumInfo albumIds;
       if (p2 & 0x01) {
          albumIds = p0.albumIds;
       }
       return p0.copy(albumIds);
    }
    public final List component1(){
       return this.albumIds;
    }
    public final ProfilePostRecoAlbumInfo copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfilePostRecoAlbumInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "albumIds");
       return new ProfilePostRecoAlbumInfo(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfilePostRecoAlbumInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProfilePostRecoAlbumInfo && a.g(this.albumIds, p0.albumIds))) {
          return true;
       }
       return false;
    }
    public final List getAlbumIds(){
       return this.albumIds;
    }
    public int hashCode(){
       ProfilePostRecoAlbumInfo obj = PatchProxy.apply(null, this, ProfilePostRecoAlbumInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.albumIds;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfilePostRecoAlbumInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProfilePostRecoAlbumInfo\(albumIds="+this.albumIds+"\)";
    }
}
