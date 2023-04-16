package hr4.o;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotInstruction;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfoStatus;

public interface abstract o implements MessageLiteOrBuilder	// class@0023c7
{

    StentorMMU$RobotInstruction getInstruction();
    String getLiveId();
    ByteString getLiveIdBytes();
    ByteString getOutputSpeech();
    String getReqId();
    ByteString getReqIdBytes();
    ByteString getSpeech();
    String getSpeechText();
    ByteString getSpeechTextBytes();
    StentorMMU$SpeechRobotInfoStatus getStatus();
    int getStatusValue();
    String getUserId();
    ByteString getUserIdBytes();
    boolean hasInstruction();
}
