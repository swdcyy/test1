package dra.a$c$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import dra.a$c;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fra.b;
import dra.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Integer;
import o07.o;

public final class a$c$a implements PopupInterface$h	// class@0024fe
{
    public final a$c b;

    public void a$c$a(a$c p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c$a.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       Iterator iterator = this.b.b.a().a().iterator();
       while (iterator.hasNext()) {
          iterator.next().B(p0);
       }
       return;
    }
    public void H(c p0,int p1){
       a$c$a uoc$a = a$c$a.class;
       if (PatchProxy.isSupport(uoc$a) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc$a, "2")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       Iterator iterator = this.b.b.a().a().iterator();
       while (iterator.hasNext()) {
          iterator.next().H(p0, p1);
       }
       this.b.b.b(null);
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
