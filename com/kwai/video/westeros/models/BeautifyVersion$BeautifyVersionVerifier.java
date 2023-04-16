package com.kwai.video.westeros.models.BeautifyVersion$BeautifyVersionVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.BeautifyVersion;

public final class BeautifyVersion$BeautifyVersionVerifier implements Internal$EnumVerifier	// class@000eb5
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       BeautifyVersion$BeautifyVersionVerifier.INSTANCE = new BeautifyVersion$BeautifyVersionVerifier();
    }
    public void BeautifyVersion$BeautifyVersionVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (BeautifyVersion.forNumber(p0) != null)? true: false;
       return b;
    }
}
