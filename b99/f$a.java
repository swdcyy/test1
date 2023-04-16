package b99.f$a;
import uw9.y;
import b99.f;
import java.lang.Object;
import uw9.x;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class f$a implements y	// class@00039e
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       x.a(this);
    }
    public void e(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, f$a.class, "1")) {
          return;
       }
       this.a.V8();
       return;
    }
}
