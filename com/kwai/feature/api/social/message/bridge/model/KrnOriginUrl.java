package com.kwai.feature.api.social.message.bridge.model.KrnOriginUrl;
import java.io.Serializable;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KrnOriginUrl implements Serializable	// class@00113e
{
    public final String url;

    public void KrnOriginUrl(){
       super(null, 1, null);
    }
    public void KrnOriginUrl(String p0){
       a.p(p0, "url");
       super();
       this.url = p0;
    }
    public void KrnOriginUrl(String p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = "";
       }
       super(p0);
       return;
    }
    public static KrnOriginUrl copy$default(KrnOriginUrl p0,String p1,int p2,Object p3){
       KrnOriginUrl url;
       if (p2 & 0x01) {
          url = p0.url;
       }
       return p0.copy(url);
    }
    public final String component1(){
       return this.url;
    }
    public final KrnOriginUrl copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnOriginUrl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "url");
       return new KrnOriginUrl(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnOriginUrl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KrnOriginUrl && a.g(this.url, p0.url))) {
          return true;
       }
       return false;
    }
    public final String getUrl(){
       return this.url;
    }
    public int hashCode(){
       KrnOriginUrl obj = PatchProxy.apply(null, this, KrnOriginUrl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.url;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KrnOriginUrl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KrnOriginUrl\(url="+this.url+"\)";
    }
}
