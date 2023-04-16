package c19.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c19.a$a;
import nsd.u;
import c19.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;

public abstract class a extends PresenterV2	// class@0004c0
{
    public final a$b p;
    public static final a$a q;

    static {
       a.q = new a$a(null);
    }
    public void a(){
       super();
       this.p = new a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.R8(this.p);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.S8(this.p);
       return;
    }
    public abstract Object P8();
    public abstract void R8(q p0);
    public abstract void S8(q p0);
}
