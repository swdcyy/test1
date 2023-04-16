package com.kwai.video.westeros.models.Bitmap$Format$FormatVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.Bitmap$Format;

public final class Bitmap$Format$FormatVerifier implements Internal$EnumVerifier	// class@000eba
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       Bitmap$Format$FormatVerifier.INSTANCE = new Bitmap$Format$FormatVerifier();
    }
    public void Bitmap$Format$FormatVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (Bitmap$Format.forNumber(p0) != null)? true: false;
       return b;
    }
}
