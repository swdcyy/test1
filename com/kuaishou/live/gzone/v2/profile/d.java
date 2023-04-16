package com.kuaishou.live.gzone.v2.profile.d;
import erd.o;
import java.lang.Object;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse;
import java.util.List;

public final class d implements o	// class@001cdd
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       LiveGzoneAuthorAuthenticationTagResponse mTradeTag = p0.mTradeTag;
       if (mTradeTag != null) {
          p0.mTags.add(mTradeTag);
       }
       return p0;
    }
}
