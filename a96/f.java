package a96.f;
import java.lang.Runnable;
import com.kwai.framework.krn.init.preload.a;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Object;
import java.util.Objects;
import c96.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.lang.Exception;
import java.lang.StackTraceElement;
import java.util.Arrays;

public final class f implements Runnable	// class@000048
{
    public final a b;
    public final LaunchModel c;
    public final LaunchModel d;

    public void f(a p0,LaunchModel p1,LaunchModel p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       int i;
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       Objects.requireNonNull(tb);
       try{
          i = 0;
          Object[] objArray = new Object[i];
          a.D().w("KrnNetwork", "onKrnStart launchModel = "+tc, objArray);
          tb.P(td);
          tb.I(td);
       }catch(java.lang.Exception e0){
          if (td.a() != null) {
             Object[] objArray1 = new Object[i];
             a.D().A("KrnNetwork", "onKrnEnter Exception="+e0.toString()+", stackTrack="+Arrays.toString(e0.getStackTrace()), objArray1);
             a.M().d0(-1002, td.a(), "onKrnEnter Exception="+e0.toString(), Arrays.toString(e0.getStackTrace()));
          }
       }
       return;
    }
}
