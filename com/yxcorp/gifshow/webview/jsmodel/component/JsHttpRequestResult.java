package com.yxcorp.gifshow.webview.jsmodel.component.JsHttpRequestResult;
import java.lang.String;
import com.yxcorp.gifshow.webview.jsmodel.component.JsHttpRequestResult$HttpResponse;
import java.lang.Object;

public class JsHttpRequestResult	// class@001771
{
    public JsHttpRequestResult$HttpResponse mData;
    public String mErrorMsg;
    public int mResult;

    public void JsHttpRequestResult(int p0,String p1,JsHttpRequestResult$HttpResponse p2){
       super();
       this.mResult = p0;
       this.mErrorMsg = p1;
       this.mData = p2;
    }
}
