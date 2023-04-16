package androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.Worker;
import java.lang.String;
import k3.h;
import android.content.Context;
import androidx.work.WorkerParameters;
import u3.r;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Enum;
import u3.m;
import u3.v;
import u3.j;
import java.util.List;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import java.util.Iterator;
import u3.i;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import androidx.work.ListenableWorker$a;
import androidx.work.ListenableWorker;
import l3.i;
import ig6.c;
import androidx.work.impl.WorkDatabase;
import u3.s;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import java.lang.Throwable;

public class DiagnosticsWorker extends Worker	// class@000aa4
{
    public static final String a;

    static {
       DiagnosticsWorker.a = h.f("DiagnosticsWrkr");
    }
    public void DiagnosticsWorker(Context p0,WorkerParameters p1){
       super(p0, p1);
    }
    public static String a(r p0,String p1,Integer p2,String p3){
       Object[] objArray = new Object[]{p0.a,p0.c,p2,p0.b.name(),p1,p3};
       return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", objArray);
    }
    public static String b(m p0,v p1,j p2,List p3){
       StringBuilder str = "";
       String str1 = (Build$VERSION.SDK_INT >= 23)? "Job Id": "Alarm Id";
       Object[] objArray = new Object[]{str1};
       str = str+String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", objArray);
       Iterator iterator = p3.iterator();
       while (iterator.hasNext()) {
          r or = iterator.next();
          i oi = null;
          i oi1 = p2.b(or.a);
          if (oi1 != null) {
             oi = Integer.valueOf(oi1.b);
          }
          str = str+DiagnosticsWorker.a(or, TextUtils.join(",", p0.a(or.a)), oi, TextUtils.join(",", p1.a(or.a)));
       }
       return str;
    }
    public ListenableWorker$a doWork(){
       WorkDatabase workDatabase = c.b(this.getApplicationContext()).H();
       s os = workDatabase.O();
       m om = workDatabase.M();
       v ov = workDatabase.P();
       j oj = workDatabase.L();
       List list = os.z((System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1)));
       List list1 = os.n();
       List list2 = os.B();
       if (list != null && !list.isEmpty()) {
          String a = DiagnosticsWorker.a;
          Throwable[] throwableArr = new Throwable[0];
          h.c().d(a, "Recently completed work:\n\n", throwableArr);
          throwableArr = new Throwable[0];
          h.c().d(a, DiagnosticsWorker.b(om, ov, oj, list), throwableArr);
       }
       if (list1 != null && !list1.isEmpty()) {
          String a1 = DiagnosticsWorker.a;
          Throwable[] throwableArr1 = new Throwable[0];
          h.c().d(a1, "Running work:\n\n", throwableArr1);
          throwableArr1 = new Throwable[0];
          h.c().d(a1, DiagnosticsWorker.b(om, ov, oj, list1), throwableArr1);
       }
       if (list2 != null && !list2.isEmpty()) {
          String a2 = DiagnosticsWorker.a;
          Throwable[] throwableArr2 = new Throwable[0];
          h.c().d(a2, "Enqueued work:\n\n", throwableArr2);
          Throwable[] throwableArr3 = new Throwable[0];
          h.c().d(a2, DiagnosticsWorker.b(om, ov, oj, list2), throwableArr3);
       }
       return ListenableWorker$a.c();
    }
}
