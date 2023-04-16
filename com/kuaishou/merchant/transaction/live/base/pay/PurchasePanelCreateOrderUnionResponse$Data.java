package com.kuaishou.merchant.transaction.live.base.pay.PurchasePanelCreateOrderUnionResponse$Data;
import java.io.Serializable;
import java.lang.Object;

public class PurchasePanelCreateOrderUnionResponse$Data implements Serializable	// class@000788
{
    public PurchasePanelCreateOrderUnionResponse$ErrorInfo mErrorInfo;
    public boolean mNeedCallPaySdk;
    public boolean mNeedJumpLandingPage;
    public PurchasePanelCreateOrderUnionResponse$CreateOrderUnionData mOrderData;
    public String mOrderDetailLink;
    public int mPayFlowControl;
    public String mPayLandingPageLink;
    public PrepayData mPrepayData;
    public String mUnpaidSimplifyHalfUrl;
    public static final long serialVersionUID = 0xc2470fe9c8829311;

    public void PurchasePanelCreateOrderUnionResponse$Data(){
       super();
       this.mPayFlowControl = 1;
    }
}
