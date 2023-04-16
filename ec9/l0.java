package ec9.l0;
import ec9.k;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.q;
import j8c.a;
import q87.c;
import java.util.HashMap;
import java.lang.Integer;
import cc9.h;
import cc9.n;
import w46.b;
import cc9.c;
import ac9.j;
import lnc.a1;

public final class l0 extends k	// class@002184
{
    public final f1 b;

    public void l0(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, l0.class, "1")) {
       }else {
          a.p(p0, "action");
          q oq = this.a().j();
          if (p0.b() != oq.b()) {
             objArray = new Object[0];
             a.D().A("CameraAssistant", "ClickMagicDelegate, action.index != listState.currentSelectPosition", objArray);
          }else {
             h oh = oq.i().get(Integer.valueOf(p0.b()));
             if (!oh instanceof n) {
                objArray = new Object[0];
                a.D().t("CameraAssistant", "ClickMagicDelegate state error", objArray);
             }else if(oq.h()){
                this.b.w0(new c(3));
             }else if(oh.b() == 2){
                this.b.u0().y();
             }else {
                String str = a1.p(R.string.arg_RES_7f1041ef);
                a.o(str, "CommonUtil.string\(R.stri¡­oot_resource_downloading\)");
                this.b.u0().g(str);
             }
          }
       }
       return;
    }
}
