package com.alipay.sdk.m.s.e$b;
import com.kuaishou.webkit.WebChromeClient;
import com.alipay.sdk.m.s.e;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.kuaishou.webkit.JsPromptResult;
import com.alipay.sdk.m.s.e$e;
import com.alipay.sdk.m.s.e$d;
import android.widget.ProgressBar;

public class e$b extends WebChromeClient	// class@000ead
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public boolean onJsPrompt(WebView p0,String p1,String p2,String p3,JsPromptResult p4){
       return e.f(this.a).a(this.a, p1, p2, p3, p4);
    }
    public void onProgressChanged(WebView p0,int p1){
       e$b ta = this.a;
       if (ta.g.b != null) {
          if (p1 > 90) {
             e.e(ta).setVisibility(4);
          }else if(e.e(ta).getVisibility() == 4){
             e.e(this.a).setVisibility(0);
          }
          e.e(this.a).setProgress(p1);
       }else {
          e.e(ta).setVisibility(8);
       }
       return;
    }
    public void onReceivedTitle(WebView p0,String p1){
       e.f(this.a).e(this.a, p1);
    }
}
