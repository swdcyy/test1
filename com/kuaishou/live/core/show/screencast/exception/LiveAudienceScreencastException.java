package com.kuaishou.live.core.show.screencast.exception.LiveAudienceScreencastException;
import java.lang.RuntimeException;
import com.kuaishou.live.core.show.screencast.exception.LiveAudienceScreencastException$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class LiveAudienceScreencastException extends RuntimeException	// class@000fce
{
    public int mType;
    public static final LiveAudienceScreencastException$a Companion;

    static {
       LiveAudienceScreencastException.Companion = new LiveAudienceScreencastException$a(null);
    }
    public void LiveAudienceScreencastException(String p0,int p1){
       a.p(p0, "message");
       super(p0);
       this.mType = p1;
    }
    public final int getMType(){
       return this.mType;
    }
    public final void setMType(int p0){
       this.mType = p0;
    }
}
