package com.kuaishou.tuna_core.webview.config.CommercialDownloadInterceptModel;
import com.yxcorp.gifshow.tuna.webview.config.IPolicyDataModel;
import java.lang.Object;

public final class CommercialDownloadInterceptModel implements IPolicyDataModel	// class@001134
{
    public boolean mAllowDownload;

    public void CommercialDownloadInterceptModel(boolean p0){
       super();
       this.mAllowDownload = p0;
    }
    public final boolean getMAllowDownload(){
       return this.mAllowDownload;
    }
    public final void setMAllowDownload(boolean p0){
       this.mAllowDownload = p0;
    }
}
