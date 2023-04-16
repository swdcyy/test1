package com.yxcorp.login.userlogin.presenter.resetpassword.n$a;
import android.text.TextWatcher;
import com.yxcorp.login.userlogin.presenter.resetpassword.n;
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

public class n$a implements TextWatcher	// class@001be5
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "1")) {
          return;
       }
       int i = 0;
       boolean b = (TextUtils.G(this.b.q).length() > 0)? true: false;
       n u = this.b.u;
       if (!b) {
          i = 8;
       }
       n.Y(u, i, b);
       this.b.s.get();
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
