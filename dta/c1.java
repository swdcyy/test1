package dta.c1;
import com.yxcorp.gifshow.homepage.presenter.i;
import gsa.j0;
import ko5.b;
import brd.t;
import wq6.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.kcube.TabIdentifier;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kcube.decorator.IContainerDecorator;
import on5.b;
import wq6.g;
import wq6.h;
import java.lang.Boolean;
import xr6.c$a;
import xr6.c;
import com.yxcorp.gifshow.homepage.kcube.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class c1 extends i	// class@002527
{
    public l z;

    public void c1(j0 p0,b p1,t p2,f p3){
       super(p0, p1, p2, p3);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c1.class, "2")) {
          return;
       }
       super.E8();
       this.S8(this.x.f());
       return;
    }
    public TabIdentifier R8(){
       Object obj = PatchProxy.apply(null, this, c1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TabIdentifier b = b.b;
       if (this.z.c().O(b)) {
          return b;
       }
       b = b.f;
       if (this.z.c().O(b)) {
          return b;
       }
       return this.z.c().U(0).M2();
    }
    public void V8(TabIdentifier p0,boolean p1,String p2){
       if (PatchProxy.isSupport(c1.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, c1.class, "4")) {
          return;
       }
       this.z.c().J(p0, p1, c.a(p2).a());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c1.class, "1")) {
          return;
       }
       super.j8();
       this.z = this.q8(l.class);
       return;
    }
}
