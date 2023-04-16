package com.kuaishou.webkit.adapter.ServiceWorkerControllerAdapter;
import com.kuaishou.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerController;
import com.kuaishou.webkit.ServiceWorkerWebSettings;
import com.kuaishou.webkit.adapter.ServiceWorkerWebSettingsAdapter;
import android.webkit.ServiceWorkerWebSettings;
import com.kuaishou.webkit.ServiceWorkerClient;
import com.kuaishou.webkit.adapter.ServiceWorkerClientAdapter;
import android.webkit.ServiceWorkerClient;

public class ServiceWorkerControllerAdapter extends ServiceWorkerController	// class@0012ae
{
    public ServiceWorkerController mStub;

    public void ServiceWorkerControllerAdapter(ServiceWorkerController p0){
       super();
       this.mStub = p0;
    }
    public static ServiceWorkerControllerAdapter getInstance(ServiceWorkerController p0){
       ServiceWorkerControllerAdapter serviceWorke = (p0 != null)? new ServiceWorkerControllerAdapter(p0): null;
       return serviceWorke;
    }
    public ServiceWorkerWebSettings getServiceWorkerWebSettings(){
       return new ServiceWorkerWebSettingsAdapter(this.mStub.getServiceWorkerWebSettings());
    }
    public void setServiceWorkerClient(ServiceWorkerClient p0){
       ServiceWorkerControllerAdapter tmStub = this.mStub;
       ServiceWorkerClientAdapter serviceWorke = (p0 != null)? new ServiceWorkerClientAdapter(p0): null;
       tmStub.setServiceWorkerClient(serviceWorke);
       return;
    }
}
