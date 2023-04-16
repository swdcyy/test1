package c.t.m.g.s;
import java.lang.Object;
import java.lang.Math;
import c.t.m.g.s$a;
import java.lang.String;
import c.t.m.g.bc;
import java.lang.System;

public class s	// class@000ca6
{
    public byte[] b;
    public s$a[] c;
    public byte[] d;
    public static final int[] a;

    static {
       s.a = new int[10]{31,'q',239,397,439,557,619,773,853,977};
    }
    public void s(){
       super(8192, 5);
    }
    public void s(int p0,int p1){
       super();
       int i = 0;
       byte[] uobyteArray = new byte[i];
       this.b = uobyteArray;
       s$a[] uoaArray = new s$a[Math.min(Math.max(1, p1), s.a.length)];
       this.c = uoaArray;
       s tc = this.c;
       while (i < tc.length) {
          int i1 = p0 * 8;
          tc[i] = new s$a(i1, s.a[i]);
          i = i + 1;
       }
       byte[] uobyteArray1 = new byte[p0];
       this.d = uobyteArray1;
       return;
    }
    public void a(String p0){
       s tb = this.b;
       _monitor_enter(tb);
       s tc = this.c;
       int len = tc.length;
       for (int i = 0; i < len; i = i + 1) {
          bc.a(this.d, tc[i].a(p0), true);
       }
       _monitor_exit(tb);
       return;
    }
    public void a(byte[] p0){
       s tb = this.b;
       _monitor_enter(tb);
       if (p0 != null) {
          System.arraycopy(p0, 0, this.d, 0, Math.min(p0.length, this.d.length));
       }
       _monitor_exit(tb);
       return;
    }
    public byte[] a(){
       s tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return this.d;
    }
    public boolean b(String p0){
       s tb = this.b;
       _monitor_enter(tb);
       if (p0 == null) {
          _monitor_exit(tb);
          return false;
       }else {
          s tc = this.c;
          int len = tc.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if (!bc.a(this.d, tc[i].a(p0))) {
                   break ;
                }else {
                   i = i + 1;
                }
             }else {
                _monitor_exit(tb);
                return true;
             }
          }
          _monitor_exit(tb);
          return false;
       }
    }
}
