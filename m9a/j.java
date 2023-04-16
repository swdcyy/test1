package m9a.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.text.format.Time;
import java.lang.System;

public final class j	// class@002f81
{

    public void j(){
       super();
    }
    public static boolean a(long p0){
       Time obj;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, oj, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = new Time();
       obj.set(p0);
       Time month = obj.month;
       Time monthDay = obj.monthDay;
       obj.set(System.currentTimeMillis());
       boolean b = (obj.year == obj.year && (month == obj.month && monthDay == obj.monthDay))? true: false;
       return b;
    }
}
