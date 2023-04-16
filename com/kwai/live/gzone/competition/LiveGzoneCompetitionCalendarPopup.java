package com.kwai.live.gzone.competition.LiveGzoneCompetitionCalendarPopup;
import k47.f;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionCalendarPopup$a;
import nsd.u;
import androidx.fragment.app.FragmentActivity;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionCalendarPopup$mDailyCompetitionViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import o07.n;
import com.kuaishou.live.gzone.widget.competition.LiveGzoneCompetitionCalendarView;
import crd.b;
import m47.b;
import java.util.Objects;
import java.util.Map;
import android.view.View;
import android.os.Bundle;
import java.util.Calendar;
import java.util.Date;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionCalendarPopup$c;
import k63.d$a;
import qrd.l1;
import android.widget.Button;
import android.view.View$OnClickListener;
import lnc.a1;
import ekd.p1;
import java.lang.Integer;
import com.kwai.live.gzone.competition.LiveGzoneCompetitionCalendarPopup$b;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneCompetitionCalendarPopup extends f	// class@000cbb
{
    public Button A;
    public Button B;
    public LiveGzoneCompetitionCalendarPopup$b C;
    public final p D;
    public int E;
    public final String F;
    public LiveGzoneCompetitionCalendarView z;
    public static final LiveGzoneCompetitionCalendarPopup$a G;

    static {
       LiveGzoneCompetitionCalendarPopup.G = new LiveGzoneCompetitionCalendarPopup$a(null);
    }
    public void LiveGzoneCompetitionCalendarPopup(FragmentActivity p0,String p1){
       a.p(p0, "activity");
       a.p(p1, "mCompetitionIds");
       super(p0);
       this.F = p1;
       this.D = s.c(new LiveGzoneCompetitionCalendarPopup$mDailyCompetitionViewModel$2(p0));
       this.E = -1;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneCompetitionCalendarPopup.class, "5")) {
          return;
       }
       a.p(p0, "popup");
       n.a(this, p0);
       LiveGzoneCompetitionCalendarPopup$b uob = null;
       this.C = uob;
       LiveGzoneCompetitionCalendarPopup tz = this.z;
       if (tz != null && !PatchProxy.applyVoid(uob, tz, LiveGzoneCompetitionCalendarView.class, "9")) {
          LiveGzoneCompetitionCalendarView h = tz.h;
          if (h != null) {
             h.dispose();
          }
       }
       b uob1 = this.o0();
       Objects.requireNonNull(uob1);
       if (!PatchProxy.applyVoid(uob, uob1, b.class, "2")) {
          uob1.a.clear();
       }
       return;
    }
    public int d0(){
       return 0x7f0d0ba5;
    }
    public void f0(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneCompetitionCalendarPopup.class, "2")) {
          return;
       }
       super.f0(p0, p1);
       if (p0 != null) {
          LiveGzoneCompetitionCalendarPopup tz = this.z;
          if (tz == null) {
             LiveGzoneCompetitionCalendarView liveGzoneCom = p0.findViewById(R.id.live_gzone_competition_calendar_view);
             Calendar instance = Calendar.getInstance();
             instance.set(2020, 0, 1);
             a.o(instance, "calendar");
             Date time = instance.getTime();
             String str = "Calendar.getInstance\(\).l¡­calendar.time\n          }";
             a.o(time, str);
             liveGzoneCom.setStartDate(time);
             instance = Calendar.getInstance();
             a.o(instance, "calendar");
             instance.setTime(new Date());
             instance.add(5, 90);
             time = instance.getTime();
             a.o(time, str);
             liveGzoneCom.setEndDate(time);
             liveGzoneCom.h(new LiveGzoneCompetitionCalendarPopup$c(this));
             liveGzoneCom.i();
             this.z = liveGzoneCom;
          }else {
             a.m(tz);
             tz.i();
          }
          int i = 0x7f07034b;
          if (this.A == null) {
             Button uButton = p0.findViewById(R.id.live_gzone_competition_calendar_today_btn);
             uButton.setOnClickListener(this);
             p1.c(uButton, a1.d(i), a1.d(i), a1.d(i), a1.d(i));
             this.A = uButton;
          }
          if (this.B == null) {
             Button uButton1 = p0.findViewById(R.id.live_gzone_competition_calendar_confirm_btn);
             uButton1.setOnClickListener(this);
             p1.c(uButton1, a1.d(i), a1.d(i), a1.d(i), a1.d(i));
             this.B = uButton1;
          }
       }
       return;
    }
    public void m0(c p0,int p1){
       if (PatchProxy.isSupport(LiveGzoneCompetitionCalendarPopup.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveGzoneCompetitionCalendarPopup.class, "4")) {
          return;
       }
       a.p(p0, "popup");
       LiveGzoneCompetitionCalendarPopup tz = this.z;
       Date selectedDate = (tz != null)? tz.getSelectedDate(): null;
       LiveGzoneCompetitionCalendarPopup tC = this.C;
       if (tC != null) {
          tC.a(selectedDate, false);
       }
       return;
    }
    public void n0(Integer p0){
       LiveGzoneCompetitionCalendarPopup tz;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneCompetitionCalendarPopup.class, "3")) {
          return;
       }
       Date uDate = 0x7f0a1eb4;
       if (p0 != null && p0.intValue() == uDate) {
          tz = this.z;
          if (tz != null) {
             uDate = new Date();
             if (!PatchProxy.applyVoidOneRefs(uDate, tz, LiveGzoneCompetitionCalendarView.class, "4")) {
                a.p(uDate, "date");
                LiveGzoneCompetitionCalendarView k = tz.k;
                a.o(k, "mStartDate");
                LiveGzoneCompetitionCalendarView l = tz.l;
                a.o(l, "mEndDate");
                long time = l.getTime();
                long time1 = uDate.getTime();
                if (k.getTime() - time1 <= 0 && time - time1 >= 0) {
                   k = tz.j;
                   a.o(k, "mCursorCalendar");
                   k.setTime(uDate);
                   tz.e();
                }
             }
          }
       }else {
          uDate = 0x7f0a1eb0;
          if (p0 != null && p0.intValue() == uDate) {
             tz = this.z;
             Date selectedDate = (tz != null)? tz.getSelectedDate(): null;
             LiveGzoneCompetitionCalendarPopup tC = this.C;
             if (tC != null) {
                tC.a(selectedDate, true);
             }
             this.C = null;
             this.o();
          }
       }
       return;
    }
    public final b o0(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneCompetitionCalendarPopup.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.getValue();
    }
}
