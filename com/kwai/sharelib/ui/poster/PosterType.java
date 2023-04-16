package com.kwai.sharelib.ui.poster.PosterType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PosterType extends Enum	// class@001721
{
    public final String value;
    public static final PosterType[] $VALUES;
    public static final PosterType BIG_PIC;
    public static final PosterType BIG_QR;
    public static final PosterType LONG_PIC;
    public static final PosterType SHORT_PIC;

    static {
       PosterType posterType;
       PosterType[] posterTypeAr = new PosterType[]{posterType,posterType,posterType,posterType};
       posterType = new PosterType("SHORT_PIC", 0, "short_pic");
       PosterType.SHORT_PIC = posterType;
       posterType = new PosterType("LONG_PIC", 1, "long_pic");
       PosterType.LONG_PIC = posterType;
       posterType = new PosterType("BIG_QR", 2, "big_qr");
       PosterType.BIG_QR = posterType;
       posterType = new PosterType("BIG_PIC", 3, "big_pic");
       PosterType.BIG_PIC = posterType;
       PosterType.$VALUES = posterTypeAr;
    }
    public void PosterType(String p0,int p1,String p2){
       super(p0, p1);
       this.value = p2;
    }
    public static PosterType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PosterType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PosterType.class, p0);
    }
    public static PosterType[] values(){
       Object obj = PatchProxy.apply(null, null, PosterType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PosterType.$VALUES.clone();
    }
    public final String getValue(){
       return this.value;
    }
}
