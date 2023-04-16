package kotlin.text.Regex$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

public final class Regex$a	// class@0018f4
{

    public void Regex$a(){
       super();
    }
    public void Regex$a(u p0){
       super();
    }
    public final int a(int p0){
       if (p0 & 0x02) {
          p0 = p0 | 0x40;
       }
       return p0;
    }
    public final String b(String p0){
       a.p(p0, "literal");
       p0 = Pattern.quote(p0);
       a.o(p0, "Pattern.quote\(literal\)");
       return p0;
    }
    public final String c(String p0){
       a.p(p0, "literal");
       p0 = Matcher.quoteReplacement(p0);
       a.o(p0, "Matcher.quoteReplacement\(literal\)");
       return p0;
    }
    public final Regex d(String p0){
       a.p(p0, "literal");
       return new Regex(p0, RegexOption.LITERAL);
    }
}
