package tc.y;
import tc.v$a;
import java.lang.Object;
import com.facebook.common.memory.MemoryTrimType;
import tc.y$a;
import java.lang.Enum;
import java.lang.String;
import cb.a;

public class y implements v$a	// class@0024cf
{

    public void y(){
       super();
    }
    public double a(MemoryTrimType p0){
       int i = y$a.a[p0.ordinal()];
       int i1 = 1;
       if (i == i1) {
          return 0;
       }
       if (i == 2 || (i == 3 || (i == 4 || i == 5))) {
          return 0x3ff0000000000000;
       }
       Object[] objArray = new Object[i1];
       objArray[0] = p0;
       a.B("NativeMemoryCacheTrimStrategy", "unknown trim type: %s", objArray);
       return 0;
    }
}
