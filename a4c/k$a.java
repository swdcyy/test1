package a4c.k$a;
import ub.a;
import a4c.k;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class k$a extends a	// class@000075
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k$a.class, "1")) {
          return;
       }
       k$a tb = this.b;
       tb.q.setTag(R.id.music_cover, tb.p);
       return;
    }
}
