package com.kuaishou.live.core.show.vote.f$c;
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
import java.lang.Long;
import hoc.a;
import com.kuaishou.live.core.show.vote.model.VoteMessageInfo;
import com.kuaishou.live.core.show.vote.f$b;

public class f$c extends b	// class@001233
{
    public final f a;

    public void f$c(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$c.class, "1")) {
          return;
       }
       this.a.m(5, 8000);
       String[] stringArray = new String[0];
       e.c("VoteStateMachine", "enter vote end", stringArray);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f$c.class, "2")) {
          return;
       }
       this.a.i(5);
       String[] stringArray = new String[0];
       e.c("VoteStateMachine", "exit vote end", stringArray);
       return;
    }
    public boolean c(Message p0){
       Message obj = PatchProxy.applyOneRefs(p0, this, f$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.what;
       if (obj != true) {
          if (obj != 5) {
             if (obj != 7) {
                return false;
             }
             this.a.m(5, p0.obj.longValue());
             return true;
          }else {
             f$c ta = this.a;
             ta.p(ta.d);
             return true;
          }
       }else {
          f$c ta1 = this.a;
          ta1.p(ta1.e);
          this.a.h.b(p0.obj);
          return true;
       }
    }
}
