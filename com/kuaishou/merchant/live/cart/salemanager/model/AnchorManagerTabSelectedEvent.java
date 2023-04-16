package com.kuaishou.merchant.live.cart.salemanager.model.AnchorManagerTabSelectedEvent;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.cart.salemanager.model.TabBarInfo$TabInfo;

public class AnchorManagerTabSelectedEvent implements Serializable	// class@0019e4
{
    public boolean mNeedMore;
    public TabBarInfo$TabInfo mTabInfo;
    public static final long serialVersionUID = 0x9d78587da93eac7c;

    public void AnchorManagerTabSelectedEvent(){
       super();
    }
    public static AnchorManagerTabSelectedEvent create(AnchorManagerTabSelectedEvent p0){
       AnchorManagerTabSelectedEvent obj = PatchProxy.applyOneRefs(p0, null, AnchorManagerTabSelectedEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AnchorManagerTabSelectedEvent();
       obj.mNeedMore = p0.mNeedMore;
       TabBarInfo$TabInfo tabInfo = new TabBarInfo$TabInfo();
       p0 = p0.mTabInfo;
       if (p0 != null) {
          tabInfo.mTabTitle = p0.mTabTitle;
          tabInfo.mCommodityGroupId = p0.mCommodityGroupId;
          tabInfo.mAutoSelected = p0.mAutoSelected;
       }
       obj.mTabInfo = tabInfo;
       return obj;
    }
}
