package com.yxcorp.gifshow.reminder.friend.presenter.single.d$b;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class d$b implements r	// class@001adb
{
    public static final d$b b;

    static {
       d$b.b = new d$b();
    }
    public void d$b(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "selected");
          b = p0.booleanValue();
       }
       return b;
    }
}
