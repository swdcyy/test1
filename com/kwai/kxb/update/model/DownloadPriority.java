package com.kwai.kxb.update.model.DownloadPriority;
import java.lang.Enum;
import java.lang.String;
import com.kwai.kxb.update.model.DownloadPriority$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DownloadPriority extends Enum	// class@00080b
{
    public final int index;
    public static final DownloadPriority[] $VALUES;
    public static final DownloadPriority$a Companion;
    public static final DownloadPriority High;
    public static final DownloadPriority Low;
    public static final DownloadPriority Middle;

    static {
       DownloadPriority uDownloadPri1;
       DownloadPriority[] uDownloadPri = new DownloadPriority[]{uDownloadPri1,uDownloadPri1,uDownloadPri1};
       uDownloadPri1 = new DownloadPriority("Low", 0, 1000);
       DownloadPriority.Low = uDownloadPri1;
       uDownloadPri1 = new DownloadPriority("Middle", 1, 2000);
       DownloadPriority.Middle = uDownloadPri1;
       uDownloadPri1 = new DownloadPriority("High", 2, 3000);
       DownloadPriority.High = uDownloadPri1;
       DownloadPriority.$VALUES = uDownloadPri;
       DownloadPriority.Companion = new DownloadPriority$a(null);
    }
    public void DownloadPriority(String p0,int p1,int p2){
       super(p0, p1);
       this.index = p2;
    }
    public static DownloadPriority valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DownloadPriority.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DownloadPriority.class, p0);
    }
    public static DownloadPriority[] values(){
       Object obj = PatchProxy.apply(null, null, DownloadPriority.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DownloadPriority.$VALUES.clone();
    }
    public final int getIndex(){
       return this.index;
    }
}
