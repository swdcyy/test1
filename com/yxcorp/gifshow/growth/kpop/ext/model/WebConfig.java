package com.yxcorp.gifshow.growth.kpop.ext.model.WebConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kpop.ext.model.WebConfig$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class WebConfig implements Serializable	// class@001413
{
    public final String webUrl;
    public static final WebConfig$a Companion;
    public static final long serialVersionUID;

    static {
       WebConfig.Companion = new WebConfig$a(null);
    }
    public void WebConfig(){
       super(null, 1, null);
    }
    public void WebConfig(String p0){
       a.p(p0, "webUrl");
       super();
       this.webUrl = p0;
    }
    public void WebConfig(String p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = "";
       }
       super(p0);
       return;
    }
    public static WebConfig copy$default(WebConfig p0,String p1,int p2,Object p3){
       WebConfig webUrl;
       if (p2 & 0x01) {
          webUrl = p0.webUrl;
       }
       return p0.copy(webUrl);
    }
    public final String component1(){
       return this.webUrl;
    }
    public final WebConfig copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WebConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "webUrl");
       return new WebConfig(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WebConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof WebConfig && a.g(this.webUrl, p0.webUrl))) {
          return true;
       }
       return false;
    }
    public final String getWebUrl(){
       return this.webUrl;
    }
    public int hashCode(){
       WebConfig obj = PatchProxy.apply(null, this, WebConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.webUrl;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, WebConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "WebConfig\(webUrl="+this.webUrl+"\)";
    }
}
