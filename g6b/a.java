package g6b.a;
import g6b.a$a;
import nsd.u;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Map;
import android.os.Bundle;
import yz6.l;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.Objects;
import com.yxcorp.gifshow.map.map.markerStyle.BaseMarkerViewStyle;
import yz6.j;

public final class a	// class@002a89
{
    public Map a;
    public j b;
    public ArrayList c;
    public j d;
    public List e;
    public a f;
    public a g;
    public a h;
    public static final a$a i;

    static {
       a.i = new a$a(null);
    }
    public void a(){
       super();
       this.a = new HashMap();
       this.c = new ArrayList();
       this.e = new LinkedList();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<MutableList<QPhoto>>\(\)");
       this.f = uoa;
       uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Boolean>\(\)");
       this.g = uoa;
       uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Boolean>\(\)");
       this.h = uoa;
    }
    public final void a(Collection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       a.p(p0, "elements");
       this.e.addAll(p0);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       this.e.clear();
       return;
    }
    public final Map c(){
       return this.a;
    }
    public final List d(){
       return this.e;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "16")) {
          return;
       }
       a td = this.d;
       if (td != null) {
          Serializable serializable = SerializableHook.getSerializable(td.getExtraInfo(), "markerViewStyle");
          Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.yxcorp.gifshow.map.map.markerStyle.BaseMarkerViewStyle");
          serializable.onCancelSelectMarker();
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.i();
          tb.remove();
          this.b = null;
       }
       return;
    }
    public final void g(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (p0 != null) {
          this.c.add(p0);
       }
       return;
    }
    public final void h(j p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "5")) {
          return;
       }
       a.p(p0, "currentSelectMarkers");
       this.e();
       this.d = p0;
       if (!PatchProxy.applyVoid(null, this, uoa, "17")) {
          a td = this.d;
          if (td != null) {
             Serializable serializable = SerializableHook.getSerializable(td.getExtraInfo(), "markerViewStyle");
             Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.yxcorp.gifshow.map.map.markerStyle.BaseMarkerViewStyle");
             serializable.onSelectMarker();
          }
       }
       return;
    }
}
