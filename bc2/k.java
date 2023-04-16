package bc2.k;
import bc2.d;
import yb2.i;
import bc2.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.show.luckystar.util.b;
import bc2.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import bc2.j;
import z1.a;
import bc2.i;
import bc2.h;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import android.app.Activity;
import d61.g;
import androidx.fragment.app.c;

public class k implements d	// class@0003d6
{
    public final i a;
    public final m b;
    public final b c;
    public KwaiDialogFragment d;
    public KwaiDialogFragment e;
    public KwaiDialogFragment f;

    public void k(i p0,b p1){
       super();
       this.a = p0;
       this.b = p0.a;
       this.c = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, k.class, "7")) {
          return;
       }
       b.c(this.d);
       return;
    }
    public void b(){
       c.a(this);
    }
    public void c(){
       k ok = k.class;
       if (PatchProxy.applyVoid(null, this, ok, "6")) {
          return;
       }
       this.a();
       if (!PatchProxy.applyVoid(null, this, ok, "8")) {
          b.c(this.e);
       }
       if (!PatchProxy.applyVoid(null, this, ok, "9")) {
          b.c(this.f);
       }
       return;
    }
    public boolean d(){
       k obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = (obj != null && obj.isAdded())? true: false;
       return b;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       this.c();
       this.i(new j(this, p0));
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, k.class, "5")) {
          return;
       }
       this.c();
       if (this.c.E0()) {
          this.i(new i(this));
       }
       return;
    }
    public boolean g(){
       k obj = PatchProxy.apply(null, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       boolean b = (obj != null && obj.isAdded())? true: false;
       return b;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       this.c();
       if (this.c.h2()) {
          this.i(new h(this));
       }
       return;
    }
    public final void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "10")) {
          return;
       }
       if (!this.b.b().isAdded()) {
          return;
       }
       if (g.h(this.c.getActivity())) {
          return;
       }
       p0.accept(this.b.b().getChildFragmentManager());
       return;
    }
}
