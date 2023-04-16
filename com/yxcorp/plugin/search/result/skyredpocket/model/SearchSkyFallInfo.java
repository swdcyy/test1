package com.yxcorp.plugin.search.result.skyredpocket.model.SearchSkyFallInfo;
import java.io.Serializable;
import java.lang.Object;

public class SearchSkyFallInfo implements Serializable	// class@002337
{
    public String mCouponId;
    public boolean mIsActivity;
    public SearchPopUpStyleInfo mPopUpStyleInfo;
    public SearchReceiveSkyFallModel mReceiveSkyFallModel;

    public void SearchSkyFallInfo(){
       super();
       this.mCouponId = "";
    }
}
