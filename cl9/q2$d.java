package cl9.q2$d;
import erd.g;
import cl9.q2;
import java.lang.Object;
import nk9.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yk9.f;

public final class q2$d implements g	// class@00065c
{
    public final q2 b;

    public void q2$d(q2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q2$d.class, "1")) {
       }else if(p0.d <= 0 || p0.e == null){
          q2.P8(this.b).e();
       }else {
          q2.P8(this.b).a(p0.d);
       }
       return;
    }
}
