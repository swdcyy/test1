package com.yxcorp.login.userlogin.presenter.resetpassword.g$b;
import android.text.TextWatcher;
import com.yxcorp.login.userlogin.presenter.resetpassword.g;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.yxcorp.utility.n;
import im8.f;
import java.lang.CharSequence;

public class g$b implements TextWatcher	// class@001bdc
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
          return;
       }
       int i = 0;
       boolean b = (TextUtils.G(this.b.p).length() > 0)? true: false;
       g q = this.b.q;
       if (!b) {
          i = 8;
       }
       n.Y(q, i, b);
       this.b.r.get();
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
