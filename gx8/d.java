package gx8.d;
import java.lang.Object;
import android.view.View;
import com.kuaishou.android.model.mix.Location;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Integer;

public final class d	// class@002518
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public static final String a(View p0,View p1,Location p2){
       String str;
       Location obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "historyTag");
       a.p(p1, "rewardTag");
       a.p(p2, "location");
       obj = p2.mTypeList;
       if (obj != null && !obj.isEmpty()) {
          Integer integer = p2.mTypeList.get(0);
          int i = 1;
          if (integer != null && integer.intValue() == i) {
             p0.setVisibility(0);
             p1.setVisibility(8);
             str = "History";
          }else if(integer != null && (integer.intValue() == 2 && p0.getVisibility())){
             p1.setVisibility(0);
             str = "Reward";
          }else {
             p0.setVisibility(8);
             p1.setVisibility(8);
             str = "Other";
          }
       }else {
          p0.setVisibility(8);
          p1.setVisibility(8);
          str = "Empty";
       }
       return str;
    }
}
