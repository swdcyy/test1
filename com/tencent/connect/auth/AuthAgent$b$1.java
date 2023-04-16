package com.tencent.connect.auth.AuthAgent$b$1;
import com.tencent.connect.auth.AuthAgent$b$a;
import com.tencent.connect.auth.AuthAgent$b;
import android.app.Dialog;
import com.tencent.tauth.IUiListener;
import java.lang.Object;
import android.view.View;

public class AuthAgent$b$1 extends AuthAgent$b$a	// class@000e19
{
    public final IUiListener a;
    public final Object b;
    public final AuthAgent$b c;

    public void AuthAgent$b$1(AuthAgent$b p0,Dialog p1,IUiListener p2,Object p3){
       this.c = p0;
       this.a = p2;
       this.b = p3;
       super(p0, p1);
    }
    public void onClick(View p0){
       this.c.a();
       AuthAgent$b$a td = this.d;
       if (td != null && td.isShowing()) {
          this.d.dismiss();
       }
       AuthAgent$b$1 ta = this.a;
       if (ta != null) {
          ta.onComplete(this.b);
       }
       return;
    }
}
