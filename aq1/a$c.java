package aq1.a$c;
import ub.a;
import aq1.a;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import aq1.e;
import java.lang.Runnable;
import ekd.k1;

public final class a$c extends a	// class@00027c
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$c.class, "1")) {
       }else {
          a.p(p0, "id");
          k1.s(new e(this), this, 200);
       }
       return;
    }
}
