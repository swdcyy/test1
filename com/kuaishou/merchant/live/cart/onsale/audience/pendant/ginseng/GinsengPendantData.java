package com.kuaishou.merchant.live.cart.onsale.audience.pendant.ginseng.GinsengPendantData;
import java.io.Serializable;
import mkd.a;
import com.kuaishou.merchant.live.cart.onsale.audience.pendant.ginseng.GinsengPendantData$a;
import nsd.u;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.live.cart.onsale.audience.pendant.ginseng.GinsengPendantData$b;
import java.util.Map;
import java.util.List;

public final class GinsengPendantData implements Serializable, a	// class@00196b
{
    public String anchorId;
    public long delayMs;
    public long displayMs;
    public String image;
    public String payload;
    public List showTabInfo;
    public Map showTabMap;
    public String title;
    public static final GinsengPendantData$a Companion;
    public static final long serialVersionUID;

    static {
       GinsengPendantData.Companion = new GinsengPendantData$a(null);
    }
    public void GinsengPendantData(){
       super();
       this.delayMs = 500;
       this.title = "";
       this.image = "";
       this.showTabMap = new LinkedHashMap();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, GinsengPendantData.class, "1")) {
          return;
       }
       GinsengPendantData tshowTabInfo = this.showTabInfo;
       if (tshowTabInfo != null) {
          Iterator iterator = tshowTabInfo.iterator();
          while (iterator.hasNext()) {
             GinsengPendantData$b uob = iterator.next();
             this.showTabMap.put(uob.tabInstanceId, uob.tabIndex);
          }
       }
       return;
    }
    public final String getAnchorId(){
       return this.anchorId;
    }
    public final long getDelayMs(){
       return this.delayMs;
    }
    public final long getDisplayMs(){
       return this.displayMs;
    }
    public final String getImage(){
       return this.image;
    }
    public final String getPayload(){
       return this.payload;
    }
    public final List getShowTabInfo(){
       return this.showTabInfo;
    }
    public final Map getShowTabMap(){
       return this.showTabMap;
    }
    public final String getTitle(){
       return this.title;
    }
    public final void setAnchorId(String p0){
       this.anchorId = p0;
    }
    public final void setDelayMs(long p0){
       this.delayMs = p0;
    }
    public final void setDisplayMs(long p0){
       this.displayMs = p0;
    }
    public final void setImage(String p0){
       this.image = p0;
    }
    public final void setPayload(String p0){
       this.payload = p0;
    }
    public final void setShowTabInfo(List p0){
       this.showTabInfo = p0;
    }
    public final void setShowTabMap(Map p0){
       this.showTabMap = p0;
    }
    public final void setTitle(String p0){
       this.title = p0;
    }
}
