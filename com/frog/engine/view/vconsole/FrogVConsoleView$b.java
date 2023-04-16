package com.frog.engine.view.vconsole.FrogVConsoleView$b;
import com.kuaishou.webkit.WebViewClient;
import com.frog.engine.view.vconsole.FrogVConsoleView;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.frog.engine.view.vconsole.FrogVConsoleView$VConsoleLoadListener;

public class FrogVConsoleView$b extends WebViewClient	// class@0015a7
{
    public final FrogVConsoleView a;

    public void FrogVConsoleView$b(FrogVConsoleView p0){
       this.a = p0;
       super();
    }
    public void onPageFinished(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogVConsoleView$b.class, "1")) {
          return;
       }
       this.a.checkAppendLogQueue(true);
       FrogVConsoleView vConsoleLoad = this.a.vConsoleLoadListener;
       if (vConsoleLoad != null) {
          vConsoleLoad.onFinish();
       }
       return;
    }
}
