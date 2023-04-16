package my7.f;
import hy7.q;
import mz7.a;
import com.kwai.yoda.model.LaunchModel;
import my7.f$a;
import my7.i;
import com.kuaishou.webkit.WebChromeClient;
import com.kuaishou.webkit.WebViewClient;

public interface abstract f	// class@0026ad
{

    q createPolicyChecker();
    a getContainerSession();
    LaunchModel getLaunchModel();
    f$a getLifeCycler();
    i getManagerProvider();
    int getStatusBarHeight();
    int getTitleBarHeight();
    WebChromeClient getWebChromeClient();
    WebViewClient getWebViewClient();
    boolean onCreate();
    void onDestroy();
    void onPause();
    void onResume();
    void onStart();
    void onStop();
}
