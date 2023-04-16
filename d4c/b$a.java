package d4c.b$a;
import ub.a;
import d4c.b;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class b$a extends a	// class@0020c2
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       tb.p.setTag(R.id.music_cover, tb.u);
       return;
    }
}
