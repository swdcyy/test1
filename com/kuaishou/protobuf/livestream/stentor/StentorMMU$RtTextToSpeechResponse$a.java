package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechResponse$a;
import hr4.m;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechResponse;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultCode;

public final class StentorMMU$RtTextToSpeechResponse$a extends GeneratedMessageLite$Builder implements m	// class@000daf
{

    public void StentorMMU$RtTextToSpeechResponse$a(){
       super(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE);
    }
    public void StentorMMU$RtTextToSpeechResponse$a(a p0){
       super(StentorMMU$RtTextToSpeechResponse.DEFAULT_INSTANCE);
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
    public long getSerialNo(){
       return this.instance.getSerialNo();
    }
    public ByteString getSpeech(){
       return this.instance.getSpeech();
    }
    public String getSpeechText(){
       return this.instance.getSpeechText();
    }
    public ByteString getSpeechTextBytes(){
       return this.instance.getSpeechTextBytes();
    }
    public StentorMMU$RtSpeechRecognitionResultCode getStatus(){
       return this.instance.getStatus();
    }
    public int getStatusValue(){
       return this.instance.getStatusValue();
    }
}
