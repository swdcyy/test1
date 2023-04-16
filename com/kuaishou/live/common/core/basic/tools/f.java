package com.kuaishou.live.common.core.basic.tools.f;
import ok.o;
import java.lang.Object;
import com.kwai.feature.api.social.message.imshare.model.IMShareTarget;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class f implements o	// class@000eed
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (p0 != null && !TextUtils.x(p0.headUri))? true: false;
       return b;
    }
}
