package kshark.lite.internal.PathFinder$sortedGcRoots$rootClassName$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kshark.lite.HeapObject;
import java.lang.String;
import kotlin.jvm.internal.a;
import kshark.lite.HeapObject$HeapClass;
import kshark.lite.HeapObject$b;
import kshark.lite.HeapObject$c;
import kshark.lite.HeapObject$d;
import kotlin.NoWhenBranchMatchedException;

public final class PathFinder$sortedGcRoots$rootClassName$1 extends Lambda implements l	// class@001bd0
{
    public static final PathFinder$sortedGcRoots$rootClassName$1 INSTANCE;

    static {
       PathFinder$sortedGcRoots$rootClassName$1.INSTANCE = new PathFinder$sortedGcRoots$rootClassName$1();
    }
    public void PathFinder$sortedGcRoots$rootClassName$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(HeapObject p0){
       String str;
       a.p(p0, "graphObject");
       if (p0 instanceof HeapObject$HeapClass) {
          str = p0.j();
       }else if(p0 instanceof HeapObject$b){
          str = p0.k();
       }else if(p0 instanceof HeapObject$c){
          str = p0.h();
       }else if(p0 instanceof HeapObject$d){
          str = p0.h();
       }else {
          throw new NoWhenBranchMatchedException();
       }
       return str;
    }
}
