package com.kuaishou.edit.draft.Asset$Type$b;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kuaishou.edit.draft.Asset$Type;

public final class Asset$Type$b implements Internal$EnumVerifier	// class@001709
{
    public static final Internal$EnumVerifier a;

    static {
       Asset$Type$b.a = new Asset$Type$b();
    }
    public void Asset$Type$b(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (Asset$Type.forNumber(p0) != null)? true: false;
       return b;
    }
}
