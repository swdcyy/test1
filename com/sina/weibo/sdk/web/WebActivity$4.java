package com.sina.weibo.sdk.web.WebActivity$4;
import com.kuaishou.webkit.WebChromeClient;
import com.sina.weibo.sdk.web.WebActivity;
import com.kuaishou.webkit.WebView;
import android.widget.ProgressBar;
import java.lang.String;

public final class WebActivity$4 extends WebChromeClient	// class@000bdb
{
    public final WebActivity au;

    public void WebActivity$4(WebActivity p0){
       this.au = p0;
       super();
    }
    public final void onProgressChanged(WebView p0,int p1){
       super.onProgressChanged(p0, p1);
       WebActivity.e(this.au).setProgress(p1);
       if (p1 == 100) {
          WebActivity.e(this.au).setVisibility(4);
          return;
       }else {
          WebActivity.e(this.au).setVisibility(0);
          return;
       }
    }
    public final void onReceivedTitle(WebView p0,String p1){
       super.onReceivedTitle(p0, p1);
    }
}
