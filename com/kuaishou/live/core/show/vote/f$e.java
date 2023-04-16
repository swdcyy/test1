package com.kuaishou.live.core.show.vote.f$e;
import hoc.b;
import com.kuaishou.live.core.show.vote.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z12.e;
import android.os.Message;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Long;
import com.kuaishou.live.core.show.vote.f$b;
import hoc.a;
import hoc.c;
import com.kuaishou.live.core.show.vote.model.VoteMessageInfo;

public class f$e extends b	// class@001235
{
    public final f a;

    public void f$e(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$e.class, "2")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("VoteStateMachine", "enter voting", stringArray);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f$e.class, "3")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("VoteStateMachine", "exit voting", stringArray);
       return;
    }
    public boolean c(Message p0){
       f$e ta;
       f h;
       Message obj = PatchProxy.applyOneRefs(p0, this, f$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.what;
       if (obj != true) {
          long l = 0;
          if (obj != 2) {
             if (obj != 3) {
                if (obj != 6) {
                   return false;
                }else {
                   this.a.h.c(p0.obj.longValue());
                   return true;
                }
             }else {
                ta = this.a;
                ta.p(ta.f);
                h = this.a.h;
                p0 = p0.obj;
                if (p0 != null) {
                   l = p0.longValue();
                }
                h.a(true, l);
                return true;
             }
          }else {
             ta = this.a;
             ta.p(ta.g);
             h = this.a.h;
             p0 = p0.obj;
             if (p0 != null) {
                l = p0.longValue();
             }
             h.a(false, l);
             return true;
          }
       }else {
          this.a.h.d(p0.obj);
          return true;
       }
    }
}
