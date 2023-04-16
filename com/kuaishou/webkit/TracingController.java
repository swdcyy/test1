package com.kuaishou.webkit.TracingController;
import java.lang.Object;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import java.lang.String;
import com.kuaishou.webkit.adapter.SystemApiVersionChecker;
import android.webkit.TracingController;
import com.kuaishou.webkit.adapter.TracingControllerAdapter;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import com.kuaishou.webkit.TracingConfig;
import java.io.OutputStream;
import java.util.concurrent.Executor;

public abstract class TracingController	// class@001261
{

    public void TracingController(){
       super();
    }
    public static TracingController getInstance(){
       if (!KsWebViewUtils.useSysWebView()) {
          return WebViewFactory.getProvider().getTracingController();
       }
       if (SystemApiVersionChecker.check(28, "TracingController", "getInstance\(\)")) {
          return TracingControllerAdapter.getInstance(TracingController.getInstance());
       }
       return null;
    }
    public abstract boolean isTracing();
    public abstract void start(TracingConfig p0);
    public abstract boolean stop(OutputStream p0,Executor p1);
}
