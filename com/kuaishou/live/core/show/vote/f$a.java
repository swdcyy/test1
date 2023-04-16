package com.kuaishou.live.core.show.vote.f$a;
import hoc.b;
import com.kuaishou.live.core.show.vote.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.vote.f$b;
import z12.e;
import android.os.Message;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hoc.a;
import hoc.c;
import com.kuaishou.live.core.show.vote.model.VoteMessageInfo;

public class f$a extends b	// class@001231
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       this.a.h.e();
       String[] stringArray = new String[0];
       e.c("VoteStateMachine", "enter idle", stringArray);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "3")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("VoteStateMachine", "exit idle", stringArray);
       return;
    }
    public boolean c(Message p0){
       Message obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.what;
       if (obj != true) {
          if (obj != 2) {
             return false;
          }
          f$a ta = this.a;
          ta.p(ta.d);
          return true;
       }else {
          f$a ta1 = this.a;
          ta1.p(ta1.e);
          this.a.h.b(p0.obj);
          return true;
       }
    }
}
