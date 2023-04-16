package com.k.a.BSProvider;
import android.content.ContentProvider;
import com.k.a.BSProvider$a;
import nsd.u;
import java.util.concurrent.atomic.AtomicBoolean;
import android.net.Uri;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import gx7.k;
import dx7.f;
import gx7.g;
import android.content.Context;
import java.lang.Class;
import android.content.ContentValues;
import java.util.Objects;
import android.app.ActivityManager;
import java.util.List;
import java.lang.Iterable;
import wsd.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.wake.utils.MatrixTool$$special$$inlined$let$lambda$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.util.LinkedHashMap;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.util.Map;
import java.lang.StringBuilder;
import android.os.Process;
import qrd.l1;
import android.database.Cursor;
import android.database.MatrixCursor;

public class BSProvider extends ContentProvider	// class@0006ec
{
    public static AtomicBoolean b;
    public static AtomicBoolean c;
    public static final BSProvider$a d;

    static {
       BSProvider.d = new BSProvider$a(null);
       BSProvider.b = new AtomicBoolean(false);
       BSProvider.c = new AtomicBoolean(false);
    }
    public void BSProvider(){
       super();
    }
    public int delete(Uri p0,String p1,String[] p2){
       a.p(p0, "uri");
       return 0;
    }
    public String getType(Uri p0){
       g a;
       Class uClass;
       a.p(p0, "uri");
       boolean andSet = BSProvider.b.getAndSet(false);
       k.a.j();
       f.d.d();
       a = g.a;
       Context context = this.getContext();
       context = (context != null)? context.getApplicationContext(): null;
       String name = this.getClass().getName();
       a.o(name, "this@BSProvider.javaClass.name");
       a.e(context, p0, 5, andSet, name);
       return "getType";
    }
    public Uri insert(Uri p0,ContentValues p1){
       a.p(p0, "uri");
       return null;
    }
    public boolean onCreate(){
       ActivityManager$RunningAppProcessInfo runningAppPr;
       List list1;
       boolean b = false;
       if (BSProvider.c.compareAndSet(b, true)) {
          g a = g.a;
          Context context = this.getContext();
          List list = null;
          context = (context != null)? context.getApplicationContext(): list;
          Objects.requireNonNull(a);
          if (context != null) {
             String packageName = context.getPackageName();
             Iterator systemServic = context.getSystemService("activity");
             if (!systemServic instanceof ActivityManager) {
                systemServic = list;
             }
             if (systemServic != null) {
                list = systemServic.getRunningAppProcesses();
             }
             if (list != null) {
                LinkedHashMap linkedHashMa = new LinkedHashMap();
                systemServic = SequencesKt___SequencesKt.i0(CollectionsKt___CollectionsKt.l1(list), new MatrixTool$$special$$inlined$let$lambda$1(list, packageName)).iterator();
                while (systemServic.hasNext()) {
                   Object obj = systemServic.next();
                   linkedHashMa.put(obj.processName, obj);
                }
                if (linkedHashMa.size() == 1) {
                   runningAppPr = linkedHashMa.get(packageName+":push_v3");
                   if (runningAppPr == null || runningAppPr.pid != Process.myPid()) {
                   label_00a2 :
                      BSProvider.b = new AtomicBoolean(b);
                   }
                }else {
                   runningAppPr = linkedHashMa.get(packageName);
                   runningAppPr = (runningAppPr != null)? runningAppPr.pid: Integer.MAX_VALUE;
                   if (Process.myPid() >= runningAppPr) {
                   }
                }
                b = true;
                goto label_00a2 ;
             }else {
                goto label_00a2 ;
             }
          }else {
             goto label_00a2 ;
          }
       }
       return true;
    }
    public Cursor query(Uri p0,String[] p1,String p2,String[] p3,String p4){
       g a;
       Class uClass;
       a.p(p0, "uri");
       boolean andSet = BSProvider.b.getAndSet(false);
       k.a.j();
       f.d.d();
       a = g.a;
       Context context = this.getContext();
       context = (context != null)? context.getApplicationContext(): null;
       String name = this.getClass().getName();
       a.o(name, "this@BSProvider.javaClass.name");
       a.e(context, p0, 6, andSet, name);
       context = new String[false];
       return new MatrixCursor(context);
    }
    public int update(Uri p0,ContentValues p1,String p2,String[] p3){
       a.p(p0, "uri");
       return 0;
    }
}
