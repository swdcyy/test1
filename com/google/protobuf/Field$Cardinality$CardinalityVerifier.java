package com.google.protobuf.Field$Cardinality$CardinalityVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.google.protobuf.Field$Cardinality;

public final class Field$Cardinality$CardinalityVerifier implements Internal$EnumVerifier	// class@000415
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       Field$Cardinality$CardinalityVerifier.INSTANCE = new Field$Cardinality$CardinalityVerifier();
    }
    public void Field$Cardinality$CardinalityVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (Field$Cardinality.forNumber(p0) != null)? true: false;
       return b;
    }
}
