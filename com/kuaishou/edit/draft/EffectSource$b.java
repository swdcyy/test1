package com.kuaishou.edit.draft.EffectSource$b;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kuaishou.edit.draft.EffectSource;

public final class EffectSource$b implements Internal$EnumVerifier	// class@00177d
{
    public static final Internal$EnumVerifier a;

    static {
       EffectSource$b.a = new EffectSource$b();
    }
    public void EffectSource$b(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EffectSource.forNumber(p0) != null)? true: false;
       return b;
    }
}
