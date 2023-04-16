package com.yxcorp.gifshow.camera.record.intelligentidentify.ui.a;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.a$b;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c$b;
import android.app.Activity;
import vd9.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.a$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import q87.c;

public class a	// class@000e09
{
    public View a;
    public View b;
    public c c;
    public a$b d;

    public void a(a$b p0){
       super();
       this.d = p0;
       c$b uob = new c$b(p0.a);
       uob.A(false);
       uob.P(true);
       uob.T(p0.d);
       uob.L(new b(this, p0));
       uob.M(new a$a(this));
       this.c = uob.k();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tc = this.c;
       if (tc != null && tc.K()) {
          Object[] objArray = new Object[0];
          a.D().s("IdentifyToast", "dismiss "+this.b(), objArray);
          this.c.o();
       }
       return;
    }
    public CharSequence b(){
       return this.d.b;
    }
}
