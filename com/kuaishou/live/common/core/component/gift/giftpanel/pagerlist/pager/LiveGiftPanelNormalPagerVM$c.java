package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$c;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveGiftPanelNormalPagerVM$c	// class@0012f5
{
    public final Integer a;
    public final boolean b;

    public void LiveGiftPanelNormalPagerVM$c(Integer p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Integer a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftPanelNormalPagerVM$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveGiftPanelNormalPagerVM$c && (a.g(this.a, p0.a) && this.b == p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveGiftPanelNormalPagerVM$c obj = PatchProxy.apply(null, this, LiveGiftPanelNormalPagerVM$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       LiveGiftPanelNormalPagerVM$c tb = this.b;
       if (tb != null) {
          tb = 1;
       }
       return (i + tb);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveGiftPanelNormalPagerVM$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SelectGiftScrollState\(position="+this.a+", smoothScroll="+this.b+"\)";
    }
}
