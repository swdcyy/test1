package com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.ThemeConfig;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ThemeConfig	// class@000f0d
{
    public final String bottomActionBarBgGravity;
    public final List bottomActionBarBgUrls;
    public final String bottomActionBarColor;
    public final String bottomActionBarDotFillColor;
    public final List cameraIconUrls;
    public final String dividerColor;
    public final String navigationBarColor;
    public final String selectedTextColor;
    public final List tabViewInfos;
    public final String unselectedTextColor;

    public final List a(){
       return this.bottomActionBarBgUrls;
    }
    public final String b(){
       return this.bottomActionBarColor;
    }
    public final List c(){
       return this.cameraIconUrls;
    }
    public final String d(){
       return this.navigationBarColor;
    }
    public final List e(){
       return this.tabViewInfos;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ThemeConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ThemeConfig && (a.g(this.bottomActionBarBgGravity, p0.bottomActionBarBgGravity) && (a.g(this.bottomActionBarBgUrls, p0.bottomActionBarBgUrls) && (a.g(this.bottomActionBarColor, p0.bottomActionBarColor) && (a.g(this.bottomActionBarDotFillColor, p0.bottomActionBarDotFillColor) && (a.g(this.navigationBarColor, p0.navigationBarColor) && (a.g(this.cameraIconUrls, p0.cameraIconUrls) && (a.g(this.selectedTextColor, p0.selectedTextColor) && (a.g(this.tabViewInfos, p0.tabViewInfos) && (a.g(this.unselectedTextColor, p0.unselectedTextColor) && a.g(this.dividerColor, p0.dividerColor)))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       ThemeConfig obj = PatchProxy.apply(null, this, ThemeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.bottomActionBarBgGravity;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ThemeConfig tbottomActio = this.bottomActionBarBgUrls;
       int i2 = (tbottomActio != null)? tbottomActio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbottomActio = this.bottomActionBarColor;
       i2 = (tbottomActio != null)? tbottomActio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbottomActio = this.bottomActionBarDotFillColor;
       i2 = (tbottomActio != null)? tbottomActio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbottomActio = this.navigationBarColor;
       i2 = (tbottomActio != null)? tbottomActio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbottomActio = this.cameraIconUrls;
       i2 = (tbottomActio != null)? tbottomActio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbottomActio = this.selectedTextColor;
       i2 = (tbottomActio != null)? tbottomActio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbottomActio = this.tabViewInfos;
       i2 = (tbottomActio != null)? tbottomActio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbottomActio = this.unselectedTextColor;
       i2 = (tbottomActio != null)? tbottomActio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbottomActio = this.dividerColor;
       if (tbottomActio != null) {
          i = tbottomActio.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ThemeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ThemeConfig\(bottomActionBarBgGravity="+this.bottomActionBarBgGravity+", bottomActionBarBgUrls="+this.bottomActionBarBgUrls+", bottomActionBarColor="+this.bottomActionBarColor+", bottomActionBarDotFillColor="+this.bottomActionBarDotFillColor+", navigationBarColor="+this.navigationBarColor+", cameraIconUrls="+this.cameraIconUrls+", selectedTextColor="+this.selectedTextColor+", tabViewInfos="+this.tabViewInfos+", unselectedTextColor="+this.unselectedTextColor+", dividerColor="+this.dividerColor+"\)";
    }
}
