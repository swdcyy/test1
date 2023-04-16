package com.kuaishou.webkit.adapter.HttpAuthHandlerAdapter;
import com.kuaishou.webkit.HttpAuthHandler;
import android.webkit.HttpAuthHandler;
import java.lang.String;

public class HttpAuthHandlerAdapter extends HttpAuthHandler	// class@0012a8
{
    public HttpAuthHandler mStub;

    public void HttpAuthHandlerAdapter(HttpAuthHandler p0){
       super();
       this.mStub = p0;
    }
    public void cancel(){
       this.mStub.cancel();
    }
    public void proceed(String p0,String p1){
       this.mStub.proceed(p0, p1);
    }
    public boolean useHttpAuthUsernamePassword(){
       return this.mStub.useHttpAuthUsernamePassword();
    }
}
