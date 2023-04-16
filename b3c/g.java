package b3c.g;
import com.kwai.page.component.a;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import b3c.h;
import com.yxcorp.gifshow.profile.ProfileStyle;
import ee7.g;
import java.lang.Class;
import com.kwai.page.component.b;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c3c.a;
import s1c.a;
import brd.t;
import j5c.c;
import b3c.b;
import erd.g;
import crd.b;
import b3c.c;
import j5c.a;
import b3c.d;
import b3c.f;
import ee7.d;
import b3c.a;
import com.kwai.page.component.ComponentStateGraph$ComponentState;
import ud7.c;
import java.util.LinkedList;
import ud7.a;
import yd7.a;
import com.kwai.page.component.actions.LoadAction;
import ee7.e;
import yd7.b;
import com.kwai.page.component.load.LoadState;
import java.util.List;
import com.kwai.page.component.ComponentException;
import java.lang.StringBuilder;
import s1c.v;
import com.kwai.feature.api.social.profile.model.ProfileParam;

public class g extends a	// class@0003a0
{
    public User l;
    public ProfileParam m;
    public v n;
    public ProfileStyle o;

    public void g(LifecycleOwner p0,View p1,h p2,ProfileStyle p3){
       super(p0, p1, p2);
       this.o = p3;
    }
    public b c(Class p0,LifecycleOwner p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == a.class) {
          return new a(p1);
       }
       return null;
    }
    public void m(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "5")) {
          this.a(this.n.e.e().subscribe(new b(this)));
          this.a(this.n.e.b().subscribe(new c(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "6")) {
          this.a(this.n.k.b().subscribe(new d(this)));
       }
       return;
    }
    public final void n(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "3")) {
          a uoa = a.class;
          int i = 0x7f0a1279;
          f uof = new f(this, this.c.e);
          a uoa1 = new a(this);
          if (this.i == ComponentStateGraph$ComponentState.INIT) {
             View view = this.b.findViewById(i);
             a uoa2 = c.a.poll();
             if (uoa2 == null) {
                uoa2 = new a();
             }
             uoa2.b = false;
             uoa2.e = uoa;
             uoa2.j = view;
             uoa2.i = view.getId();
             uoa2.m = uoa1;
             uoa2.d = uof;
             uoa2.k = uof.a();
             uoa2.l = this;
             if (uof.a() != null) {
                uoa2.k.t(LoadAction.BUILDER_SYNC);
                if (uof instanceof b) {
                   uoa2.k.q(LoadState.LOAD);
                }else {
                   uoa2.k.q(LoadState.UNLOAD);
                }
             }
             this.e.add(uoa2);
          }else {
             throw new ComponentException("只能在createComponents里调用createComponent方法: "+this.getClass().getName());
          }
       }
       return;
    }
    public void o(v p0,ProfileParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "1")) {
          return;
       }
       this.m = p1;
       this.n = p0;
       this.l = p1.mUser;
       p0.g = this.c.c;
       return;
    }
}
