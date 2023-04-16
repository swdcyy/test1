package com.loc.w;
import java.lang.Object;
import com.loc.w$a;
import java.lang.String;
import com.loc.x;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;

public final class w	// class@001470
{
    public String a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String[] l;

    public void w(){
       super();
       this.c = 1;
       this.l = null;
    }
    public void w(w$a p0){
       super();
       this.c = 1;
       this.l = null;
       this.g = w$a.a(p0);
       this.h = w$a.b(p0);
       this.j = w$a.c(p0);
       this.i = w$a.d(p0);
       this.c = w$a.e(p0);
       this.k = w$a.f(p0);
       this.l = w$a.g(p0);
       this.b = x.b(this.h);
       this.a = x.b(this.j);
       this.d = x.b(this.i);
       this.e = x.b(w.a(this.l));
       this.f = x.b(this.k);
    }
    public void w(w$a p0,byte p1){
       super(p0);
    }
    public static String a(String[] p0){
       if (p0 == null) {
          return null;
       }
       StringBuilder str = "";
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          str = str+p0[i]+";";
       }
       return str;
    }
    public static String[] a(String p0){
       return p0.split(";");
    }
    public final String a(){
       if (TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(this.a)) {
          this.j = x.c(this.a);
       }
       return this.j;
    }
    public final void a(boolean p0){
       this.c = p0;
    }
    public final String b(){
       return this.g;
    }
    public final String c(){
       if (TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(this.b)) {
          this.h = x.c(this.b);
       }
       return this.h;
    }
    public final String d(){
       if (TextUtils.isEmpty(this.k) && !TextUtils.isEmpty(this.f)) {
          this.k = x.c(this.f);
       }
       if (TextUtils.isEmpty(this.k)) {
          this.k = "standard";
       }
       return this.k;
    }
    public final boolean e(){
       if (this.c == true) {
          return true;
       }
       return false;
    }
    public final boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 == this) {
          return true;
       }
       if (w.class != p0.getClass()) {
          return false;
       }
       if ((this.j).equals(p0.j) && ((this.g).equals(p0.g) && (this.h).equals(p0.h))) {
          return true;
       }
       return false;
    }
    public final String[] f(){
       w tl = this.l;
       if (tl == null || (!tl.length && !TextUtils.isEmpty(this.e))) {
          this.l = w.a(x.c(this.e));
       }
       return this.l.clone();
    }
}
