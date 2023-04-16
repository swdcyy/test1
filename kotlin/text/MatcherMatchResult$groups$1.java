package kotlin.text.MatcherMatchResult$groups$1;
import zsd.j;
import kotlin.collections.AbstractCollection;
import kotlin.text.MatcherMatchResult;
import java.util.regex.MatchResult;
import java.lang.Object;
import zsd.h;
import usd.k;
import kotlin.text.RegexKt;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import fsd.l;
import fsd.k;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;
import wsd.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.MatcherMatchResult$groups$1$iterator$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;

public final class MatcherMatchResult$groups$1 extends AbstractCollection implements j	// class@0018f0
{
    public final MatcherMatchResult b;

    public void MatcherMatchResult$groups$1(MatcherMatchResult p0){
       this.b = p0;
       super();
    }
    public int b(){
       return (this.b.d().groupCount() + 1);
    }
    public final boolean contains(Object p0){
       int i;
       v0 = (p0 != null)? p0 instanceof h: 1;
       if (v0) {
          return this.d(p0);
       }else {
          return false;
       }
    }
    public boolean d(h p0){
       return super.contains(p0);
    }
    public h get(int p0){
       h oh;
       k ok = RegexKt.e(this.b.d(), p0);
       if (ok.t().intValue() >= 0) {
          String str = this.b.d().group(p0);
          a.o(str, "matchResult.group\(index\)");
          oh = new h(str, ok);
       }else {
          oh = null;
       }
       return oh;
    }
    public h get(String p0){
       a.p(p0, "name");
       return l.a.c(this.b.d(), p0);
    }
    public boolean isEmpty(){
       return false;
    }
    public Iterator iterator(){
       return SequencesKt___SequencesKt.b1(CollectionsKt___CollectionsKt.l1(CollectionsKt__CollectionsKt.F(this)), new MatcherMatchResult$groups$1$iterator$1(this)).iterator();
    }
}
