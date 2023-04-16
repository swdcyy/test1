package aegon.chrome.base.TraceEvent$c;
import android.util.Printer;
import aegon.chrome.base.TraceEvent;
import java.lang.Object;
import aegon.chrome.base.TraceEvent$a;
import java.lang.String;
import aegon.chrome.base.EarlyTraceEvent;
import java.lang.StringBuilder;
import aegon.chrome.base.TraceEvent$f;
import aegon.chrome.base.f;
import K.S;

public class TraceEvent$c implements Printer	// class@000158
{
    public String a;
    public static final int b;
    public static final boolean c;

    static {
       TraceEvent$c.b = 18;
    }
    public void TraceEvent$c(){
       super();
    }
    public void TraceEvent$c(TraceEvent$a p0){
       super();
    }
    public void a(String p0){
       boolean b = EarlyTraceEvent.e();
       if (TraceEvent.c || b) {
          StringBuilder str = "Looper.dispatch: ";
          int b1 = TraceEvent$c.b;
          int i = p0.indexOf(40, b1);
          int i1 = (i == -1)? -1: p0.indexOf(41, i);
          String str1 = "";
          String str2 = (i1 != -1)? p0.substring((i + 1), i1): str1;
          str = str+str2+"\(";
          b1 = p0.indexOf(125, b1);
          i = (b1 == -1)? -1: p0.indexOf(58, b1);
          if (i == -1) {
             i = p0.length();
          }
          if (b1 != -1) {
             str1 = p0.substring((b1 + 2), i);
          }
          this.a = str+str1+"\)";
          if (TraceEvent.c) {
             f.l();
             S.M_y76mct(this.a);
          }else {
             EarlyTraceEvent.a(this.a, 1);
          }
       }
       return;
    }
    public void b(String p0){
       boolean b = EarlyTraceEvent.e();
       if (TraceEvent.c || (b && this.a != null)) {
          if (TraceEvent.c) {
             f.l();
             S.MLJecZJ9(this.a);
          }else {
             EarlyTraceEvent.f(this.a, true);
          }
       }
       this.a = null;
       return;
    }
    public void println(String p0){
       if (p0.startsWith(">")) {
          this.a(p0);
       }else {
          this.b(p0);
       }
       return;
    }
}
