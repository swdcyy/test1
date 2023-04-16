package a21.a;
import rd1.d;
import mp1.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;

public final class a implements d	// class@000035
{
    public final d b;
    public final c c;

    public void a(d p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void jd(int p0,boolean p1,String p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, a.class, "2")) {
          return;
       }
       this.c.g(p0);
       this.b.jd(p0, p1, p2);
       return;
    }
    public void p9(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.b.p9(p0);
       return;
    }
}
