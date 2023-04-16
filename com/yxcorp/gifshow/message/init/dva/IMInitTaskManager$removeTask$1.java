package com.yxcorp.gifshow.message.init.dva.IMInitTaskManager$removeTask$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class IMInitTaskManager$removeTask$1 extends Lambda implements l	// class@001d54
{
    public final String $taskType;

    public void IMInitTaskManager$removeTask$1(String p0){
       this.$taskType = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMInitTaskManager$removeTask$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return a.g(p0, this.$taskType);
    }
}
