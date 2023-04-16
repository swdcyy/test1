package ok.b;
import ok.o;
import ok.b$d;
import ok.b$c;
import ok.b$e;
import ok.b$k;
import ok.b$m;
import ok.b$n;
import ok.b$p;
import ok.b$o;
import ok.b$l;
import ok.b$h;
import ok.b$t;
import ok.b$a;
import java.lang.Object;
import java.lang.CharSequence;
import ok.b$b;
import ok.b$j;
import ok.b$g;
import ok.b$i;
import ok.b$r;
import java.lang.String;
import ok.b$u;
import java.lang.Character;
import ok.n;

public abstract class b implements o	// class@002046
{
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;

    static {
       b.b = b.j();
       b.c = b$d.p;
       b.d = b$c.q;
       b.e = b$e.s;
       b.f = b$k.p;
       b.g = b$m.p;
       b.h = b$n.p;
       b.i = b$p.p;
       b.j = b$o.p;
       b.k = b$l.q;
       b.l = b$h.s;
       b.m = b$t.s;
       b.n = b$a.q;
       b.o = b.g();
    }
    public void b(){
       super();
    }
    public static b a(CharSequence p0){
       int i = p0.length();
       if (!i) {
          return b.g();
       }
       int i1 = 0;
       if (i == 1) {
          return b.e(p0.charAt(i1));
       }
       if (i != 2) {
          return new b$b(p0);
       }
       return new b$j(p0.charAt(i1), p0.charAt(1));
    }
    public static b c(char p0,char p1){
       return new b$g(p0, p1);
    }
    public static b e(char p0){
       return new b$i(p0);
    }
    public static b g(){
       return b$r.q;
    }
    public static String h(char p0){
       char[] uocharArray = new char[6]{92,'u',0,0,0,0};
       for (int i = 0; i < 4; i = i + 1) {
          int i1 = i - 5;
          int i2 = p0 & 0x0f;
          uocharArray[i1] = ("0123456789ABCDEF").charAt(i2);
          int i3 = p0 >> 4;
       }
       return String.copyValueOf(uocharArray);
    }
    public static b j(){
       return b$u.r;
    }
    public boolean apply(Object p0){
       return this.b(p0);
    }
    public boolean b(Character p0){
       return this.f(p0.charValue());
    }
    public int d(CharSequence p0,int p1){
       int i = p0.length();
       n.l(p1, i);
       while (true) {
          if (p1 >= i) {
             return -1;
          }
          if (this.f(p0.charAt(p1))) {
             break ;
          }else {
             p1++;
          }
       }
       return p1;
    }
    public abstract boolean f(char p0);
    public String i(CharSequence p0){
       int i = p0.length();
       int i1 = 0;
       while (i1 < i && this.f(p0.charAt(i1))) {
          i1 = i1 + 1;
       }
       do {
          i = i - 1;
       } while (i <= i1 || !this.f(p0.charAt(i)));
       return p0.subSequence(i1, (i + 1)).toString();
    }
    public String toString(){
       return super.toString();
    }
}
