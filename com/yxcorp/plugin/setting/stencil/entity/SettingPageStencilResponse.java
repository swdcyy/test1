package com.yxcorp.plugin.setting.stencil.entity.SettingPageStencilResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.settings.stencil.entity.SettingPageStencil;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SettingPageStencilResponse implements Serializable	// class@000904
{
    public final SettingPageStencil pageStencil;

    public void SettingPageStencilResponse(SettingPageStencil p0){
       super();
       this.pageStencil = p0;
    }
    public static SettingPageStencilResponse copy$default(SettingPageStencilResponse p0,SettingPageStencil p1,int p2,Object p3){
       SettingPageStencilResponse pageStencil;
       if (p2 & 0x01) {
          pageStencil = p0.pageStencil;
       }
       return p0.copy(pageStencil);
    }
    public final SettingPageStencil component1(){
       return this.pageStencil;
    }
    public final SettingPageStencilResponse copy(SettingPageStencil p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SettingPageStencilResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SettingPageStencilResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SettingPageStencilResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SettingPageStencilResponse && a.g(this.pageStencil, p0.pageStencil))) {
          return true;
       }
       return false;
    }
    public final SettingPageStencil getPageStencil(){
       return this.pageStencil;
    }
    public int hashCode(){
       SettingPageStencilResponse obj = PatchProxy.apply(null, this, SettingPageStencilResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.pageStencil;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SettingPageStencilResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SettingPageStencilResponse\(pageStencil="+this.pageStencil+"\)";
    }
}
