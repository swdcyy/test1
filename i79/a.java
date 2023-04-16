package i79.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Character;
import java.lang.Appendable;
import kotlin.jvm.internal.a;

public final class a	// class@002644
{
    public String a;
    public String b;
    public String c;

    public void a(String p0,String p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final String a(){
       return this.b;
    }
    public final String b(){
       return this.a;
    }
    public boolean equals(Object p0){
       String str2;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (!p0 instanceof a) {
          return i;
       }
       obj = this.a;
       StringBuilder str = null;
       if (obj != null) {
          StringBuilder str1 = "";
          int i1 = obj.length();
          int i2 = 0;
          while (i2 < i1) {
             char c = obj.charAt(i2);
             if (Character.isLetter(c)) {
                str1.append(c);
             }
             i2 = i2 + 1;
          }
          str2 = str1;
          a.o(str2, "filterTo\(StringBuilder\(\), predicate\).toString\(\)");
       }else {
          str2 = str;
       }
       p0 = p0.a;
       if (p0 != null) {
          str = "";
          int i3 = p0.length();
          while (i < i3) {
             char c1 = p0.charAt(i);
             if (Character.isLetter(c1)) {
                str.append(c1);
             }
             i = i + 1;
          }
          str = str;
          a.o(str, "filterTo\(StringBuilder\(\), predicate\).toString\(\)");
       }
       return a.g(str2, str);
    }
}
