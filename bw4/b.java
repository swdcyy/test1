package bw4.b;
import java.lang.Object;
import java.util.HashSet;
import bw4.b$a;
import android.os.Looper;
import bw4.b$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import android.os.Message;
import java.lang.StringBuilder;
import jw4.c;
import java.lang.Boolean;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Thread;
import android.os.Handler;
import java.util.Objects;
import java.lang.IllegalArgumentException;

public class b	// class@0003df
{
    public final Set a;
    public b$b b;
    public Handler c;

    public void b(){
       super();
       this.a = new HashSet();
       this.c = new b$a(this, Looper.getMainLooper());
    }
    public void a(b$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public void b(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       c.a("KSRTCStateMachine", "unhandledMessage: msg.what="+p0.what);
       return;
    }
    public void c(Message p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "3")) {
          return;
       }
       c.a("KSRTCStateMachine", "currentState = ["+this.b.toString()+"]");
       if (!this.b.a(p0)) {
          this.b(p0);
       }
       if (p1) {
          try{
             p0.recycle();
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public final Message d(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Message message = PatchProxy.apply(null, this, uob, "5");
       if (message != PatchProxyResult.class) {
       }else {
          message = Message.obtain();
       }
       message.what = p0;
       return message;
    }
    public final void e(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "10")) {
          return;
       }
       this.f(this.d(p0));
       return;
    }
    public final void f(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       c.a("KSRTCStateMachine", "currentState = ["+this.b.toString()+"]");
       if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
          this.c(p0, true);
       }else {
          this.c.sendMessage(p0);
       }
       return;
    }
    public void g(b$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       if (!this.a.contains(p0)) {
          throw new IllegalArgumentException("unknown state: "+p0);
       }
       b tb = this.b;
       Objects.requireNonNull(tb, "currentState should not be null");
       StringBuilder str = "transition from:"+tb;
       c.a("KSRTCStateMachine", str+" => "+p0);
       this.b = p0;
       Objects.requireNonNull(p0);
       return;
    }
}
