package kotlin.text.StringsKt___StringsKt$a;
import java.lang.Iterable;
import osd.a;
import java.lang.CharSequence;
import java.lang.Object;
import java.util.Iterator;
import trd.r;
import kotlin.text.StringsKt__StringsKt;

public final class StringsKt___StringsKt$a implements Iterable, a	// class@001906
{
    public final CharSequence b;

    public void StringsKt___StringsKt$a(CharSequence p0){
       this.b = p0;
       super();
    }
    public Iterator iterator(){
       return StringsKt__StringsKt.s3(this.b);
    }
}
