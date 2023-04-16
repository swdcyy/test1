package com.kuaishou.merchant.live.cart.onsale.audience.model.RealTimeUpdateResponse$TabResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class RealTimeUpdateResponse$TabResponse implements Serializable	// class@001958
{
    public String mContext;
    public String mCursor;
    public int mListUpdateType;
    public PageComponentInfo mPageComponentInfo;
    public String mTabId;
    public int mTabType;
    public LiveShopFrameModel$Toast mToast;
    public List mUltronBizIdList;
    public static final long serialVersionUID = 0xe183081c1be8ac0d;

    public void RealTimeUpdateResponse$TabResponse(){
       super();
       this.mUltronBizIdList = new ArrayList();
    }
}
