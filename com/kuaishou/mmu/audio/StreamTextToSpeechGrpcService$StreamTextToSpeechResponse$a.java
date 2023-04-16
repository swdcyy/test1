package com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$a;
import com.kuaishou.mmu.audio.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechResponse;
import com.google.protobuf.GeneratedMessageLite;
import fn4.a;
import com.google.protobuf.ByteString;
import java.lang.String;
import com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType;

public final class StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$a extends GeneratedMessageLite$Builder implements a	// class@0009f5
{

    public void StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$a(){
       super(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE);
    }
    public void StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$a(a p0){
       super(StreamTextToSpeechGrpcService$StreamTextToSpeechResponse.DEFAULT_INSTANCE);
    }
    public ByteString getAudio(){
       return this.instance.getAudio();
    }
    public String getContent(){
       return this.instance.getContent();
    }
    public ByteString getContentBytes(){
       return this.instance.getContentBytes();
    }
    public long getPlayDuration(){
       return this.instance.getPlayDuration();
    }
    public String getReqId(){
       return this.instance.getReqId();
    }
    public ByteString getReqIdBytes(){
       return this.instance.getReqIdBytes();
    }
    public boolean getRequestContinue(){
       return this.instance.getRequestContinue();
    }
    public StreamTextToSpeechGrpcService$StreamTextToSpeechResponse$ResultType getResult(){
       return this.instance.getResult();
    }
    public int getResultValue(){
       return this.instance.getResultValue();
    }
    public long getSerialNo(){
       return this.instance.getSerialNo();
    }
    public String getUserid(){
       return this.instance.getUserid();
    }
    public ByteString getUseridBytes(){
       return this.instance.getUseridBytes();
    }
}
