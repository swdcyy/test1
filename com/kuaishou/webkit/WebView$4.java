package com.kuaishou.webkit.WebView$4;
import android.webkit.WebView$FindListener;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebView$FindListener;
import java.lang.Object;

public class WebView$4 implements WebView$FindListener	// class@001282
{
    public final WebView this$0;
    public final WebView$FindListener val$listener;

    public void WebView$4(WebView p0,WebView$FindListener p1){
       this.this$0 = p0;
       this.val$listener = p1;
       super();
    }
    public void onFindResultReceived(int p0,int p1,boolean p2){
       this.val$listener.onFindResultReceived(p0, p1, p2);
    }
}
