package com.kuaishou.webkit.WebView$1;
import android.webkit.WebView$FindListener;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebView$FindListener;
import java.lang.Object;

public class WebView$1 implements WebView$FindListener	// class@00127f
{
    public final WebView this$0;
    public final WebView$FindListener val$listener_inner;

    public void WebView$1(WebView p0,WebView$FindListener p1){
       this.this$0 = p0;
       this.val$listener_inner = p1;
       super();
    }
    public void onFindResultReceived(int p0,int p1,boolean p2){
       this.val$listener_inner.onFindResultReceived(p0, p1, p2);
    }
}
