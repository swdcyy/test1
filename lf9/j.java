package lf9.j;
import lf9.b;
import lf9.m;
import lf9.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import kf9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import kf9.f;
import j8c.a;
import q87.c;
import java.util.HashMap;
import java.util.List;

public final class j extends b	// class@002dd6
{
    public final q b;

    public void j(m p0,q p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          if (p0.b() != uob.b()) {
             Object[] objArray = new Object[0];
             a.D().A("SliMode", "ClickEmptyDelegate, action.index != listState.currentSelectPosition", objArray);
          }else if(uob.d()){
             this.a().h(f.a(uob, null, 0, 0, null, false, false, 31, null));
          }
          this.b.w0();
       }
       return;
    }
}
