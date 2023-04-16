package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotResponse$a;
import hr4.q;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotResponse;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResponse;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$BizType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtNLUResponse;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechResponse;

public final class StentorMMU$SpeechRobotResponse$a extends GeneratedMessageLite$Builder implements q	// class@000dc3
{

    public void StentorMMU$SpeechRobotResponse$a(){
       super(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE);
    }
    public void StentorMMU$SpeechRobotResponse$a(a p0){
       super(StentorMMU$SpeechRobotResponse.DEFAULT_INSTANCE);
    }
    public StentorMMU$RtSpeechRecognitionResponse getAsrResponse(){
       return this.instance.getAsrResponse();
    }
    public String getBizId(){
       return this.instance.getBizId();
    }
    public ByteString getBizIdBytes(){
       return this.instance.getBizIdBytes();
    }
    public StentorMMU$BizType getBizType(){
       return this.instance.getBizType();
    }
    public int getBizTypeValue(){
       return this.instance.getBizTypeValue();
    }
    public StentorMMU$RtNLUResponse getNluResponse(){
       return this.instance.getNluResponse();
    }
    public String getReqId(){
       return this.instance.getReqId();
    }
    public ByteString getReqIdBytes(){
       return this.instance.getReqIdBytes();
    }
    public StentorMMU$RtTextToSpeechResponse getTtsResponse(){
       return this.instance.getTtsResponse();
    }
    public boolean hasAsrResponse(){
       return this.instance.hasAsrResponse();
    }
    public boolean hasNluResponse(){
       return this.instance.hasNluResponse();
    }
    public boolean hasTtsResponse(){
       return this.instance.hasTtsResponse();
    }
}
