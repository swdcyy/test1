package com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import ok.k;
import kotlin.jvm.internal.a;

public class PadCoronaRankingListTabInfo implements Serializable	// class@001246
{
    public int tabId;
    public String tabName;
    public static final PadCoronaRankingListTabInfo$a Companion;
    public static final long serialVersionUID;

    static {
       PadCoronaRankingListTabInfo.Companion = new PadCoronaRankingListTabInfo$a(null);
    }
    public void PadCoronaRankingListTabInfo(){
       super();
       this.tabId = -1;
       this.tabName = "";
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof PadCoronaRankingListTabInfo && p0.tabId == this.tabId)? true: false;
       return b;
    }
    public final int getTabId(){
       return this.tabId;
    }
    public final String getTabName(){
       return this.tabName;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, PadCoronaRankingListTabInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.tabId)};
       return k.b(obj);
    }
    public final void setTabId(int p0){
       this.tabId = p0;
    }
    public final void setTabName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PadCoronaRankingListTabInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.tabName = p0;
       return;
    }
}
