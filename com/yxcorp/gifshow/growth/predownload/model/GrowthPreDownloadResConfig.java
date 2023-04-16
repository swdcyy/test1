package com.yxcorp.gifshow.growth.predownload.model.GrowthPreDownloadResConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.predownload.model.GrowthPreDownloadResConfig$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthPreDownloadResConfig implements Serializable	// class@001484
{
    public final List video;
    public static final GrowthPreDownloadResConfig$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthPreDownloadResConfig.Companion = new GrowthPreDownloadResConfig$a(null);
    }
    public void GrowthPreDownloadResConfig(){
       super(null, 1, null);
    }
    public void GrowthPreDownloadResConfig(List p0){
       a.p(p0, "video");
       super();
       this.video = p0;
    }
    public void GrowthPreDownloadResConfig(List p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = CollectionsKt__CollectionsKt.E();
       }
       super(p0);
       return;
    }
    public static GrowthPreDownloadResConfig copy$default(GrowthPreDownloadResConfig p0,List p1,int p2,Object p3){
       GrowthPreDownloadResConfig video;
       if (p2 & 0x01) {
          video = p0.video;
       }
       return p0.copy(video);
    }
    public final List component1(){
       return this.video;
    }
    public final GrowthPreDownloadResConfig copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthPreDownloadResConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "video");
       return new GrowthPreDownloadResConfig(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthPreDownloadResConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthPreDownloadResConfig && a.g(this.video, p0.video))) {
          return true;
       }
       return false;
    }
    public final List getVideo(){
       return this.video;
    }
    public int hashCode(){
       GrowthPreDownloadResConfig obj = PatchProxy.apply(null, this, GrowthPreDownloadResConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.video;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthPreDownloadResConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthPreDownloadResConfig\(video="+this.video+"\)";
    }
}
