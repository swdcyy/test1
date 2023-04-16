package lf9.k;
import lf9.b;
import lf9.m;
import lf9.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import kf9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import kf9.f;
import j8c.a;
import q87.c;
import java.util.HashMap;
import java.lang.Integer;
import kf9.a;
import kf9.e;
import lf9.c;
import java.util.List;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class k extends b	// class@002dd7
{
    public final q b;

    public void k(m p0,q p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          String str = "SliMode";
          int i = 0;
          if (p0.b() != uob.b()) {
             objArray = new Object[i];
             a.D().A(str, "ClickMagicDelegate, action.index != listState.currentSelectPosition", objArray);
          }else {
             p0 = uob.g().get(Integer.valueOf(p0.b()));
             if (!p0 instanceof e) {
                objArray = new Object[i];
                a.D().A(str, "ClickMagicDelegate state error", objArray);
             }else if(uob.e()){
                this.b.v0(new c(3));
             }else if(p0.b() == 2){
                if (uob.d()) {
                   this.a().h(f.a(uob, null, 0, 0, null, false, false, 31, null));
                }
                this.b.w0();
             }else {
                a.o(i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1041ef), i), "KSToast.applyStyle\(R.sty¡­ing\), Toast.LENGTH_SHORT\)");
             }
          }
       }
       return;
    }
}
