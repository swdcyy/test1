package com.yxcorp.login.bind.presenter.o0$a;
import y8c.r;
import com.yxcorp.login.bind.presenter.o0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nl8.p;
import com.yxcorp.login.model.VerifyMethodInfo;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import e1d.k1;
import android.view.View$OnClickListener;

public class o0$a extends r	// class@001a8d
{
    public final o0 i;

    public void o0$a(o0 p0){
       this.i = p0;
       super();
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, o0$a.class, "1")) {
          return;
       }
       VerifyMethodInfo verifyMethod = this.t();
       this.q(R.id.verify_method_desc).setMaxLines(1);
       this.q(R.id.verify_method_desc).setText(verifyMethod.methodName);
       this.q(R.id.verify_more).setText(verifyMethod.methodDesc);
       this.q(R.id.item_root).setOnClickListener(new k1(this, verifyMethod));
       return;
    }
}
