package com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveGiftGroupItemViewData;
import java.util.List;
import java.util.Collections;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveGiftGroupItemViewData	// class@001315
{
    public final String desc;
    public final List iconUrls;
    public final String title;

    public void LiveGiftGroupItemViewData(){
       super();
       this.title = "";
       this.desc = "";
       this.iconUrls = Collections.emptyList();
    }
    public final String a(){
       return this.title;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftGroupItemViewData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveGiftGroupItemViewData && (a.g(this.title, p0.title) && (a.g(this.desc, p0.desc) && a.g(this.iconUrls, p0.iconUrls))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveGiftGroupItemViewData obj = PatchProxy.apply(null, this, LiveGiftGroupItemViewData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveGiftGroupItemViewData tdesc = this.desc;
       int i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.iconUrls;
       if (tdesc != null) {
          i = tdesc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveGiftGroupItemViewData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftGroupItemViewData\(title="+this.title+", desc="+this.desc+", iconUrls="+this.iconUrls+"\)";
    }
}
