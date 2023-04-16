package com.kuaishou.bowl.core.component.TKComponent$3$1;
import java.util.HashMap;
import com.kuaishou.bowl.core.component.TKComponent$3;
import tx4.w;
import com.kuaishou.bowl.core.component.c;
import java.lang.Object;
import java.lang.Integer;

public class TKComponent$3$1 extends HashMap	// class@001193
{
    public final TKComponent$3 this$1;
    public final w val$tkBundleInfo;

    public void TKComponent$3$1(TKComponent$3 p0,w p1){
       this.this$1 = p0;
       this.val$tkBundleInfo = p1;
       super();
       this.put("renderMode", p0.e.e);
       if (p1 != null) {
          this.put("bundleVersion", Integer.valueOf(p1.d));
       }
       return;
    }
}
