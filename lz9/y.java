package lz9.y;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import lz9.b0;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import lnc.a1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import m9a.l;
import o07.o;

public class y implements PopupInterface$h	// class@002eef
{
    public final b0 b;

    public void y(b0 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       y tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, b0.class, "4")) {
          i3 oi3 = i3.f();
          oi3.c("redpoint_id", Integer.valueOf(0x2a40));
          oi3.d("redpoint_text", a1.p(R.string.arg_RES_7f10076f));
          oi3.c("redpoint_style", Integer.valueOf(2));
          oi3.d("redpoint_source", "PageCommentBubble");
          oi3.d("redpoint_loc", "PageCommentBubble");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "UNIFY_REDPOINT";
          uElementPack.params = oi3.e();
          u1.D0("", null, 3, uElementPack, null, null);
       }
       this.b.Y.c();
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
