package com.tencent.open.c.b;
import com.kuaishou.webkit.WebView;
import android.content.Context;
import java.lang.String;
import com.tencent.open.log.SLog;
import com.kuaishou.webkit.WebSettings;
import android.widget.AbsoluteLayout;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.StringBuilder;
import java.lang.Exception;

public class b extends WebView	// class@000f5a
{

    public void b(Context p0){
       super(p0);
       this.a();
    }
    public void a(){
       this.removeJavascriptInterface("searchBoxJavaBridge_");
       this.removeJavascriptInterface("accessibility");
       this.removeJavascriptInterface("accessibilityTraversal");
       SLog.i("openSDK_LOG.OpenWebView", "removeJSInterface");
    }
    public void destroy(){
       String str = "openSDK_LOG.OpenWebView";
       try{
          this.getSettings().setBuiltInZoomControls(true);
          this.getSettings().setDisplayZoomControls(false);
          this.setVisibility(8);
          SLog.i(str, "-->OpenWebView.destroy setBuiltInZoomControls");
       }catch(java.lang.Exception e2){
          SLog.e(str, "-->OpenWebView.destroy setBuiltInZoomControls", e2);
       }
       super.destroy();
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       WebSettings settings = this.getSettings();
       if (settings == null) {
          return;
       }
       settings.setSavePassword(false);
       Class class = settings.getClass();
       try{
          int i = 1;
          Class[] uClassArray = new Class[i];
          uClassArray[0] = String.class;
          Method method = class.getMethod("removeJavascriptInterface", uClassArray);
          if (method != null) {
             Object[] objArray = new Object[i];
             objArray[0] = "searchBoxJavaBridge_";
             method.invoke(this, objArray);
             objArray = new Object[i];
             objArray[0] = "accessibility";
             method.invoke(this, objArray);
             objArray = new Object[i];
             objArray[0] = "accessibilityTraversal";
             method.invoke(this, objArray);
             SLog.i("openSDK_LOG.OpenWebView", "remove js interface");
          }
       }catch(java.lang.Exception e1){
          SLog.e("openSDK_LOG.OpenWebView", "remove js interface.e:"+e1.toString());
       }
       return;
    }
}
