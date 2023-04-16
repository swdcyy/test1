package cl3.b;
import p51.a;
import android.app.Activity;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import p51.c;

public class b extends a	// class@00058b
{
    public final float r;

    public void b(Activity p0,View p1,View p2,float p3){
       super(p0, p1, p2);
       this.r = p3;
    }
    public void m(float p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       super.m(p0);
       this.u();
       return;
    }
    public void n(float p0,int p1,float p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, b.class, "2")) {
          return;
       }
       super.n(p0, p1, p2);
       if (p1 == 17) {
          this.u();
       }
       return;
    }
    public final void u(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.b.setTranslationY(this.r);
       return;
    }
}
