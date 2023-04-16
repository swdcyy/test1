package com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionResponse$a;
import com.kuaishou.mmu.audio.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionResponse;
import com.google.protobuf.GeneratedMessageLite;
import fn4.c;
import com.google.protobuf.ByteString;
import java.lang.String;
import com.kuaishou.mmu.common.Result$ResultStatus;
import com.kuaishou.mmu.audio.VoiceConversionGrpcService$RtVoiceConversionResponse$Type;

public final class VoiceConversionGrpcService$RtVoiceConversionResponse$a extends GeneratedMessageLite$Builder implements c	// class@000a02
{

    public void VoiceConversionGrpcService$RtVoiceConversionResponse$a(){
       super(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE);
    }
    public void VoiceConversionGrpcService$RtVoiceConversionResponse$a(c p0){
       super(VoiceConversionGrpcService$RtVoiceConversionResponse.DEFAULT_INSTANCE);
    }
    public ByteString getAudio(){
       return this.instance.getAudio();
    }
    public boolean getContinue(){
       return this.instance.getContinue();
    }
    public String getReqid(){
       return this.instance.getReqid();
    }
    public ByteString getReqidBytes(){
       return this.instance.getReqidBytes();
    }
    public long getSerialNo(){
       return this.instance.getSerialNo();
    }
    public Result$ResultStatus getStatus(){
       return this.instance.getStatus();
    }
    public VoiceConversionGrpcService$RtVoiceConversionResponse$Type getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public String getUserid(){
       return this.instance.getUserid();
    }
    public ByteString getUseridBytes(){
       return this.instance.getUseridBytes();
    }
    public boolean hasStatus(){
       return this.instance.hasStatus();
    }
}
