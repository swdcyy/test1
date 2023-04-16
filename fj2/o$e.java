package fj2.o$e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import fj2.o;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kuaishou.screencast.c;
import java.lang.Integer;
import o07.o;

public class o$e implements PopupInterface$h	// class@00297b
{
    public final o b;

    public void o$e(o p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$e.class, "1")) {
          return;
       }
       b.a(-1851168653).f();
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(o$e.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, o$e.class, "2")) {
          return;
       }
       b.a(-1851168653).i();
       p0.x = null;
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
