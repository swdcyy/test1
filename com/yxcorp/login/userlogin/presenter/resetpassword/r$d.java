package com.yxcorp.login.userlogin.presenter.resetpassword.r$d;
import android.text.TextWatcher;
import com.yxcorp.login.userlogin.presenter.resetpassword.r;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.EditText;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.yxcorp.utility.n;
import im8.f;
import java.lang.CharSequence;

public class r$d implements TextWatcher	// class@001bed
{
    public final r b;

    public void r$d(r p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       r r;
       if (PatchProxy.applyVoidOneRefs(p0, this, r$d.class, "1")) {
          return;
       }
       r$d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, r.class, "8")) {
          int i = 0;
          boolean b = (TextUtils.G(tb.p).length() > 0)? true: false;
          r = tb.r;
          if (!b) {
             i = 8;
          }
          n.Y(r, i, b);
          tb.y.get();
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
