package com.kuaishou.merchant.marketing.platform.fullgiving.model.LotteryResultData;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.LotteryResultData$a;
import nsd.u;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.LotteryResult;
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

public final class LotteryResultData implements Serializable	// class@001b2a
{
    public LotteryResult lotteryResult;
    public List widgetItems;
    public static final LotteryResultData$a Companion;
    public static final long serialVersionUID;

    static {
       LotteryResultData.Companion = new LotteryResultData$a(null);
    }
    public void LotteryResultData(LotteryResult p0,List p1){
       super();
       this.lotteryResult = p0;
       this.widgetItems = p1;
    }
    public static LotteryResultData copy$default(LotteryResultData p0,LotteryResult p1,List p2,int p3,Object p4){
       LotteryResultData lotteryResul;
       LotteryResultData widgetItems;
       if (p3 & 0x01) {
          lotteryResul = p0.lotteryResult;
       }
       if (p3 & 0x02) {
          widgetItems = p0.widgetItems;
       }
       return p0.copy(lotteryResul, widgetItems);
    }
    public final LotteryResult component1(){
       return this.lotteryResult;
    }
    public final List component2(){
       return this.widgetItems;
    }
    public final LotteryResultData copy(LotteryResult p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LotteryResultData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LotteryResultData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LotteryResultData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LotteryResultData && (a.g(this.lotteryResult, p0.lotteryResult) && a.g(this.widgetItems, p0.widgetItems)))) {
          return true;
       }
       return false;
    }
    public final LotteryResult getLotteryResult(){
       return this.lotteryResult;
    }
    public final List getWidgetItems(){
       return this.widgetItems;
    }
    public int hashCode(){
       LotteryResultData obj = PatchProxy.apply(null, this, LotteryResultData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.lotteryResult;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LotteryResultData twidgetItems = this.widgetItems;
       if (twidgetItems != null) {
          i = twidgetItems.hashCode();
       }
       return (i1 + i);
    }
    public final void setLotteryResult(LotteryResult p0){
       this.lotteryResult = p0;
    }
    public final void setWidgetItems(List p0){
       this.widgetItems = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LotteryResultData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LotteryResultData\(lotteryResult="+this.lotteryResult+", widgetItems="+this.widgetItems+"\)";
    }
}
