package com.kuaishou.live.gzone.widget.competition.LiveGzoneCompetitionCalendarView;
import k63.d;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.kuaishou.live.gzone.widget.competition.LiveGzoneCompetitionCalendarView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.Calendar;
import java.util.Date;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k63.d$a;
import com.kwai.robust.PatchProxyResult;
import java.text.SimpleDateFormat;
import java.util.List;
import k63.f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.CharSequence;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.Objects;
import k63.a;
import java.lang.Boolean;
import java.util.Map;
import brd.t;
import k63.g;
import erd.g;
import t45.d;
import brd.z;
import k63.h;
import erd.a;
import k63.i;
import k63.j;
import crd.b;
import java.lang.IllegalArgumentException;
import java.lang.Integer;

public final class LiveGzoneCompetitionCalendarView extends FrameLayout implements d, View$OnClickListener	// class@001cff
{
    public View b;
    public View c;
    public TextView d;
    public RecyclerView e;
    public f f;
    public d$a g;
    public b h;
    public final HashMap i;
    public final Calendar j;
    public Date k;
    public Date l;
    public HashMap m;
    public static final LiveGzoneCompetitionCalendarView$a n;

    static {
       LiveGzoneCompetitionCalendarView.n = new LiveGzoneCompetitionCalendarView$a(null);
    }
    public void LiveGzoneCompetitionCalendarView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void LiveGzoneCompetitionCalendarView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.i = new HashMap();
       this.j = Calendar.getInstance();
       Calendar instance = Calendar.getInstance();
       instance.set(2020, 0, 1);
       a.o(instance, "it");
       this.k = instance.getTime();
       instance = Calendar.getInstance();
       a.o(instance, "it");
       instance.setTime(new Date());
       instance.add(5, 90);
       this.l = instance.getTime();
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneCompetitionCalendarView.class, "10")) {
       }else {
          View view = LayoutInflater.from(this.getContext()).inflate(R.layout.arg_RES_7f0d0ba7, objArray);
          View view1 = view.findViewById(R.id.live_gzone_competition_calendar_view_pre_month_btn);
          a.o(view1, "this.findViewById\(R.id.l¡­endar_view_pre_month_btn\)");
          this.b = view1;
          if (view1 == null) {
             a.S("mPreMonthBtn");
          }
          view1.setOnClickListener(this);
          view1 = view.findViewById(R.id.live_gzone_competition_calendar_view_next_month_btn);
          a.o(view1, "this.findViewById\(R.id.l¡­ndar_view_next_month_btn\)");
          this.c = view1;
          if (view1 == null) {
             a.S("mNextMonthBtn");
          }
          view1.setOnClickListener(this);
          view1 = view.findViewById(R.id.live_gzone_competition_calendar_view_date_tv);
          a.o(view1, "this.findViewById\(R.id.l¡­on_calendar_view_date_tv\)");
          this.d = view1;
          view1 = view.findViewById(R.id.live_gzone_competition_calendar_view_rv);
          a.o(view1, "this.findViewById\(R.id.l¡­etition_calendar_view_rv\)");
          this.e = view1;
          if (view1 == null) {
             a.S("mDateRecyclerView");
          }
          view1.setLayoutManager(new GridLayoutManager(view.getContext(), 7));
          this.addView(view);
       }
       return;
    }
    public d a(d$a p0){
       return this.h(p0);
    }
    public void b(Date p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneCompetitionCalendarView.class, "4")) {
          return;
       }
       a.p(p0, "date");
       LiveGzoneCompetitionCalendarView tk = this.k;
       a.o(tk, "mStartDate");
       LiveGzoneCompetitionCalendarView tl = this.l;
       a.o(tl, "mEndDate");
       long time = tl.getTime();
       long time1 = p0.getTime();
       if (tk.getTime() - time1 <= 0 && time - time1 >= 0) {
          tk = this.j;
          a.o(tk, "mCursorCalendar");
          tk.setTime(p0);
          this.e();
       }
       return;
    }
    public final String c(Calendar p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneCompetitionCalendarView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = new SimpleDateFormat("yyyy-MM").format(p0.getTime());
       a.o(str, "SimpleDateFormat\(\"yyyy-M¡­is@formatString.time\)\n  }");
       return str;
    }
    public final void d(List p0,Calendar p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneCompetitionCalendarView.class, "13")) {
          return;
       }
       LiveGzoneCompetitionCalendarView tf = this.f;
       if (tf == null) {
          this.f = new f(p0, p1);
          LiveGzoneCompetitionCalendarView te = this.e;
          if (te == null) {
             a.S("mDateRecyclerView");
          }
          te.setAdapter(this.f);
       }else if(tf != null){
          LiveGzoneCompetitionCalendarView tj = this.j;
          a.o(tj, "mCursorCalendar");
          if (!PatchProxy.applyVoidTwoRefs(p0, tj, tf, f.class, "4")) {
             a.p(p0, "newDates");
             a.p(tj, "cursorCalendar");
             tf.g = tj;
             ArrayList uArrayList = new ArrayList();
             tf.f = uArrayList;
             uArrayList.addAll(p0);
          }
          tf.k0();
       }
       return;
    }
    public final void e(){
       boolean b;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, LiveGzoneCompetitionCalendarView.class, "11")) {
          return;
       }
       LiveGzoneCompetitionCalendarView d = obj.d;
       if (d == null) {
          a.S("mCurrentPageDateTV");
       }
       LiveGzoneCompetitionCalendarView j = obj.j;
       String str = "mCursorCalendar";
       a.o(j, str);
       d.setText(obj.c(j));
       d = obj.j;
       a.o(d, str);
       if (!PatchProxy.applyVoidOneRefs(d, obj, LiveGzoneCompetitionCalendarView.class, "12")) {
          String str1 = obj.c(d);
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          List list = obj.i.get(str1);
          objectRef.element = list;
          if (list == null) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             ArrayList uArrayList = PatchProxy.applyOneRefs(d, obj, LiveGzoneCompetitionCalendarView.class, "14");
             if (uArrayList != patchProxyRe) {
             }else {
                uArrayList = new ArrayList();
                Object obj1 = d.clone();
                Objects.requireNonNull(obj1, "null cannot be cast to non-null type java.util.Calendar");
                int i = 5;
                int i1 = 1;
                obj1.set(i, i1);
                int i2 = obj1.get(7) - 2;
                if (i2 == -1) {
                   i2 = 6;
                }
                obj1.add(i, (- i2));
                String str2 = 42;
                int i3 = 0;
                while (i3 < str2) {
                   Date time = obj1.getTime();
                   a.o(time, "delegateCalendar.time");
                   uArrayList.add(new a(time, 0));
                   obj1.add(i, i1);
                   i3 = i3 + 1;
                   str2 = 42;
                }
                a uoa = uArrayList.get(35);
                LiveGzoneCompetitionCalendarView j1 = obj.j;
                a.o(j1, str);
                Object obj2 = PatchProxy.applyTwoRefs(uoa, j1, obj, LiveGzoneCompetitionCalendarView.class, "15");
                if (obj2 != patchProxyRe) {
                   b = obj2.booleanValue();
                }else if(obj.j(uoa.a()).get(i1) == j1.get(i1) && obj.j(uoa.a()).get(2) == j1.get(2)){
                   i1 = 0;
                }
                b = i1;
                if (!b) {
                   uArrayList = uArrayList.subList(0, 35);
                }
             }
             objectRef.element = uArrayList;
             obj.i.put(str1, uArrayList);
          }
          j = obj.g;
          if (j != null) {
             a.m(j);
             obj.h = j.a(objectRef.element).doOnSubscribe(new g(obj)).observeOn(d.a).doOnComplete(new h(obj)).subscribe(new i(obj, d), new j(obj, objectRef, d));
          }else {
             obj.d(objectRef.element, d);
          }
       }
       this.g();
       return;
    }
    public final boolean f(Calendar p0,Calendar p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveGzoneCompetitionCalendarView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (p0.get(i) != p1.get(i) || p0.get(2) != p1.get(2)) {
          i = false;
       }
       return i;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneCompetitionCalendarView.class, "16")) {
          return;
       }
       LiveGzoneCompetitionCalendarView tj = this.j;
       String str = "mCursorCalendar";
       a.o(tj, str);
       LiveGzoneCompetitionCalendarView tk = this.k;
       a.o(tk, "mStartDate");
       int b = this.f(tj, this.j(tk));
       tk = this.b;
       if (tk == null) {
          a.S("mPreMonthBtn");
       }
       int i = 8;
       b = (b)? 8: 0;
       tk.setVisibility(b);
       tj = this.j;
       a.o(tj, str);
       LiveGzoneCompetitionCalendarView tl = this.l;
       a.o(tl, "mEndDate");
       b = this.f(tj, this.j(tl));
       tl = this.c;
       if (tl == null) {
          a.S("mNextMonthBtn");
       }
       if (!b) {
          i = 0;
       }
       tl.setVisibility(i);
       return;
    }
    public Calendar getCursorCalendar(){
       LiveGzoneCompetitionCalendarView obj = PatchProxy.apply(null, this, LiveGzoneCompetitionCalendarView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       a.o(obj, "mCursorCalendar");
       return obj;
    }
    public Date getSelectedDate(){
       Object[] objArray = null;
       LiveGzoneCompetitionCalendarView obj = PatchProxy.apply(objArray, this, LiveGzoneCompetitionCalendarView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          objArray = obj.e;
       }
       return objArray;
    }
    public LiveGzoneCompetitionCalendarView h(d$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneCompetitionCalendarView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "listener");
       this.g = p0;
       return this;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneCompetitionCalendarView.class, "8")) {
          return;
       }
       LiveGzoneCompetitionCalendarView tl = this.l;
       a.o(tl, "mEndDate");
       LiveGzoneCompetitionCalendarView tk = this.k;
       a.o(tk, "mStartDate");
       if (tl.getTime() - tk.getTime() < 0) {
          throw new IllegalArgumentException("[LiveGzoneCompetitionCalendarView] end date should after start date!");
       }
       this.e();
       return;
    }
    public final Calendar j(Date p0){
       Calendar obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneCompetitionCalendarView.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Calendar.getInstance();
       a.o(obj, "this");
       obj.setTime(p0);
       a.o(obj, "Calendar.getInstance\(\).a¡­ime = this@toCalendar\n  }");
       return obj;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneCompetitionCalendarView.class, "7")) {
          return;
       }
       Integer integer = (p0 != null)? Integer.valueOf(p0.getId()): null;
       int i = 0x7f0a1eb8;
       if (integer != null && integer.intValue() == i) {
          this.j.add(2, -1);
          this.e();
          this.g();
       }else {
          i = 0x7f0a1eb7;
          if (integer != null && integer.intValue() == i) {
             this.j.add(2, 1);
             this.e();
             this.g();
          }
       }
       return;
    }
    public void setEndDate(Date p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneCompetitionCalendarView.class, "2")) {
          return;
       }
       a.p(p0, "endDate");
       this.l = p0;
       return;
    }
    public void setStartDate(Date p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneCompetitionCalendarView.class, "1")) {
          return;
       }
       a.p(p0, "startDate");
       this.k = p0;
       return;
    }
}
