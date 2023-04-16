package com.kuaishou.webkit.adapter.WebChromeClientAdapter$JsPromptResultReceiver;
import com.kuaishou.webkit.JsResult$ResultReceiver;
import com.kuaishou.webkit.adapter.WebChromeClientAdapter;
import android.webkit.JsPromptResult;
import java.lang.Object;
import com.kuaishou.webkit.JsResult;
import com.kuaishou.webkit.JsPromptResult;
import java.lang.String;

public class WebChromeClientAdapter$JsPromptResultReceiver implements JsResult$ResultReceiver	// class@0012b8
{
    public JsPromptResult mStub;
    public final WebChromeClientAdapter this$0;

    public void WebChromeClientAdapter$JsPromptResultReceiver(WebChromeClientAdapter p0,JsPromptResult p1){
       this.this$0 = p0;
       super();
       this.mStub = p1;
    }
    public void onJsResultComplete(JsResult p0){
       if (p0.getResult()) {
          this.mStub.confirm(p0.getStringResult());
       }else {
          this.mStub.cancel();
       }
       return;
    }
}
