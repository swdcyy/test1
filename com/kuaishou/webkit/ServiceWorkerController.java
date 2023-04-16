package com.kuaishou.webkit.ServiceWorkerController;
import java.lang.Object;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import java.lang.String;
import com.kuaishou.webkit.adapter.SystemApiVersionChecker;
import android.webkit.ServiceWorkerController;
import com.kuaishou.webkit.adapter.ServiceWorkerControllerAdapter;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import com.kuaishou.webkit.ServiceWorkerWebSettings;
import com.kuaishou.webkit.ServiceWorkerClient;

public abstract class ServiceWorkerController	// class@001259
{

    public void ServiceWorkerController(){
       super();
    }
    public static ServiceWorkerController getInstance(){
       if (!KsWebViewUtils.useSysWebView()) {
          return WebViewFactory.getProvider().getServiceWorkerController();
       }
       if (SystemApiVersionChecker.check(24, "ServiceWorkerController", "getInstance\(\)")) {
          return ServiceWorkerControllerAdapter.getInstance(ServiceWorkerController.getInstance());
       }
       return null;
    }
    public abstract ServiceWorkerWebSettings getServiceWorkerWebSettings();
    public abstract void setServiceWorkerClient(ServiceWorkerClient p0);
}
