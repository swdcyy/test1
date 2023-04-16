package com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler$a;
import p59.t$a;
import com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler$a$a;
import p59.s;

public final class RegisterWebViewDidShowHandler$a implements t$a	// class@0018ea
{
    public final RegisterWebViewDidShowHandler a;

    public void RegisterWebViewDidShowHandler$a(RegisterWebViewDidShowHandler p0){
       this.a = p0;
       super();
    }
    public final void onDestroy(){
       if (PatchProxy.applyVoid(null, this, RegisterWebViewDidShowHandler$a.class, "1")) {
          return;
       }
       RegisterWebViewDidShowHandler$a$a uoa$a = new RegisterWebViewDidShowHandler$a$a(this);
       return;
    }
    public void onResume(){
       s.a(this);
    }
}
