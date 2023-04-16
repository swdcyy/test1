package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.floatingscreen.LiveMerchantCommentTopBarrageData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import android.view.View;

public final class LiveMerchantCommentTopBarrageData extends LiveFloatingScreenBaseData	// class@0016b1
{
    public PendantMountInfo mountInfo;
    public View mountView;

    public void LiveMerchantCommentTopBarrageData(){
       super();
    }
    public final PendantMountInfo getMountInfo(){
       return this.mountInfo;
    }
    public final View getMountView(){
       return this.mountView;
    }
    public final void setMountInfo(PendantMountInfo p0){
       this.mountInfo = p0;
    }
    public final void setMountView(View p0){
       this.mountView = p0;
    }
}
