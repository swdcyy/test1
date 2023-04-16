package com.kuaishou.live.gzone.barrage.g;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$LiveCommentStyle;

public final class g implements o	// class@001c34
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final Object apply(Object p0){
       if (p0 == null) {
          p0 = Boolean.FALSE;
       }else {
          p0 = p0.mLiveCommentStyle;
          p0 = (p0 == null)? Boolean.FALSE: Boolean.valueOf(p0.mEnableMyCommentSuffix);
       }
       return p0;
    }
}
