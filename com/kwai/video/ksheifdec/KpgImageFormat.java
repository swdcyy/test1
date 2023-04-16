package com.kwai.video.ksheifdec.KpgImageFormat;
import com.facebook.imageformat.a;
import java.lang.String;
import java.lang.Object;

public final class KpgImageFormat	// class@000f9f
{
    public static final a KPG;

    static {
       KpgImageFormat.KPG = new a("KPG", "kpg");
    }
    public void KpgImageFormat(){
       super();
    }
    public static boolean isKpgFormat(a p0){
       boolean b = (p0 == KpgImageFormat.KPG)? true: false;
       return b;
    }
}
