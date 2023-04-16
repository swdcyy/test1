package com.kuaishou.live.core.show.vote.e$c;
import com.kuaishou.live.core.show.vote.f$b;
import com.kuaishou.live.core.show.vote.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.lang.StringBuilder;
import z12.e;
import wl2.o;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import java.lang.Runnable;
import ekd.k1;
import crd.b;
import lnc.b9;
import wl2.s;
import com.kuaishou.live.core.show.vote.model.VoteMessageInfo;
import wl2.r;
import wl2.p;
import wl2.q;

public class e$c implements f$b	// class@00122f
{
    public final e a;

    public void e$c(e p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,long p1){
       e$c uoc = e$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Long.valueOf(p1), this, uoc, "4")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoteAudienceManager", "on vote stop "+p0+" "+p1, stringArray);
       uoc = this.a;
       uoc.n = true;
       k1.r(new o(this), uoc.h.mResultDisplayMillis);
       b9.a(this.a.f);
       k1.o(new s(this, p0, p1));
       return;
    }
    public void b(VoteMessageInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "2")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoteAudienceManager", "on vote start", stringArray);
       this.a.n = false;
       k1.o(new r(this, p0));
       return;
    }
    public void c(long p0){
       e$c uoc = e$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "5")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoteAudienceManager", "on vote time count down", stringArray);
       k1.o(new p(this, p0));
       return;
    }
    public void d(VoteMessageInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "3")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoteAudienceManager", "on vote message update", stringArray);
       k1.o(new q(this, p0));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "1")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoteAudienceManager", "enter idle state", stringArray);
       return;
    }
}
