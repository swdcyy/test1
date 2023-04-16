package bed.a0;
import z3b.f;
import bed.y;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Throwable;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import qm6.b$a;
import android.content.Context;
import z3b.e;

public class a0 implements f	// class@0003fd
{
    public final ProgressFragment a;
    public final int b;
    public final y c;

    public void a0(y p0,ProgressFragment p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void b(MagicBaseConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "2")) {
          return;
       }
       a0 ta = this.a;
       if (ta != null) {
          ta.dismiss();
       }
       this.c.f(this.b, p0);
       return;
    }
    public void d(MagicBaseConfig p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a0.class, "1")) {
          return;
       }
       if (this.c.b.mMusic == null) {
          a0 ta = this.a;
          if (ta != null) {
             ta.dismiss();
          }
          ta = this.c;
          ta.l(new b$a(ta.a, this.b).e0(ta.b.mTagName));
       }
       return;
    }
    public void e(MagicBaseConfig p0){
       e.a(this, p0);
    }
    public void g(MagicBaseConfig p0,int p1,int p2){
       e.d(this, p0, p1, p2);
    }
}
