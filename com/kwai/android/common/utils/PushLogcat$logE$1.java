package com.kwai.android.common.utils.PushLogcat$logE$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import qrd.l1;
import kotlin.jvm.internal.a;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.reflect.Method;

public final class PushLogcat$logE$1 extends Lambda implements q	// class@0009a0
{
    public static final PushLogcat$logE$1 INSTANCE;

    static {
       PushLogcat$logE$1.INSTANCE = new PushLogcat$logE$1();
    }
    public void PushLogcat$logE$1(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2);
       return l1.a;
    }
    public final void invoke(String p0,String p1,Throwable p2){
       a.p(p0, "tag");
       a.p(p1, "msg");
       Method method = PushLogcat.access$getEMethod$p(PushLogcat.INSTANCE);
       if (method != null) {
          Object[] objArray = new Object[]{p0,p1,p2};
          method.invoke(null, objArray);
       }
       return;
    }
}
