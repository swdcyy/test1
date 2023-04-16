package kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$4;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.Number;
import kotlin.Pair;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Collection;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Integer;
import qrd.r0;

public final class StringsKt__StringsKt$rangesDelimitedBy$4 extends Lambda implements p	// class@001902
{
    public final List $delimitersList;
    public final boolean $ignoreCase;

    public void StringsKt__StringsKt$rangesDelimitedBy$4(List p0,boolean p1){
       this.$delimitersList = p0;
       this.$ignoreCase = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
    public final Pair invoke(CharSequence p0,int p1){
       a.p(p0, "$receiver");
       Pair pair = StringsKt__StringsKt.U2(p0, this.$delimitersList, p1, this.$ignoreCase, false);
       pair = (pair != null)? r0.a(pair.getFirst(), Integer.valueOf((pair.getSecond()).length())): null;
       return pair;
    }
}
