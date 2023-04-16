package fh1.b;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftResponse;
import java.lang.StringBuilder;

public final class b	// class@002337
{
    public List giftPanelItems;
    public String giftToken;
    public UpdatedGiftResponse newGiftInfo;
    public String recoGiftLlsid;

    public void b(){
       ArrayList uArrayList = new ArrayList();
       a.p(uArrayList, "giftPanelItems");
       super();
       this.giftPanelItems = uArrayList;
       this.newGiftInfo = null;
       this.recoGiftLlsid = null;
       this.giftToken = null;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (a.g(this.giftPanelItems, p0.giftPanelItems) && (a.g(this.newGiftInfo, p0.newGiftInfo) && (a.g(this.recoGiftLlsid, p0.recoGiftLlsid) && a.g(this.giftToken, p0.giftToken)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.giftPanelItems;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       b tnewGiftInfo = this.newGiftInfo;
       int i2 = (tnewGiftInfo != null)? tnewGiftInfo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tnewGiftInfo = this.recoGiftLlsid;
       i2 = (tnewGiftInfo != null)? tnewGiftInfo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tnewGiftInfo = this.giftToken;
       if (tnewGiftInfo != null) {
          i = tnewGiftInfo.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftNormalPagerResponse\(giftPanelItems="+this.giftPanelItems+", newGiftInfo="+this.newGiftInfo+", recoGiftLlsid="+this.recoGiftLlsid+", giftToken="+this.giftToken+"\)";
    }
}
