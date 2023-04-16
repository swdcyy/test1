package com.tencent.connect.auth.AuthAgent$b$3;
import android.content.DialogInterface$OnCancelListener;
import com.tencent.connect.auth.AuthAgent$b;
import com.tencent.tauth.IUiListener;
import java.lang.Object;
import android.content.DialogInterface;

public class AuthAgent$b$3 implements DialogInterface$OnCancelListener	// class@000e1b
{
    public final IUiListener a;
    public final Object b;
    public final AuthAgent$b c;

    public void AuthAgent$b$3(AuthAgent$b p0,IUiListener p1,Object p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onCancel(DialogInterface p0){
       AuthAgent$b$3 ta = this.a;
       if (ta != null) {
          ta.onComplete(this.b);
       }
       return;
    }
}
