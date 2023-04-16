package kotlin.text.Regex$findAll$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import java.lang.CharSequence;
import java.lang.Object;
import zsd.k;

public final class Regex$findAll$1 extends Lambda implements a	// class@0018f5
{
    public final CharSequence $input;
    public final int $startIndex;
    public final Regex this$0;

    public void Regex$findAll$1(Regex p0,CharSequence p1,int p2){
       this.this$0 = p0;
       this.$input = p1;
       this.$startIndex = p2;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final k invoke(){
       return this.this$0.find(this.$input, this.$startIndex);
    }
}
