package e7a.l$a;
import ub.a;
import e7a.l;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.refresh.KwaiLoadingView;

public class l$a extends a	// class@00208c
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l$a.class, "1")) {
       }else {
          this.b.q.setVisibility(8);
       }
       return;
    }
}
