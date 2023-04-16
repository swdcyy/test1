package com.kuaishou.webkit.adapter.WebResourceErrorAdapter;
import com.kuaishou.webkit.WebResourceError;
import android.webkit.WebResourceError;
import java.lang.CharSequence;

public class WebResourceErrorAdapter extends WebResourceError	// class@0012c3
{
    public WebResourceError mStub;

    public void WebResourceErrorAdapter(WebResourceError p0){
       super();
       this.mStub = p0;
    }
    public CharSequence getDescription(){
       return this.mStub.getDescription();
    }
    public int getErrorCode(){
       return this.mStub.getErrorCode();
    }
}
