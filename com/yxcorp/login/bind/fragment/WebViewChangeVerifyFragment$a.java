package com.yxcorp.login.bind.fragment.WebViewChangeVerifyFragment$a;
import com.yxcorp.gifshow.widget.SwipeLayout$c;
import com.yxcorp.login.bind.fragment.WebViewChangeVerifyFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.u1;
import android.content.Intent;
import com.yxcorp.login.bind.fragment.WebViewChangeVerifyFragment$c;

public class WebViewChangeVerifyFragment$a extends SwipeLayout$c	// class@001a56
{
    public final WebViewChangeVerifyFragment a;

    public void WebViewChangeVerifyFragment$a(WebViewChangeVerifyFragment p0){
       this.a = p0;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, WebViewChangeVerifyFragment$a.class, "1")) {
          return;
       }
       u1.K0(3);
       Intent intent = new Intent();
       intent.putExtra("changeVerifyResult", 0);
       this.a.F.a(intent);
       return;
    }
}
