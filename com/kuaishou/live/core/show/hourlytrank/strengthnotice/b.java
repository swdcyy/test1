package com.kuaishou.live.core.show.hourlytrank.strengthnotice.b;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$e;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$f;
import java.lang.Object;
import ta1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
import p91.m;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$d;
import fa2.f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView$b;
import fa2.d;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeNarrowItemView$a;
import fa2.e;

public class b implements LiveHourlyRankStrengthNoticeView$e	// class@000c44
{
    public final a$f a;

    public void b(a$f p0){
       this.a = p0;
       super();
    }
    public a a(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.d.b.o();
    }
    public LiveHourlyRankStrengthNoticeView$d b(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this);
    }
    public LiveHourlyRankStrengthNoticeExpandView$b c(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(this);
    }
    public LiveHourlyRankStrengthNoticeNarrowItemView$a d(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e(this);
    }
    public long e(){
       return this.a.c;
    }
}
