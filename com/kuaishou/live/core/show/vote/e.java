package com.kuaishou.live.core.show.vote.e;
import com.kuaishou.live.core.show.vote.e$b;
import java.lang.Object;
import com.kuaishou.live.core.show.vote.model.VoteMessageInfo;
import mrd.a;
import java.util.Random;
import java.lang.System;
import com.kuaishou.live.core.show.vote.e$c;
import com.kuaishou.live.core.show.vote.f;
import com.kuaishou.live.core.show.vote.f$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import brd.y;
import com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import android.os.Message;
import hoc.c;
import z12.e;
import crd.b;
import lnc.b9;
import java.util.Objects;
import android.os.CountDownTimer;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.vote.e$a;

public class e	// class@001230
{
    public f a;
    public e$b b;
    public CountDownTimer c;
    public VoteMessageInfo d;
    public Random e;
    public b f;
    public boolean g;
    public LiveVoterResponse h;
    public e$c i;
    public int j;
    public long k;
    public boolean l;
    public c m;
    public boolean n;

    public void e(e$b p0){
       super();
       this.d = new VoteMessageInfo();
       this.g = false;
       this.l = false;
       this.m = a.g();
       this.n = true;
       this.e = new Random(System.currentTimeMillis());
       this.b = p0;
       e$c uoc = new e$c(this);
       this.i = uoc;
       this.a = new f(uoc);
    }
    public final long a(long p0){
       long l;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoe, "6");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (this.e == null) {
          this.e = new Random(System.currentTimeMillis());
       }
       uoe = null;
       if (p0 - uoe > 0) {
          l = (long)this.e.nextInt((int)p0);
       }
       return l;
    }
    public final void b(LiveVoterResponse p0){
       e ta;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "5")) {
          return;
       }
       this.m.onNext(p0);
       this.f = null;
       this.j = 0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoe, "7")) {
          this.h = p0;
          this.b.d(p0);
       }
       this.d.updateFromVoteResponse(p0);
       if (p0.mVote.isViteStop()) {
          p0.mRestTime = 0;
          ta = this.a;
          ta.l(ta.e(2));
       }else {
          this.e(p0.mVote.mLeftMillis);
          ta = this.a;
          ta.l(ta.f(1, this.d));
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "10")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoteAudienceManager", "release", stringArray);
       this.g = true;
       this.h = null;
       b9.a(this.f);
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, f.class, "1")) {
          ta.h();
       }
       ta = this.c;
       if (ta != null) {
          ta.cancel();
          this.c = null;
       }
       return;
    }
    public void d(long p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "12")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoteAudienceManager", "start timer count down "+p0, stringArray);
       uoe = this.c;
       if (uoe != null) {
          uoe.cancel();
       }
       if (p0 <= 0) {
          e ta = this.a;
          ta.l(ta.e(3));
          return;
       }else {
          e$a uoa = new e$a(this, p0, 200);
          this.c = v6;
          v6.start();
          return;
       }
    }
    public void e(long p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "13")) {
          return;
       }
       this.d(p0);
       return;
    }
}
