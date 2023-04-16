package com.kuaishou.edit.draft.Asset$PositionType$b;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kuaishou.edit.draft.Asset$PositionType;

public final class Asset$PositionType$b implements Internal$EnumVerifier	// class@0016fe
{
    public static final Internal$EnumVerifier a;

    static {
       Asset$PositionType$b.a = new Asset$PositionType$b();
    }
    public void Asset$PositionType$b(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (Asset$PositionType.forNumber(p0) != null)? true: false;
       return b;
    }
}
