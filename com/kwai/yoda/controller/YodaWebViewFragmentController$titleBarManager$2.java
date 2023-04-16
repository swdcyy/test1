package com.kwai.yoda.controller.YodaWebViewFragmentController$titleBarManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.controller.YodaWebViewFragmentController;
import dz7.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.kwai.yoda.bridge.YodaBaseWebView;

public final class YodaWebViewFragmentController$titleBarManager$2 extends Lambda implements a	// class@0011bb
{
    public final YodaWebViewFragmentController this$0;

    public void YodaWebViewFragmentController$titleBarManager$2(YodaWebViewFragmentController p0){
       this.this$0 = p0;
       super(0);
    }
    public final n invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, YodaWebViewFragmentController$titleBarManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = this.this$0.e().getView();
       if (view != null) {
          objArray = view.findViewById(R.id.title_layout);
       }
       return new n(objArray, this.this$0.getWebView());
    }
    public Object invoke(){
       return this.invoke();
    }
}
