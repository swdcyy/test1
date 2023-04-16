package com.kuaishou.webkit.WebMessagePort;
import java.lang.Object;
import com.kuaishou.webkit.WebMessage;
import com.kuaishou.webkit.WebMessagePort$WebMessageCallback;
import android.os.Handler;

public abstract class WebMessagePort	// class@00126e
{

    public void WebMessagePort(){
       super();
    }
    public abstract void close();
    public abstract void postMessage(WebMessage p0);
    public abstract void setWebMessageCallback(WebMessagePort$WebMessageCallback p0);
    public abstract void setWebMessageCallback(WebMessagePort$WebMessageCallback p0,Handler p1);
}
