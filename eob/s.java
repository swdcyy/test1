package eob.s;
import com.kwai.plugin.dva.work.c$c;
import eob.t;
import brd.v;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hob.a;
import java.lang.Integer;
import brd.g;
import sj7.d;

public class s implements c$c	// class@00279b
{
    public final long a;
    public final v b;
    public final t c;

    public void s(t p0,long p1,v p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       a.a(false, false, this.a);
       this.b.onNext(Integer.valueOf(-1));
       this.b.onComplete();
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
       }else {
          a.a(false, true, this.a);
          this.b.onNext(Integer.valueOf(2));
          this.b.onComplete();
       }
       return;
    }
}
