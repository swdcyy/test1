package com.xiaomi.push.e$a;
import java.lang.String;
import java.lang.Object;

public class e$a	// class@0010ff
{
    public String a;
    public static final e$a b;
    public static final e$a c;
    public static final e$a d;
    public static final e$a e;
    public static final e$a f;

    static {
       e$a.b = new e$a("get");
       e$a.c = new e$a("set");
       e$a.d = new e$a("result");
       e$a.e = new e$a("error");
       e$a.f = new e$a("command");
    }
    public void e$a(String p0){
       this.a = p0;
    }
    public static e$a a(String p0){
       if (p0 == null) {
          return null;
       }
       p0 = p0.toLowerCase();
       e$a b = e$a.b;
       if ((b.toString()).equals(p0)) {
          return b;
       }
       b = e$a.c;
       if ((b.toString()).equals(p0)) {
          return b;
       }
       b = e$a.e;
       if ((b.toString()).equals(p0)) {
          return b;
       }
       b = e$a.d;
       if ((b.toString()).equals(p0)) {
          return b;
       }
       b = e$a.f;
       if ((b.toString()).equals(p0)) {
          return b;
       }
       return null;
    }
    public String toString(){
       return this.a;
    }
}
