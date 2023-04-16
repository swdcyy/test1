package a7a.p$b;
import jd5.i;
import a7a.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;

public class p$b implements i	// class@000072
{
    public final p a;

    public void p$b(p p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       if (PatchProxy.isSupport2(p$b.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, p$b.class, "1")) {
          return;
       }
       p$b ta = this.a;
       if (ta.z != ta.v.getCurrentPosition()) {
          ta = this.a;
          ta.P8(ta.v.getCurrentPosition());
          ta = this.a;
          ta.z = ta.v.getCurrentPosition();
       }
       PatchProxy.onMethodExit(p$b.class, "1");
       return;
    }
    public void b(int p0,int p1){
    }
    public void c(){
    }
}
