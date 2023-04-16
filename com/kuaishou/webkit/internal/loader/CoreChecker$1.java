package com.kuaishou.webkit.internal.loader.CoreChecker$1;
import com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import android.app.Application;
import com.kuaishou.webkit.internal.loader.CoreChecker$CheckCallback;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.webkit.internal.loader.KsWebviewLoadConfig;
import com.kuaishou.webkit.internal.loader.CoreChecker$1$1;
import java.lang.Runnable;
import com.kuaishou.webkit.internal.ThreadUtils;
import com.kuaishou.webkit.internal.loader.CoreChecker;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import com.kuaishou.webkit.extension.KwSdk$LoadError;
import com.kuaishou.webkit.extension.KwSdk;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.webkit.internal.ErrorResult;
import com.kuaishou.webkit.extension.KsCoreInitSettings;
import com.kuaishou.webkit.WebView;

public class CoreChecker$1 implements KwSdk$CoreInitCallback	// class@00132d
{
    public final Application val$app;
    public final CoreChecker$CheckCallback val$callback;

    public void CoreChecker$1(Application p0,CoreChecker$CheckCallback p1){
       this.val$app = p0;
       this.val$callback = p1;
       super();
    }
    public void onCoreLoadFailed(String p0,String p1){
    }
    public void onCoreLoadFinished(boolean p0){
       KsWebviewLoadConfig.setLoadNewConfig(false);
       if (p0) {
          ThreadUtils.postOnUiThread(new CoreChecker$1$1(this));
       }else {
          CoreChecker.restoreCustomEventDelegate();
          String loaderStep = KsWebViewUtils.getLoaderStep();
          String exception = KsWebViewUtils.getException();
          String str = "check failed le:"+String.valueOf(KwSdk.getLoadError().getValue())+"; step:";
          if (!TextUtils.isEmpty(loaderStep)) {
             str = str+loaderStep;
          }
          if (!TextUtils.isEmpty(exception)) {
             str = str+"; exp:"+exception;
          }
          this.val$callback.onFinish(ErrorResult.makeError(str));
       }
       return;
    }
    public void onPreLoadCore(KsCoreInitSettings p0){
       WebView.setDataDirectorySuffix("kwv_utils_process");
       p0.enableMultiProcess(false);
       p0.forceUsePacakage(false);
       p0.useSystemWebView(false);
       p0.disableHiddenApiUnseal();
    }
}
