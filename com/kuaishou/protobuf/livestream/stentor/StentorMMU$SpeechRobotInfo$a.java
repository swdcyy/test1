package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfo$a;
import hr4.o;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfo;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotInstruction;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfoStatus;

public final class StentorMMU$SpeechRobotInfo$a extends GeneratedMessageLite$Builder implements o	// class@000dbc
{

    public void StentorMMU$SpeechRobotInfo$a(){
       super(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE);
    }
    public void StentorMMU$SpeechRobotInfo$a(a p0){
       super(StentorMMU$SpeechRobotInfo.DEFAULT_INSTANCE);
    }
    public StentorMMU$RobotInstruction getInstruction(){
       return this.instance.getInstruction();
    }
    public String getLiveId(){
       return this.instance.getLiveId();
    }
    public ByteString getLiveIdBytes(){
       return this.instance.getLiveIdBytes();
    }
    public ByteString getOutputSpeech(){
       return this.instance.getOutputSpeech();
    }
    public String getReqId(){
       return this.instance.getReqId();
    }
    public ByteString getReqIdBytes(){
       return this.instance.getReqIdBytes();
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
    public StentorMMU$SpeechRobotInfoStatus getStatus(){
       return this.instance.getStatus();
    }
    public int getStatusValue(){
       return this.instance.getStatusValue();
    }
    public String getUserId(){
       return this.instance.getUserId();
    }
    public ByteString getUserIdBytes(){
       return this.instance.getUserIdBytes();
    }
    public boolean hasInstruction(){
       return this.instance.hasInstruction();
    }
}
