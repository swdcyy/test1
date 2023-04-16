package kotlin.text.Regex$Serialized;
import java.io.Serializable;
import kotlin.text.Regex$Serialized$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import kotlin.text.Regex;
import java.util.regex.Pattern;

public final class Regex$Serialized implements Serializable	// class@0018f3
{
    public final int flags;
    public final String pattern;
    public static final Regex$Serialized$a Companion;
    public static final long serialVersionUID;

    static {
       Regex$Serialized.Companion = new Regex$Serialized$a(null);
    }
    public void Regex$Serialized(String p0,int p1){
       a.p(p0, "pattern");
       super();
       this.pattern = p0;
       this.flags = p1;
    }
    public final int getFlags(){
       return this.flags;
    }
    public final String getPattern(){
       return this.pattern;
    }
    public final Object readResolve(){
       Pattern pattern = Pattern.compile(this.pattern, this.flags);
       a.o(pattern, "Pattern.compile\(pattern, flags\)");
       return new Regex(pattern);
    }
}
