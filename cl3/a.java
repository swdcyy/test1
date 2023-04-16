package cl3.a;
import p51.c;
import android.app.Activity;
import android.view.View;
import com.kuaishou.live.common.core.basic.player.AdaptPlayViewReason;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class a extends c	// class@00058a
{
    public final float k;

    public void a(Activity p0,View p1,View p2,float p3){
       super(p0, p1, p2);
       this.k = p3;
    }
    public void b(float p0,AdaptPlayViewReason p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       super.b(p0, p1);
       this.m();
       return;
    }
    public void c(int p0,float p1,AdaptPlayViewReason p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), p2, this, a.class, "2")) {
          return;
       }
       super.c(p0, p1, p2);
       if (p0 == 17) {
          this.m();
       }
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.b.setTranslationY(this.k);
       return;
    }
}
