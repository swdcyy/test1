package com.kuaishou.webkit.WebView$FindListenerDistributor;
import com.kuaishou.webkit.WebView$FindListener;
import com.kuaishou.webkit.WebView;
import java.lang.Object;
import com.kuaishou.webkit.WebView$1;

public class WebView$FindListenerDistributor implements WebView$FindListener	// class@001286
{
    public WebView$FindListener mFindDialogFindListener;
    public WebView$FindListener mUserFindListener;
    public final WebView this$0;

    public void WebView$FindListenerDistributor(WebView p0){
       this.this$0 = p0;
       super();
    }
    public void WebView$FindListenerDistributor(WebView p0,WebView$1 p1){
       super(p0);
    }
    public void onFindResultReceived(int p0,int p1,boolean p2){
       WebView$FindListenerDistributor tmFindDialog = this.mFindDialogFindListener;
       if (tmFindDialog != null) {
          tmFindDialog.onFindResultReceived(p0, p1, p2);
       }
       tmFindDialog = this.mUserFindListener;
       if (tmFindDialog != null) {
          tmFindDialog.onFindResultReceived(p0, p1, p2);
       }
       return;
    }
}
