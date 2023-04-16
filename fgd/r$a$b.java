package fgd.r$a$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import fgd.r$a;
import java.lang.String;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o07.o;
import bgd.b;
import fgd.r;
import bgd.c;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Integer;
import java.lang.Boolean;

public final class r$a$b implements PopupInterface$h	// class@000e36
{
    public final r$a b;
    public final String c;
    public final Ref$BooleanRef d;

    public void r$a$b(r$a p0,String p1,Ref$BooleanRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void B(c p0){
       b a;
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a$b.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       o.e(this, p0);
       a = b.a;
       r$a$b tc = this.c;
       String str = "content";
       a.o(tc, str);
       String str1 = r.S8(this.b.b).c();
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(tc, str1, a, b.class, "2")) {
          a.p(tc, str);
          a.p(str1, "size");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLEAR_POPUP";
          i3 oi3 = i3.f();
          oi3.d("popup_text", tc);
          oi3.d("size", str1);
          uElementPack.params = oi3.e();
          u1.u0(4, uElementPack, null);
       }
       return;
    }
    public void H(c p0,int p1){
       b a;
       r$a$b uoa$b = r$a$b.class;
       if (PatchProxy.isSupport(uoa$b) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa$b, "2")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       a = b.a;
       r$a$b tc = this.c;
       String str = "content";
       a.o(tc, str);
       String str1 = r.S8(this.b.b).c();
       Ref$BooleanRef element = this.d.element;
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(tc, str1, Boolean.valueOf(element), a, b.class, "4")) {
          a.p(tc, str);
          str = "size";
          a.p(str1, str);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLEAR_POPUP";
          i3 oi3 = i3.f();
          oi3.d("popup_text", tc);
          oi3.d(str, str1);
          String str2 = (element != null)? "TRUE": "FALSE";
          oi3.d("confirm_type", str2);
          uElementPack.params = oi3.e();
          u1.u(1, uElementPack, null);
       }
       return;
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
