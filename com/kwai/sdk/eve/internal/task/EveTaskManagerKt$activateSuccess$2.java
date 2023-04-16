package com.kwai.sdk.eve.internal.task.EveTaskManagerKt$activateSuccess$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import en7.t;
import msd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.task.EveTaskManagerKt$activateSuccess$2$1;

public final class EveTaskManagerKt$activateSuccess$2 extends Lambda implements l	// class@0015ce
{
    public static final EveTaskManagerKt$activateSuccess$2 INSTANCE;

    static {
       EveTaskManagerKt$activateSuccess$2.INSTANCE = new EveTaskManagerKt$activateSuccess$2();
    }
    public void EveTaskManagerKt$activateSuccess$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveTaskManagerKt$activateSuccess$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return EveTaskManagerKt$activateSuccess$2$1.INSTANCE;
    }
}
