package com.yxcorp.login.userlogin.fragment.QRCodeLoginFragment$a;
import android.view.View$OnClickListener;
import com.yxcorp.login.userlogin.fragment.QRCodeLoginFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class QRCodeLoginFragment$a implements View$OnClickListener	// class@001b3c
{
    public final QRCodeLoginFragment b;

    public void QRCodeLoginFragment$a(QRCodeLoginFragment p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QRCodeLoginFragment$a.class, "1")) {
          return;
       }
       this.b.ch();
       return;
    }
}
