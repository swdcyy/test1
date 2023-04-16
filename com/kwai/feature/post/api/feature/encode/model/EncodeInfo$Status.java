package com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EncodeInfo$Status extends Enum	// class@00139a
{
    public static final EncodeInfo$Status[] $VALUES;
    public static final EncodeInfo$Status CANCELED;
    public static final EncodeInfo$Status COMPLETE;
    public static final EncodeInfo$Status ENCODING;
    public static final EncodeInfo$Status FAILED;
    public static final EncodeInfo$Status PENDING;

    static {
       EncodeInfo$Status status = new EncodeInfo$Status("PENDING", 0);
       EncodeInfo$Status.PENDING = status;
       EncodeInfo$Status status1 = new EncodeInfo$Status("ENCODING", 1);
       EncodeInfo$Status.ENCODING = status1;
       EncodeInfo$Status status2 = new EncodeInfo$Status("COMPLETE", 2);
       EncodeInfo$Status.COMPLETE = status2;
       EncodeInfo$Status status3 = new EncodeInfo$Status("FAILED", 3);
       EncodeInfo$Status.FAILED = status3;
       EncodeInfo$Status status4 = new EncodeInfo$Status("CANCELED", 4);
       EncodeInfo$Status.CANCELED = status4;
       EncodeInfo$Status[] statusArray = new EncodeInfo$Status[]{status,status1,status2,status3,status4};
       EncodeInfo$Status.$VALUES = statusArray;
    }
    public void EncodeInfo$Status(String p0,int p1){
       super(p0, p1);
    }
    public static EncodeInfo$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EncodeInfo$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EncodeInfo$Status.class, p0);
    }
    public static EncodeInfo$Status[] values(){
       Object obj = PatchProxy.apply(null, null, EncodeInfo$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EncodeInfo$Status.$VALUES.clone();
    }
}
