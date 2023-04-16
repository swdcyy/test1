package com.kuaishou.webkit.internal.loader.CoreChecker$1$1;
import java.lang.Runnable;
import com.kuaishou.webkit.internal.loader.CoreChecker$1;
import java.lang.Object;
import com.kuaishou.webkit.extension.jscore.JsContext;
import android.content.Context;
import java.lang.String;
import com.kuaishou.webkit.WebSettings;
import com.kuaishou.webkit.internal.loader.CoreChecker;
import com.kuaishou.webkit.internal.ErrorResult;
import com.kuaishou.webkit.internal.loader.CoreChecker$CheckCallback;

public class CoreChecker$1$1 implements Runnable	// class@00132c
{
    public final CoreChecker$1 this$0;

    public void CoreChecker$1$1(CoreChecker$1 p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       JsContext jsContext = new JsContext(this.this$0.val$app, "CoreChecker");
       WebSettings.getDefaultUserAgent(this.this$0.val$app);
       CoreChecker.restoreCustomEventDelegate();
       this.this$0.val$callback.onFinish(ErrorResult.makeSucceed());
    }
}
