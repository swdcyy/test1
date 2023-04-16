package com.kuaishou.locallife.log.biz.LocalLifeLiveLogBiz;
import mr3.b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LocalLifeLiveLogBiz extends Enum implements b	// class@00149b
{
    public final String mLogBiz;
    public static final LocalLifeLiveLogBiz[] $VALUES;
    public static final LocalLifeLiveLogBiz LIVE_PREVIEW;
    public static final LocalLifeLiveLogBiz LIVE_ROOM;
    public static final LocalLifeLiveLogBiz MAKE_MONEY;

    static {
       LocalLifeLiveLogBiz localLifeLiv = new LocalLifeLiveLogBiz("LIVE_ROOM", 0, "liveRoom");
       LocalLifeLiveLogBiz.LIVE_ROOM = localLifeLiv;
       LocalLifeLiveLogBiz localLifeLiv1 = new LocalLifeLiveLogBiz("MAKE_MONEY", 1, "makeMoney");
       LocalLifeLiveLogBiz.MAKE_MONEY = localLifeLiv1;
       LocalLifeLiveLogBiz localLifeLiv2 = new LocalLifeLiveLogBiz("LIVE_PREVIEW", 2, "livePreview");
       LocalLifeLiveLogBiz.LIVE_PREVIEW = localLifeLiv2;
       LocalLifeLiveLogBiz[] localLifeLiv3 = new LocalLifeLiveLogBiz[]{localLifeLiv,localLifeLiv1,localLifeLiv2};
       LocalLifeLiveLogBiz.$VALUES = localLifeLiv3;
    }
    public void LocalLifeLiveLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mLogBiz = p2;
    }
    public static LocalLifeLiveLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalLifeLiveLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LocalLifeLiveLogBiz.class, p0);
    }
    public static LocalLifeLiveLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, LocalLifeLiveLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalLifeLiveLogBiz.$VALUES.clone();
    }
    public String getLogBiz(){
       return this.mLogBiz;
    }
}
