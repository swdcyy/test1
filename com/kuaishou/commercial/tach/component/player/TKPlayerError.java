package com.kuaishou.commercial.tach.component.player.TKPlayerError;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TKPlayerError extends Enum	// class@00166f
{
    public final int mErrorCode;
    public final String mErrorMessage;
    public static final TKPlayerError[] $VALUES;
    public static final TKPlayerError FEED_INVALID;
    public static final TKPlayerError LIVE_ENDED;
    public static final TKPlayerError SOURCE_INVALID;
    public static final TKPlayerError UNKNOWN;

    static {
       TKPlayerError tKPlayerErro = new TKPlayerError("UNKNOWN", 0, 0x101d1, "unknown error");
       TKPlayerError.UNKNOWN = tKPlayerErro;
       TKPlayerError tKPlayerErro1 = new TKPlayerError("SOURCE_INVALID", 1, 0x101d2, "player source invalid");
       TKPlayerError.SOURCE_INVALID = tKPlayerErro1;
       TKPlayerError tKPlayerErro2 = new TKPlayerError("FEED_INVALID", 2, 0x101d3, "feed invalid");
       TKPlayerError.FEED_INVALID = tKPlayerErro2;
       TKPlayerError tKPlayerErro3 = new TKPlayerError("LIVE_ENDED", 3, 0x101d4, "live is ended");
       TKPlayerError.LIVE_ENDED = tKPlayerErro3;
       TKPlayerError[] tKPlayerErro4 = new TKPlayerError[]{tKPlayerErro,tKPlayerErro1,tKPlayerErro2,tKPlayerErro3};
       TKPlayerError.$VALUES = tKPlayerErro4;
    }
    public void TKPlayerError(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.mErrorCode = p2;
       this.mErrorMessage = p3;
    }
    public static TKPlayerError valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TKPlayerError.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TKPlayerError.class, p0);
    }
    public static TKPlayerError[] values(){
       Object obj = PatchProxy.apply(null, null, TKPlayerError.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TKPlayerError.$VALUES.clone();
    }
    public int getCode(){
       return this.mErrorCode;
    }
    public String getMessage(){
       return this.mErrorMessage;
    }
}
