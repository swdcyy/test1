package ch1.d;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIGiftPanelTab;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d	// class@0004b7
{
    public final int pagerApiVersion;
    public final String pagerRequestContext;
    public final String tabId;
    public final int tabType;
    public final UIGiftPanelTab ui;

    public void d(){
       super("NormalGift", 0, 0, "", LiveGiftPanelConfig.z.a());
    }
    public void d(String p0,int p1,int p2,String p3,UIGiftPanelTab p4){
       a.p(p0, "tabId");
       a.p(p3, "pagerRequestContext");
       a.p(p4, "ui");
       super();
       this.tabId = p0;
       this.tabType = p1;
       this.pagerApiVersion = p2;
       this.pagerRequestContext = p3;
       this.ui = p4;
    }
    public final String a(){
       return this.tabId;
    }
    public final UIGiftPanelTab b(){
       return this.ui;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (a.g(this.tabId, p0.tabId) && (this.tabType == p0.tabType && (this.pagerApiVersion == p0.pagerApiVersion && (a.g(this.pagerRequestContext, p0.pagerRequestContext) && a.g(this.ui, p0.ui))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.tabId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((i1 * 31) + this.tabType) * 31) + this.pagerApiVersion) * 31;
       d tpagerReques = this.pagerRequestContext;
       int i2 = (tpagerReques != null)? tpagerReques.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tpagerReques = this.ui;
       if (tpagerReques != null) {
          i = tpagerReques.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftTabItemInfo\(tabId="+this.tabId+", tabType="+this.tabType+", pagerApiVersion="+this.pagerApiVersion+", pagerRequestContext="+this.pagerRequestContext+", ui="+this.ui+"\)";
    }
}
