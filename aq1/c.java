package aq1.c;
import ub.a;
import aq1.a;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;
import kotlin.jvm.internal.a;
import aq1.b;
import java.lang.Runnable;
import ekd.k1;

public final class c extends a	// class@000280
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       this.b.K3();
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "1")) {
       }else {
          a.p(p0, "id");
          k1.s(new b(this), this, 200);
       }
       return;
    }
}
