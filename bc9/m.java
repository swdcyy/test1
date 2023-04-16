package bc9.m;
import android.view.View$OnClickListener;
import bc9.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.assistant.a;
import e17.i;
import bc9.k;
import java.util.List;
import ec9.f1;
import cc9.c;
import sa6.a;
import fc9.a;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import cc9.q;
import ac9.g;
import dc9.c;
import com.yxcorp.gifshow.camera.record.base.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.camera.record.assistant.a$a;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class m implements View$OnClickListener	// class@0003fe
{
    public final l b;

    public void m(l p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       int i;
       int b;
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       if (this.b.g2().z()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100235);
          return;
       }else {
          k ok = this.b.g2().p();
          if (ok != null) {
             List list = ok.s1();
             if (list != null && list.isEmpty() == true) {
                return;
             }
          }
          this.b.g2().r().w0(new c(50));
          l f = this.b.F;
          i = 0;
          if (f != null) {
             f = f.c();
             if (f != null) {
                b = f.isSelected();
             label_0062 :
                l f1 = this.b.F;
                if (f1 != null) {
                   View view = f1.c();
                   if (view != null) {
                      view.setSelected((b ^ 0x01));
                   }
                }
                f1 = this.b.F;
                if (f1 != null) {
                   TextView textView = f1.f();
                   if (textView != null) {
                      String str = (!b)? a1.p(R.string.arg_RES_7f100233): a1.p(R.string.arg_RES_7f100234);
                      textView.setText(str);
                   }
                }
                g og = this.b.g2().r().v0().d();
                int i1 = this.b.g2().r().v0().b();
                if (og != null) {
                   c uoc = this.b.g2().h();
                   b = b ^ 1;
                   d d = this.b.d;
                   a.o(d, "mCallerContext");
                   BaseFragment uBaseFragmen = d.f();
                   a.o(uBaseFragmen, "mCallerContext.fragment");
                   int i2 = this.b.g2().m();
                   Objects.requireNonNull(uoc);
                   c uoc1 = c.class;
                   if (PatchProxy.isSupport(uoc1)) {
                      Object[] objArray = new Object[]{Boolean.valueOf(b),og,uBaseFragmen,Integer.valueOf(i1),Integer.valueOf(i2)};
                      if (!PatchProxy.applyVoid(objArray, uoc, uoc1, "16")) {
                      }
                   }else {
                   }
                }
             label_018d :
                return;
             }
          }
          b = 0;
          goto label_0062 ;
       }
    }
}
