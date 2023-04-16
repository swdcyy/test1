package com.yxcorp.gifshow.easteregg.manager.ConditionConfigManager$c;
import erd.g;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.easteregg.manager.ConditionConfigManager;

public final class ConditionConfigManager$c implements g	// class@001ad2
{
    public static final ConditionConfigManager$c b;

    static {
       ConditionConfigManager$c.b = new ConditionConfigManager$c();
    }
    public void ConditionConfigManager$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConditionConfigManager$c.class, "1")) {
       }else {
          ConditionConfigManager.a = p0;
       }
       return;
    }
}
