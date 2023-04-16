package ok.b$b;
import ok.b;
import java.lang.CharSequence;
import java.lang.String;
import java.util.Arrays;
import java.lang.Object;
import java.lang.Character;
import java.lang.StringBuilder;

public final class b$b extends b	// class@0027e0
{
    public final char[] p;

    public void b$b(CharSequence p0){
       super();
       char[] uocharArray = (p0.toString()).toCharArray();
       this.p = uocharArray;
       Arrays.sort(uocharArray);
    }
    public boolean apply(Object p0){
       return this.b(p0);
    }
    public boolean f(char p0){
       boolean b = (Arrays.binarySearch(this.p, p0) >= 0)? true: false;
       return b;
    }
    public String toString(){
       String str = "CharMatcher.anyOf\(\"";
       b$b tp = this.p;
       int len = tp.length;
       for (int i = 0; i < len; i = i + 1) {
          str = str+b.h(tp[i]);
       }
       return str+"\"\)";
    }
}
