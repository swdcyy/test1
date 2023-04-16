package fia.k$a;
import d6a.a;
import fia.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import tga.e;
import im8.f;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import fia.k$a$a;
import kga.c;
import erd.g;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class k$a extends a	// class@002916
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "2")) {
          return;
       }
       k t = this.b.t;
       if (t != null) {
          t.dispose();
       }
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$a.class, "1")) {
          return;
       }
       RxBus f = RxBus.f;
       k s = this.b.s;
       if (s != null) {
          objArray = s.get();
       }
       f.b(new e(a.g(objArray, Boolean.FALSE)));
       k$a tb = this.b;
       k p = tb.p;
       if (p != null) {
          tb.t = p.subscribe(k$a$a.b, c.a);
          tb = this.b;
          p = tb.t;
          a.m(p);
          tb.X7(p);
       }
       return;
    }
}
