package com.kuaishou.live.core.show.wishlist.model.DrawInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DrawInfo	// class@0012e1
{
    public final String baseScheme;
    public final String buttonDesc;
    public final String desc;
    public final String iconUrl;
    public final String title;

    public final String a(){
       return this.baseScheme;
    }
    public final String b(){
       return this.buttonDesc;
    }
    public final String c(){
       return this.desc;
    }
    public final String d(){
       return this.iconUrl;
    }
    public final String e(){
       return this.title;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DrawInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DrawInfo && (a.g(this.baseScheme, p0.baseScheme) && (a.g(this.title, p0.title) && (a.g(this.desc, p0.desc) && (a.g(this.buttonDesc, p0.buttonDesc) && a.g(this.iconUrl, p0.iconUrl))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       DrawInfo obj = PatchProxy.apply(null, this, DrawInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.baseScheme;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       DrawInfo ttitle = this.title;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.desc;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.buttonDesc;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.iconUrl;
       if (ttitle != null) {
          i = ttitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DrawInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DrawInfo\(baseScheme="+this.baseScheme+", title="+this.title+", desc="+this.desc+", buttonDesc="+this.buttonDesc+", iconUrl="+this.iconUrl+"\)";
    }
}
