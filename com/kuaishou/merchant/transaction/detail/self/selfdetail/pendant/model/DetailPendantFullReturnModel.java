package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantFullReturnModel;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.BaseDetailPendantItemModel;
import java.util.List;
import java.lang.String;

public final class DetailPendantFullReturnModel extends BaseDetailPendantItemModel	// class@000748
{
    public final List bottomImgCdnUrl;
    public final String bottomImgUrl;
    public final float progress;

    public void DetailPendantFullReturnModel(){
       super();
       this.bottomImgUrl = "";
    }
    public final List getBottomImgCdnUrl(){
       return this.bottomImgCdnUrl;
    }
    public final String getBottomImgUrl(){
       return this.bottomImgUrl;
    }
    public final float getProgress(){
       return this.progress;
    }
}
