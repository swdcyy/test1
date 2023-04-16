package gy9.a;
import erd.g;
import d7a.b;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.lang.Object;
import rd5.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a implements g	// class@002507
{
    public final b b;
    public final IntensifyFollowElement c;

    public void a(b p0,IntensifyFollowElement p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
       }else {
          this.c.G0(this.b, p0.a, p0.b);
          PatchProxy.onMethodExit(a.class, "1");
       }
       return;
    }
}
