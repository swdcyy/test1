package kshark.lite.HeapAnalyzer$d;
import std.n$c;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class HeapAnalyzer$d	// class@001b83
{
    public final n$c a;
    public final List b;

    public void HeapAnalyzer$d(n$c p0,List p1){
       a.p(p0, "root");
       a.p(p1, "childPath");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final List a(){
       return this.b;
    }
    public final n$c b(){
       return this.a;
    }
}
