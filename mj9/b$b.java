package mj9.b$b;
import android.view.View$OnClickListener;
import mj9.b;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.util.Objects;
import mj9.a$a;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import hlb.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import k2b.u1;

public final class b$b implements View$OnClickListener	// class@00303e
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       if (b.P8(this.b).isSelected()) {
          return;
       }
       b$b tb = this.b;
       Objects.requireNonNull(tb);
       b uob1 = PatchProxy.apply(null, tb, uob, "6");
       if (uob1 != patchProxyRe) {
       }else {
          uob1 = tb.s;
          if (uob1 == null) {
             a.S("onItemClickListener");
          }
       }
       b p = this.b.p;
       a.m(p);
       int i = p.intValue();
       TextView textView = b.P8(this.b);
       b$b tb1 = this.b;
       Objects.requireNonNull(tb1);
       b uob2 = PatchProxy.apply(null, tb1, uob, "2");
       if (uob2 != patchProxyRe) {
       }else {
          uob2 = tb1.q;
          if (uob2 == null) {
             a.S("mHotChannelSubTag");
          }
       }
       uob1.a(i, textView, uob2);
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, uob, "13")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SUB_CHANNEL_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.tagPackage = tb.R8();
          u1.u(3, uElementPack, uContentPack);
       }
       return;
    }
}
