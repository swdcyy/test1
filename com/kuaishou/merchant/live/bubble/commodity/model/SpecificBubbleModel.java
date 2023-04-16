package com.kuaishou.merchant.live.bubble.commodity.model.SpecificBubbleModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.kuaishou.merchant.live.bubble.commodity.model.SpecificBubbleModel$SpecificItemInfo;

public class SpecificBubbleModel implements Serializable	// class@0018e4
{
    public List mCommodities;
    public int mDisplayIntervalMillis;
    public String mPopTitle;
    public List mSpecificItemInfos;
    public static final long serialVersionUID = 0x45477e011bdb4738;

    public void SpecificBubbleModel(){
       super();
       this.mCommodities = new ArrayList();
    }
    public List getCommodities(){
       SpecificBubbleModel obj = PatchProxy.apply(null, this, SpecificBubbleModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mCommodities == null) {
          this.mCommodities = new ArrayList();
       }
       this.mCommodities.clear();
       obj = this.mSpecificItemInfos;
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             this.mCommodities.add(iterator.next().correctFormat());
          }
       }
       return this.mCommodities;
    }
}
