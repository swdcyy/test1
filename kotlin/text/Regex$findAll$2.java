package kotlin.text.Regex$findAll$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import zsd.k;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class Regex$findAll$2 extends FunctionReferenceImpl implements l	// class@0018f6
{
    public static final Regex$findAll$2 INSTANCE;

    static {
       Regex$findAll$2.INSTANCE = new Regex$findAll$2();
    }
    public void Regex$findAll$2(){
       super(1, k.class, "next", "next\(\)Lkotlin/text/MatchResult;", 0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final k invoke(k p0){
       a.p(p0, "p1");
       return p0.next();
    }
}
