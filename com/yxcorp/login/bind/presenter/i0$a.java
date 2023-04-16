package com.yxcorp.login.bind.presenter.i0$a;
import v0d.m$b;
import com.yxcorp.login.bind.presenter.i0;
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

public class i0$a implements m$b	// class@001a77
{
    public final i0 a;

    public void i0$a(i0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i0$a.class, "2")) {
          return;
       }
       i0 q = this.a.q;
       if (q != null) {
          q.setText(R.string.arg_RES_7f1042b2);
          this.a.q.setEnabled(true);
       }
       return;
    }
    public void onProgress(int p0){
       i0$a uoa = i0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       i0 q = this.a.q;
       if (q != null) {
          q.setEnabled(false);
          Object[] objArray = new Object[]{Integer.valueOf(p0)};
          this.a.q.setText(a.B.getString(R.string.arg_RES_7f1042b2)+" \("+a.B.getString(R.string.arg_RES_7f104cee, objArray)+"\)");
       }
       return;
    }
}
