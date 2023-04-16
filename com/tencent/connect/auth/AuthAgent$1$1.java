package com.tencent.connect.auth.AuthAgent$1$1;
import java.lang.Runnable;
import com.tencent.connect.auth.AuthAgent$1;
import android.app.Activity;
import java.lang.Object;
import com.tencent.open.web.security.JniInterface;
import com.tencent.connect.auth.a;
import com.tencent.connect.auth.AuthAgent;
import com.tencent.connect.auth.QQToken;
import android.content.Context;
import java.lang.String;
import com.tencent.tauth.IUiListener;
import android.app.Dialog;
import com.tencent.open.log.SLog;
import com.tencent.open.TDialog;

public class AuthAgent$1$1 implements Runnable	// class@000e16
{
    public final Activity a;
    public final AuthAgent$1 b;

    public void AuthAgent$1$1(AuthAgent$1 p0,Activity p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       AuthAgent$1$1 tb;
       if (JniInterface.isJniOk) {
          tb = this.b;
          a uoa = new a(this.a, "action_login", tb.a, tb.b, AuthAgent.f(tb.c));
          if (!this.a.isFinishing()) {
             v0.show();
          }
       }else {
          tb = this.b;
          TDialog tDialog = new TDialog(this.a, "", AuthAgent.a(this.b.c, ""), tb.b, AuthAgent.g(tb.c));
          if (!this.a.isFinishing()) {
             v0.show();
          }
       }
       return;
    }
}
