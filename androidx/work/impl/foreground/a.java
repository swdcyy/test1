package androidx.work.impl.foreground.a;
import q3.c;
import l3.b;
import java.lang.String;
import k3.h;
import android.content.Context;
import java.lang.Object;
import l3.i;
import ig6.c;
import x3.a;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.HashMap;
import q3.d;
import l3.d;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;
import java.lang.Class;
import android.net.Uri;
import k3.d;
import android.app.Notification;
import android.os.Parcelable;
import java.util.List;
import java.util.Iterator;
import java.lang.Throwable;
import java.util.Map;
import u3.r;
import java.util.Set;
import java.lang.Iterable;
import java.util.Map$Entry;
import androidx.work.impl.foreground.a$b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.UUID;
import k3.i;
import java.lang.Integer;
import android.os.Build$VERSION;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.a$a;
import java.lang.Runnable;

public class a implements c, b	// class@000a91
{
    public Context b;
    public i c;
    public final a d;
    public final Object e;
    public String f;
    public d g;
    public final Map h;
    public final Map i;
    public final Set j;
    public final d k;
    public a$b l;
    public static final String m;

    static {
       a.m = h.f("SystemFgDispatcher");
    }
    public void a(Context p0){
       super();
       this.b = p0;
       this.e = new Object();
       i oi = c.b(p0);
       this.c = oi;
       a uoa = oi.J();
       this.d = uoa;
       this.f = null;
       this.g = null;
       this.h = new LinkedHashMap();
       this.j = new HashSet();
       this.i = new HashMap();
       this.k = new d(this.b, uoa, this);
       this.c.F().c(this);
    }
    public static Intent a(Context p0,String p1){
       Intent intent = new Intent(p0, SystemForegroundService.class);
       intent.setAction("ACTION_CANCEL_WORK");
       Object[] objArray = new Object[]{p1};
       intent.setData(Uri.parse(String.format("workspec://%s", objArray)));
       intent.putExtra("KEY_WORKSPEC_ID", p1);
       return intent;
    }
    public static Intent b(Context p0,String p1,d p2){
       Intent intent = new Intent(p0, SystemForegroundService.class);
       intent.setAction("ACTION_NOTIFY");
       intent.putExtra("KEY_NOTIFICATION_ID", p2.c());
       intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", p2.a());
       intent.putExtra("KEY_NOTIFICATION", p2.b());
       intent.putExtra("KEY_WORKSPEC_ID", p1);
       return intent;
    }
    public static Intent f(Context p0,String p1,d p2){
       Intent intent = new Intent(p0, SystemForegroundService.class);
       intent.setAction("ACTION_START_FOREGROUND");
       intent.putExtra("KEY_WORKSPEC_ID", p1);
       intent.putExtra("KEY_NOTIFICATION_ID", p2.c());
       intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", p2.a());
       intent.putExtra("KEY_NOTIFICATION", p2.b());
       intent.putExtra("KEY_WORKSPEC_ID", p1);
       return intent;
    }
    public void c(List p0){
       if (!p0.isEmpty()) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             Object[] objArray = new Object[]{str};
             Throwable[] throwableArr = new Throwable[0];
             h.c().a(a.m, String.format("Constraints unmet for WorkSpec %s", objArray), throwableArr);
             this.c.Q(str);
          }
       }
       return;
    }
    public void d(String p0,boolean p1){
       a te = this.e;
       _monitor_enter(te);
       r or = this.i.remove(p0);
       boolean b = (or != null)? this.j.remove(or): false;
       if (b) {
          this.k.d(this.j);
       }
       _monitor_exit(te);
       this.g = this.h.remove(p0);
       if (p0.equals(this.f)) {
          if (this.h.size() > 0) {
             Iterator iterator = this.h.entrySet().iterator();
             Map$Entry uEntry = iterator.next();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
             }
             this.f = uEntry.getKey();
             if (this.l != null) {
                d value = uEntry.getValue();
                this.l.d(value.c(), value.a(), value.b());
                this.l.a(value.c());
             }
          }
       }else {
          a tg = this.g;
          if (tg != null) {
             te = this.l;
             if (te != null) {
                te.a(tg.c());
             }
          }
       }
       return;
    }
    public void e(List p0){
    }
    public final void g(Intent p0){
       Object[] objArray = new Object[]{p0};
       Throwable[] throwableArr = new Throwable[0];
       h.c().d(a.m, String.format("Stopping foreground work for %s", objArray), throwableArr);
       String stringExtra = p0.getStringExtra("KEY_WORKSPEC_ID");
       if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
          this.c.f(UUID.fromString(stringExtra));
       }
       return;
    }
    public final void h(Intent p0){
       int i = 0;
       int intExtra = p0.getIntExtra("KEY_NOTIFICATION_ID", i);
       int intExtra1 = p0.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", i);
       String stringExtra = p0.getStringExtra("KEY_WORKSPEC_ID");
       Notification parcelableEx = p0.getParcelableExtra("KEY_NOTIFICATION");
       Object[] objArray = new Object[]{Integer.valueOf(intExtra),stringExtra,Integer.valueOf(intExtra1)};
       Throwable[] throwableArr = new Throwable[i];
       h.c().a(a.m, String.format("Notifying with \(id: %s, workSpecId: %s, notificationType: %s\)", objArray), throwableArr);
       if (parcelableEx != null && this.l != null) {
          this.h.put(stringExtra, new d(intExtra, parcelableEx, intExtra1));
          if (TextUtils.isEmpty(this.f)) {
             this.f = stringExtra;
             this.l.d(intExtra, intExtra1, parcelableEx);
          }else {
             this.l.b(intExtra, parcelableEx);
             if (intExtra1 && Build$VERSION.SDK_INT >= 29) {
                Iterator iterator = this.h.entrySet().iterator();
                while (iterator.hasNext()) {
                   i = i | iterator.next().getValue().a();
                }
                d uod = this.h.get(this.f);
                if (uod != null) {
                   this.l.d(uod.c(), i, uod.b());
                }
             }
          }
       }
       return;
    }
    public final void i(Intent p0){
       Object[] objArray = new Object[]{p0};
       Throwable[] throwableArr = new Throwable[0];
       h.c().d(a.m, String.format("Started foreground service %s", objArray), throwableArr);
       this.d.d(new a$a(this, this.c.H(), p0.getStringExtra("KEY_WORKSPEC_ID")));
    }
    public void j(){
       Throwable[] throwableArr = new Throwable[0];
       h.c().d(a.m, "Stopping foreground service", throwableArr);
       a tl = this.l;
       if (tl != null) {
          a tg = this.g;
          if (tg != null) {
             tl.a(tg.c());
             this.g = null;
          }
          this.l.stop();
       }
       return;
    }
    public void k(){
       this.l = null;
       a te = this.e;
       _monitor_enter(te);
       this.k.e();
       _monitor_exit(te);
       this.c.F().i(this);
    }
    public void l(Intent p0){
       String action = p0.getAction();
       if (("ACTION_START_FOREGROUND").equals(action)) {
          this.i(p0);
          this.h(p0);
       }else if(("ACTION_NOTIFY").equals(action)){
          this.h(p0);
       }else if(("ACTION_CANCEL_WORK").equals(action)){
          this.g(p0);
       }
       return;
    }
    public void m(a$b p0){
       if (this.l != null) {
          Throwable[] throwableArr = new Throwable[0];
          h.c().b(a.m, "A callback already exists.", throwableArr);
          return;
       }else {
          this.l = p0;
          return;
       }
    }
}
