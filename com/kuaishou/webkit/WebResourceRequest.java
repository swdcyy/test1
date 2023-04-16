package com.kuaishou.webkit.WebResourceRequest;
import java.lang.String;
import java.util.Map;
import android.net.Uri;

public interface abstract WebResourceRequest	// class@001270
{

    String getMethod();
    Map getRequestHeaders();
    Uri getUrl();
    boolean hasGesture();
    boolean isForMainFrame();
    boolean isRedirect();
}
