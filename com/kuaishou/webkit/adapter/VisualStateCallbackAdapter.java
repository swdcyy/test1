package com.kuaishou.webkit.adapter.VisualStateCallbackAdapter;
import android.webkit.WebView$VisualStateCallback;
import com.kuaishou.webkit.WebView$VisualStateCallback;

public class VisualStateCallbackAdapter extends WebView$VisualStateCallback	// class@0012b5
{
    public WebView$VisualStateCallback mVisualStateCallback;

    public void VisualStateCallbackAdapter(WebView$VisualStateCallback p0){
       super();
       this.mVisualStateCallback = p0;
    }
    public void onComplete(long p0){
       VisualStateCallbackAdapter tmVisualStat = this.mVisualStateCallback;
       if (tmVisualStat != null) {
          tmVisualStat.onComplete(p0);
       }
       return;
    }
}
