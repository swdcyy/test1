package com.kuaishou.mmu.common.Result$StringResponse$a;
import gn4.d;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.mmu.common.Result$StringResponse;
import com.google.protobuf.GeneratedMessageLite;
import gn4.a;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.mmu.common.Result$ResultStatus;

public final class Result$StringResponse$a extends GeneratedMessageLite$Builder implements d	// class@000a0e
{

    public void Result$StringResponse$a(){
       super(Result$StringResponse.DEFAULT_INSTANCE);
    }
    public void Result$StringResponse$a(a p0){
       super(Result$StringResponse.DEFAULT_INSTANCE);
    }
    public String getResullt(){
       return this.instance.getResullt();
    }
    public ByteString getResulltBytes(){
       return this.instance.getResulltBytes();
    }
    public Result$ResultStatus getStatus(){
       return this.instance.getStatus();
    }
    public boolean hasStatus(){
       return this.instance.hasStatus();
    }
}
