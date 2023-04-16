package com.kuaishou.webkit.adapter.WebChromeClientAdapter$JsResultReceiver;
import com.kuaishou.webkit.JsResult$ResultReceiver;
import com.kuaishou.webkit.adapter.WebChromeClientAdapter;
import android.webkit.JsResult;
import java.lang.Object;
import com.kuaishou.webkit.JsResult;

public class WebChromeClientAdapter$JsResultReceiver implements JsResult$ResultReceiver	// class@0012b9
{
    public JsResult mStub;
    public final WebChromeClientAdapter this$0;

    public void WebChromeClientAdapter$JsResultReceiver(WebChromeClientAdapter p0,JsResult p1){
       this.this$0 = p0;
       super();
       this.mStub = p1;
    }
    public void onJsResultComplete(JsResult p0){
       if (p0.getResult()) {
          this.mStub.confirm();
       }else {
          this.mStub.cancel();
       }
       return;
    }
}
