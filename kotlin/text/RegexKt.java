package kotlin.text.RegexKt;
import java.util.regex.Matcher;
import java.lang.CharSequence;
import zsd.k;
import kotlin.text.MatcherMatchResult;
import java.util.Set;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Enum;
import java.lang.Class;
import java.util.EnumSet;
import kotlin.text.RegexKt$fromInt$$inlined$apply$lambda$1;
import java.lang.Iterable;
import msd.l;
import trd.y;
import java.util.Collections;
import java.lang.Object;
import java.util.regex.MatchResult;
import usd.k;
import usd.q;
import java.util.Iterator;
import zsd.g;

public final class RegexKt	// class@0018fa
{

    public static final k a(Matcher p0,int p1,CharSequence p2){
       k ok = (!p0.find(p1))? null: new MatcherMatchResult(p0, p2);
       return ok;
    }
    public static final Set b(int p0){
       a.y(4, "T");
       EnumSet uEnumSet = EnumSet.allOf(Enum.class);
       y.P0(uEnumSet, new RegexKt$fromInt$$inlined$apply$lambda$1(p0));
       Set set = Collections.unmodifiableSet(uEnumSet);
       a.o(set, "Collections.unmodifiable¡­mask == it.value }\n    }\)");
       return set;
    }
    public static final k c(Matcher p0,CharSequence p1){
       k ok = (!p0.matches())? null: new MatcherMatchResult(p0, p1);
       return ok;
    }
    public static final k d(MatchResult p0){
       return q.n1(p0.start(), p0.end());
    }
    public static final k e(MatchResult p0,int p1){
       return q.n1(p0.start(p1), p0.end(p1));
    }
    public static final int f(Iterable p0){
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i | iterator.next().getValue();
       }
       return i;
    }
}
