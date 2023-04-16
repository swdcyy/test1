package zsd.v;
import kotlin.text.StringsKt__StringsKt;
import java.lang.CharSequence;
import msd.l;
import java.math.BigDecimal;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Character;
import java.math.BigInteger;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Collection;
import kotlin.text.StringsKt___StringsKt;

public class v extends StringsKt__StringsKt	// class@002b8d
{

    public void v(){
       super();
    }
    public static final char G5(CharSequence p0,int p1){
       return p0.charAt(p1);
    }
    public static final BigDecimal H5(CharSequence p0,l p1){
       int i = 0;
       BigDecimal uBigDecimal = BigDecimal.valueOf((long)i);
       a.o(uBigDecimal, "BigDecimal.valueOf\(this.toLong\(\)\)");
       for (; i < p0.length(); i = i + 1) {
          uBigDecimal = uBigDecimal.add(p1.invoke(Character.valueOf(p0.charAt(i))));
          a.o(uBigDecimal, "this.add\(other\)");
       }
       return uBigDecimal;
    }
    public static final BigInteger I5(CharSequence p0,l p1){
       int i = 0;
       BigInteger uBigInteger = BigInteger.valueOf((long)i);
       a.o(uBigInteger, "BigInteger.valueOf\(this.toLong\(\)\)");
       for (; i < p0.length(); i = i + 1) {
          uBigInteger = uBigInteger.add(p1.invoke(Character.valueOf(p0.charAt(i))));
          a.o(uBigInteger, "this.add\(other\)");
       }
       return uBigInteger;
    }
    public static final SortedSet J5(CharSequence p0){
       a.p(p0, "$this$toSortedSet");
       return StringsKt___StringsKt.I8(p0, new TreeSet());
    }
}
