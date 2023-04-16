package com.kuaishou.live.common.core.component.watchingcount.updater.b;
import com.kuaishou.live.common.core.component.watchingcount.updater.a;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData$SourceType;
import java.lang.Object;
import java.util.HashSet;
import com.google.common.collect.o;
import z1.k;
import com.kuaishou.live.common.core.component.watchingcount.updater.a$a;
import com.kuaishou.live.common.core.component.watchingcount.updater.a$b;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Set;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import xy1.b;
import com.kuaishou.live.common.core.component.watchingcount.updater.b$a;
import ho1.l$b;
import ho1.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class b implements a	// class@0017cb
{
    public final k a;
    public final boolean b;
    public final a$a c;
    public final a$b d;
    public final k e;
    public WatchingCountData f;
    public WatchingCountData g;
    public static final Set h;
    public static final Set i;

    static {
       WatchingCountData$SourceType aPI_LOOP;
       WatchingCountData$SourceType aPI_START_PL;
       WatchingCountData$SourceType sC_LIVE_WATC;
       WatchingCountData$SourceType[] sourceTypeAr = new WatchingCountData$SourceType[]{aPI_LOOP,aPI_START_PL,WatchingCountData$SourceType.SC_FEED_PUSH,sC_LIVE_WATC};
       aPI_LOOP = WatchingCountData$SourceType.API_LOOP;
       aPI_START_PL = WatchingCountData$SourceType.API_START_PLAY;
       sC_LIVE_WATC = WatchingCountData$SourceType.SC_LIVE_WATCHING_LIST;
       b.h = o.k(sourceTypeAr);
       sourceTypeAr = new WatchingCountData$SourceType[]{aPI_LOOP,aPI_START_PL,sC_LIVE_WATC};
       b.i = o.k(sourceTypeAr);
    }
    public void b(k p0,boolean p1,a$a p2,a$b p3,k p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void a(WatchingCountData p0){
       WatchingCountData watchingCoun;
       WatchingCountData b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       LiveLogTag tOP_USER = LiveLogTag.TOP_USER;
       String str = "input";
       b.c0(tOP_USER, this.c("updateWatchingCount"), str, p0);
       if (!b.h.contains(p0.a)) {
          b.c0(tOP_USER, this.c("updateWatchingCount | dropped | unsupported type"), str, p0);
          return;
       }else if(TextUtils.x(p0.c)){
          b.Z(tOP_USER, this.c("updateWatchingCount | dropped | EMPTY DisplayWatchingCount!!!"));
          return;
       }else {
          b tg = this.g;
          if (tg != null && !p0.b - tg.b) {
             if ((p0.c).equals(tg.c)) {
                b.Z(tOP_USER, this.c("updateWatchingCount | dropped | unchanged watchingCount"));
                return;
             }else {
                b.Z(tOP_USER, this.c("updateWatchingCount | WARNING | DIFFERENT DisplayWatchingCount for the same WatchingCount in row !!!"));
             }
          }
          long l = this.b();
          if (b.i.contains(p0.a)) {
             this.f = p0;
             b.Z(tOP_USER, this.c("updateWatchingCount | apply | reliable input"));
          }else {
             watchingCoun = this.f;
             if (watchingCoun != null && watchingCoun.b - p0.b > 0) {
                b.Z(tOP_USER, this.c("updateWatchingCount | apply | last reliable cache"));
             label_00a1 :
                if (this.b == null) {
                   TextView textView = this.a.get();
                   if (textView != null) {
                      b.a(textView, p0.c);
                   }
                   this.d.a(watchingCoun.b);
                   this.d.b(watchingCoun.c);
                }
                this.g = watchingCoun;
                b.c0(tOP_USER, this.c("updateWatchingCount | applied"), "input:", watchingCoun);
                Object obj = this.a.get();
                if (obj != null) {
                   b = watchingCoun.b;
                   WatchingCountData c = watchingCoun.c;
                   int i = (this.b != null)? 0x7f0812e1: 0;
                   l.c(obj, b, c, false, i, b, new b$a(this, l));
                }
                return;
             }else {
                b.Z(tOP_USER, this.c("updateWatchingCount | apply | greater unreliable input"));
             }
          }
          watchingCoun = p0;
          goto label_00a1 ;
       }
    }
    public long b(){
       b tg = this.g;
       WatchingCountData b = (tg != null)? tg.b: 0;
       return b;
    }
    public final String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OptimizedUpdater {liveStreamId:"+this.e.get()+"}"+p0;
    }
    public void reset(){
       this.f = null;
       this.g = null;
    }
}
