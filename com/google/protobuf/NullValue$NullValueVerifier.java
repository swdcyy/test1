package com.google.protobuf.NullValue$NullValueVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.google.protobuf.NullValue;

public final class NullValue$NullValueVerifier implements Internal$EnumVerifier	// class@000491
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       NullValue$NullValueVerifier.INSTANCE = new NullValue$NullValueVerifier();
    }
    public void NullValue$NullValueVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (NullValue.forNumber(p0) != null)? true: false;
       return b;
    }
}
