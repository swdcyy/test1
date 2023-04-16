package com.kwai.sdk.eve.internal.inference.DataBundle$TRANSFER;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DataBundle$TRANSFER extends Enum	// class@001541
{
    public static final DataBundle$TRANSFER[] $VALUES;
    public static final DataBundle$TRANSFER REF;
    public static final DataBundle$TRANSFER VALUE;

    static {
       DataBundle$TRANSFER tRANSFER;
       DataBundle$TRANSFER[] tRANSFERArra = new DataBundle$TRANSFER[]{tRANSFER,tRANSFER};
       tRANSFER = new DataBundle$TRANSFER("VALUE", 0);
       DataBundle$TRANSFER.VALUE = tRANSFER;
       tRANSFER = new DataBundle$TRANSFER("REF", 1);
       DataBundle$TRANSFER.REF = tRANSFER;
       DataBundle$TRANSFER.$VALUES = tRANSFERArra;
    }
    public void DataBundle$TRANSFER(String p0,int p1){
       super(p0, p1);
    }
    public static DataBundle$TRANSFER valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DataBundle$TRANSFER.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DataBundle$TRANSFER.class, p0);
    }
    public static DataBundle$TRANSFER[] values(){
       Object obj = PatchProxy.apply(null, null, DataBundle$TRANSFER.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DataBundle$TRANSFER.$VALUES.clone();
    }
}
