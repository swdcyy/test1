package com.kuaishou.webkit.ServiceWorkerWebSettings;
import java.lang.Object;

public abstract class ServiceWorkerWebSettings	// class@00125a
{

    public void ServiceWorkerWebSettings(){
       super();
    }
    public abstract boolean getAllowContentAccess();
    public abstract boolean getAllowFileAccess();
    public abstract boolean getBlockNetworkLoads();
    public abstract int getCacheMode();
    public abstract void setAllowContentAccess(boolean p0);
    public abstract void setAllowFileAccess(boolean p0);
    public abstract void setBlockNetworkLoads(boolean p0);
    public abstract void setCacheMode(int p0);
}
