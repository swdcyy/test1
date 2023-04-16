package com.yxcorp.login.userlogin.presenter.resetpassword.g$a;
import android.view.View$OnFocusChangeListener;
import com.yxcorp.login.userlogin.presenter.resetpassword.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.n;

public class g$a implements View$OnFocusChangeListener	// class@001bdb
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void onFocusChange(View p0,boolean p1){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, g$a.class, "1")) {
          return;
       }
       int i = 0;
       p1 = (p1 && TextUtils.G(this.b.p).length() > 0)? true: false;
       g q = this.b.q;
       if (!p1) {
          i = 8;
       }
       n.Y(q, i, p1);
       return;
    }
}
