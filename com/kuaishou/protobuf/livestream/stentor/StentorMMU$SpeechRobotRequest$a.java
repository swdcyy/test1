package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotRequest$a;
import hr4.p;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotRequest;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionRequest;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$BizType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotReqType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechRequest;

public final class StentorMMU$SpeechRobotRequest$a extends GeneratedMessageLite$Builder implements p	// class@000dc1
{

    public void StentorMMU$SpeechRobotRequest$a(){
       super(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE);
    }
    public void StentorMMU$SpeechRobotRequest$a(a p0){
       super(StentorMMU$SpeechRobotRequest.DEFAULT_INSTANCE);
    }
    public StentorMMU$RtSpeechRecognitionRequest getAsrRequest(){
       return this.instance.getAsrRequest();
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
    public String getRecognitionResult(){
       return this.instance.getRecognitionResult();
    }
    public ByteString getRecognitionResultBytes(){
       return this.instance.getRecognitionResultBytes();
    }
    public String getReqId(){
       return this.instance.getReqId();
    }
    public ByteString getReqIdBytes(){
       return this.instance.getReqIdBytes();
    }
    public StentorMMU$RobotReqType getReqType(){
       return this.instance.getReqType();
    }
    public int getReqTypeValue(){
       return this.instance.getReqTypeValue();
    }
    public StentorMMU$RtTextToSpeechRequest getTtsRequest(){
       return this.instance.getTtsRequest();
    }
    public boolean hasAsrRequest(){
       return this.instance.hasAsrRequest();
    }
    public boolean hasTtsRequest(){
       return this.instance.hasTtsRequest();
    }
}
