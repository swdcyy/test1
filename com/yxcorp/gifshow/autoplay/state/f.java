package com.yxcorp.gifshow.autoplay.state.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import pr6.d;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import xl8.b;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.autoplay.state.f$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.s;
import t45.d;
import brd.z;
import java.util.Objects;
import y99.j;
import erd.g;

public class f	// class@001c3e
{
    public final d a;
    public final b b;
    public f$a c;
    public b d;

    public void f(BaseFragment p0){
       super(new d(p0));
    }
    public void f(d p0){
       super();
       this.a = p0;
       this.b = new b(Boolean.FALSE);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       if (this.c != null) {
          b9.a(this.d);
          this.c = null;
       }
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.c() ^ 0x01);
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.b.a();
       }
       return obj.booleanValue();
    }
    public t d(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.k() || this.a.g() == null) {
          this.a();
          return t.empty();
       }else if(this.c == null){
          this.c = new f$a(this);
          f tc = this.c;
          Objects.requireNonNull(tc);
          this.d = RxBus.f.f(s.class).observeOn(d.a).subscribe(new j(tc));
       }
       return this.b.observable();
    }
}
