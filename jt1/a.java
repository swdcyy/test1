package jt1.a;
import bt1.c;
import com.kuaishou.live.viewcontroller.ViewController;
import ft1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.pk.MultiPkGameState;
import com.kwai.robust.PatchProxyResult;
import bt1.b;
import bt1.a;

public class a extends ViewController implements c	// class@002c04
{
    public final b j;

    public void a(b p0){
       a.p(p0, "gameModel");
       super();
       this.j = p0;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.j.i(this);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.j.t(this);
       return;
    }
    public final MultiPkGameState V2(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.m();
    }
    public final b W2(){
       return this.j;
    }
    public void Y0(){
       b.d(this);
    }
    public void Z1(){
       b.a(this);
    }
    public void e2(a p0){
       b.c(this, p0);
    }
    public void i2(){
       b.b(this);
    }
}
