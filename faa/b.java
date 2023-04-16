package faa.b;
import brd.y;
import brd.d0;
import brd.d;
import brd.p;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import w46.b;
import crd.b;

public final class b implements y, d0, d, p	// class@0022f0
{
    public final String b;
    public final String c;

    public void b(String p0,String p1){
       a.p(p0, "tag");
       a.p(p1, "msg");
       super();
       this.b = p0;
       this.c = p1;
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(this.b, this.c+":onComplete", objArray);
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "error");
       a.D().e(this.b, this.c+":onError", p0);
       return;
    }
    public void onNext(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(this.b, this.c+":onNext:"+p0, objArray);
       return;
    }
    public void onSubscribe(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "disposable");
       Object[] objArray = new Object[0];
       a.D().w(this.b, this.c+":onSubscribe", objArray);
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(this.b, this.c+":onSuccess:"+p0, objArray);
       return;
    }
}
