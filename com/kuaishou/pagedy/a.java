package com.kuaishou.pagedy.a;
import com.kuaishou.pagedy.b$a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.a;
import ho4.b;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import java.util.Map;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class a implements b$a	// class@000a42
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean a(a p0){
       boolean b;
       if (p0 instanceof b) {
          a componentDat = p0.componentData;
          if (componentDat != null) {
             PageDyComponentInfo engineConfig = componentDat.engineConfig;
             if (engineConfig != null && engineConfig.get("isMainTab") != null) {
                b = TextUtils.equals(String.valueOf(p0.componentData.engineConfig.get("isMainTab")), "true");
             label_0028 :
                return b;
             }
          }
       }
       b = false;
       goto label_0028 ;
    }
}
