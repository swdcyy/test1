package androidx.work.impl.WorkDatabase;
import androidx.room.RoomDatabase;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import java.util.concurrent.Executor;
import java.lang.Class;
import androidx.room.RoomDatabase$a;
import androidx.room.c0;
import l3.h;
import java.lang.String;
import androidx.work.impl.WorkDatabase$a;
import a3.c$c;
import androidx.room.RoomDatabase$b;
import w2.c;
import androidx.work.impl.a;
import androidx.work.impl.a$g;
import androidx.work.impl.a$h;
import androidx.work.impl.WorkDatabase$b;
import java.lang.System;
import java.lang.StringBuilder;
import u3.b;
import u3.e;
import u3.g;
import u3.j;
import u3.m;
import u3.p;
import u3.s;
import u3.v;

public abstract class WorkDatabase extends RoomDatabase	// class@000a64
{
    public static final long n;

    static {
       WorkDatabase.n = TimeUnit.DAYS.toMillis(7);
    }
    public void WorkDatabase(){
       super();
    }
    public static WorkDatabase E(Context p0,Executor p1,boolean p2){
       RoomDatabase$a uoa;
       WorkDatabase workDatabase = WorkDatabase.class;
       if (p2) {
          uoa = c0.c(p0, workDatabase);
          uoa.c();
       }else {
          uoa = c0.a(p0, workDatabase, "androidx.work.workdb");
          uoa.g(new WorkDatabase$a(p0));
       }
       uoa.i(p1);
       uoa.a(WorkDatabase.G());
       c[] uocArray = new c[]{a.a};
       uoa.b(uocArray);
       uocArray = new c[]{new a$g(p0, 2, 3)};
       uoa.b(uocArray);
       uocArray = new c[]{a.b};
       uoa.b(uocArray);
       uocArray = new c[]{a.c};
       uoa.b(uocArray);
       uocArray = new c[]{new a$g(p0, 5, 6)};
       uoa.b(uocArray);
       uocArray = new c[]{a.d};
       uoa.b(uocArray);
       uocArray = new c[]{a.e};
       uoa.b(uocArray);
       uocArray = new c[]{a.f};
       uoa.b(uocArray);
       uocArray = new c[]{new a$h(p0)};
       uoa.b(uocArray);
       c[] uocArray1 = new c[]{new a$g(p0, 10, 11)};
       uoa.b(uocArray1);
       uoa.e();
       return uoa.d();
    }
    public static RoomDatabase$b G(){
       return new WorkDatabase$b();
    }
    public static long H(){
       return (System.currentTimeMillis() - WorkDatabase.n);
    }
    public static String I(){
       return "DELETE FROM workspec WHERE state IN \(2, 3, 5\) AND \(period_start_time + minimum_retention_duration\) < "+WorkDatabase.H()+" AND \(SELECT COUNT\(*\)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         \(SELECT id FROM workspec WHERE state IN \(2, 3, 5\)\)\)";
    }
    public abstract b F();
    public abstract e J();
    public abstract g K();
    public abstract j L();
    public abstract m M();
    public abstract p N();
    public abstract s O();
    public abstract v P();
}
