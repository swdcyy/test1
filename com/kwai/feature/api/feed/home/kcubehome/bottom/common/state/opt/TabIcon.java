package com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.TabIcon;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TabIcon	// class@000f0b
{
    public final List selectedTabIconUrls;
    public final List unselectedTabIconUrls;

    public final List a(){
       return this.selectedTabIconUrls;
    }
    public final List b(){
       return this.unselectedTabIconUrls;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TabIcon.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TabIcon && (a.g(this.selectedTabIconUrls, p0.selectedTabIconUrls) && a.g(this.unselectedTabIconUrls, p0.unselectedTabIconUrls)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TabIcon obj = PatchProxy.apply(null, this, TabIcon.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.selectedTabIconUrls;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       TabIcon tunselectedT = this.unselectedTabIconUrls;
       if (tunselectedT != null) {
          i = tunselectedT.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TabIcon.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TabIcon\(selectedTabIconUrls="+this.selectedTabIconUrls+", unselectedTabIconUrls="+this.unselectedTabIconUrls+"\)";
    }
}
