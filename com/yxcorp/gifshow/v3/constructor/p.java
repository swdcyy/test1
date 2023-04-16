package com.yxcorp.gifshow.v3.constructor.p;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class p implements g	// class@000d4f
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("WorkspaceConstructor", "onPostConstructEvent", p0);
    }
}
