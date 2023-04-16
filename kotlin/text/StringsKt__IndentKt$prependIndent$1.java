package kotlin.text.StringsKt__IndentKt$prependIndent$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import zsd.u;
import java.lang.StringBuilder;

public final class StringsKt__IndentKt$prependIndent$1 extends Lambda implements l	// class@0018fe
{
    public final String $indent;

    public void StringsKt__IndentKt$prependIndent$1(String p0){
       this.$indent = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(String p0){
       StringsKt__IndentKt$prependIndent$1 t$indent;
       a.p(p0, "it");
       if (u.S1(p0)) {
          if (p0.length() < (this.$indent).length()) {
             t$indent = this.$indent;
          }
       }else {
          p0 = this.$indent+p0;
       }
       return t$indent;
    }
}
