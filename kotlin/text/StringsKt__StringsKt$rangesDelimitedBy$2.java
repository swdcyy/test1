package kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.Number;
import kotlin.Pair;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Integer;
import qrd.r0;

public final class StringsKt__StringsKt$rangesDelimitedBy$2 extends Lambda implements p	// class@001901
{
    public final char[] $delimiters;
    public final boolean $ignoreCase;

    public void StringsKt__StringsKt$rangesDelimitedBy$2(char[] p0,boolean p1){
       this.$delimiters = p0;
       this.$ignoreCase = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
    public final Pair invoke(CharSequence p0,int p1){
       a.p(p0, "$receiver");
       int i = StringsKt__StringsKt.k3(p0, this.$delimiters, p1, this.$ignoreCase);
       Pair pair = (i < 0)? null: r0.a(Integer.valueOf(i), Integer.valueOf(1));
       return pair;
    }
}
