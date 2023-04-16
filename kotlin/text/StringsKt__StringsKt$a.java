package kotlin.text.StringsKt__StringsKt$a;
import trd.r;
import java.lang.CharSequence;

public final class StringsKt__StringsKt$a extends r	// class@001900
{
    public int b;
    public final CharSequence c;

    public void StringsKt__StringsKt$a(CharSequence p0){
       this.c = p0;
       super();
    }
    public char b(){
       StringsKt__StringsKt$a tb = this.b;
       this.b = tb + 1;
       return this.c.charAt(tb);
    }
    public boolean hasNext(){
       boolean b = (this.b < this.c.length())? true: false;
       return b;
    }
}
