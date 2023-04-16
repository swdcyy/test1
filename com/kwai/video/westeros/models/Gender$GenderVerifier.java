package com.kwai.video.westeros.models.Gender$GenderVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.Gender;

public final class Gender$GenderVerifier implements Internal$EnumVerifier	// class@000f7b
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       Gender$GenderVerifier.INSTANCE = new Gender$GenderVerifier();
    }
    public void Gender$GenderVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (Gender.forNumber(p0) != null)? true: false;
       return b;
    }
}
