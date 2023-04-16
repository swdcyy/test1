package com.kwai.video.westeros.models.RecordSubBusiness$RecordSubBusinessVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kwai.video.westeros.models.RecordSubBusiness;

public final class RecordSubBusiness$RecordSubBusinessVerifier implements Internal$EnumVerifier	// class@001020
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       RecordSubBusiness$RecordSubBusinessVerifier.INSTANCE = new RecordSubBusiness$RecordSubBusinessVerifier();
    }
    public void RecordSubBusiness$RecordSubBusinessVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (RecordSubBusiness.forNumber(p0) != null)? true: false;
       return b;
    }
}
