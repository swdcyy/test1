package com.kuaishou.webkit.adapter.ServiceWorkerWebSettingsAdapter;
import com.kuaishou.webkit.ServiceWorkerWebSettings;
import android.webkit.ServiceWorkerWebSettings;

public class ServiceWorkerWebSettingsAdapter extends ServiceWorkerWebSettings	// class@0012af
{
    public ServiceWorkerWebSettings mStub;

    public void ServiceWorkerWebSettingsAdapter(ServiceWorkerWebSettings p0){
       super();
       this.mStub = p0;
    }
    public boolean getAllowContentAccess(){
       return this.mStub.getAllowContentAccess();
    }
    public boolean getAllowFileAccess(){
       return this.mStub.getAllowFileAccess();
    }
    public boolean getBlockNetworkLoads(){
       return this.mStub.getBlockNetworkLoads();
    }
    public int getCacheMode(){
       return this.mStub.getCacheMode();
    }
    public void setAllowContentAccess(boolean p0){
       this.mStub.setAllowContentAccess(p0);
    }
    public void setAllowFileAccess(boolean p0){
       this.mStub.setAllowFileAccess(p0);
    }
    public void setBlockNetworkLoads(boolean p0){
       this.mStub.setBlockNetworkLoads(p0);
    }
    public void setCacheMode(int p0){
       this.mStub.setCacheMode(p0);
    }
}
