package hsd.a;
import gsd.a;
import ssd.e;
import tsd.a;
import java.util.regex.MatchResult;
import java.lang.String;
import zsd.h;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.regex.Matcher;
import usd.k;
import java.lang.Integer;
import java.lang.UnsupportedOperationException;

public class a extends a	// class@000fa8
{

    public void a(){
       super();
    }
    public e b(){
       return new a();
    }
    public h c(MatchResult p0,String p1){
       a.p(p0, "matchResult");
       a.p(p1, "name");
       h oh = null;
       if (!p0 instanceof Matcher) {
          p0 = oh;
       }
       if (p0 != null) {
          k ok = new k(p0.start(p1), (p0.end(p1) - 1));
          if (ok.t().intValue() >= 0) {
             String str = p0.group(p1);
             a.o(str, "matcher.group\(name\)");
             oh = new h(str, ok);
          }
          return oh;
       }else {
          throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
       }
    }
}
