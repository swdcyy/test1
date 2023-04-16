package com.kwai.locallife.config.LocalLifeLiveMeiTuanBiz;
import mr3.b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LocalLifeLiveMeiTuanBiz extends Enum implements b	// class@000ea4
{
    public final String mLogBiz;
    public static final LocalLifeLiveMeiTuanBiz[] $VALUES;
    public static final LocalLifeLiveMeiTuanBiz MT_LIVE;
    public static final LocalLifeLiveMeiTuanBiz MT_OTHER;

    static {
       LocalLifeLiveMeiTuanBiz localLifeLiv = new LocalLifeLiveMeiTuanBiz("MT_LIVE", 0, "LocalLifeLive");
       LocalLifeLiveMeiTuanBiz.MT_LIVE = localLifeLiv;
       LocalLifeLiveMeiTuanBiz localLifeLiv1 = new LocalLifeLiveMeiTuanBiz("MT_OTHER", 1, "other");
       LocalLifeLiveMeiTuanBiz.MT_OTHER = localLifeLiv1;
       LocalLifeLiveMeiTuanBiz[] localLifeLiv2 = new LocalLifeLiveMeiTuanBiz[]{localLifeLiv,localLifeLiv1};
       LocalLifeLiveMeiTuanBiz.$VALUES = localLifeLiv2;
    }
    public void LocalLifeLiveMeiTuanBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mLogBiz = p2;
    }
    public static LocalLifeLiveMeiTuanBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalLifeLiveMeiTuanBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LocalLifeLiveMeiTuanBiz.class, p0);
    }
    public static LocalLifeLiveMeiTuanBiz[] values(){
       Object obj = PatchProxy.apply(null, null, LocalLifeLiveMeiTuanBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalLifeLiveMeiTuanBiz.$VALUES.clone();
    }
    public String getLogBiz(){
       return this.mLogBiz;
    }
}
