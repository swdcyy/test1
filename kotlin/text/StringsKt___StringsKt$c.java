package kotlin.text.StringsKt___StringsKt$c;
import trd.e0;
import java.lang.CharSequence;
import msd.l;
import java.lang.Object;
import java.util.Iterator;
import trd.r;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Character;

public final class StringsKt___StringsKt$c implements e0	// class@001908
{
    public final CharSequence a;
    public final l b;

    public void StringsKt___StringsKt$c(CharSequence p0,l p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Iterator a(){
       return StringsKt__StringsKt.s3(this.a);
    }
    public Object b(Object p0){
       return this.c(p0.charValue());
    }
    public Object c(char p0){
       return this.b.invoke(Character.valueOf(p0));
    }
}
