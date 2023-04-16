package com.yxcorp.login.userlogin.presenter.phoneverify.c$a;
import v0d.m$b;
import com.yxcorp.login.userlogin.presenter.phoneverify.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.Integer;
import java.lang.StringBuilder;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;

public class c$a implements m$b	// class@001bcf
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "2")) {
          return;
       }
       c q = this.a.q;
       if (q != null) {
          q.setText(R.string.arg_RES_7f1042b2);
          this.a.q.setEnabled(true);
       }
       return;
    }
    public void onProgress(int p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       c q = this.a.q;
       if (q != null) {
          q.setEnabled(false);
          Object[] objArray = new Object[]{Integer.valueOf(p0)};
          this.a.q.setText(a.B.getString(R.string.arg_RES_7f1042b2)+" \("+a.B.getString(R.string.arg_RES_7f104cee, objArray)+"\)");
       }
       return;
    }
}
