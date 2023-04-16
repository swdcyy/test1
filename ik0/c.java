package ik0.c;
import ik0.k;
import ik0.g;
import android.view.ViewGroup;
import com.kuaishou.krn.model.LaunchModel;
import kk0.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import kk0.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.title.a;

public final class c implements k	// class@00290d
{
    public c a;
    public View b;
    public FrameLayout c;
    public g d;
    public LaunchModel e;
    public a f;

    public void c(g p0,ViewGroup p1,LaunchModel p2,a p3){
       a.p(p0, "mKrnContainer");
       a.p(p1, "rootLayout");
       a.p(p2, "mLaunchModel");
       a.p(p3, "mTopBarConfig");
       super();
       this.d = p0;
       this.e = p2;
       this.f = p3;
       ViewStub viewStub = p1.findViewById(R.id.kds_top_bar_title_layout_stub);
       View view = (viewStub != null)? viewStub.inflate(): p1.findViewById(R.id.kds_top_bar_title_layout_inflated);
       this.b = view;
       this.c = p1.findViewById(0x7f0a1603);
       return;
    }
    public c m1(){
       c obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          a uoa = new a(this.d, this.b, this.c, this.e, this.f);
          this.a = obj;
       }
       obj = this.a;
       a.m(obj);
       return obj;
    }
}
