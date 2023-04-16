package a96.d;
import java.lang.Runnable;
import com.kwai.framework.krn.init.preload.a;
import android.net.Uri;
import java.lang.Object;
import java.util.Objects;
import c96.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.kuaishou.krn.model.LaunchModel;
import at6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import java.lang.StackTraceElement;
import java.util.Arrays;

public final class d implements Runnable	// class@000046
{
    public final a b;
    public final Uri c;

    public void d(a p0,Uri p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       int i;
       boolean b;
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       try{
          i = 0;
          Object[] objArray = new Object[i];
          a.D().w("KrnNetwork", "onKrnEnter uri="+tc.toString(), objArray);
          LaunchModel launchModel = a.a(tc);
          tb.P(launchModel);
          tb.I(launchModel);
       label_00b6 :
          return;
       }catch(java.lang.Exception e4){
          String str = tc.toString();
          Object obj = PatchProxy.applyOneRefs(str, tb, a.class, "13");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!TextUtils.isEmpty(str) && (!str.startsWith("kwai://krn?") && (str.startsWith("kwai://kds/vue?") || str.startsWith("kwai://kds/react?")))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             Object[] objArray1 = new Object[i];
             a.D().A("KrnNetwork", "onKrnEnter Exception="+e4.toString()+", stackTrack="+Arrays.toString(e4.getStackTrace()), objArray1);
             a.M().d0(-1002, "total", e4.toString(), Arrays.toString(e4.getStackTrace()));
             goto label_00b6 ;
          }else {
             goto label_00b6 ;
          }
       }
    }
}
