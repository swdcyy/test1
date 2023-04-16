package com.kwai.page.component.b;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import com.kwai.page.component.ComponentStateGraph$ComponentState;
import ud7.f;
import ge7.b;
import ge7.a;
import java.lang.Class;
import java.lang.String;
import java.lang.ref.WeakReference;
import vd7.a;
import vd7.b;
import android.view.ViewStub;
import java.util.Objects;
import com.kwai.page.component.ui.UIFrom;
import android.content.Context;
import com.kwai.page.component.ComponentException;
import java.lang.StringBuilder;
import ud7.g;
import com.kwai.page.component.ComponentStateGraph$a;
import com.kwai.page.component.ComponentStateGraph;
import java.lang.IllegalStateException;
import ee7.g;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class b	// class@001040
{
    public b a;
    public final a b;
    public final b c;
    public a d;
    public Context e;
    public ComponentStateGraph$ComponentState f;
    public boolean g;
    public boolean h;
    public d i;
    public a j;
    public final WeakReference k;
    public final LifecycleObserver l;
    public b m;

    public void b(LifecycleOwner p0){
       super();
       this.f = ComponentStateGraph$ComponentState.INIT;
       this.g = false;
       this.h = false;
       this.l = new f(this);
       b uob = this.n();
       this.c = uob;
       this.b = new a(uob, this.getClass().getName());
       this.k = new WeakReference(p0);
       this.d = this.j();
    }
    public final void b(b p0){
       this.a = p0;
       ComponentStateGraph$ComponentState bIND = ComponentStateGraph$ComponentState.BIND;
       if (this.f == bIND) {
          this.d = this.j();
          this.g = true;
       }
       this.i(bIND);
       return;
    }
    public void c(ViewStub p0,int p1){
       b tb = this.b;
       Objects.requireNonNull(tb);
       tb.e = UIFrom.STUB_VIEW;
       tb.b = p0;
       tb.h = p1;
       tb.d = p0.getContext();
       this.i(ComponentStateGraph$ComponentState.CREATE);
    }
    public abstract a d();
    public final void e(){
       this.i(ComponentStateGraph$ComponentState.DESTROY);
    }
    public final void f(String p0){
       if (this.h != null) {
          return;
       }
       throw new ComponentException(this.getClass().getName()+": 非Bind阶段不能调用 "+p0+" 方法");
    }
    public ComponentStateGraph$ComponentState g(){
       return this.f;
    }
    public final boolean h(){
       boolean b = (this.f.index() == ComponentStateGraph$ComponentState.BIND.index())? true: false;
       return b;
    }
    public final void i(ComponentStateGraph$ComponentState p0){
       if (ComponentStateGraph.a(this.f, p0, new g(this))) {
          return;
       }
       throw new IllegalStateException("不能从 "+this.f+" 跳到 "+p0+", class:"+this.getClass().getName());
    }
    public final a j(){
       a uoa = this.d();
       uoa.a.set(false);
       b tc = this.c;
       tc.g = this.k.get();
       tc.f = uoa;
       return uoa;
    }
    public void k(){
    }
    public void l(){
    }
    public void m(){
    }
    public abstract b n();
    public final void o(){
       this.i(ComponentStateGraph$ComponentState.UNBIND);
    }
}
