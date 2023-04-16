package com.yxcorp.gifshow.init.module.l;
import zf6.k$b;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.init.module.DayNightInitModule;
import com.kwai.framework.model.user.QCurrentUser;

public final class l implements k$b	// class@0019cb
{
    public static final l a;

    static {
       l.a = new l();
    }
    public void l(){
       super();
    }
    public final String getUid(){
       return QCurrentUser.me().getId();
    }
}
