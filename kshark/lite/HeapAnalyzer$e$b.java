package kshark.lite.HeapAnalyzer$e$b;
import kshark.lite.HeapAnalyzer$e;
import nsd.u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;

public final class HeapAnalyzer$e$b extends HeapAnalyzer$e	// class@001b85
{
    public final Map a;
    public final long b;

    public void HeapAnalyzer$e$b(long p0){
       super(null);
       this.b = p0;
       this.a = new LinkedHashMap();
    }
    public long a(){
       return this.b;
    }
    public final Map b(){
       return this.a;
    }
    public String toString(){
       return "ParentNode\(objectId="+this.b+", children="+this.a+')';
    }
}
