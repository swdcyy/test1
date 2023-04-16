package bsa.b$e;
import fr6.i;
import bsa.b;
import java.lang.Object;
import wq6.h;
import fr6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import wra.b;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import wq6.g;
import pr6.d;
import po5.c;
import pr6.b;
import k2b.e0;
import ura.b;

public final class b$e implements i	// class@000455
{
    public final b a;

    public void b$e(b p0){
       this.a = p0;
       super();
    }
    public void a(h p0,int p1){
       h.a(this, p0, p1);
    }
    public void b(h p0,h p1,int p2,int p3,float p4){
       h.b(this, p0, p1, p2, p3, p4);
    }
    public void c(h p0,int p1){
       b$e uoe = b$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1")) {
          return;
       }
       a.p(p0, "tab");
       b$e ta = this.a;
       Objects.requireNonNull(ta);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), ta, uob, "10")) {
          uob = ta.r;
          if (uob == null) {
             a.S("mHomeBlockViewState");
          }
          if (uob.d()) {
             uob = ta.q;
             String str = "mContainerDecorator";
             if (uob == null) {
                a.S(str);
             }
             h oh = uob.c().U(p1);
             b q = ta.q;
             if (q == null) {
                a.S(str);
             }
             b c = c.C;
             a.o(c, "HomeFragmentFuncIds.LOG_PAGE");
             e0 uoe0 = q.e().e(c);
             b.b(oh, p1, "HOT_CHANNEL_TAB", true, uoe0);
          }
       }
       this.a.W8(true);
       return;
    }
}
