package com.alipay.tscenter.biz.rpc.vkeydfp.result.AppListCmdResult;
import com.alipay.tscenter.biz.rpc.vkeydfp.result.AppListResult;

public class AppListCmdResult extends AppListResult	// class@000eba
{
    public boolean needRetry;

    public void AppListCmdResult(){
       this.needRetry = false;
    }
}
