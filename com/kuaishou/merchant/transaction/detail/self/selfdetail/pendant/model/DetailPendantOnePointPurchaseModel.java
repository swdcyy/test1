package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantOnePointPurchaseModel;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.BaseDetailPendantItemModel;
import java.util.List;
import java.lang.String;

public final class DetailPendantOnePointPurchaseModel extends BaseDetailPendantItemModel	// class@000749
{
    public final List mBottomImgCdnUrl;
    public final String mBottomImgUrl;
    public final String mButtonName;
    public final int mState;

    public void DetailPendantOnePointPurchaseModel(){
       super();
    }
    public final List getMBottomImgCdnUrl(){
       return this.mBottomImgCdnUrl;
    }
    public final String getMBottomImgUrl(){
       return this.mBottomImgUrl;
    }
    public final String getMButtonName(){
       return this.mButtonName;
    }
    public final int getMState(){
       return this.mState;
    }
}
