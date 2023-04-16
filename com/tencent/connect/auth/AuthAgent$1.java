package com.tencent.connect.auth.AuthAgent$1;
import java.lang.Runnable;
import com.tencent.connect.auth.AuthAgent;
import java.lang.String;
import com.tencent.tauth.IUiListener;
import java.lang.Object;
import com.tencent.open.utils.i;
import com.tencent.open.web.security.JniInterface;
import java.lang.ref.WeakReference;
import android.app.Activity;
import com.tencent.connect.auth.AuthAgent$1$1;

public class AuthAgent$1 implements Runnable	// class@000e17
{
    public final String a;
    public final IUiListener b;
    public final AuthAgent c;

    public void AuthAgent$1(AuthAgent p0,String p1,IUiListener p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       i.a(AuthAgent.SECURE_LIB_FILE_NAME, AuthAgent.SECURE_LIB_NAME, 5);
       JniInterface.loadSo();
       if (AuthAgent.e(this.c) == null) {
          return;
       }
       Activity uActivity = AuthAgent.e(this.c).get();
       if (uActivity != null) {
          uActivity.runOnUiThread(new AuthAgent$1$1(this, uActivity));
       }
       return;
    }
}
