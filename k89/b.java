package k89.b;
import com.kwai.robust.Robust$MethodListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import k89.c;
import java.lang.StringBuilder;
import android.os.Trace;

public class b implements Robust$MethodListener	// class@002b62
{

    public void b(){
       super();
    }
    public void onMethodEntry(Class p0,String p1){
       if (c.a()) {
          String str = p1+"_"+p0.getName();
          if (str.length() > 127) {
             str = str.substring(0, 127);
          }
          Trace.beginSection(str);
       }
       return;
    }
    public void onMethodExit(Class p0,String p1){
       if (c.a()) {
          Trace.endSection();
       }
       return;
    }
}
