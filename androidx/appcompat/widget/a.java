package androidx.appcompat.widget.a;
import android.database.DataSetObservable;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.HashMap;
import android.content.Context;
import java.util.ArrayList;
import androidx.appcompat.widget.a$d;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.util.Map;
import androidx.appcompat.widget.a$e;
import java.util.List;
import android.content.Intent;
import androidx.appcompat.widget.a$b;
import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import androidx.appcompat.widget.a$f;
import java.lang.System;
import android.content.pm.PackageManager;
import androidx.appcompat.widget.a$g;
import android.os.AsyncTask;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.lang.IllegalStateException;
import java.io.FileInputStream;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import java.io.InputStream;
import java.lang.Long;
import java.lang.Float;
import org.xmlpull.v1.XmlPullParserException;
import java.util.Collections;
import androidx.appcompat.widget.a$c;

public class a extends DataSetObservable	// class@00063d
{
    public final Object a;
    public final List b;
    public final List c;
    public final Context d;
    public final String e;
    public Intent f;
    public a$c g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public a$f m;
    public static final String n;
    public static final Object o;
    public static final Map p;

    static {
       a.n = a.class.getSimpleName();
       a.o = new Object();
       a.p = new HashMap();
    }
    public void a(Context p0,String p1){
       super();
       this.a = new Object();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.g = new a$d();
       this.h = 50;
       boolean b = true;
       this.i = b;
       this.j = false;
       this.k = b;
       this.l = false;
       this.d = p0.getApplicationContext();
       if (!TextUtils.isEmpty(p1)) {
          String str = ".xml";
          if (!p1.endsWith(str)) {
             this.e = p1+str;
          label_0055 :
             return;
          }
       }
       this.e = p1;
       goto label_0055 ;
    }
    public static a d(Context p0,String p1){
       Object o = a.o;
       _monitor_enter(o);
       Map p = a.p;
       a uoa = p.get(p1);
       if (uoa == null) {
          uoa = new a(p0, p1);
          p.put(p1, uoa);
       }
       _monitor_exit(o);
       return uoa;
    }
    public final boolean a(a$e p0){
       boolean b = this.c.add(p0);
       if (b) {
          this.k = true;
          this.l();
          this.k();
          this.p();
          this.notifyChanged();
       }
       return b;
    }
    public Intent b(int p0){
       a ta = this.a;
       _monitor_enter(ta);
       Intent intent = null;
       if (this.f == null) {
          _monitor_exit(ta);
          return intent;
       }else {
          this.c();
          ResolveInfo activityInfo = this.b.get(p0).b.activityInfo;
          ComponentName uComponentNa = new ComponentName(activityInfo.packageName, activityInfo.name);
          Intent intent1 = new Intent(this.f);
          intent1.setComponent(uComponentNa);
          if (this.m != null && this.m.a(this, new Intent(intent1))) {
             _monitor_exit(ta);
             return intent;
          }else {
             this.a(new a$e(uComponentNa, System.currentTimeMillis(), 0x3f800000));
             _monitor_exit(ta);
             return intent1;
          }
       }
    }
    public final void c(){
       this.l();
       if (this.j() | this.m()) {
          this.p();
          this.notifyChanged();
       }
       return;
    }
    public ResolveInfo e(int p0){
       a ta = this.a;
       _monitor_enter(ta);
       this.c();
       _monitor_exit(ta);
       return this.b.get(p0).b;
    }
    public int f(){
       a ta = this.a;
       _monitor_enter(ta);
       this.c();
       _monitor_exit(ta);
       return this.b.size();
    }
    public int g(ResolveInfo p0){
       a ta = this.a;
       _monitor_enter(ta);
       this.c();
       a tb = this.b;
       int i = tb.size();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             if (tb.get(i1).b == p0) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             _monitor_exit(ta);
             return -1;
          }
       }
       _monitor_exit(ta);
       return i1;
    }
    public ResolveInfo h(){
       a ta = this.a;
       _monitor_enter(ta);
       this.c();
       if (!this.b.isEmpty()) {
          _monitor_exit(ta);
          return this.b.get(0).b;
       }else {
          _monitor_exit(ta);
          return null;
       }
    }
    public int i(){
       a ta = this.a;
       _monitor_enter(ta);
       this.c();
       _monitor_exit(ta);
       return this.c.size();
    }
    public final boolean j(){
       boolean b = false;
       if (this.l == null || this.f == null) {
          return b;
       }
       this.l = b;
       this.b.clear();
       List list = this.d.getPackageManager().queryIntentActivities(this.f, b);
       int i = list.size();
       for (; b < i; b = b + 1) {
          this.b.add(new a$b(list.get(b)));
       }
       return true;
    }
    public final void k(){
       if (this.j == null) {
          throw new IllegalStateException("No preceding call to #readHistoricalData");
       }
       if (this.k == null) {
          return;
       }
       boolean b = false;
       this.k = b;
       if (!TextUtils.isEmpty(this.e)) {
          Object[] objArray = new Object[]{new ArrayList(this.c),this.e};
          new a$g(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArray);
       }
       return;
    }
    public final void l(){
       int i = this.c.size() - this.h;
       if (i <= 0) {
          return;
       }
       this.k = true;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.c.remove(0);
       }
       return;
    }
    public final boolean m(){
       if (this.i == null || (this.k == null || TextUtils.isEmpty(this.e))) {
          return false;
       }
       this.i = false;
       this.j = true;
       this.n();
       return true;
    }
    public final void n(){
       try{
          FileInputStream uFileInputSt = this.d.openFileInput(this.e);
          try{
             XmlPullParser xmlPullParse = Xml.newPullParser();
             xmlPullParse.setInput(uFileInputSt, "UTF-8");
             try{
                for (int i = 0; i != 1 && i != 2; i = xmlPullParse.next()) {
                }
                if (!("historical-records").equals(xmlPullParse.getName())) {
                   throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
                a tc = this.c;
                tc.clear();
                while (true) {
                   int i1 = xmlPullParse.next();
                   if (i1 == 1) {
                      if (uFileInputSt != null) {
                      }else {
                         break ;
                      }
                   }else if(i1 == 3 || i1 == 4){
                      continue ;
                   }else if(("historical-record").equals(xmlPullParse.getName())){
                      tc.add(new a$e(xmlPullParse.getAttributeValue(null, "activity"), Long.parseLong(xmlPullParse.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParse.getAttributeValue(null, "weight"))));
                   }else {
                      throw new XmlPullParserException("Share records file not well-formed.");
                   }
                }
             label_008e :
                return;
             }catch( e0){
             }
          }catch(org.xmlpull.v1.XmlPullParserException e0){
             if (e0 != null) {
             }else {
                goto label_008e ;
             }
          }catch(java.io.IOException e0){
             if (e0 != null) {
             }else {
                goto label_008e ;
             }
          }
          try{
             e0.close();
             goto label_008e ;
          }catch(java.io.IOException e0){
          }
       }catch(java.io.FileNotFoundException e0){
       }
    }
    public void o(int p0){
       a ta = this.a;
       _monitor_enter(ta);
       this.c();
       a$b uob = this.b.get(p0);
       a$b uob1 = this.b.get(0);
       float f = (uob1 != null)? (uob1.c - uob.c) + 5.00f: 0x3f800000;
       ResolveInfo activityInfo = uob.b.activityInfo;
       this.a(new a$e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f));
       _monitor_exit(ta);
       return;
    }
    public final boolean p(){
       if (this.g == null || (this.f == null || (this.b.isEmpty() || this.c.isEmpty()))) {
          return false;
       }
       this.g.a(this.f, this.b, Collections.unmodifiableList(this.c));
       return true;
    }
}
