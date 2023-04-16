package com.google.protobuf.Field$Kind$KindVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.google.protobuf.Field$Kind;

public final class Field$Kind$KindVerifier implements Internal$EnumVerifier	// class@000418
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       Field$Kind$KindVerifier.INSTANCE = new Field$Kind$KindVerifier();
    }
    public void Field$Kind$KindVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (Field$Kind.forNumber(p0) != null)? true: false;
       return b;
    }
}
