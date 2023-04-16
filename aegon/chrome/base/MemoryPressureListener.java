package aegon.chrome.base.MemoryPressureListener;
import java.lang.Object;
import aegon.chrome.base.ThreadUtils;
import aegon.chrome.base.d;
import aegon.chrome.base.e;

public class MemoryPressureListener	// class@00014b
{
    public static e a;

    public void MemoryPressureListener(){
       super();
    }
    public static void addNativeCallback(){
       d a = d.a;
       if (MemoryPressureListener.a == null) {
          MemoryPressureListener.a = new e();
       }
       MemoryPressureListener.a.b(a);
       return;
    }
}
