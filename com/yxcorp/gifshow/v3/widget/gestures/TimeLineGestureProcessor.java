package com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor;
import com.yxcorp.gifshow.v3.widget.gestures.ITimeLineGestureProcessor;
import java.lang.Object;
import com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor$a;
import lnc.a1;
import com.yxcorp.gifshow.v3.widget.gestures.ITimeLineGestureProcessor$HeadingDirection;
import com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor$AbsorbStatus;
import com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor$mAssetPointList$2;
import msd.a;
import qrd.p;
import qrd.s;
import kotlin.Pair;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Boolean;
import java.util.HashMap;
import bxc.c;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import java.lang.Math;
import faa.a;
import q87.c;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.f;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.widget.gestures.TimelineAssetInfo;
import com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor$b;
import java.util.Comparator;
import trd.x;
import java.lang.Number;

public class TimeLineGestureProcessor implements ITimeLineGestureProcessor	// class@00166f
{
    public final String a;
    public final long b;
    public boolean c;
    public final TimeLineGestureProcessor$a d;
    public final int e;
    public final int f;
    public ITimeLineGestureProcessor$HeadingDirection g;
    public TimeLineGestureProcessor$AbsorbStatus h;
    public TimelineAssetInfo i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final p p;

    public void TimeLineGestureProcessor(){
       super();
       this.a = "TimeLineGesture";
       this.b = 25;
       this.c = true;
       this.d = new TimeLineGestureProcessor$a();
       this.e = a1.e(7.00f);
       this.f = a1.e(14.00f);
       this.g = ITimeLineGestureProcessor$HeadingDirection.NONE;
       this.h = TimeLineGestureProcessor$AbsorbStatus.IDLE;
       this.j = -1;
       this.k = -1;
       this.o = -1;
       this.p = s.c(TimeLineGestureProcessor$mAssetPointList$2.INSTANCE);
    }
    public Pair a(int p0,ITimeLineGestureProcessor$HeadingDirection p1){
       String obj;
       int b;
       int i2;
       Object[] objArray;
       TimeLineGestureProcessor$AbsorbStatus bLOCKED_TUNI;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TimeLineGestureProcessor timeLineGest = TimeLineGestureProcessor.class;
       if (PatchProxy.isSupport(timeLineGest)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, timeLineGest, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "direction";
       a.p(p1, obj);
       if (this.c == null) {
          return new Pair(TimeLineGestureProcessor$AbsorbStatus.IDLE, Integer.valueOf(p0));
       }else {
          TimeLineGestureProcessor td = this.d;
          Objects.requireNonNull(td);
          Object obj1 = PatchProxy.applyOneRefs(p1, td, TimeLineGestureProcessor$a.class, "2");
          String str = 1;
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             a.p(p1, obj);
             Boolean uBoolean = td.a.get(p1);
             b = (uBoolean != null)? uBoolean.booleanValue(): true;
          }
          int i = -1;
          if (!b) {
             if (this.o == i) {
                this.o = this.j;
             }
             return new Pair(TimeLineGestureProcessor$AbsorbStatus.ABSORBED, Integer.valueOf(this.o));
          }else {
             TimeLineGestureProcessor to = this.o;
             if (to != i) {
                this.n = ((this.l + p0) - this.m) - to;
                this.o = i;
             }
             this.g = p1;
             b = c.a[this.h.ordinal()];
             obj = ", absorb pos: ";
             int i1 = 0;
             if (b != str) {
                if (b != 2) {
                   if (b == 3 || b == 4) {
                      p0 = ((p0 + this.l) - this.m) - this.n;
                      i2 = p0 - this.j;
                      if (Math.abs(i2) >= this.e) {
                         objArray = new Object[i1];
                         a.D().w(this.a, "TUNING --> IDLE", objArray);
                         this.i();
                      }else if(!i2){
                         bLOCKED_TUNI = TimeLineGestureProcessor$AbsorbStatus.BLOCKED_TUNING;
                      }else {
                         bLOCKED_TUNI = TimeLineGestureProcessor$AbsorbStatus.TUNING;
                      }
                      this.h = bLOCKED_TUNI;
                      return new Pair(this.h, Integer.valueOf(p0));
                   }else {
                      throw new NoWhenBranchMatchedException();
                   }
                }else {
                   p0 = p0 - this.k;
                   to = this.f;
                   if (Math.abs(p0) > to) {
                      this.h = TimeLineGestureProcessor$AbsorbStatus.TUNING;
                      TimeLineGestureProcessor tm = this.m;
                      if (p0 <= 0) {
                         b = - to;
                      }
                      this.m = tm + to;
                      Object[] objArray1 = new Object[i1];
                      a.D().w(this.a, "ABSORBED --> TUNING: "+this.m+obj+this.j, objArray1);
                      to = this.h;
                      timeLineGest = this.j;
                      td = this.f;
                      p0 = (p0 > 0)? p0 - td: p0 + td;
                      return new Pair(to, Integer.valueOf((timeLineGest + p0)));
                   }else {
                      return new Pair(this.h, Integer.valueOf(this.j));
                   }
                }
             }else {
                b = ((this.l + p0) - this.m) - this.n;
                i2 = this.h(b, p1);
                int i3 = (i2 >= 0)? i2: b;
                if (i2 >= 0) {
                   f.P(this.b);
                   this.h = TimeLineGestureProcessor$AbsorbStatus.ABSORBED;
                   this.j = i2;
                   this.k = p0;
                   this.l = this.l + (i2 - b);
                   objArray = new Object[i1];
                   a.D().w(this.a, "IDLE --> ABSORBED: "+this.l+obj+this.j+", trigger pos: "+this.k, objArray);
                }
                return new Pair(this.h, Integer.valueOf(i3));
             }
          }
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, TimeLineGestureProcessor.class, "3")) {
          return;
       }
       TimeLineGestureProcessor td = this.d;
       TimeLineGestureProcessor tg = this.g;
       Objects.requireNonNull(td);
       TimeLineGestureProcessor$a uoa = TimeLineGestureProcessor$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.FALSE, tg, td, uoa, "1")) {
          a.p(tg, "direction");
          td.a.put(tg, Boolean.FALSE);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, TimeLineGestureProcessor.class, "6")) {
          return;
       }
       this.i();
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.o = -1;
       return;
    }
    public void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimeLineGestureProcessor.class, "4")) {
          return;
       }
       a.p(p0, "timelineAssetInfoList");
       this.g().clear();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          TimelineAssetInfo timelineAsse = iterator.next();
          if (timelineAsse.b() >= 0) {
             this.g().add(new Pair(Integer.valueOf(timelineAsse.b()), timelineAsse));
          }
          if (timelineAsse.a() >= 0) {
             this.g().add(new Pair(Integer.valueOf(timelineAsse.a()), timelineAsse));
          }
       }
       x.p0(this.g(), TimeLineGestureProcessor$b.b);
       return;
    }
    public void e(boolean p0){
       this.c = p0;
    }
    public final int f(){
       return this.e;
    }
    public final ArrayList g(){
       Object obj = PatchProxy.apply(null, this, TimeLineGestureProcessor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public int h(int p0,ITimeLineGestureProcessor$HeadingDirection p1){
       int i3;
       TimeLineGestureProcessor timeLineGest = TimeLineGestureProcessor.class;
       if (PatchProxy.isSupport(timeLineGest)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, timeLineGest, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p1, "direction");
       int i = -1;
       if (this.h != TimeLineGestureProcessor$AbsorbStatus.IDLE) {
          return i;
       }else {
          int i1 = c.b[p1.ordinal()];
          int i2 = 1;
          if (i1 != i2) {
             if (i1 == 2) {
                i1 = 0;
                i2 = this.g().size();
                while (i1 < i2) {
                   i3 = this.g().get(i1).getFirst().intValue();
                   if (p0 < i3) {
                      int i4 = i3 - p0;
                      if (i4 <= this.e) {
                         this.i = this.g().get(i1).getSecond();
                         i = i3;
                         break ;
                      }
                   }
                   i1++;
                }
             }
          }else {
             i1 = this.g().size() - i2;
             while (i1 >= 0) {
                i2 = this.g().get(i1).getFirst().intValue();
                if (p0 > i2) {
                   i3 = p0 - i2;
                   if (i3 <= this.e) {
                      this.i = this.g().get(i1).getSecond();
                      i = i2;
                      break ;
                   }
                }
                i1--;
             }
          }
          return i;
       }
    }
    public final void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TimeLineGestureProcessor.class, "7")) {
          return;
       }
       this.j = -1;
       this.k = -1;
       this.i = objArray;
       this.h = TimeLineGestureProcessor$AbsorbStatus.IDLE;
       TimeLineGestureProcessor td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, TimeLineGestureProcessor$a.class, "3")) {
          td.a.clear();
       }
       return;
    }
}
