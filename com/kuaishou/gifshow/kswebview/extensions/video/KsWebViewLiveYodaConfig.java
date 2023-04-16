package com.kuaishou.gifshow.kswebview.extensions.video.KsWebViewLiveYodaConfig;
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

public final class KsWebViewLiveYodaConfig	// class@0019ec
{
    public final boolean forceUseMinResolution;
    public final String pageUrl;

    public void KsWebViewLiveYodaConfig(){
       super(false, null, 3, null);
    }
    public void KsWebViewLiveYodaConfig(boolean p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = false;
       }
       p1 = (p2 & 0x02)? "": null;
       a.p(p1, "pageUrl");
       super();
       this.forceUseMinResolution = p0;
       this.pageUrl = p1;
       return;
    }
    public final String a(){
       return this.pageUrl;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsWebViewLiveYodaConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KsWebViewLiveYodaConfig && (this.forceUseMinResolution == p0.forceUseMinResolution && a.g(this.pageUrl, p0.pageUrl)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       KsWebViewLiveYodaConfig obj = PatchProxy.apply(null, this, KsWebViewLiveYodaConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.forceUseMinResolution;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       KsWebViewLiveYodaConfig tpageUrl = this.pageUrl;
       int i1 = (tpageUrl != null)? tpageUrl.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KsWebViewLiveYodaConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsWebViewLiveYodaConfig\(forceUseMinResolution="+this.forceUseMinResolution+", pageUrl="+this.pageUrl+"\)";
    }
}
