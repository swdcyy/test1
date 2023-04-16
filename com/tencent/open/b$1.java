package com.tencent.open.b$1;
import com.kuaishou.webkit.WebChromeClient;
import com.tencent.open.b;
import java.lang.String;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import com.kuaishou.webkit.ConsoleMessage;

public class b$1 extends WebChromeClient	// class@000f42
{
    public final b a;

    public void b$1(b p0){
       this.a = p0;
       super();
    }
    public void onConsoleMessage(String p0,int p1,String p2){
       SLog.i("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage"+p0+" -- From 222 line "+p1+" of "+p2);
    }
    public boolean onConsoleMessage(ConsoleMessage p0){
       if (p0 == null) {
          return false;
       }
       SLog.i("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage"+p0.message()+" -- From  111 line "+p0.lineNumber()+" of "+p0.sourceId());
       this.a.a(p0.message());
       return true;
    }
}
