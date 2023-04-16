package zsd.r;
import zsd.q;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import msd.l;

public class r extends q	// class@002973
{

    public void r(){
       super();
    }
    public static final StringBuilder h0(StringBuilder p0,Object p1){
       p0 = p0+p1;
       a.o(p0, "this.append\(obj\)");
       return p0;
    }
    public static final StringBuilder i0(StringBuilder p0,Object[] p1){
       a.p(p0, "$this$append");
       a.p(p1, "value");
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          p0 = p0+p1[i];
       }
       return p0;
    }
    public static final StringBuilder j0(StringBuilder p0,String[] p1){
       a.p(p0, "$this$append");
       a.p(p1, "value");
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          p0 = p0+p1[i];
       }
       return p0;
    }
    public static final StringBuilder k0(StringBuilder p0){
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder l0(StringBuilder p0,char p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder m0(StringBuilder p0,CharSequence p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder n0(StringBuilder p0,Object p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder o0(StringBuilder p0,String p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder p0(StringBuilder p0,boolean p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final StringBuilder q0(StringBuilder p0,char[] p1){
       p0 = p0+p1;
       a.o(p0, "append\(value\)");
       p0 = p0+10;
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final String r0(int p0,l p1){
       StringBuilder str = new StringBuilder(p0);
       p1.invoke(str);
       String str1 = str;
       a.o(str1, "StringBuilder\(capacity\).¡­builderAction\).toString\(\)");
       return str1;
    }
    public static final String s0(l p0){
       StringBuilder str = "";
       p0.invoke(str);
       String str1 = str;
       a.o(str1, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       return str1;
    }
}
