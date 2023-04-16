package cbc.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public class a	// class@00056b
{

    public void a(){
       super();
    }
    public static void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       Log.g("IntimateRelationLog", p0);
       return;
    }
}
