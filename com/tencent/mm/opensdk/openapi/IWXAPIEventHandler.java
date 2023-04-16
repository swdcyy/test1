package com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;

public interface abstract IWXAPIEventHandler	// class@000f18
{

    void onReq(BaseReq p0);
    void onResp(BaseResp p0);
}
