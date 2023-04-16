package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.LoginButtonViewElement$loginBtnValueWatcher$2$a;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.LoginButtonViewElement$loginBtnValueWatcher$2;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import mr6.b;
import kotlin.jvm.internal.a;

public final class LoginButtonViewElement$loginBtnValueWatcher$2$a implements u	// class@0016f7
{
    public final LoginButtonViewElement$loginBtnValueWatcher$2 a;

    public void LoginButtonViewElement$loginBtnValueWatcher$2$a(LoginButtonViewElement$loginBtnValueWatcher$2 p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginButtonViewElement$loginBtnValueWatcher$2$a.class, "1")) {
       }else {
          View view = this.a.this$0.j().findViewById(R.id.left_text);
          if (view != null) {
             a.o(p0, "visibility");
             view.setVisibility(p0.intValue());
          }
       }
       return;
    }
}
