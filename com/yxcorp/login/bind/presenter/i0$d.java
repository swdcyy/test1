package com.yxcorp.login.bind.presenter.i0$d;
import mvb.b$b;
import com.yxcorp.login.bind.presenter.i0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import im8.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.yxcorp.login.util.o;
import android.widget.EditText;
import android.widget.TextView;

public class i0$d implements b$b	// class@001a7a
{
    public final i0 a;

    public void i0$d(i0 p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(i0$d.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, i0$d.class, "1")) {
          return;
       }
       if (TextUtils.x(this.a.t.get())) {
          this.a.t.set(p1);
          if (!this.a.v.get().booleanValue() && !TextUtils.x(this.a.u.get())) {
             i0$d ta = this.a;
             ta.s.setText(o.a((ta.u.get()).replace(p1, "")));
             this.a.s.setFocusable(false);
             this.a.s.setFocusableInTouchMode(false);
             this.a.p.setClickable(false);
          }
          this.a.P8();
       }
       return;
    }
}
