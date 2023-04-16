package cud.m;
import java.lang.Object;
import cud.l;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.l1;
import java.lang.IllegalArgumentException;

public final class m	// class@001443
{
    public static l a;
    public static long b;
    public static final m c;

    static {
       m.c = new m();
    }
    public void m(){
       super();
    }
    public static final void a(l p0){
       a.q(p0, "segment");
       l ol = (p0.f == null && p0.g == null)? 1: null;
       if (ol) {
          if (p0.d != null) {
             return;
          }else {
             m c = m.c;
             _monitor_enter(c);
             long l = m.b + (long)8192;
             if (l - 0x10000 > 0) {
                _monitor_exit(c);
                return;
             }else {
                m.b = l;
                p0.f = m.a;
                p0.c = 0;
                p0.b = 0;
                m.a = p0;
                _monitor_exit(c);
                return;
             }
          }
       }else {
          throw new IllegalArgumentException("Failed requirement.".toString());
       }
    }
    public static final l b(){
       m c = m.c;
       _monitor_enter(c);
       l a = m.a;
       if (a != null) {
          m.a = a.f;
          a.f = null;
          m.b = m.b - (long)8192;
          _monitor_exit(c);
          return a;
       }else {
          _monitor_exit(c);
          return new l();
       }
    }
}
