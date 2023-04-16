package com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptIndexModel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Long;
import zsd.r;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class NasaLaunchOptIndexModel	// class@000f9c
{
    public String aid;
    public String cid;
    public long createTimestamp;
    public boolean isPrefetch;
    public String photoId;

    public void NasaLaunchOptIndexModel(){
       super();
    }
    public final String getAid(){
       return this.aid;
    }
    public final String getCid(){
       return this.cid;
    }
    public final long getCreateTimestamp(){
       return this.createTimestamp;
    }
    public final String getPhotoId(){
       return this.photoId;
    }
    public final boolean isPrefetch(){
       return this.isPrefetch;
    }
    public final void setAid(String p0){
       this.aid = p0;
    }
    public final void setCid(String p0){
       this.cid = p0;
    }
    public final void setCreateTimestamp(long p0){
       this.createTimestamp = p0;
    }
    public final void setPhotoId(String p0){
       this.photoId = p0;
    }
    public final void setPrefetch(boolean p0){
       this.isPrefetch = p0;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, NasaLaunchOptIndexModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "photoId:";
       NasaLaunchOptIndexModel tphotoId = this.photoId;
       if (tphotoId == null) {
          tphotoId = "";
       }
       obj = obj+tphotoId+", ";
       Object[] objArray = new Object[]{"createTimestamp:",Long.valueOf(this.createTimestamp)};
       r.i0(obj, objArray);
       obj = obj+", ";
       objArray = new Object[]{"isPrefetch:",Boolean.valueOf(this.isPrefetch)};
       r.i0(obj, objArray);
       obj = obj+", ";
       String[] stringArray = new String[]{"aid:",this.aid};
       r.j0(obj, stringArray);
       obj = obj+", ";
       String[] stringArray1 = new String[]{"cid:",this.cid};
       r.j0(obj, stringArray1);
       obj = obj;
       a.o(obj, "builder.toString\(\)");
       return obj;
    }
}
