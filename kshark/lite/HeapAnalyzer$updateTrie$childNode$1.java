package kshark.lite.HeapAnalyzer$updateTrie$childNode$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import kshark.lite.HeapAnalyzer$e$b;
import java.lang.Object;
import java.util.Map;
import java.lang.Long;

public final class HeapAnalyzer$updateTrie$childNode$1 extends Lambda implements a	// class@001b87
{
    public final long $objectId;
    public final HeapAnalyzer$e$b $parentNode;

    public void HeapAnalyzer$updateTrie$childNode$1(long p0,HeapAnalyzer$e$b p1){
       this.$objectId = p0;
       this.$parentNode = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HeapAnalyzer$e$b invoke(){
       HeapAnalyzer$e$b uoe$b = new HeapAnalyzer$e$b(this.$objectId);
       this.$parentNode.b().put(Long.valueOf(this.$objectId), uoe$b);
       return uoe$b;
    }
}
