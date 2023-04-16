package com.kuaishou.growth.pendant.model.PendantClickEventConfig;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.PendantClickEventConfig$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PendantClickEventConfig implements Serializable	// class@00066d
{
    public String clickLinkUrl;
    public int clickType;
    public static final PendantClickEventConfig$a Companion;
    public static final long serialVersionUID;

    static {
       PendantClickEventConfig.Companion = new PendantClickEventConfig$a(null);
    }
    public void PendantClickEventConfig(){
       super(0, null, 3, null);
    }
    public void PendantClickEventConfig(int p0,String p1){
       super();
       this.clickType = p0;
       this.clickLinkUrl = p1;
    }
    public void PendantClickEventConfig(int p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static PendantClickEventConfig copy$default(PendantClickEventConfig p0,int p1,String p2,int p3,Object p4){
       PendantClickEventConfig clickType;
       PendantClickEventConfig clickLinkUrl;
       if (p3 & 0x01) {
          clickType = p0.clickType;
       }
       if (p3 & 0x02) {
          clickLinkUrl = p0.clickLinkUrl;
       }
       return p0.copy(clickType, clickLinkUrl);
    }
    public final int component1(){
       return this.clickType;
    }
    public final String component2(){
       return this.clickLinkUrl;
    }
    public final PendantClickEventConfig copy(int p0,String p1){
       if (PatchProxy.isSupport(PendantClickEventConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, PendantClickEventConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PendantClickEventConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantClickEventConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PendantClickEventConfig && (this.clickType == p0.clickType && a.g(this.clickLinkUrl, p0.clickLinkUrl)))) {
          return true;
       }
       return false;
    }
    public final String getClickLinkUrl(){
       return this.clickLinkUrl;
    }
    public final int getClickType(){
       return this.clickType;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, PendantClickEventConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.clickType * 31;
       PendantClickEventConfig tclickLinkUr = this.clickLinkUrl;
       int i1 = (tclickLinkUr != null)? tclickLinkUr.hashCode(): 0;
       return (i + i1);
    }
    public final void setClickLinkUrl(String p0){
       this.clickLinkUrl = p0;
    }
    public final void setClickType(int p0){
       this.clickType = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PendantClickEventConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PendantClickEventConfig\(clickType="+this.clickType+", clickLinkUrl="+this.clickLinkUrl+"\)";
    }
}
