package kshark.lite.HeapAnalyzer$a;
import kshark.lite.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class HeapAnalyzer$a	// class@001b7e
{
    public final b a;
    public final List b;
    public final boolean c;

    public void HeapAnalyzer$a(b p0,List p1,boolean p2){
       a.p(p0, "graph");
       a.p(p1, "referenceMatchers");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final b a(){
       return this.a;
    }
}
