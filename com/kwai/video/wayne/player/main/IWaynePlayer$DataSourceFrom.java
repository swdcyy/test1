package com.kwai.video.wayne.player.main.IWaynePlayer$DataSourceFrom;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IWaynePlayer$DataSourceFrom extends Enum	// class@000d64
{
    public static final IWaynePlayer$DataSourceFrom[] $VALUES;
    public static final IWaynePlayer$DataSourceFrom FromCache;
    public static final IWaynePlayer$DataSourceFrom FromFile;
    public static final IWaynePlayer$DataSourceFrom FromMediaDataResource;
    public static final IWaynePlayer$DataSourceFrom FromNet;
    public static final IWaynePlayer$DataSourceFrom FromUnknown;

    static {
       IWaynePlayer$DataSourceFrom uDataSourceF1;
       IWaynePlayer$DataSourceFrom[] uDataSourceF = new IWaynePlayer$DataSourceFrom[]{uDataSourceF1,uDataSourceF1,uDataSourceF1,uDataSourceF1,uDataSourceF1};
       uDataSourceF1 = new IWaynePlayer$DataSourceFrom("FromFile", 0);
       IWaynePlayer$DataSourceFrom.FromFile = uDataSourceF1;
       uDataSourceF1 = new IWaynePlayer$DataSourceFrom("FromCache", 1);
       IWaynePlayer$DataSourceFrom.FromCache = uDataSourceF1;
       uDataSourceF1 = new IWaynePlayer$DataSourceFrom("FromMediaDataResource", 2);
       IWaynePlayer$DataSourceFrom.FromMediaDataResource = uDataSourceF1;
       uDataSourceF1 = new IWaynePlayer$DataSourceFrom("FromUnknown", 3);
       IWaynePlayer$DataSourceFrom.FromUnknown = uDataSourceF1;
       uDataSourceF1 = new IWaynePlayer$DataSourceFrom("FromNet", 4);
       IWaynePlayer$DataSourceFrom.FromNet = uDataSourceF1;
       IWaynePlayer$DataSourceFrom.$VALUES = uDataSourceF;
    }
    public void IWaynePlayer$DataSourceFrom(String p0,int p1){
       super(p0, p1);
    }
    public static IWaynePlayer$DataSourceFrom valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IWaynePlayer$DataSourceFrom.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IWaynePlayer$DataSourceFrom.class, p0);
    }
    public static IWaynePlayer$DataSourceFrom[] values(){
       Object obj = PatchProxy.apply(null, null, IWaynePlayer$DataSourceFrom.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IWaynePlayer$DataSourceFrom.$VALUES.clone();
    }
}
