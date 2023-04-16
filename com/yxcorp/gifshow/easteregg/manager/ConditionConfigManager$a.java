package com.yxcorp.gifshow.easteregg.manager.ConditionConfigManager$a;
import erd.o;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import daa.m;
import kotlin.jvm.internal.a;

public final class ConditionConfigManager$a implements o	// class@001ad0
{
    public static final ConditionConfigManager$a b;

    static {
       ConditionConfigManager$a.b = new ConditionConfigManager$a();
    }
    public void ConditionConfigManager$a(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ConditionConfigManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = p0.a();
       }
       return obj;
    }
}
