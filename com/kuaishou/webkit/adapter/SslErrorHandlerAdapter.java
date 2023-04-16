package com.kuaishou.webkit.adapter.SslErrorHandlerAdapter;
import com.kuaishou.webkit.SslErrorHandler;
import android.webkit.SslErrorHandler;

public class SslErrorHandlerAdapter extends SslErrorHandler	// class@0012b0
{
    public SslErrorHandler mStub;

    public void SslErrorHandlerAdapter(SslErrorHandler p0){
       super();
       this.mStub = p0;
    }
    public void cancel(){
       this.mStub.cancel();
    }
    public void proceed(){
       this.mStub.proceed();
    }
}
