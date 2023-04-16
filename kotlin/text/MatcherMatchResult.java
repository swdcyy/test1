package kotlin.text.MatcherMatchResult;
import zsd.k;
import java.util.regex.Matcher;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.text.MatcherMatchResult$groups$1;
import zsd.k$b;
import zsd.k$a;
import zsd.i;
import java.util.List;
import kotlin.text.MatcherMatchResult$a;
import java.util.regex.MatchResult;
import usd.k;
import kotlin.text.RegexKt;
import java.util.regex.Pattern;

public final class MatcherMatchResult implements k	// class@0018f1
{
    public final i a;
    public List b;
    public final Matcher c;
    public final CharSequence d;

    public void MatcherMatchResult(Matcher p0,CharSequence p1){
       a.p(p0, "matcher");
       a.p(p1, "input");
       super();
       this.c = p0;
       this.d = p1;
       this.a = new MatcherMatchResult$groups$1(this);
    }
    public k$b a(){
       return k$a.a(this);
    }
    public i b(){
       return this.a;
    }
    public List c(){
       if (this.b == null) {
          this.b = new MatcherMatchResult$a(this);
       }
       MatcherMatchResult tb = this.b;
       a.m(tb);
       return tb;
    }
    public final MatchResult d(){
       return this.c;
    }
    public k getRange(){
       return RegexKt.d(this.d());
    }
    public String getValue(){
       String str = this.d().group();
       a.o(str, "matchResult.group\(\)");
       return str;
    }
    public k next(){
       k ok;
       int i = this.d().end();
       int i1 = (this.d().end() == this.d().start())? 1: 0;
       i = i + i1;
       if (i <= this.d.length()) {
          Matcher matcher = this.c.pattern().matcher(this.d);
          a.o(matcher, "matcher.pattern\(\).matcher\(input\)");
          ok = RegexKt.a(matcher, i, this.d);
       }else {
          ok = null;
       }
       return ok;
    }
}
