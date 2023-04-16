package com.kuaishou.live.core.show.vote.f$d;
import hoc.b;
import com.kuaishou.live.core.show.vote.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hoc.c;
import z12.e;
import android.os.Message;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hoc.a;
import java.lang.Long;
import com.kuaishou.live.core.show.vote.f$b;
import com.kuaishou.live.core.show.vote.model.VoteMessageInfo;

public class f$d extends b	// class@001234
{
    public final f a;

    public void f$d(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$d.class, "1")) {
          return;
       }
       this.a.m(8, 8000);
       String[] stringArray = new String[0];
       e.c("VoteStateMachine", "enter vote local stop", stringArray);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f$d.class, "2")) {
          return;
       }
       this.a.i(8);
       String[] stringArray = new String[0];
       e.c("VoteStateMachine", "exit vote local stop", stringArray);
       return;
    }
    public boolean c(Message p0){
       Message obj = PatchProxy.applyOneRefs(p0, this, f$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.what;
       if (obj != true) {
          if (obj != 2) {
             int i = 8;
             if (obj != i) {
                return false;
             }else {
                this.a.i(i);
                f$d ta = this.a;
                ta.p(ta.d);
                return true;
             }
          }else {
             f$d ta1 = this.a;
             ta1.p(ta1.g);
             f h = this.a.h;
             p0 = p0.obj;
             long l = (p0 != null)? p0.longValue(): 0;
             h.a(false, l);
             return true;
          }
       }else {
          this.a.h.d(p0.obj);
          return true;
       }
    }
}
