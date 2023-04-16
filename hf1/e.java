package hf1.e;
import k81.k;
import o81.g;
import java.lang.Object;
import android.view.ViewGroup;
import g81.a;
import k81.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.comments.widget.LiveCommentsNormalItemView;
import android.content.Context;
import hf1.e$a;

public class e implements k	// class@002685
{
    public final g a;

    public void e(g p0){
       super();
       this.a = p0;
    }
    public h a(ViewGroup p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return new e$a(this, new LiveCommentsNormalItemView(p0.getContext()));
    }
}
