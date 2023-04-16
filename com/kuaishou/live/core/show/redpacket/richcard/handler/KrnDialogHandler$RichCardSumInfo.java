package com.kuaishou.live.core.show.redpacket.richcard.handler.KrnDialogHandler$RichCardSumInfo;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.handler.KrnDialogHandler$RichCardSumInfo$a;
import nsd.u;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.richcard.http.ItemInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class KrnDialogHandler$RichCardSumInfo implements Serializable	// class@000f79
{
    public final String remainCount;
    public final ItemInfo[] richCardItems;
    public static final KrnDialogHandler$RichCardSumInfo$a Companion;
    public static final long serialVersionUID;

    static {
       KrnDialogHandler$RichCardSumInfo.Companion = new KrnDialogHandler$RichCardSumInfo$a(null);
    }
    public void KrnDialogHandler$RichCardSumInfo(String p0,ItemInfo[] p1){
       super();
       this.remainCount = p0;
       this.richCardItems = p1;
    }
    public static KrnDialogHandler$RichCardSumInfo copy$default(KrnDialogHandler$RichCardSumInfo p0,String p1,ItemInfo[] p2,int p3,Object p4){
       KrnDialogHandler$RichCardSumInfo remainCount;
       KrnDialogHandler$RichCardSumInfo richCardItem;
       if (p3 & 0x01) {
          remainCount = p0.remainCount;
       }
       if (p3 & 0x02) {
          richCardItem = p0.richCardItems;
       }
       return p0.copy(remainCount, richCardItem);
    }
    public final String component1(){
       return this.remainCount;
    }
    public final ItemInfo[] component2(){
       return this.richCardItems;
    }
    public final KrnDialogHandler$RichCardSumInfo copy(String p0,ItemInfo[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnDialogHandler$RichCardSumInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KrnDialogHandler$RichCardSumInfo(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnDialogHandler$RichCardSumInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KrnDialogHandler$RichCardSumInfo && (a.g(this.remainCount, p0.remainCount) && a.g(this.richCardItems, p0.richCardItems)))) {
          return true;
       }
       return false;
    }
    public final String getRemainCount(){
       return this.remainCount;
    }
    public final ItemInfo[] getRichCardItems(){
       return this.richCardItems;
    }
    public int hashCode(){
       KrnDialogHandler$RichCardSumInfo obj = PatchProxy.apply(null, this, KrnDialogHandler$RichCardSumInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.remainCount;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KrnDialogHandler$RichCardSumInfo trichCardIte = this.richCardItems;
       if (trichCardIte != null) {
          i = Arrays.hashCode(trichCardIte);
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KrnDialogHandler$RichCardSumInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RichCardSumInfo\(remainCount="+this.remainCount+", richCardItems="+Arrays.toString(this.richCardItems)+"\)";
    }
}
