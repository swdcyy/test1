package com.yxcorp.gifshow.entity.l7;
import ok.h;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Boolean;

public final class l7 implements h	// class@000dfa
{
    public static final l7 b;

    static {
       l7.b = new l7();
    }
    public void l7(){
       super();
    }
    public final Object apply(Object p0){
       return Boolean.valueOf(p0.showMissYouButton());
    }
}
