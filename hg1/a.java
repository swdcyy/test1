package hg1.a;
import dp3.e;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import dp3.g;
import fp3.e;
import hg1.a$a;
import fp3.a;
import android.view.LayoutInflater;
import android.animation.Animator;
import dp3.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fo1.a;

public final class a implements e	// class@00269a
{
    public final ViewGroup b;

    public void a(ViewGroup p0){
       a.p(p0, "container");
       super();
       this.b = p0;
    }
    public void G(g p0,e p1){
    }
    public void H(a p0,LayoutInflater p1){
    }
    public boolean I(g p0){
       return false;
    }
    public void J(e p0,int p1,int p2,int p3,int p4,Animator p5){
       d.a(this, p0, p1, p2, p3, p4, p5);
    }
    public void K(e p0,g p1,Animator p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "2")) {
          return;
       }
       if (p0 instanceof a) {
          this.b.setAlpha(0);
          this.b.setVisibility(4);
       }
       return;
    }
    public void L(e p0,g p1,Animator p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "3")) {
          return;
       }
       if (p0 instanceof a) {
          this.b.setAlpha(0x3f800000);
          this.b.setVisibility(0);
       }
       return;
    }
    public ViewGroup getView(){
       return this.b;
    }
    public void r(int p0){
       d.b(this, p0);
    }
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b.setAlpha(0x3f800000);
       this.b.setVisibility(0);
       return;
    }
    public void w(g p0,e p1){
    }
}
