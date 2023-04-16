package a96.e;
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

public final class e implements Runnable	// class@000047
{
    public final a b;
    public final LaunchModel c;

    public void e(a p0,LaunchModel p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       int i;
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       try{
          i = 0;
          Object[] objArray = new Object[i];
          a.D().w("KrnNetwork", "onKrnStart launchModel = "+tc, objArray);
          tb.P(tc);
          tb.I(tc);
       }catch(java.lang.Exception e0){
          if (tc.a() != null) {
             Object[] objArray1 = new Object[i];
             a.D().A("KrnNetwork", "onKrnEnter Exception="+e0.toString()+", stackTrack="+Arrays.toString(e0.getStackTrace()), objArray1);
             a.M().d0(-1002, tc.a(), "onKrnEnter Exception="+e0.toString(), Arrays.toString(e0.getStackTrace()));
          }
       }
       return;
    }
}
