package com.kuaishou.merchant.home2.dynamic.titlebar.model.SearchSwitcherSkin;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SearchSwitcherSkin	// class@00177c
{
    public final String borderColor;
    public final String contentBgColor;
    public final String hintTextColor;
    public final String searchBtnBgColor;
    public final String searchBtnTextColor;
    public final String searchContainerBgColor;
    public final String skinResource;
    public final int type;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchSwitcherSkin.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SearchSwitcherSkin && (a.g(this.borderColor, p0.borderColor) && (a.g(this.contentBgColor, p0.contentBgColor) && (a.g(this.hintTextColor, p0.hintTextColor) && (a.g(this.searchBtnBgColor, p0.searchBtnBgColor) && (a.g(this.searchBtnTextColor, p0.searchBtnTextColor) && (a.g(this.searchContainerBgColor, p0.searchContainerBgColor) && (this.type == p0.type && a.g(this.skinResource, p0.skinResource)))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       SearchSwitcherSkin obj = PatchProxy.apply(null, this, SearchSwitcherSkin.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.borderColor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SearchSwitcherSkin tcontentBgCo = this.contentBgColor;
       int i2 = (tcontentBgCo != null)? tcontentBgCo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcontentBgCo = this.hintTextColor;
       i2 = (tcontentBgCo != null)? tcontentBgCo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcontentBgCo = this.searchBtnBgColor;
       i2 = (tcontentBgCo != null)? tcontentBgCo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcontentBgCo = this.searchBtnTextColor;
       i2 = (tcontentBgCo != null)? tcontentBgCo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcontentBgCo = this.searchContainerBgColor;
       i2 = (tcontentBgCo != null)? tcontentBgCo.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.type) * 31;
       tcontentBgCo = this.skinResource;
       if (tcontentBgCo != null) {
          i = tcontentBgCo.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SearchSwitcherSkin.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SearchSwitcherSkin\(borderColor="+this.borderColor+", contentBgColor="+this.contentBgColor+", hintTextColor="+this.hintTextColor+", searchBtnBgColor="+this.searchBtnBgColor+", searchBtnTextColor="+this.searchBtnTextColor+", searchContainerBgColor="+this.searchContainerBgColor+", type="+this.type+", skinResource="+this.skinResource+"\)";
    }
}
