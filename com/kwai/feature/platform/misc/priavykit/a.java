package com.kwai.feature.platform.misc.priavykit.a;
import tk7.b$a;
import android.app.Activity;
import java.lang.Object;
import kzc.d;
import com.kwai.library.widget.popup.common.c$b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import u07.t$a;
import android.view.View$OnClickListener;
import r06.c;
import u07.u;
import r06.b;
import r06.a;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import u07.f;
import com.kwai.library.widget.popup.common.c;

public class a implements b$a	// class@0012c0
{
    public d a;

    public void a(Activity p0){
       super();
       d uod = new d(p0);
       uod.z(false);
       uod.v(true);
       this.a = uod;
    }
    public b$a a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.z0(p0);
       return this;
    }
    public b$a b(CharSequence p0,View$OnClickListener p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.R0(p0);
       this.a.t0(new c(p1));
       return this;
    }
    public b$a c(CharSequence p0,View$OnClickListener p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.T0(p0);
       this.a.u0(new b(p1));
       return this;
    }
    public b$a d(View$OnClickListener p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.J(new a(p0));
       return this;
    }
    public b$a setTitle(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.X0(p0);
       return this;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       f.e(this.a).X();
       return;
    }
}
