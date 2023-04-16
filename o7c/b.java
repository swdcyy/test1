package o7c.b;
import f7c.d;
import lnc.a1;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import qvb.a;
import a7c.h;
import android.view.View;
import d7c.b;
import g7c.a;
import com.yxcorp.gifshow.pymk.f;
import brd.t;
import a7c.h$a;
import com.kwai.robust.PatchProxyResult;
import ok.x;
import a7c.b$a;

public abstract class b extends d	// class@0038e2
{
    public RecyclerView f;
    public static final int g;

    static {
       b.g = a1.d(0x7f070329);
    }
    public void b(){
       super();
    }
    public void Ad(RecoUser p0,User p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "3")) {
          return;
       }
       super.Ad(p0, p1, p2);
       if (this.c.isEmpty()) {
          this.h();
       }
       return;
    }
    public void P2(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.P2();
       return;
    }
    public void Z3(RecoUser p0,h p1,View p2){
       PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "2");
    }
    public Class d(){
       return b.class;
    }
    public int e(){
       return 1;
    }
    public a f(){
       return null;
    }
    public h$a g(f p0,t p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       h$a uoa = new h$a(null, p0, true, p1).e(15, this.d());
       b$a uoa1 = new b$a();
       uoa1.f(true);
       uoa.g(uoa1);
       uoa.i(this.e());
       uoa.f(this.f());
       uoa.m(this);
       return uoa;
    }
    public abstract void h();
}
