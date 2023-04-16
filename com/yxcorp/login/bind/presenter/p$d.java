package com.yxcorp.login.bind.presenter.p$d;
import v0d.m$b;
import com.yxcorp.login.bind.presenter.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.content.res.Resources;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.content.Context;
import java.lang.CharSequence;

public class p$d implements m$b	// class@001a94
{
    public final p a;

    public void p$d(p p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, p$d.class, "2")) {
          return;
       }
       p$d ta = this.a;
       p r = ta.r;
       if (r != null) {
          ta.z = false;
          r.setText(R.string.arg_RES_7f1042b2);
          this.a.r.setEnabled(true);
          ta = this.a;
          ta.r.setTextColor(ta.l8().getColor(R.color.arg_RES_7f061c48));
       }
       return;
    }
    public void onProgress(int p0){
       p$d uod = p$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       uod = this.a;
       p r = uod.r;
       if (r != null) {
          uod.z = true;
          r.setEnabled(false);
          p$d ta = this.a;
          ta.r.setTextColor(ta.l8().getColor(R.color.arg_RES_7f061eed));
          Object[] objArray = new Object[true];
          objArray[0] = Integer.valueOf(p0);
          this.a.r.setText(this.a.getContext().getString(R.string.arg_RES_7f1042b2)+" \("+this.a.getContext().getString(R.string.arg_RES_7f104cee, objArray)+"\)");
       }
       return;
    }
}
