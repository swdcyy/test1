package kotlin.text.StringsKt__IndentKt$getIndentFunction$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class StringsKt__IndentKt$getIndentFunction$2 extends Lambda implements l	// class@0018fd
{
    public final String $indent;

    public void StringsKt__IndentKt$getIndentFunction$2(String p0){
       this.$indent = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(String p0){
       a.p(p0, "line");
       return this.$indent+p0;
    }
}
