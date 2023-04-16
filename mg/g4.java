package mg.g4;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.framework.preference.startup.MyCourseConfig;
import java.lang.System;
import oe6.a;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import java.lang.String;
import java.lang.Object;

public class g4 extends z	// class@002602
{

    public void g4(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       if (p0 != null) {
          p0.mExpireTime = System.currentTimeMillis() + (long)(p0.mTimeOutSecond * 1000);
          a.Z(p0);
          this.d(p0.mCallback, new JsErrorResult(1, ""));
       }
       return;
    }
}
