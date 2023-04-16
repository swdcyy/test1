package zsd.n;
import java.lang.Object;
import java.lang.Appendable;
import java.lang.CharSequence;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.l;
import java.lang.Character;
import java.util.Objects;

public class n	// class@00296f
{

    public void n(){
       super();
    }
    public static final Appendable a(Appendable p0,CharSequence[] p1){
       a.p(p0, "$this$append");
       a.p(p1, "value");
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          p0.append(p1[i]);
       }
       return p0;
    }
    public static final void b(Appendable p0,Object p1,l p2){
       a.p(p0, "$this$appendElement");
       if (p2 != null) {
          p0.append(p2.invoke(p1));
       }else if(p1 != null){
          p2 = p1 instanceof CharSequence;
       }else {
          int i = 1;
       }
       if (p2) {
          p0.append(p1);
       }else if(p1 instanceof Character){
          p0.append(p1.charValue());
       }else {
          p0.append(String.valueOf(p1));
       }
       return;
    }
    public static final Appendable c(Appendable p0){
       p0 = p0.append(10);
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final Appendable d(Appendable p0,char p1){
       p0 = p0.append(p1);
       a.o(p0, "append\(value\)");
       p0 = p0.append(10);
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final Appendable e(Appendable p0,CharSequence p1){
       p0 = p0.append(p1);
       a.o(p0, "append\(value\)");
       p0 = p0.append(10);
       a.o(p0, "append\(\'\\n\'\)");
       return p0;
    }
    public static final Appendable f(Appendable p0,CharSequence p1,int p2,int p3){
       a.p(p0, "$this$appendRange");
       a.p(p1, "value");
       p0 = p0.append(p1, p2, p3);
       Objects.requireNonNull(p0, "null cannot be cast to non-null type T");
       return p0;
    }
}
