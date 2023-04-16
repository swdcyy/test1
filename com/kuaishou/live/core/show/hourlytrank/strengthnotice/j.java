package com.kuaishou.live.core.show.hourlytrank.strengthnotice.j;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$e;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$f;
import java.lang.Object;
import ta1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
import p91.m;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$d;
import fa2.d0;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView$b;
import fa2.b0;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeNarrowItemView$a;
import fa2.c0;
import p63.a$a;
import com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import p63.a;
import jt5.b;

public class j implements LiveHourlyRankStrengthNoticeView$e	// class@000c53
{
    public final i$f a;

    public void j(i$f p0){
       this.a = p0;
       super();
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.e.b.o();
    }
    public LiveHourlyRankStrengthNoticeView$d b(){
       Object obj = PatchProxy.apply(null, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d0(this);
    }
    public LiveHourlyRankStrengthNoticeExpandView$b c(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b0(this);
    }
    public LiveHourlyRankStrengthNoticeNarrowItemView$a d(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c0(this);
    }
    public long e(){
       return this.a.d;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       a$a uoa = new a$a();
       uoa.a("popularitySubRankType", String.valueOf(this.a.c));
       this.a.e.e.c(LiveHourlyRankType.POPULARITY_RANK, "STRENGTHEN_NOTICE_BANNER", 0, uoa.b());
       return;
    }
}
