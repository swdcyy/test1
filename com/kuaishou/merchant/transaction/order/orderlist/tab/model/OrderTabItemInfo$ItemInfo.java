package com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderTabItemInfo$ItemInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Arrays;
import ue4.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import z1.d;
import java.lang.Number;
import java.lang.Long;

public class OrderTabItemInfo$ItemInfo implements Serializable	// class@0008dc
{
    public DistributionSeller mDistributionSeller;
    public long mDistributorId;
    public OrderTabItemInfo$ItemStatusInfo mExtraDesc;
    public OrderTabItemInfo$HeadPictureLabel mHeadPictureLabel;
    public List mItemDesc;
    public long mItemId;
    public String mItemPicUrl;
    public OrderTabItemInfo$ItemStatusInfo mItemStatusInfo;
    public String mItemTitle;
    public JsonObject mLogs;
    public String mNum;
    public long mOid;
    public long mPrice;
    public OrderRecommendDist mRecommendDist;
    public Commodity$IconLabel[] mShowIconListV2;
    public OrderTabItemInfo$ItemTalentInfo mTalentInfo;
    public static final long serialVersionUID = 0x40a43c3f3af3b0a5;

    public void OrderTabItemInfo$ItemInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OrderTabItemInfo$ItemInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mPrice - p0.mPrice || (this.mOid - p0.mOid || (!Arrays.equals(this.mShowIconListV2, p0.mShowIconListV2) || (!f.a(this.mItemPicUrl, p0.mItemPicUrl) || (!TextUtils.equals(this.mItemTitle, p0.mItemTitle) || (!d.a(this.mItemDesc, p0.mItemDesc) || !TextUtils.equals(this.mNum, p0.mNum))))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, OrderTabItemInfo$ItemInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mItemPicUrl,this.mItemTitle,this.mItemDesc,Long.valueOf(this.mPrice),this.mNum,this.mItemStatusInfo,this.mExtraDesc,Long.valueOf(this.mOid)};
       return ((d.b(obj) * 31) + Arrays.hashCode(this.mShowIconListV2));
    }
}
