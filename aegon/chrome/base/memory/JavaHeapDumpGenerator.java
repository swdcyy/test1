package aegon.chrome.base.memory.JavaHeapDumpGenerator;
import java.lang.Object;
import java.lang.String;
import android.os.Debug;
import java.lang.StringBuilder;
import java.io.IOException;
import a0.n;

public final class JavaHeapDumpGenerator	// class@00016f
{

    public void JavaHeapDumpGenerator(){
       super();
    }
    public static boolean generateHprof(String p0){
       boolean b;
       try{
          Debug.dumpHprofData(p0);
          b = true;
          return b;
       }catch(java.io.IOException e0){
          Object[] objArray = new Object[0];
          n.e("JavaHprofGenerator", "Error writing to file "+b+". Error: "+e0.getMessage(), objArray);
          return 0;
       }
    }
}
