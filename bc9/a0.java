package bc9.a0;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import bc9.z;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.base.d;
import pc9.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.camera.record.base.b;

public final class a0 extends RecyclerView$r	// class@0003d0
{
    public final RecyclerView a;
    public final z b;

    public void a0(RecyclerView p0,z p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport2(a0.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, a0.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (!p1) {
          this.a.removeOnScrollListener(this);
          a0 tb = this.b;
          tb.d.m(new c(tb.h2()));
       }
       PatchProxy.onMethodExit(a0.class, "1");
       return;
    }
}
