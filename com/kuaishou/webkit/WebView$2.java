package com.kuaishou.webkit.WebView$2;
import android.webkit.DownloadListener;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.DownloadListener;
import java.lang.Object;
import java.lang.String;

public class WebView$2 implements DownloadListener	// class@001280
{
    public final WebView this$0;
    public final DownloadListener val$listener;

    public void WebView$2(WebView p0,DownloadListener p1){
       this.this$0 = p0;
       this.val$listener = p1;
       super();
    }
    public void onDownloadStart(String p0,String p1,String p2,String p3,long p4){
       this.val$listener.onDownloadStart(p0, p1, p2, p3, p4);
    }
}
