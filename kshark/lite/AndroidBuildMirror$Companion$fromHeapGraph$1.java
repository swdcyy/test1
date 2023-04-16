package kshark.lite.AndroidBuildMirror$Companion$fromHeapGraph$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import kshark.lite.b;
import java.lang.Object;
import kshark.lite.a;
import java.lang.String;
import kshark.lite.HeapObject$HeapClass;
import kotlin.jvm.internal.a;
import rtd.h;
import rtd.i;
import java.lang.Integer;

public final class AndroidBuildMirror$Companion$fromHeapGraph$1 extends Lambda implements a	// class@001b70
{
    public final b $graph;

    public void AndroidBuildMirror$Companion$fromHeapGraph$1(b p0){
       this.$graph = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       HeapObject$HeapClass heapClass = this.$graph.g("android.os.Build");
       a.m(heapClass);
       HeapObject$HeapClass heapClass1 = this.$graph.g("android.os.Build$VERSION");
       a.m(heapClass1);
       h oh = heapClass.h("MANUFACTURER");
       a.m(oh);
       String str = oh.b().d();
       a.m(str);
       h oh1 = heapClass1.h("SDK_INT");
       a.m(oh1);
       Integer integer = oh1.b().b();
       a.m(integer);
       return new a(str, integer.intValue());
    }
}
