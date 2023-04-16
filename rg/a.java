package rg.a;
import rg.d$b;
import java.lang.Object;
import java.lang.String;
import android.os.Build;
import java.lang.CharSequence;
import rg.h;

public abstract class a implements d$b	// class@002377
{

    public void a(){
       super();
    }
    public String a(String p0){
       return p0.substring(3, (p0.length() - 3));
    }
    public String[] c(){
       String[] sUPPORTED_AB = Build.SUPPORTED_ABIS;
       if (sUPPORTED_AB.length > 0) {
          return sUPPORTED_AB;
       }
       String cPU_ABI2 = Build.CPU_ABI2;
       if (!h.a(cPU_ABI2)) {
          String[] stringArray = new String[]{Build.CPU_ABI,cPU_ABI2};
          return stringArray;
       }else {
          sUPPORTED_AB = new String[]{Build.CPU_ABI};
          return sUPPORTED_AB;
       }
    }
}
