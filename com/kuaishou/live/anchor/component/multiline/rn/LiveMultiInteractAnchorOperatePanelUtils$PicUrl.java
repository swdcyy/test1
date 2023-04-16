package com.kuaishou.live.anchor.component.multiline.rn.LiveMultiInteractAnchorOperatePanelUtils$PicUrl;
import java.io.Serializable;
import com.kuaishou.live.anchor.component.multiline.rn.LiveMultiInteractAnchorOperatePanelUtils$PicUrl$a;
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

public final class LiveMultiInteractAnchorOperatePanelUtils$PicUrl implements Serializable	// class@000a2f
{
    public String cdn;
    public String url;
    public static final LiveMultiInteractAnchorOperatePanelUtils$PicUrl$a Companion;
    public static final long serialVersionUID;

    static {
       LiveMultiInteractAnchorOperatePanelUtils$PicUrl.Companion = new LiveMultiInteractAnchorOperatePanelUtils$PicUrl$a(null);
    }
    public void LiveMultiInteractAnchorOperatePanelUtils$PicUrl(String p0,String p1){
       a.p(p0, "cdn");
       a.p(p1, "url");
       super();
       this.cdn = p0;
       this.url = p1;
    }
    public static LiveMultiInteractAnchorOperatePanelUtils$PicUrl copy$default(LiveMultiInteractAnchorOperatePanelUtils$PicUrl p0,String p1,String p2,int p3,Object p4){
       LiveMultiInteractAnchorOperatePanelUtils$PicUrl cdn;
       LiveMultiInteractAnchorOperatePanelUtils$PicUrl url;
       if (p3 & 0x01) {
          cdn = p0.cdn;
       }
       if (p3 & 0x02) {
          url = p0.url;
       }
       return p0.copy(cdn, url);
    }
    public final String component1(){
       return this.cdn;
    }
    public final String component2(){
       return this.url;
    }
    public final LiveMultiInteractAnchorOperatePanelUtils$PicUrl copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiInteractAnchorOperatePanelUtils$PicUrl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cdn");
       a.p(p1, "url");
       return new LiveMultiInteractAnchorOperatePanelUtils$PicUrl(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiInteractAnchorOperatePanelUtils$PicUrl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMultiInteractAnchorOperatePanelUtils$PicUrl && (a.g(this.cdn, p0.cdn) && a.g(this.url, p0.url)))) {
          return true;
       }
       return false;
    }
    public final String getCdn(){
       return this.cdn;
    }
    public final String getUrl(){
       return this.url;
    }
    public int hashCode(){
       LiveMultiInteractAnchorOperatePanelUtils$PicUrl obj = PatchProxy.apply(null, this, LiveMultiInteractAnchorOperatePanelUtils$PicUrl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.cdn;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveMultiInteractAnchorOperatePanelUtils$PicUrl turl = this.url;
       if (turl != null) {
          i = turl.hashCode();
       }
       return (i1 + i);
    }
    public final void setCdn(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiInteractAnchorOperatePanelUtils$PicUrl.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.cdn = p0;
       return;
    }
    public final void setUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiInteractAnchorOperatePanelUtils$PicUrl.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.url = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMultiInteractAnchorOperatePanelUtils$PicUrl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PicUrl\(cdn="+this.cdn+", url="+this.url+"\)";
    }
}
