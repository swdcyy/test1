package com.feature.post.bridge.u;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class u implements g	// class@0014bd
{
    public static final u b;

    static {
       u.b = new u();
    }
    public void u(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("PostBridgeModuleImpl", "goToPost", p0);
    }
}
