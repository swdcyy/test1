package com.kwai.video.ksheifdec.HeifImageFormat;
import com.facebook.imageformat.a;
import java.lang.String;
import java.lang.Object;

public final class HeifImageFormat	// class@0008d9
{
    public static final a HEIC;
    public static final a HEIF;

    static {
       HeifImageFormat.HEIF = new a("HEIF", "heif");
       HeifImageFormat.HEIC = new a("HEIC", "heic");
    }
    public void HeifImageFormat(){
       super();
    }
    public static boolean isHeifFormat(a p0){
       boolean b = (p0 == HeifImageFormat.HEIF || p0 == HeifImageFormat.HEIC)? true: false;
       return b;
    }
}
