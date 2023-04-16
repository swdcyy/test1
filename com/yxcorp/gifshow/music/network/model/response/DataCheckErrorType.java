package com.yxcorp.gifshow.music.network.model.response.DataCheckErrorType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DataCheckErrorType extends Enum	// class@00205f
{
    public static final DataCheckErrorType[] $VALUES;
    public static final DataCheckErrorType FIELD_NOT_FOUND;
    public static final DataCheckErrorType INVALID_FIELD_SIZE;

    static {
       DataCheckErrorType uDataCheckEr1;
       DataCheckErrorType[] uDataCheckEr = new DataCheckErrorType[]{uDataCheckEr1,uDataCheckEr1};
       uDataCheckEr1 = new DataCheckErrorType("FIELD_NOT_FOUND", 0);
       DataCheckErrorType.FIELD_NOT_FOUND = uDataCheckEr1;
       uDataCheckEr1 = new DataCheckErrorType("INVALID_FIELD_SIZE", 1);
       DataCheckErrorType.INVALID_FIELD_SIZE = uDataCheckEr1;
       DataCheckErrorType.$VALUES = uDataCheckEr;
    }
    public void DataCheckErrorType(String p0,int p1){
       super(p0, p1);
    }
    public static DataCheckErrorType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DataCheckErrorType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DataCheckErrorType.class, p0);
    }
    public static DataCheckErrorType[] values(){
       Object obj = PatchProxy.apply(null, null, DataCheckErrorType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DataCheckErrorType.$VALUES.clone();
    }
}
