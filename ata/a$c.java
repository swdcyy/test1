package ata.a$c;
import ub.a;
import ata.a;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;

public final class a$c extends a	// class@0002f2
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$c.class, "3")) {
          return;
       }
       p0.h = null;
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$c.class, "2")) {
       }else {
          this.b.i(p1);
       }
       return;
    }
    public void onIntermediateImageSet(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$c.class, "1")) {
       }else {
          this.b.i(p1);
       }
       return;
    }
}
