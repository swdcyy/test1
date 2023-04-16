package com.kwai.android.common.utils.PushLogcat$logI$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import kotlin.jvm.internal.a;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.reflect.Method;

public final class PushLogcat$logI$1 extends Lambda implements p	// class@0009a1
{
    public static final PushLogcat$logI$1 INSTANCE;

    static {
       PushLogcat$logI$1.INSTANCE = new PushLogcat$logI$1();
    }
    public void PushLogcat$logI$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(String p0,String p1){
       a.p(p0, "tag");
       a.p(p1, "msg");
       Method method = PushLogcat.access$getIMethod$p(PushLogcat.INSTANCE);
       if (method != null) {
          Object[] objArray = new Object[]{p0,p1};
          method.invoke(null, objArray);
       }
       return;
    }
}
