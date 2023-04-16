package com.yxcorp.login.userlogin.presenter.resetpassword.u$a;
import tyc.u4;
import com.yxcorp.login.userlogin.presenter.resetpassword.u;
import android.text.Editable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import b3d.j0;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.utility.n;

public class u$a extends u4	// class@001bf2
{
    public final u b;

    public void u$a(u p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$a.class, "1")) {
          return;
       }
       if (p0 != null && !TextUtils.x(p0.toString())) {
          if (p0.length() >= 8 && (p0.length() <= 20 && j0.b(p0.toString()))) {
             this.b.r.setVisibility(4);
             this.b.s.setEnabled(true);
          }else {
             this.b.s.setEnabled(0);
             this.b.r.setVisibility(0);
          }
          n.Y(this.b.p, 0, true);
       }else {
          n.Y(this.b.p, 4, 0);
          this.b.r.setVisibility(4);
          this.b.s.setEnabled(0);
       }
       return;
    }
}
