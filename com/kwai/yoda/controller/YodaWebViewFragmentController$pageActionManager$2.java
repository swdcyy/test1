package com.kwai.yoda.controller.YodaWebViewFragmentController$pageActionManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.controller.YodaWebViewFragmentController;
import dz7.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.app.Activity;

public final class YodaWebViewFragmentController$pageActionManager$2 extends Lambda implements a	// class@0011b9
{
    public final YodaWebViewFragmentController this$0;

    public void YodaWebViewFragmentController$pageActionManager$2(YodaWebViewFragmentController p0){
       this.this$0 = p0;
       super(0);
    }
    public final l invoke(){
       Object obj = PatchProxy.apply(null, this, YodaWebViewFragmentController$pageActionManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l(this.this$0.e().getActivity(), this.this$0.getWebView());
    }
    public Object invoke(){
       return this.invoke();
    }
}
