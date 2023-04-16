package com.kuaishou.webkit.adapter.CustomViewCallbackAdapter;
import com.kuaishou.webkit.WebChromeClient$CustomViewCallback;
import android.webkit.WebChromeClient$CustomViewCallback;
import java.lang.Object;

public class CustomViewCallbackAdapter implements WebChromeClient$CustomViewCallback	// class@0012a5
{
    public WebChromeClient$CustomViewCallback mStub;

    public void CustomViewCallbackAdapter(WebChromeClient$CustomViewCallback p0){
       super();
       this.mStub = p0;
    }
    public void onCustomViewHidden(){
       this.mStub.onCustomViewHidden();
    }
}
