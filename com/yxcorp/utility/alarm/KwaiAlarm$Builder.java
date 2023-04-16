package com.yxcorp.utility.alarm.KwaiAlarm$Builder;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.LinkedHashSet;
import com.yxcorp.utility.alarm.KwaiAlarm$Builder$calendar$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.Calendar;
import com.yxcorp.utility.alarm.KwaiAlarm;
import java.lang.Integer;
import kotlin.collections.ArraysKt___ArraysKt;

public final class KwaiAlarm$Builder	// class@0009b4
{
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public LinkedHashSet h;
    public final p i;

    public void KwaiAlarm$Builder(String p0,String p1,int p2,int p3){
       a.p(p0, "id");
       a.p(p1, "msg");
       super();
       this.a = "";
       this.b = "";
       this.c = -1;
       this.d = -1;
       this.e = 15;
       this.f = true;
       this.g = true;
       this.h = new LinkedHashSet();
       this.i = s.c(KwaiAlarm$Builder$calendar$2.INSTANCE);
       this.b(p0, p1, p2, p3);
    }
    public void KwaiAlarm$Builder(String p0,String p1,long p2){
       a.p(p0, "id");
       a.p(p1, "msg");
       super();
       this.a = "";
       this.b = "";
       this.c = -1;
       this.d = -1;
       this.e = 15;
       this.f = true;
       this.g = true;
       this.h = new LinkedHashSet();
       this.i = s.c(KwaiAlarm$Builder$calendar$2.INSTANCE);
       Calendar uCalendar = this.a();
       a.o(uCalendar, "calendar");
       uCalendar.setTimeInMillis(p2);
       this.b(p0, p1, this.a().get(11), this.a().get(12));
    }
    public final Calendar a(){
       return this.i.getValue();
    }
    public final void b(String p0,String p1,int p2,int p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void c(int[] p0){
       a.p(p0, "days");
       int len = p0.length;
       int i = 0;
       while (i < len) {
          int i1 = p0[i];
          if (ArraysKt___ArraysKt.P7(KwaiAlarm.b.b(), Integer.valueOf(i1))) {
             this.h.add(Integer.valueOf(i1));
          }
          i = i + 1;
       }
       return;
    }
    public final KwaiAlarm$Builder d(boolean p0){
       this.f = p0;
       return this;
    }
    public final KwaiAlarm$Builder e(boolean p0){
       this.g = p0;
       return this;
    }
    public final KwaiAlarm$Builder f(int p0){
       this.e = p0;
       return this;
    }
}
