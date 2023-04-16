package zsd.q;
import zsd.p;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuffer;
import java.lang.CharSequence;
import java.lang.Appendable;
import zsd.w;

public class q extends p	// class@002972
{

    public void q(){
       super();
    }
    public static final StringBuilder A(StringBuilder p0,long p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder B(StringBuilder p0,StringBuffer p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder C(StringBuilder p0,StringBuilder p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder D(StringBuilder p0,short p1){
       p0 = p0+p1;
       a.o(p0, "append\(value.toInt\(\)\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder E(StringBuilder p0,CharSequence p1,int p2,int p3){
       p0 = p0+p1;
       a.o(p0, "this.append\(value, startIndex, endIndex\)");
       return p0;
    }
    public static final StringBuilder F(StringBuilder p0,char[] p1,int p2,int p3){
       p0 = p0+p1;
       a.o(p0, "this.append\(value, start¡­x, endIndex - startIndex\)");
       return p0;
    }
    public static final Appendable G(Appendable p0){
       a.p(p0, "$this$appendln");
       p0 = p0.append(w.a);
       a.o(p0, "append\(SystemProperties.LINE_SEPARATOR\)");
       return p0;
    }
    public static final Appendable H(Appendable p0,char p1){
       p0 = p0.append(p1);
       a.o(p0, "append\(value\)");
       return q.G(p0);
    }
    public static final Appendable I(Appendable p0,CharSequence p1){
       p0 = p0.append(p1);
       a.o(p0, "append\(value\)");
       return q.G(p0);
    }
    public static final StringBuilder J(StringBuilder p0){
       a.p(p0, "$this$appendln");
       p0 = p0+w.a;
       a.o(p0, "append\(SystemProperties.LINE_SEPARATOR\)");
       return p0;
    }
    public static final StringBuilder K(StringBuilder p0,byte p1){
       p0 = p0+p1;
       a.o(p0, "append\(value.toInt\(\)\)");
       return q.J(p0);
    }
    public static final StringBuilder L(StringBuilder p0,char p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       return q.J(p0);
    }
    public static final StringBuilder M(StringBuilder p0,double p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       return q.J(p0);
    }
    public static final StringBuilder N(StringBuilder p0,float p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       return q.J(p0);
    }
    public static final StringBuilder O(StringBuilder p0,int p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       return q.J(p0);
    }
    public static final StringBuilder P(StringBuilder p0,long p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       return q.J(p0);
    }
    public static final StringBuilder Q(StringBuilder p0,CharSequence p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       return q.J(p0);
    }
    public static final StringBuilder R(StringBuilder p0,Object p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       return q.J(p0);
    }
    public static final StringBuilder S(StringBuilder p0,String p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       return q.J(p0);
    }
    public static final StringBuilder T(StringBuilder p0,StringBuffer p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       return q.J(p0);
    }
    public static final StringBuilder U(StringBuilder p0,StringBuilder p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       return q.J(p0);
    }
    public static final StringBuilder V(StringBuilder p0,short p1){
       p0 = p0+p1;
       a.o(p0, "append\(value.toInt\(\)\)");
       return q.J(p0);
    }
    public static final StringBuilder W(StringBuilder p0,boolean p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       return q.J(p0);
    }
    public static final StringBuilder X(StringBuilder p0,char[] p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       return q.J(p0);
    }
    public static final StringBuilder Y(StringBuilder p0){
       a.p(p0, "$this$clear");
       p0.setLength(0);
       return p0;
    }
    public static final StringBuilder Z(StringBuilder p0,int p1){
       p0 = p0.deleteCharAt(p1);
       a.o(p0, "this.deleteCharAt\(index\)");
       return p0;
    }
    public static final StringBuilder a0(StringBuilder p0,int p1,int p2){
       p0 = p0.delete(p1, p2);
       a.o(p0, "this.delete\(startIndex, endIndex\)");
       return p0;
    }
    public static final StringBuilder b0(StringBuilder p0,int p1,CharSequence p2,int p3,int p4){
       p0 = p0.insert(p1, p2, p3, p4);
       a.o(p0, "this.insert\(index, value, startIndex, endIndex\)");
       return p0;
    }
    public static final StringBuilder c0(StringBuilder p0,int p1,char[] p2,int p3,int p4){
       p0 = p0.insert(p1, p2, p3, (p4 - p3));
       a.o(p0, "this.insert\(index, value¡­x, endIndex - startIndex\)");
       return p0;
    }
    public static final void d0(StringBuilder p0,int p1,char p2){
       a.p(p0, "$this$set");
       p0.setCharAt(p1, p2);
    }
    public static final StringBuilder e0(StringBuilder p0,int p1,int p2,String p3){
       p0 = p0.replace(p1, p2, p3);
       a.o(p0, "this.replace\(startIndex, endIndex, value\)");
       return p0;
    }
    public static final void f0(StringBuilder p0,char[] p1,int p2,int p3,int p4){
       p0.getChars(p3, p4, p1, p2);
    }
    public static void g0(StringBuilder p0,char[] p1,int p2,int p3,int p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = 0;
       }
       if (p5 & 0x04) {
          p3 = 0;
       }
       if (p5 & 0x08) {
          p4 = p0.length();
       }
       p0.getChars(p3, p4, p1, p2);
       return;
    }
    public static final StringBuilder w(StringBuilder p0,byte p1){
       p0 = p0+p1;
       a.o(p0, "append\(value.toInt\(\)\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder x(StringBuilder p0,double p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder y(StringBuilder p0,float p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder z(StringBuilder p0,int p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
}
