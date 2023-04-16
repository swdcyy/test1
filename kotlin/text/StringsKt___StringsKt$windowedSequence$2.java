package kotlin.text.StringsKt___StringsKt$windowedSequence$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Number;

public final class StringsKt___StringsKt$windowedSequence$2 extends Lambda implements l	// class@00190c
{
    public final int $size;
    public final CharSequence $this_windowedSequence;
    public final l $transform;

    public void StringsKt___StringsKt$windowedSequence$2(CharSequence p0,int p1,l p2){
       this.$this_windowedSequence = p0;
       this.$size = p1;
       this.$transform = p2;
       super(1);
    }
    public final Object invoke(int p0){
       int i = this.$size + p0;
       if (i < 0 || i > this.$this_windowedSequence.length()) {
          i = this.$this_windowedSequence.length();
       }
       return this.$transform.invoke(this.$this_windowedSequence.subSequence(p0, i));
    }
    public Object invoke(Object p0){
       return this.invoke(p0.intValue());
    }
}
