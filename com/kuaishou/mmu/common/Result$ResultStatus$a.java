package com.kuaishou.mmu.common.Result$ResultStatus$a;
import gn4.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.mmu.common.Result$ResultStatus;
import com.google.protobuf.GeneratedMessageLite;
import gn4.a;
import com.kuaishou.mmu.common.Result$ResultCode;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class Result$ResultStatus$a extends GeneratedMessageLite$Builder implements c	// class@000a0c
{

    public void Result$ResultStatus$a(){
       super(Result$ResultStatus.DEFAULT_INSTANCE);
    }
    public void Result$ResultStatus$a(a p0){
       super(Result$ResultStatus.DEFAULT_INSTANCE);
    }
    public Result$ResultCode getCode(){
       return this.instance.getCode();
    }
    public int getCodeValue(){
       return this.instance.getCodeValue();
    }
    public String getMsg(){
       return this.instance.getMsg();
    }
    public ByteString getMsgBytes(){
       return this.instance.getMsgBytes();
    }
}
