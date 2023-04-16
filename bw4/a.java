package bw4.a;
import bw4.b;
import bw4.a$c;
import bw4.a$b;
import bw4.a$a;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.String;
import jw4.c;
import bw4.b$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.Set;
import xv4.h;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.Message;

public class a extends b	// class@0003dc
{
    public b$b d;
    public b$b e;
    public b$b f;
    public Set g;

    public void a(){
       super();
       this.d = new a$c(this);
       this.e = new a$b(this);
       this.f = new a$a(this);
       this.g = new CopyOnWriteArraySet();
       c.a("KSRTCStateMachine", "init");
       this.a(this.d);
       this.a(this.e);
       this.a(this.f);
       this.b = this.d;
    }
    public void h(b$b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       c.d("KSRTCStateMachine", "dispatchRTCState", "state", p0, "object", p1, "listeners", this.g);
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          h oh = iterator.next();
          int i = this.j(p0);
          int i1 = (p1 == null)? 0: p1.intValue();
          oh.c8(i, i1);
       }
       return;
    }
    public int i(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.j(this.b);
    }
    public int j(b$b p0){
       if (p0 instanceof a$b) {
          return 1;
       }
       if (p0 instanceof a$a) {
          return 2;
       }
       return 0;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       c.b("KSRTCStateMachine", "moveToConnectedState", "current state", Integer.valueOf(this.i()));
       if (this.i() == 1) {
          this.e(2);
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       c.b("KSRTCStateMachine", "moveToConnectingState", "current state", Integer.valueOf(this.i()));
       if (!this.i()) {
          this.e(1);
       }
       return;
    }
    public void m(int p0){
       Message message;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       c.c("KSRTCStateMachine", "moveToIdleState", "current state", Integer.valueOf(this.i()), "reason", Integer.valueOf(p0));
       if (!this.i()) {
          return;
       }
       Integer integer = Integer.valueOf(p0);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(0), integer, this, uob, "11")) {
          if (PatchProxy.isSupport(uob)) {
             message = PatchProxy.applyTwoRefs(Integer.valueOf(0), integer, this, uob, "7");
             if (message != PatchProxyResult.class) {
             label_006a :
                this.f(message);
             }
          }
          message = this.d(0);
          message.obj = integer;
          goto label_006a ;
       }
       return;
    }
}
