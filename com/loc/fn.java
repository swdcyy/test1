package com.loc.fn;
import android.content.Context;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.io.File;
import java.lang.String;
import com.loc.fq;
import java.lang.Throwable;
import com.loc.eb;
import com.amap.api.location.AMapLocation;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Long;
import org.json.JSONObject;
import com.loc.fo;
import com.loc.fp;
import android.content.SharedPreferences$Editor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.System;
import java.util.List;
import com.loc.p;
import com.loc.ey;
import java.io.UnsupportedEncodingException;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class fn	// class@001433
{
    public String a;
    public String b;
    public LinkedHashMap c;
    public File d;
    public String e;
    public Context g;
    public boolean h;
    public static fn f;
    public static long i;

    public void fn(Context p0){
       super();
       this.c = new LinkedHashMap();
       this.e = null;
       this.a = "";
       this.b = null;
       p0 = p0.getApplicationContext();
       this.g = p0;
       String path = p0.getFilesDir().getPath();
       if (this.e == null) {
          this.e = fq.l(this.g);
       }
       this.d = new File(path, "reportRecorder");
       this.c();
       return;
    }
    public static synchronized fn a(Context p0){
       _monitor_enter(fn.class);
       if (fn.f == null) {
          fn.f = new fn(p0);
       }
       _monitor_exit(fn.class);
       return fn.f;
    }
    public synchronized final void a(){
       if (this.h != null) {
          this.d();
          this.h = false;
       }
       return;
    }
    public synchronized final void a(AMapLocation p0){
       if (this.c.containsKey(this.a) || (this.c.size() >= 8 || (this.c.containsKey(this.a) && this.c.size() >= 9))) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.c.entrySet().iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().getKey());
             int i = this.c.size() - 7;
             if (uArrayList.size() == i) {
                break ;
             }
          }
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             this.c.remove(iterator1.next());
          }
       }
       if (p0.getErrorCode()) {
          return;
       }else if(p0.getLocationType() == 6 || p0.getLocationType() == 5){
          return;
       }else {
          long l = 1;
          if (this.c.containsKey(this.a)) {
             long l1 = this.c.get(this.a).longValue() + l;
             fn.i = l1;
             this.c.put(this.a, Long.valueOf(l1));
          }else {
             this.c.put(this.a, Long.valueOf(l));
             fn.i = l;
          }
          l = fn.i;
          if (l && !(l % 100)) {
             this.a();
          }
          this.h = true;
          return;
       }
    }
    public synchronized final void b(){
       if (!this.b(this.g)) {
          return;
       }
       Iterator iterator = this.c.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if ((this.a).equals(uEntry.getKey())) {
             continue ;
          }else {
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("param_long_first", uEntry.getKey());
             jSONObject.put("param_long_second", uEntry.getValue());
             fo.a(this.g, "O023", jSONObject);
          }
       }
       return;
    }
    public final boolean b(Context p0){
       if (this.b == null) {
          this.b = fp.a(p0, "pref", "lastavedate", "0");
       }
       if ((this.b).equals(this.a)) {
          return false;
       }else {
          SharedPreferences$Editor uEditor = fp.a(p0, "pref");
          fp.a(uEditor, "lastavedate", this.a);
          fp.a(uEditor);
          this.b = this.a;
          return true;
       }
    }
    public synchronized final void c(){
       fn tc = this.c;
       if (tc != null && tc.size() > 0) {
          return;
       }
       this.a = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
       Iterator iterator = fq.a(this.d).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          try{
             String[] stringArray = (new String(ey.b(p.b(str), this.e), "UTF-8")).split(",");
             if (stringArray != null) {
                int i = 1;
                if (stringArray.length > i) {
                   this.c.put(stringArray[0], Long.valueOf(Long.parseLong(stringArray[i])));
                }
             }
          }catch(java.io.UnsupportedEncodingException e1){
             e1.printStackTrace();
             goto label_002d ;
          }
       }
       return;
    }
    public final void d(){
       String str = "";
       Iterator iterator = this.c.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          try{
             str = str+p.b(ey.a((uEntry.getKey()+","+uEntry.getValue()).getBytes("UTF-8"), this.e))+"\n";
          }catch(java.io.UnsupportedEncodingException e2){
             e2.printStackTrace();
             goto label_000f ;
          }
       }
       str = str;
       if (!TextUtils.isEmpty(str)) {
          fq.a(this.d, str);
       }
       return;
    }
}
