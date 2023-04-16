package com.kwai.feature.api.social.message.bridge.model.UploadGroupAvatarResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UploadGroupAvatarResult implements Serializable	// class@001142
{
    public final String ksUri;
    public final String url;

    public void UploadGroupAvatarResult(String p0,String p1){
       a.p(p0, "ksUri");
       a.p(p1, "url");
       super();
       this.ksUri = p0;
       this.url = p1;
    }
    public static UploadGroupAvatarResult copy$default(UploadGroupAvatarResult p0,String p1,String p2,int p3,Object p4){
       UploadGroupAvatarResult ksUri;
       UploadGroupAvatarResult url;
       if (p3 & 0x01) {
          ksUri = p0.ksUri;
       }
       if (p3 & 0x02) {
          url = p0.url;
       }
       return p0.copy(ksUri, url);
    }
    public final String component1(){
       return this.ksUri;
    }
    public final String component2(){
       return this.url;
    }
    public final UploadGroupAvatarResult copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, UploadGroupAvatarResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "ksUri");
       a.p(p1, "url");
       return new UploadGroupAvatarResult(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UploadGroupAvatarResult.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UploadGroupAvatarResult && (a.g(this.ksUri, p0.ksUri) && a.g(this.url, p0.url)))) {
          return true;
       }
       return false;
    }
    public final String getKsUri(){
       return this.ksUri;
    }
    public final String getUrl(){
       return this.url;
    }
    public int hashCode(){
       UploadGroupAvatarResult obj = PatchProxy.apply(null, this, UploadGroupAvatarResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.ksUri;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       UploadGroupAvatarResult turl = this.url;
       if (turl != null) {
          i = turl.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UploadGroupAvatarResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UploadGroupAvatarResult\(ksUri="+this.ksUri+", url="+this.url+"\)";
    }
}
