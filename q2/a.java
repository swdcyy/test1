package q2.a;
import java.lang.Object;
import android.content.Context;
import java.util.HashMap;
import java.util.ArrayList;
import q2.a$a;
import android.os.Looper;
import q2.a$b;
import q2.a$c;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.lang.String;
import android.content.ContentResolver;
import android.net.Uri;
import java.util.Set;
import java.util.Objects;
import java.lang.Integer;
import android.os.Handler;

public final class a	// class@002957
{
    public final Context a;
    public final HashMap b;
    public final HashMap c;
    public final ArrayList d;
    public final Handler e;
    public static final Object f;
    public static a g;

    static {
       a.f = new Object();
    }
    public void a(Context p0){
       super();
       this.b = new HashMap();
       this.c = new HashMap();
       this.d = new ArrayList();
       this.a = p0;
       this.e = new a$a(this, p0.getMainLooper());
    }
    public static a b(Context p0){
       Object f = a.f;
       _monitor_enter(f);
       if (a.g == null) {
          a.g = new a(p0.getApplicationContext());
       }
       _monitor_exit(f);
       return a.g;
    }
    public void a(){
       a tb = this.b;
       _monitor_enter(tb);
       int i = this.d.size();
       while (i > 0) {
          a$b[] uobArray = new a$b[i];
          this.d.toArray(uobArray);
          this.d.clear();
          _monitor_exit(tb);
          int i1 = 0;
          while (i1 < i) {
             object oobject = uobArray[i1];
             int i2 = oobject.b.size();
             int i3 = 0;
             while (i3 < i2) {
                a$c uoc = oobject.b.get(i3);
                if (uoc.d == null) {
                   uoc.b.onReceive(this.a, oobject.a);
                }
                i3 = i3 + 1;
             }
             i1 = i1 + 1;
          }
       }
       _monitor_exit(tb);
       return;
    }
    public void c(BroadcastReceiver p0,IntentFilter p1){
       a tb = this.b;
       _monitor_enter(tb);
       a$c uoc = new a$c(p1, p0);
       ArrayList uArrayList = this.b.get(p0);
       if (uArrayList == null) {
          uArrayList = new ArrayList(1);
          this.b.put(p0, uArrayList);
       }
       uArrayList.add(uoc);
       for (int i = 0; i < p1.countActions(); i++) {
          String action = p1.getAction(i);
          ArrayList uArrayList1 = this.c.get(action);
          if (uArrayList1 == null) {
             uArrayList1 = new ArrayList(1);
             this.c.put(action, uArrayList1);
          }
          uArrayList1.add(uoc);
       }
       _monitor_exit(tb);
       return;
    }
    public boolean d(Intent p0){
       int i3;
       Object obj2;
       String str1;
       String str2;
       ArrayList uArrayList;
       a uoa = this;
       Intent intent = p0;
       a b = uoa.b;
       _monitor_enter(b);
       String action = p0.getAction();
       String str = intent.resolveTypeIfNeeded(uoa.a.getContentResolver());
       Uri data = p0.getData();
       String scheme = p0.getScheme();
       Set categories = p0.getCategories();
       int i = (p0.getFlags() & 0x08)? 1: 0;
       if (i) {
          p0.toString();
       }
       Object obj = uoa.c.get(p0.getAction());
       if (obj != null) {
          if (i) {
             obj.toString();
          }
          int i1 = 0;
          int i2 = 0;
          while (i2 < obj.size()) {
             Object obj1 = obj.get(i2);
             if (i) {
                Objects.toString(obj1.a);
             }
             if (obj1.c != null) {
                i3 = i2;
                obj2 = obj;
                str1 = action;
                str2 = str;
                uArrayList = i1;
             }else {
                Object obj3 = obj1;
                i3 = i2;
                str1 = action;
                uArrayList = i1;
                obj2 = obj;
                str2 = str;
                int i4 = obj1.a.match(action, str, scheme, data, categories, "LocalBroadcastManager");
                if (i4 >= 0) {
                   if (i) {
                      Integer.toHexString(i4);
                   }
                   i1 = (!uArrayList)? new ArrayList(): uArrayList;
                   i1.add(obj3);
                   obj3.c = true;
                label_00a0 :
                   i2 = i3 + 1;
                   action = str1;
                   obj = obj2;
                   str = str2;
                   String str3 = null;
                }
             }
             i1 = uArrayList;
             goto label_00a0 ;
          }
          uArrayList = i1;
          if (uArrayList != null) {
             for (int i5 = 0; i5 < uArrayList.size(); i5 = i5 + 1) {
                uArrayList.get(i5).c = false;
             }
             uoa.d.add(new a$b(intent, uArrayList));
             if (!uoa.e.hasMessages(1)) {
                uoa.e.sendEmptyMessage(1);
             }
             _monitor_exit(b);
             return 1;
          }
       }else {
          boolean b1 = false;
       }
       _monitor_exit(b);
       return false;
    }
    public void e(BroadcastReceiver p0){
       a tb = this.b;
       _monitor_enter(tb);
       ArrayList uArrayList = this.b.remove(p0);
       if (uArrayList == null) {
          _monitor_exit(tb);
          return;
       }else {
          int i = uArrayList.size() - 1;
          while (i >= 0) {
             a$c uoc = uArrayList.get(i);
             uoc.d = true;
             int i1 = 0;
             while (i1 < uoc.a.countActions()) {
                String action = uoc.a.getAction(i1);
                ArrayList uArrayList1 = this.c.get(action);
                if (uArrayList1 != null) {
                   int i2 = uArrayList1.size() - 1;
                   while (i2 >= 0) {
                      a$c uoc1 = uArrayList1.get(i2);
                      if (uoc1.b == p0) {
                         uoc1.d = true;
                         uArrayList1.remove(i2);
                      }
                      i2 = i2 - 1;
                   }
                   if (uArrayList1.size() <= 0) {
                      this.c.remove(action);
                   }
                }
                i1 = i1 + 1;
             }
             i = i - 1;
          }
          _monitor_exit(tb);
          return;
       }
    }
}
