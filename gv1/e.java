package gv1.e;
import ls5.a;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import java.lang.Boolean;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import java.lang.Number;

public final class e implements a	// class@00258e
{
    public final String a;
    public final List b;

    public void e(List p0){
       a.p(p0, "subItems");
       super();
       this.b = p0;
       this.a = "";
    }
    public final List a(){
       return this.b;
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       throw new IllegalStateException("can not getView from TempPlayFlipperPendantItem");
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.b.size() != b || !CollectionsKt___CollectionsKt.m2(this.b).c()) {
          b = false;
       }
       return b;
    }
    public void d(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       a.p(p0, "parent");
       return;
    }
    public void e(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       a.p(p0, "parent");
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof e && (this.b.size() == p0.b.size() && this.b.containsAll(p0.b)))? true: false;
       return b;
    }
    public String getId(){
       return this.a;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.hashCode();
    }
}
