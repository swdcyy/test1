package com.tencent.connect.auth.a$4;
import android.content.DialogInterface$OnDismissListener;
import com.tencent.connect.auth.a;
import java.lang.Object;
import android.content.DialogInterface;
import com.tencent.open.web.security.JniInterface;

public class a$4 implements DialogInterface$OnDismissListener	// class@000e24
{
    public final a a;

    public void a$4(a p0){
       this.a = p0;
       super();
    }
    public void onDismiss(DialogInterface p0){
       try{
          if (JniInterface.isJniOk) {
             JniInterface.clearAllPWD();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
