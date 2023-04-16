package com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechRequest$a;
import fn4.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.mmu.audio.StreamTextToSpeechGrpcService$StreamTextToSpeechRequest;
import com.google.protobuf.GeneratedMessageLite;
import fn4.a;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class StreamTextToSpeechGrpcService$StreamTextToSpeechRequest$a extends GeneratedMessageLite$Builder implements b	// class@0009f0
{

    public void StreamTextToSpeechGrpcService$StreamTextToSpeechRequest$a(){
       super(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE);
    }
    public void StreamTextToSpeechGrpcService$StreamTextToSpeechRequest$a(a p0){
       super(StreamTextToSpeechGrpcService$StreamTextToSpeechRequest.DEFAULT_INSTANCE);
    }
    public StreamTextToSpeechGrpcService$StreamTextToSpeechRequest$a a(int p0){
       this.copyOnWrite();
       this.instance.setAudioBitRate(p0);
       return this;
    }
    public int getAot(){
       return this.instance.getAot();
    }
    public int getAudioBitRate(){
       return this.instance.getAudioBitRate();
    }
    public int getAudioFormat(){
       return this.instance.getAudioFormat();
    }
    public int getBitRateMode(){
       return this.instance.getBitRateMode();
    }
    public String getContent(){
       return this.instance.getContent();
    }
    public ByteString getContentBytes(){
       return this.instance.getContentBytes();
    }
    public int getIchs(){
       return this.instance.getIchs();
    }
    public int getInputType(){
       return this.instance.getInputType();
    }
    public int getLangType(){
       return this.instance.getLangType();
    }
    public int getPitch(){
       return this.instance.getPitch();
    }
    public String getReqId(){
       return this.instance.getReqId();
    }
    public ByteString getReqIdBytes(){
       return this.instance.getReqIdBytes();
    }
    public int getSampleRate(){
       return this.instance.getSampleRate();
    }
    public float getSemitone(){
       return this.instance.getSemitone();
    }
    public long getSerialNo(){
       return this.instance.getSerialNo();
    }
    public int getSpeakerId(){
       return this.instance.getSpeakerId();
    }
    public int getSpeed(){
       return this.instance.getSpeed();
    }
    public int getStreamPacketDur(){
       return this.instance.getStreamPacketDur();
    }
    public float getTimbre(){
       return this.instance.getTimbre();
    }
    public String getUserid(){
       return this.instance.getUserid();
    }
    public ByteString getUseridBytes(){
       return this.instance.getUseridBytes();
    }
    public String getVoiceName(){
       return this.instance.getVoiceName();
    }
    public ByteString getVoiceNameBytes(){
       return this.instance.getVoiceNameBytes();
    }
    public int getVolume(){
       return this.instance.getVolume();
    }
}
