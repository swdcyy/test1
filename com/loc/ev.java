package com.loc.ev;
import android.content.Context;
import android.os.Handler;
import java.lang.Object;
import java.util.LinkedList;
import com.loc.ev$1;
import java.io.File;
import java.lang.String;
import com.loc.fq;
import java.lang.Throwable;
import com.loc.eb;
import java.lang.Runnable;
import java.util.ArrayList;
import java.util.List;
import java.lang.System;
import java.util.Iterator;
import com.loc.eu;
import com.loc.p;
import com.loc.ey;
import org.json.JSONObject;
import org.json.JSONException;
import java.io.UnsupportedEncodingException;
import android.location.Location;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class ev	// class@00141d
{
    public LinkedList a;
    public File b;
    public boolean c;
    public Handler d;
    public String e;
    public boolean f;
    public Runnable g;

    public void ev(Context p0,Handler p1){
       super();
       this.a = new LinkedList();
       this.c = false;
       this.e = null;
       this.g = new ev$1(this);
       this.d = p1;
       String path = p0.getFilesDir().getPath();
       if (this.e == null) {
          this.e = fq.l(p0);
       }
       this.b = new File(path, "hisloc");
       this.a();
       ev td = this.d;
       if (td != null) {
          td.removeCallbacks(this.g);
          this.d.postDelayed(this.g, 0xea60);
       }
       return;
    }
    public static boolean a(ev p0){
       return p0.c;
    }
    public static boolean b(ev p0){
       return p0.f;
    }
    public static boolean b(ArrayList p0,ArrayList p1){
       if (p0 != null && (p0.size() <= 0 || (p1 != null && p1.size() > 0))) {
          if ((long)p0.size() - 4 >= 0) {
             return false;
          }else if((long)p1.size() - 20 >= 0){
             return false;
          }
       }
       return true;
    }
    public static void c(ev p0){
       p0.b();
    }
    public static boolean d(ev p0){
       p0.f = false;
       return false;
    }
    public static Handler e(ev p0){
       return p0.d;
    }
    public static Runnable f(ev p0){
       return p0.g;
    }
    public final List a(ArrayList p0,ArrayList p1){
       if (!ev.b(p0, p1)) {
          return null;
       }
       long l = System.currentTimeMillis();
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          eu uoeu = iterator.next();
          long l1 = l - uoeu.d;
          if (l1 - 0x50775d800 < 0) {
             uArrayList.add(uoeu);
             i = i + 1;
          }
          if (i == 10) {
             break ;
          }
       }
       return uArrayList;
    }
    public final void a(){
       ev ta = this.a;
       if (ta != null && ta.size() > 0) {
          return;
       }
       Iterator iterator = fq.a(this.b).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          try{
             eu uoeu = new eu();
             uoeu.a(new JSONObject(new String(ey.b(p.b(str), this.e), "UTF-8")));
             this.a.add(uoeu);
          }catch(java.io.UnsupportedEncodingException e1){
             e1.printStackTrace();
             goto label_0015 ;
          }catch(org.json.JSONException e1){
             e1.printStackTrace();
             goto label_0015 ;
          }
       }
       return;
    }
    public final void a(eu p0){
       Iterator iterator = this.a.iterator();
       int i = 0;
       eu uoeu = null;
       eu uoeu1 = uoeu;
       int i1 = 0;
       while (iterator.hasNext()) {
          eu uoeu2 = iterator.next();
          if (uoeu2.a == 1) {
             if (uoeu1 == null) {
                uoeu1 = uoeu2;
             }
             i1 = i1 + 1;
             uoeu = uoeu2;
          }
       }
       if (uoeu != null) {
          Location location = new Location("gps");
          if ((p0.d - uoeu.d) - 0x4e20 < 0) {
             double[] uodoubleArra = new double[]{p0.b,p0.c,uoeu.b,uoeu.c};
             if (fq.a(uodoubleArra) - 0x41a00000 < 0) {
                return;
             }
          }
       }
       if ((long)i1 - 5 >= 0) {
          this.a.remove(uoeu1);
       }
       if ((long)this.a.size() - 10 >= 0) {
          this.a.removeFirst();
       }
       this.a.add(p0);
       this.f = true;
       return;
    }
    public final void a(boolean p0){
       if (!p0) {
          this.g.run();
       }
       ev td = this.d;
       if (td != null) {
          td.removeCallbacks(this.g);
       }
       this.c = true;
       return;
    }
    public final void b(){
       String str = "";
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          eu uoeu = iterator.next();
          try{
             str = str+p.b(ey.a((uoeu.a()).getBytes("UTF-8"), this.e))+"\n";
          }catch(java.io.UnsupportedEncodingException e2){
             e2.printStackTrace();
             goto label_000b ;
          }
       }
       str = str;
       if (!TextUtils.isEmpty(str)) {
          fq.a(this.b, str);
       }
       return;
    }
    public final void b(eu p0){
       if (this.a.size() > 0) {
          eu a = p0.a;
          if (a == 6 || a == 5) {
             a = this.a.getLast();
             if (!a.c - p0.c && (a.b - p0.b || a.e != p0.e)) {
                if ((long)this.a.size() - 10 >= 0) {
                   this.a.removeFirst();
                }
                this.a.add(p0);
                this.f = true;
             }
          }else if(!this.a.contains(p0)){
             if ((long)this.a.size() - 10 >= 0) {
                this.a.removeFirst();
             }
             this.a.add(p0);
             this.f = true;
          }
       }
       return;
    }
}
