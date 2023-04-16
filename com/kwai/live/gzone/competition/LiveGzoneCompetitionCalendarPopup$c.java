package com.kwai.live.gzone.competition.LiveGzoneCompetitionCalendarPopup$c;
import k63.d$a;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionCalendarPopup;
import java.lang.Object;
import java.util.List;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import m47.b;
import java.util.Objects;
import java.lang.Integer;
import k63.a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Date;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import u37.d;
import u37.e;
import cjd.e;
import erd.o;
import m47.a;

public final class LiveGzoneCompetitionCalendarPopup$c implements d$a	// class@000cb9
{
    public final LiveGzoneCompetitionCalendarPopup a;

    public void LiveGzoneCompetitionCalendarPopup$c(LiveGzoneCompetitionCalendarPopup p0){
       this.a = p0;
       super();
    }
    public t a(List p0){
       LiveGzoneCompetitionCalendarPopup$c a;
       LiveGzoneCompetitionCalendarPopup liveGzoneCom;
       LiveGzoneCompetitionCalendarPopup liveGzoneCom1;
       b uob2;
       t ot;
       b obj = this;
       Object obj1 = p0;
       t obj2 = PatchProxy.applyOneRefsWithListener(obj1, obj, LiveGzoneCompetitionCalendarPopup$c.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "dateList");
       if (p0.isEmpty()) {
          obj2 = t.just(p0);
          a.o(obj2, "Observable.just\(dateList\)");
          PatchProxy.onMethodExit(LiveGzoneCompetitionCalendarPopup$c.class, "1");
          return obj2;
       }else {
          b uob = obj.a.o0();
          a = obj.a;
          LiveGzoneCompetitionCalendarPopup e = a.E;
          LiveGzoneCompetitionCalendarPopup f = a.F;
          Objects.requireNonNull(uob);
          b uob1 = b.class;
          if (PatchProxy.isSupport(uob1)) {
             obj = uob1;
             obj2 = PatchProxy.applyThreeRefs(Integer.valueOf(e), f, p0, uob, b.class, "1");
             if (obj2 != PatchProxyResult.class) {
             }else {
             label_005c :
                a.p(f, "competitionIds");
                a.p(obj1, "dateList");
                a uoa = obj1.get(0);
                a uoa1 = CollectionsKt___CollectionsKt.Y2(p0);
                Date uDate = uoa.a();
                Date uDate1 = uoa1.a();
                String str = PatchProxy.applyTwoRefs(uDate, uDate1, uob, obj, "4");
                if (str != PatchProxyResult.class) {
                }else {
                   str = uob.p0(uDate)+"&"+uob.p0(uDate1);
                }
                if (uob.a.containsKey(str)) {
                   Map map = uob.a.get(str);
                   Iterator iterator = p0.iterator();
                   while (iterator.hasNext()) {
                      uoa1 = iterator.next();
                      a.m(map);
                      uoa1.b(uob.o0(map, uoa1.a()));
                   }
                   obj2 = t.just(p0);
                   a.o(obj2, "Observable.just\(dateList\)");
                }else {
                   Date uDate2 = uoa.a();
                   Date uDate3 = uoa1.a();
                   if (PatchProxy.isSupport(obj)) {
                      liveGzoneCom = f;
                      liveGzoneCom1 = e;
                      uob2 = uob;
                      ot = PatchProxy.applyFourRefs(Integer.valueOf(e), liveGzoneCom, uDate2, uDate3, uob2, b.class, "3");
                      if (ot != PatchProxyResult.class) {
                      label_0113 :
                         obj2 = ot.map(new e()).map(new a(uob2, str, obj1));
                         a.o(obj2, "fetchCompetitionCount\(ga¡­     dateList\n          }");
                      }
                   }else {
                      liveGzoneCom = f;
                      liveGzoneCom1 = e;
                      uob2 = uob;
                   }
                   ot = e.b().r(liveGzoneCom1, liveGzoneCom, uob2.p0(uDate2), uob2.p0(uDate3));
                   goto label_0113 ;
                }
             }
          }else {
             obj = uob1;
             goto label_005c ;
          }
          PatchProxy.onMethodExit(LiveGzoneCompetitionCalendarPopup$c.class, "1");
          return obj2;
       }
    }
}
