package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$m;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class a$m implements r	// class@001720
{
    public static final a$m b;

    static {
       a$m.b = new a$m();
    }
    public void a$m(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a$m.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.m(p0);
          b = p0.booleanValue();
       }
       return b;
    }
}
